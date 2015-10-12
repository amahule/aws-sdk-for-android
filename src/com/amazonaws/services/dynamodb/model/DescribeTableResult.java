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
package com.amazonaws.services.dynamodb.model;

/**
 * Describe Table Result
 */
public class DescribeTableResult {

    private TableDescription table;

    /**
     * Returns the value of the Table property for this object.
     *
     * @return The value of the Table property for this object.
     */
    public TableDescription getTable() {
        return table;
    }
    
    /**
     * Sets the value of the Table property for this object.
     *
     * @param table The new value for the Table property for this object.
     */
    public void setTable(TableDescription table) {
        this.table = table;
    }
    
    /**
     * Sets the value of the Table property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param table The new value for the Table property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTableResult withTable(TableDescription table) {
        this.table = table;
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
        if (table != null) sb.append("Table: " + table + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeTableResult == false) return false;
        DescribeTableResult other = (DescribeTableResult)obj;
        
        if (other.getTable() == null ^ this.getTable() == null) return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false) return false; 
        return true;
    }
    
}
    