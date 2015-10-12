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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#monitorInstances(MonitorInstancesRequest) MonitorInstances operation}.
 * <p>
 * Enables monitoring for a running instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#monitorInstances(MonitorInstancesRequest)
 */
public class MonitorInstancesRequest extends AmazonWebServiceRequest {

    /**
     * The list of Amazon EC2 instances on which to enable monitoring.
     */
    private java.util.List<String> instanceIds;

    /**
     * Default constructor for a new MonitorInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public MonitorInstancesRequest() {}
    
    /**
     * Constructs a new MonitorInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceIds The list of Amazon EC2 instances on which to enable
     * monitoring.
     */
    public MonitorInstancesRequest(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    
    
    /**
     * The list of Amazon EC2 instances on which to enable monitoring.
     *
     * @return The list of Amazon EC2 instances on which to enable monitoring.
     */
    public java.util.List<String> getInstanceIds() {
        
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * The list of Amazon EC2 instances on which to enable monitoring.
     *
     * @param instanceIds The list of Amazon EC2 instances on which to enable monitoring.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The list of Amazon EC2 instances on which to enable monitoring.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of Amazon EC2 instances on which to enable monitoring.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public MonitorInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The list of Amazon EC2 instances on which to enable monitoring.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of Amazon EC2 instances on which to enable monitoring.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public MonitorInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

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
        if (instanceIds != null) sb.append("InstanceIds: " + instanceIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof MonitorInstancesRequest == false) return false;
        MonitorInstancesRequest other = (MonitorInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        return true;
    }
    
}
    