/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#resetInstanceAttribute(ResetInstanceAttributeRequest) ResetInstanceAttribute operation}.
 * <p>
 * Resets an attribute of an instance to its default value.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#resetInstanceAttribute(ResetInstanceAttributeRequest)
 */
public class ResetInstanceAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     */
    private String instanceId;

    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>kernel</code>, <code>ramdisk</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     */
    private String attribute;

    /**
     * Default constructor for a new ResetInstanceAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResetInstanceAttributeRequest() {}
    
    /**
     * Constructs a new ResetInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the Amazon EC2 instance whose attribute is
     * being reset.
     * @param attribute The name of the attribute being reset. <p> Available
     * attribute names: <code>kernel</code>, <code>ramdisk</code>
     */
    public ResetInstanceAttributeRequest(String instanceId, String attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute;
    }

    
    
    /**
     * Constructs a new ResetInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the Amazon EC2 instance whose attribute is
     * being reset.
     * @param attribute The name of the attribute being reset. <p> Available
     * attribute names: <code>kernel</code>, <code>ramdisk</code>
     */
    public ResetInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute.toString();
    }
    
    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     *
     * @return The ID of the Amazon EC2 instance whose attribute is being reset.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     *
     * @param instanceId The ID of the Amazon EC2 instance whose attribute is being reset.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the Amazon EC2 instance whose attribute is being reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>kernel</code>, <code>ramdisk</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @return The name of the attribute being reset. <p> Available attribute names:
     *         <code>kernel</code>, <code>ramdisk</code>
     *
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>kernel</code>, <code>ramdisk</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>kernel</code>, <code>ramdisk</code>
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>kernel</code>, <code>ramdisk</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>kernel</code>, <code>ramdisk</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceAttributeName
     */
    public ResetInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>kernel</code>, <code>ramdisk</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>kernel</code>, <code>ramdisk</code>
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * <code>kernel</code>, <code>ramdisk</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         <code>kernel</code>, <code>ramdisk</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceAttributeName
     */
    public ResetInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
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
        if (instanceId != null) sb.append("InstanceId: " + instanceId + ", ");
        if (attribute != null) sb.append("Attribute: " + attribute + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ResetInstanceAttributeRequest == false) return false;
        ResetInstanceAttributeRequest other = (ResetInstanceAttributeRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    