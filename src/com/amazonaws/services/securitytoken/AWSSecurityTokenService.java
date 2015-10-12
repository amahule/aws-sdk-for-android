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
package com.amazonaws.services.securitytoken;

import com.amazonaws.*;
import com.amazonaws.services.securitytoken.model.*;


/**
 * Interface for accessing AWSSecurityTokenService.
 * AWS Security Token Service <p>
 * This is the <i>AWS Security Token Service API Reference</i> . The AWS Security Token Service is a web service that enables you to request temporary,
 * limited-privilege credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users). This guide
 * provides descriptions of the AWS Security Token Service API as well as links to related content in <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/"> Using IAM </a> .
 * </p>
 * <p>
 * For more detailed information about using this service, go to <a href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/TokenBasedAuth.html">
 * Granting Temporary Access to Your AWS Resources </a> in <i>Using IAM</i> .
 * </p>
 * <p>
 * For specific information about setting up signatures and authorization through the API, go to <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a> in <i>Using IAM</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * We will refer to Amazon Identity and Access Management using the abbreviated form IAM. All copyrights and legal protections still apply.
 * </p>
 */
public interface AWSSecurityTokenService {

    /**
     * Overrides the default endpoint for this client ("https://sts.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * The GetSessionToken action returns a set of temporary credentials for
     * an AWS account or IAM user. The credentials consist of an Access Key
     * ID, a Secret Access Key, and a security token. These credentials are
     * valid for the specified duration only. The session duration for IAM
     * users can be between one and 36 hours, with a default of 12 hours. The
     * session duration for AWS account owners is restricted to one hour.
     * </p>
     * <p>
     * For more information about using GetSessionToken to create temporary
     * credentials, go to <a
     * mazonwebservices.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a> in
     * <i>Using IAM</i> .
     * </p>
     *
     * @param getSessionTokenRequest Container for the necessary parameters
     *           to execute the GetSessionToken service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the GetSessionToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSessionTokenResult getSessionToken(GetSessionTokenRequest getSessionTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The GetFederationToken action returns a set of temporary credentials
     * for a federated user with the user name and policy specified in the
     * request. The credentials consist of an Access Key ID, a Secret Access
     * Key, and a security token. The credentials are valid for the specified
     * duration, between one and 36 hours.
     * </p>
     * <p>
     * The federated user who holds these credentials has any permissions
     * allowed by the intersection of the specified policy and any resource
     * or user policies that apply to the caller of the GetFederationToken
     * API, and any resource policies that apply to the federated user's
     * Amazon Resource Name (ARN). For more information about how token
     * permissions work, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html">
     * Controlling Permissions in Temporary Credentials </a> in <i>Using AWS
     * Identity and Access Management</i> . For information about using
     * GetFederationToken to create temporary credentials, see <a
     * cs.amazonwebservices.com/IAM/latest/UserGuide/CreatingFedTokens.html">
     * Creating Temporary Credentials to Enable Access for Federated Users
     * </a> in <i>Using AWS Identity and Access Management</i> .
     * </p>
     *
     * @param getFederationTokenRequest Container for the necessary
     *           parameters to execute the GetFederationToken service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the GetFederationToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws MalformedPolicyDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The GetSessionToken action returns a set of temporary credentials for
     * an AWS account or IAM user. The credentials consist of an Access Key
     * ID, a Secret Access Key, and a security token. These credentials are
     * valid for the specified duration only. The session duration for IAM
     * users can be between one and 36 hours, with a default of 12 hours. The
     * session duration for AWS account owners is restricted to one hour.
     * </p>
     * <p>
     * For more information about using GetSessionToken to create temporary
     * credentials, go to <a
     * mazonwebservices.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a> in
     * <i>Using IAM</i> .
     * </p>
     * 
     * @return The response from the GetSessionToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSessionTokenResult getSessionToken() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        