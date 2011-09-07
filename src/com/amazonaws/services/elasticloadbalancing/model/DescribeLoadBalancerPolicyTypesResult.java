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
 * Describe Load Balancer Policy Types Result
 */
public class DescribeLoadBalancerPolicyTypesResult {

    private java.util.List<PolicyTypeDescription> policyTypeDescriptions;

    /**
     * Returns the value of the PolicyTypeDescriptions property for this
     * object.
     *
     * @return The value of the PolicyTypeDescriptions property for this object.
     */
    public java.util.List<PolicyTypeDescription> getPolicyTypeDescriptions() {
        if (policyTypeDescriptions == null) {
            policyTypeDescriptions = new java.util.ArrayList<PolicyTypeDescription>();
        }
        return policyTypeDescriptions;
    }
    
    /**
     * Sets the value of the PolicyTypeDescriptions property for this object.
     *
     * @param policyTypeDescriptions The new value for the PolicyTypeDescriptions property for this object.
     */
    public void setPolicyTypeDescriptions(java.util.Collection<PolicyTypeDescription> policyTypeDescriptions) {
        java.util.List<PolicyTypeDescription> policyTypeDescriptionsCopy = new java.util.ArrayList<PolicyTypeDescription>();
        if (policyTypeDescriptions != null) {
            policyTypeDescriptionsCopy.addAll(policyTypeDescriptions);
        }
        this.policyTypeDescriptions = policyTypeDescriptionsCopy;
    }
    
    /**
     * Sets the value of the PolicyTypeDescriptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeDescriptions The new value for the PolicyTypeDescriptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPolicyTypesResult withPolicyTypeDescriptions(PolicyTypeDescription... policyTypeDescriptions) {
        for (PolicyTypeDescription value : policyTypeDescriptions) {
            getPolicyTypeDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyTypeDescriptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeDescriptions The new value for the PolicyTypeDescriptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPolicyTypesResult withPolicyTypeDescriptions(java.util.Collection<PolicyTypeDescription> policyTypeDescriptions) {
        java.util.List<PolicyTypeDescription> policyTypeDescriptionsCopy = new java.util.ArrayList<PolicyTypeDescription>();
        if (policyTypeDescriptions != null) {
            policyTypeDescriptionsCopy.addAll(policyTypeDescriptions);
        }
        this.policyTypeDescriptions = policyTypeDescriptionsCopy;

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
        sb.append("PolicyTypeDescriptions: " + policyTypeDescriptions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    