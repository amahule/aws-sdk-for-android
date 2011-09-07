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
 * Policy Attribute Description
 */
public class PolicyAttributeDescription {

    private String attributeName;

    private String attributeValue;

    /**
     * Returns the value of the AttributeName property for this object.
     *
     * @return The value of the AttributeName property for this object.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * Sets the value of the AttributeName property for this object.
     *
     * @param attributeName The new value for the AttributeName property for this object.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * Sets the value of the AttributeName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The new value for the AttributeName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyAttributeDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    /**
     * Returns the value of the AttributeValue property for this object.
     *
     * @return The value of the AttributeValue property for this object.
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    
    /**
     * Sets the value of the AttributeValue property for this object.
     *
     * @param attributeValue The new value for the AttributeValue property for this object.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    /**
     * Sets the value of the AttributeValue property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValue The new value for the AttributeValue property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyAttributeDescription withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        sb.append("AttributeName: " + attributeName + ", ");
        sb.append("AttributeValue: " + attributeValue + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    