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

/**
 * <p>
 * The result of describing the purchased Reserved Instances for your account.
 * </p>
 */
public class DescribeReservedInstancesResult {

    /**
     * The list of described Reserved Instances.
     */
    private java.util.List<ReservedInstances> reservedInstances;

    /**
     * The list of described Reserved Instances.
     *
     * @return The list of described Reserved Instances.
     */
    public java.util.List<ReservedInstances> getReservedInstances() {
        
        if (reservedInstances == null) {
            reservedInstances = new java.util.ArrayList<ReservedInstances>();
        }
        return reservedInstances;
    }
    
    /**
     * The list of described Reserved Instances.
     *
     * @param reservedInstances The list of described Reserved Instances.
     */
    public void setReservedInstances(java.util.Collection<ReservedInstances> reservedInstances) {
        if (reservedInstances == null) {
            this.reservedInstances = null;
            return;
        }

        java.util.List<ReservedInstances> reservedInstancesCopy = new java.util.ArrayList<ReservedInstances>(reservedInstances.size());
        reservedInstancesCopy.addAll(reservedInstances);
        this.reservedInstances = reservedInstancesCopy;
    }
    
    /**
     * The list of described Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstances The list of described Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesResult withReservedInstances(ReservedInstances... reservedInstances) {
        if (getReservedInstances() == null) setReservedInstances(new java.util.ArrayList<ReservedInstances>(reservedInstances.length));
        for (ReservedInstances value : reservedInstances) {
            getReservedInstances().add(value);
        }
        return this;
    }
    
    /**
     * The list of described Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstances The list of described Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesResult withReservedInstances(java.util.Collection<ReservedInstances> reservedInstances) {
        if (reservedInstances == null) {
            this.reservedInstances = null;
        } else {
            java.util.List<ReservedInstances> reservedInstancesCopy = new java.util.ArrayList<ReservedInstances>(reservedInstances.size());
            reservedInstancesCopy.addAll(reservedInstances);
            this.reservedInstances = reservedInstancesCopy;
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
        if (reservedInstances != null) sb.append("ReservedInstances: " + reservedInstances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstances() == null) ? 0 : getReservedInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeReservedInstancesResult == false) return false;
        DescribeReservedInstancesResult other = (DescribeReservedInstancesResult)obj;
        
        if (other.getReservedInstances() == null ^ this.getReservedInstances() == null) return false;
        if (other.getReservedInstances() != null && other.getReservedInstances().equals(this.getReservedInstances()) == false) return false; 
        return true;
    }
    
}
    