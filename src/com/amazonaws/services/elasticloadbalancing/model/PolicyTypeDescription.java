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
 * Policy Type Description
 */
public class PolicyTypeDescription {

    private String policyTypeName;

    private String description;

    private java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions;

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
    public PolicyTypeDescription withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }
    
    
    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyTypeDescription withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyAttributeTypeDescriptions property for
     * this object.
     *
     * @return The value of the PolicyAttributeTypeDescriptions property for this
     *         object.
     */
    public java.util.List<PolicyAttributeTypeDescription> getPolicyAttributeTypeDescriptions() {
        if (policyAttributeTypeDescriptions == null) {
            policyAttributeTypeDescriptions = new java.util.ArrayList<PolicyAttributeTypeDescription>();
        }
        return policyAttributeTypeDescriptions;
    }
    
    /**
     * Sets the value of the PolicyAttributeTypeDescriptions property for
     * this object.
     *
     * @param policyAttributeTypeDescriptions The new value for the PolicyAttributeTypeDescriptions property for
     *         this object.
     */
    public void setPolicyAttributeTypeDescriptions(java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptionsCopy = new java.util.ArrayList<PolicyAttributeTypeDescription>();
        if (policyAttributeTypeDescriptions != null) {
            policyAttributeTypeDescriptionsCopy.addAll(policyAttributeTypeDescriptions);
        }
        this.policyAttributeTypeDescriptions = policyAttributeTypeDescriptionsCopy;
    }
    
    /**
     * Sets the value of the PolicyAttributeTypeDescriptions property for
     * this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeTypeDescriptions The new value for the PolicyAttributeTypeDescriptions property for
     *         this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(PolicyAttributeTypeDescription... policyAttributeTypeDescriptions) {
        for (PolicyAttributeTypeDescription value : policyAttributeTypeDescriptions) {
            getPolicyAttributeTypeDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyAttributeTypeDescriptions property for
     * this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeTypeDescriptions The new value for the PolicyAttributeTypeDescriptions property for
     *         this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptionsCopy = new java.util.ArrayList<PolicyAttributeTypeDescription>();
        if (policyAttributeTypeDescriptions != null) {
            policyAttributeTypeDescriptionsCopy.addAll(policyAttributeTypeDescriptions);
        }
        this.policyAttributeTypeDescriptions = policyAttributeTypeDescriptionsCopy;

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
        sb.append("PolicyTypeName: " + policyTypeName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("PolicyAttributeTypeDescriptions: " + policyAttributeTypeDescriptions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    