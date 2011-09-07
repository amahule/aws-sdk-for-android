/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.handlers;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;

/**
 * Request handler to add session-based credentials to a request.
 */
public class SessionBasedAuthenticationRequestHandler extends AbstractRequestHandler {
    private AWSCredentials credentials;
    private String securityToken;
    private final AmazonWebServiceClient client;

	public SessionBasedAuthenticationRequestHandler(AWSCredentials credentials, String securityToken,
            AmazonWebServiceClient client) {
        super();
        this.credentials = credentials;
        this.securityToken = securityToken;
        this.client = client;
    }

	public void beforeRequest(Request<?> request) {
		request.getOriginalRequest().setRequestCredentials(this.credentials);
        if ( AmazonWebServiceClient.AWS_QUERY_STRING_PROTOCOL.equals(client.getProtocol()) ) {
            request.addParameter("SecurityToken", this.securityToken);
        } else {
            request.addHeader("x-amz-security-token", this.securityToken);
        }
	}	
}
