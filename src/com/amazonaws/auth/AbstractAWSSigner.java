/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringInputStream;

/**
 * Abstract base class for AWS signing protocol implementations. Provides
 * utilities commonly needed by signing protocols such as computing
 * canonicalized host names, query string parameters, etc.
 * <p>
 * Not intended to be sub-classed by developers.
 */
public abstract class AbstractAWSSigner implements Signer {

    /** The default encoding to use when URL encoding */
    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * Computes an RFC 2104-compliant HMAC signature and returns the result as a
     * Base64 encoded string.
     */
    protected String signAndBase64Encode(String data, String key, SigningAlgorithm algorithm)
            throws AmazonClientException {
    	try {
			return signAndBase64Encode(data.getBytes(DEFAULT_ENCODING), key, algorithm);
		} catch (UnsupportedEncodingException e) {
    		throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
		}
    }

    /**
     * Computes an RFC 2104-compliant HMAC signature for an array of bytes and
     * returns the result as a Base64 encoded string.
     */
    protected String signAndBase64Encode(byte[] data, String key, SigningAlgorithm algorithm)
    		throws AmazonClientException {
    	try {
    		byte[] signature = sign(data, key.getBytes(DEFAULT_ENCODING), algorithm);
    		return new String(Base64.encodeBase64(signature));
    	} catch (Exception e) {
    		throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
    	}
    }

    protected byte[] sign(String stringData, byte[] key, SigningAlgorithm algorithm) throws AmazonClientException {
        try {
            byte[] data = stringData.getBytes(DEFAULT_ENCODING);
            return sign(data, key, algorithm);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }

    protected byte[] sign(byte[] data, byte[] key, SigningAlgorithm algorithm) throws AmazonClientException {
        try {
            Mac mac = Mac.getInstance(algorithm.toString());
            mac.init(new SecretKeySpec(key, algorithm.toString()));
            return mac.doFinal(data);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }

    /**
     * Hashes the string contents (assumed to be UTF-8) using the SHA-256
     * algorithm.
     *
     * @param text
     *            The string to hash.
     *
     * @return The hashed bytes from the specified string.
     *
     * @throws AmazonClientException
     *             If the hash cannot be computed.
     */
    protected byte[] hash(String text) throws AmazonClientException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes(DEFAULT_ENCODING));
            return md.digest();
        } catch (Exception e) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e.getMessage(), e);
        }
    }

    /**
     * Examines the specified query string parameters and returns a
     * canonicalized form.
     * <p>
     * The canonicalized query string is formed by first sorting all the query
     * string parameters, then URI encoding both the key and value and then
     * joining them, in order, separating key value pairs with an '&'.
     *
     * @param parameters
     *            The query string parameters to be canonicalized.
     *
     * @return A canonicalized form for the specified query string parameters.
     */
    protected String getCanonicalizedQueryString(Map<String, String> parameters) {
        SortedMap<String, String> sorted = new TreeMap<String, String>();
        sorted.putAll(parameters);

        StringBuilder builder = new StringBuilder();
        Iterator<Map.Entry<String, String>> pairs = sorted.entrySet().iterator();
        while (pairs.hasNext()) {
            Map.Entry<String, String> pair = pairs.next();
            String key = pair.getKey();
            String value = pair.getValue();
            builder.append(HttpUtils.urlEncode(key, false));
            builder.append("=");
            builder.append(HttpUtils.urlEncode(value, false));
            if (pairs.hasNext()) {
                builder.append("&");
            }
        }

        return builder.toString();
    }

    protected String getCanonicalizedQueryString(Request<?> request) {
        /*
         * If we're using POST and we don't have any request payload content,
         * then any request query parameters will be sent as the payload, and
         * not in the actual query string.
         */
        if (HttpUtils.usePayloadForQueryParameters(request)) return "";
        else return this.getCanonicalizedQueryString(request.getParameters());
    }

    protected String getRequestPayload(Request<?> request) {
        if (HttpUtils.usePayloadForQueryParameters(request)) {
            String encodedParameters = HttpUtils.encodeParameters(request);
            if (encodedParameters == null) return "";
            return encodedParameters;
        }

        return getRequestPayloadWithoutQueryParams(request);
    }

    protected String getRequestPayloadWithoutQueryParams(Request<?> request) {
        try {
            InputStream content = request.getContent();
            if (content == null) return "";

            if (content instanceof StringInputStream) {
                return ((StringInputStream)content).getString();
            }

            if (!content.markSupported()) {
                throw new AmazonClientException("Unable to read request payload to sign request.");
            }

            StringBuilder sb = new StringBuilder();
            content.mark(-1);
            int b;
            while ((b = content.read()) > -1) {
                sb.append((char)b);
            }
            content.reset();
            return sb.toString();
        } catch (Exception e) {
            throw new AmazonClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }

    protected String getCanonicalizedResourcePath(String resourcePath) {
        if (resourcePath == null || resourcePath.length() == 0) {
            return "/";
        } else {
            return HttpUtils.urlEncode(resourcePath, true);
        }
    }

    protected String getCanonicalizedEndpoint(URI endpoint) {
        String endpointForStringToSign = endpoint.getHost().toLowerCase();
        /*
         * Apache HttpClient will omit the port in the Host header for default
         * port values (i.e. 80 for HTTP and 443 for HTTPS) even if we
         * explicitly specify it, so we need to be careful that we use the same
         * value here when we calculate the string to sign and in the Host
         * header we send in the HTTP request.
         */
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            endpointForStringToSign += ":" + endpoint.getPort();
        }

        return endpointForStringToSign;
    }

    /**
     * Loads the individual access key ID and secret key from the specified
     * credentials, ensuring that access to the credentials is synchronized on
     * the credentials object itself, and trimming any extra whitespace from the
     * credentials.
     * <p>
     * Returns either a {@link BasicSessionCredentials} or a
     * {@link BasicAWSCredentials} object, depending on the input type.
     *
     * @param credentials
     * @return A new credentials object with the sanitized credentials.
     */
    protected AWSCredentials sanitizeCredentials(AWSCredentials credentials) {
        String accessKeyId = null;
        String secretKey   = null;
        String token = null;
        synchronized (credentials) {
            accessKeyId = credentials.getAWSAccessKeyId();
            secretKey   = credentials.getAWSSecretKey();
            if ( credentials instanceof AWSSessionCredentials ) {
                token = ((AWSSessionCredentials) credentials).getSessionToken();
            }
        }
        if (secretKey != null) secretKey = secretKey.trim();
        if (accessKeyId != null) accessKeyId = accessKeyId.trim();
        if (token != null) token = token.trim();

        if (credentials instanceof AWSSessionCredentials) {
            return new BasicSessionCredentials(accessKeyId, secretKey, token);
        }

        return new BasicAWSCredentials(accessKeyId, secretKey);
    }

    /**
     * Adds session credentials to the request given.
     *
     * @param request
     *            The request to add session credentials information to
     * @param credentials
     *            The session credentials to add to the request
     */
    protected abstract void addSessionCredentials(Request<?> request, AWSSessionCredentials credentials);

}
