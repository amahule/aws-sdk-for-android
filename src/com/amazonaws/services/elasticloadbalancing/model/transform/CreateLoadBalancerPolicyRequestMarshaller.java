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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Load Balancer Policy Request Marshaller
 */
public class CreateLoadBalancerPolicyRequestMarshaller implements Marshaller<Request<CreateLoadBalancerPolicyRequest>, CreateLoadBalancerPolicyRequest> {

    public Request<CreateLoadBalancerPolicyRequest> marshall(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) {
        Request<CreateLoadBalancerPolicyRequest> request = new DefaultRequest<CreateLoadBalancerPolicyRequest>(createLoadBalancerPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancerPolicy");
        request.addParameter("Version", "2011-08-15");
        if (createLoadBalancerPolicyRequest != null) {
            if (createLoadBalancerPolicyRequest.getLoadBalancerName() != null) {
                request.addParameter("LoadBalancerName", StringUtils.fromString(createLoadBalancerPolicyRequest.getLoadBalancerName()));
            }
        }
        if (createLoadBalancerPolicyRequest != null) {
            if (createLoadBalancerPolicyRequest.getPolicyName() != null) {
                request.addParameter("PolicyName", StringUtils.fromString(createLoadBalancerPolicyRequest.getPolicyName()));
            }
        }
        if (createLoadBalancerPolicyRequest != null) {
            if (createLoadBalancerPolicyRequest.getPolicyTypeName() != null) {
                request.addParameter("PolicyTypeName", StringUtils.fromString(createLoadBalancerPolicyRequest.getPolicyTypeName()));
            }
        }

        if (createLoadBalancerPolicyRequest != null) {
            java.util.List<PolicyAttribute> policyAttributesList = createLoadBalancerPolicyRequest.getPolicyAttributes();
            int policyAttributesListIndex = 1;
            for (PolicyAttribute policyAttributesListValue : policyAttributesList) {
                if (policyAttributesListValue != null) {
                    if (policyAttributesListValue.getAttributeName() != null) {
                        request.addParameter("PolicyAttributes.member." + policyAttributesListIndex + ".AttributeName", StringUtils.fromString(policyAttributesListValue.getAttributeName()));
                    }
                }
                if (policyAttributesListValue != null) {
                    if (policyAttributesListValue.getAttributeValue() != null) {
                        request.addParameter("PolicyAttributes.member." + policyAttributesListIndex + ".AttributeValue", StringUtils.fromString(policyAttributesListValue.getAttributeValue()));
                    }
                }

                policyAttributesListIndex++;
            }
        }


        return request;
    }
}
