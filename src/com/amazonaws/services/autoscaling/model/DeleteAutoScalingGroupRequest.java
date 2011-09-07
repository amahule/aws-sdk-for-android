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
package com.amazonaws.services.autoscaling.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteAutoScalingGroup(DeleteAutoScalingGroupRequest) DeleteAutoScalingGroup operation}.
 * <p>
 * Deletes the specified auto scaling group if the group has no
 * instances and no scaling activities in progress.
 * </p>
 * <p>
 * Starting with API version 2011-01-01, you can use the optional
 * parameter <code>--force-delete</code> to delete the auto scaling group
 * and any running instances it owns. When you use this parameter, Auto
 * Scaling will terminate the intances associated with the group and then
 * delete the group.
 * </p>
 * <p>
 * <b>NOTE:</b> To remove all instances before calling
 * DeleteAutoScalingGroup, you can call UpdateAutoScalingGroup to set the
 * minimum and maximum size of the AutoScalingGroup to zero.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteAutoScalingGroup(DeleteAutoScalingGroupRequest)
 */
public class DeleteAutoScalingGroupRequest extends AmazonWebServiceRequest {

    private String autoScalingGroupName;

    private Boolean forceDelete;

    /**
     * Returns the value of the AutoScalingGroupName property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The value of the AutoScalingGroupName property for this object.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * Sets the value of the AutoScalingGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The new value for the AutoScalingGroupName property for this object.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * Sets the value of the AutoScalingGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The new value for the AutoScalingGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * Returns the value of the ForceDelete property for this object.
     *
     * @return The value of the ForceDelete property for this object.
     */
    public Boolean isForceDelete() {
        return forceDelete;
    }
    
    /**
     * Sets the value of the ForceDelete property for this object.
     *
     * @param forceDelete The new value for the ForceDelete property for this object.
     */
    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }
    
    /**
     * Sets the value of the ForceDelete property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forceDelete The new value for the ForceDelete property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteAutoScalingGroupRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    
    
    /**
     * Returns the value of the ForceDelete property for this object.
     *
     * @return The value of the ForceDelete property for this object.
     */
    public Boolean getForceDelete() {
        return forceDelete;
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("ForceDelete: " + forceDelete + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    