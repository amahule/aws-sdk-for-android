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
 * Policy Description
 */
public class PolicyDescription {

    private String policyName;

    private String policyTypeName;

    private java.util.List<PolicyAttributeDescription> policyAttributeDescriptions;

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
    public PolicyDescription withPolicyName(String policyName) {
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
    public PolicyDescription withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyAttributeDescriptions property for this
     * object.
     *
     * @return The value of the PolicyAttributeDescriptions property for this object.
     */
    public java.util.List<PolicyAttributeDescription> getPolicyAttributeDescriptions() {
        if (policyAttributeDescriptions == null) {
            policyAttributeDescriptions = new java.util.ArrayList<PolicyAttributeDescription>();
        }
        return policyAttributeDescriptions;
    }
    
    /**
     * Sets the value of the PolicyAttributeDescriptions property for this
     * object.
     *
     * @param policyAttributeDescriptions The new value for the PolicyAttributeDescriptions property for this
     *         object.
     */
    public void setPolicyAttributeDescriptions(java.util.Collection<PolicyAttributeDescription> policyAttributeDescriptions) {
        java.util.List<PolicyAttributeDescription> policyAttributeDescriptionsCopy = new java.util.ArrayList<PolicyAttributeDescription>();
        if (policyAttributeDescriptions != null) {
            policyAttributeDescriptionsCopy.addAll(policyAttributeDescriptions);
        }
        this.policyAttributeDescriptions = policyAttributeDescriptionsCopy;
    }
    
    /**
     * Sets the value of the PolicyAttributeDescriptions property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeDescriptions The new value for the PolicyAttributeDescriptions property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyDescription withPolicyAttributeDescriptions(PolicyAttributeDescription... policyAttributeDescriptions) {
        for (PolicyAttributeDescription value : policyAttributeDescriptions) {
            getPolicyAttributeDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyAttributeDescriptions property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeDescriptions The new value for the PolicyAttributeDescriptions property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyDescription withPolicyAttributeDescriptions(java.util.Collection<PolicyAttributeDescription> policyAttributeDescriptions) {
        java.util.List<PolicyAttributeDescription> policyAttributeDescriptionsCopy = new java.util.ArrayList<PolicyAttributeDescription>();
        if (policyAttributeDescriptions != null) {
            policyAttributeDescriptionsCopy.addAll(policyAttributeDescriptions);
        }
        this.policyAttributeDescriptions = policyAttributeDescriptionsCopy;

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
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("PolicyTypeName: " + policyTypeName + ", ");
        sb.append("PolicyAttributeDescriptions: " + policyAttributeDescriptions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    