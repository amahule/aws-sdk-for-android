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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest) CreateLoadBalancerPolicy operation}.
 * 
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest)
 */
public class CreateLoadBalancerPolicyRequest extends AmazonWebServiceRequest {

    private String loadBalancerName;

    private String policyName;

    private String policyTypeName;

    private java.util.List<PolicyAttribute> policyAttributes;

    /**
     * Returns the value of the LoadBalancerName property for this object.
     *
     * @return The value of the LoadBalancerName property for this object.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * Sets the value of the LoadBalancerName property for this object.
     *
     * @param loadBalancerName The new value for the LoadBalancerName property for this object.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * Sets the value of the LoadBalancerName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The new value for the LoadBalancerName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyName property for this object.
     *
     * @return The value of the PolicyName property for this object.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * Sets the value of the PolicyName property for this object.
     *
     * @param policyName The new value for the PolicyName property for this object.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * Sets the value of the PolicyName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The new value for the PolicyName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyTypeName property for this object.
     *
     * @return The value of the PolicyTypeName property for this object.
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }
    
    /**
     * Sets the value of the PolicyTypeName property for this object.
     *
     * @param policyTypeName The new value for the PolicyTypeName property for this object.
     */
    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }
    
    /**
     * Sets the value of the PolicyTypeName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeName The new value for the PolicyTypeName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerPolicyRequest withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyAttributes property for this object.
     *
     * @return The value of the PolicyAttributes property for this object.
     */
    public java.util.List<PolicyAttribute> getPolicyAttributes() {
        if (policyAttributes == null) {
            policyAttributes = new java.util.ArrayList<PolicyAttribute>();
        }
        return policyAttributes;
    }
    
    /**
     * Sets the value of the PolicyAttributes property for this object.
     *
     * @param policyAttributes The new value for the PolicyAttributes property for this object.
     */
    public void setPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        java.util.List<PolicyAttribute> policyAttributesCopy = new java.util.ArrayList<PolicyAttribute>();
        if (policyAttributes != null) {
            policyAttributesCopy.addAll(policyAttributes);
        }
        this.policyAttributes = policyAttributesCopy;
    }
    
    /**
     * Sets the value of the PolicyAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributes The new value for the PolicyAttributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerPolicyRequest withPolicyAttributes(PolicyAttribute... policyAttributes) {
        for (PolicyAttribute value : policyAttributes) {
            getPolicyAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributes The new value for the PolicyAttributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerPolicyRequest withPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        java.util.List<PolicyAttribute> policyAttributesCopy = new java.util.ArrayList<PolicyAttribute>();
        if (policyAttributes != null) {
            policyAttributesCopy.addAll(policyAttributes);
        }
        this.policyAttributes = policyAttributesCopy;

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
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("PolicyTypeName: " + policyTypeName + ", ");
        sb.append("PolicyAttributes: " + policyAttributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    