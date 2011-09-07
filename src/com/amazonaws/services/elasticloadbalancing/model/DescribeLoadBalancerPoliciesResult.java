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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Describe Load Balancer Policies Result
 */
public class DescribeLoadBalancerPoliciesResult {

    private java.util.List<PolicyDescription> policyDescriptions;

    /**
     * Returns the value of the PolicyDescriptions property for this object.
     *
     * @return The value of the PolicyDescriptions property for this object.
     */
    public java.util.List<PolicyDescription> getPolicyDescriptions() {
        if (policyDescriptions == null) {
            policyDescriptions = new java.util.ArrayList<PolicyDescription>();
        }
        return policyDescriptions;
    }
    
    /**
     * Sets the value of the PolicyDescriptions property for this object.
     *
     * @param policyDescriptions The new value for the PolicyDescriptions property for this object.
     */
    public void setPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        java.util.List<PolicyDescription> policyDescriptionsCopy = new java.util.ArrayList<PolicyDescription>();
        if (policyDescriptions != null) {
            policyDescriptionsCopy.addAll(policyDescriptions);
        }
        this.policyDescriptions = policyDescriptionsCopy;
    }
    
    /**
     * Sets the value of the PolicyDescriptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDescriptions The new value for the PolicyDescriptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(PolicyDescription... policyDescriptions) {
        for (PolicyDescription value : policyDescriptions) {
            getPolicyDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyDescriptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDescriptions The new value for the PolicyDescriptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        java.util.List<PolicyDescription> policyDescriptionsCopy = new java.util.ArrayList<PolicyDescription>();
        if (policyDescriptions != null) {
            policyDescriptionsCopy.addAll(policyDescriptions);
        }
        this.policyDescriptions = policyDescriptionsCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("PolicyDescriptions: " + policyDescriptions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    