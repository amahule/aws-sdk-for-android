/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Subscriptions Request Marshaller
 */
public class ListSubscriptionsRequestMarshaller implements Marshaller<Request<ListSubscriptionsRequest>, ListSubscriptionsRequest> {

    public Request<ListSubscriptionsRequest> marshall(ListSubscriptionsRequest listSubscriptionsRequest) {
        Request<ListSubscriptionsRequest> request = new DefaultRequest<ListSubscriptionsRequest>(listSubscriptionsRequest, "AmazonSNS");
        request.addParameter("Action", "ListSubscriptions");
        request.addParameter("Version", "2010-03-31");
        if (listSubscriptionsRequest != null) {
            if (listSubscriptionsRequest.getNextToken() != null) {
                request.addParameter("NextToken", StringUtils.fromString(listSubscriptionsRequest.getNextToken()));
            }
        }


        return request;
    }
}
