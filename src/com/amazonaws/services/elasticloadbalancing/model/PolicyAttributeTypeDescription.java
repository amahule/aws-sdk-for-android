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
 * Policy Attribute Type Description
 */
public class PolicyAttributeTypeDescription {

    private String attributeName;

    private String attributeType;

    private String description;

    private String defaultValue;

    private String cardinality;

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
    public PolicyAttributeTypeDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    /**
     * Returns the value of the AttributeType property for this object.
     *
     * @return The value of the AttributeType property for this object.
     */
    public String getAttributeType() {
        return attributeType;
    }
    
    /**
     * Sets the value of the AttributeType property for this object.
     *
     * @param attributeType The new value for the AttributeType property for this object.
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
    
    /**
     * Sets the value of the AttributeType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeType The new value for the AttributeType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyAttributeTypeDescription withAttributeType(String attributeType) {
        this.attributeType = attributeType;
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
    public PolicyAttributeTypeDescription withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Returns the value of the DefaultValue property for this object.
     *
     * @return The value of the DefaultValue property for this object.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * Sets the value of the DefaultValue property for this object.
     *
     * @param defaultValue The new value for the DefaultValue property for this object.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * Sets the value of the DefaultValue property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The new value for the DefaultValue property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyAttributeTypeDescription withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    
    
    /**
     * Returns the value of the Cardinality property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE, ZERO_OR_ONE, ZERO_OR_MORE, ONE_OR_MORE
     *
     * @return The value of the Cardinality property for this object.
     *
     * @see Cardinality
     */
    public String getCardinality() {
        return cardinality;
    }
    
    /**
     * Sets the value of the Cardinality property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE, ZERO_OR_ONE, ZERO_OR_MORE, ONE_OR_MORE
     *
     * @param cardinality The new value for the Cardinality property for this object.
     *
     * @see Cardinality
     */
    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }
    
    /**
     * Sets the value of the Cardinality property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE, ZERO_OR_ONE, ZERO_OR_MORE, ONE_OR_MORE
     *
     * @param cardinality The new value for the Cardinality property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Cardinality
     */
    public PolicyAttributeTypeDescription withCardinality(String cardinality) {
        this.cardinality = cardinality;
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
        sb.append("AttributeType: " + attributeType + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("DefaultValue: " + defaultValue + ", ");
        sb.append("Cardinality: " + cardinality + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    