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
package com.amazonaws.services.cloudwatch.model;

/**
 * Datapoint
 */
public class Datapoint {

    private java.util.Date timestamp;

    private Double sampleCount;

    private Double average;

    private Double sum;

    private Double minimum;

    private Double maximum;

    private String unit;

    /**
     * Returns the value of the Timestamp property for this object.
     *
     * @return The value of the Timestamp property for this object.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
    
    /**
     * Sets the value of the Timestamp property for this object.
     *
     * @param timestamp The new value for the Timestamp property for this object.
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * Sets the value of the Timestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The new value for the Timestamp property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Datapoint withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    
    /**
     * Returns the value of the SampleCount property for this object.
     *
     * @return The value of the SampleCount property for this object.
     */
    public Double getSampleCount() {
        return sampleCount;
    }
    
    /**
     * Sets the value of the SampleCount property for this object.
     *
     * @param sampleCount The new value for the SampleCount property for this object.
     */
    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }
    
    /**
     * Sets the value of the SampleCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sampleCount The new value for the SampleCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Datapoint withSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }
    
    
    /**
     * Returns the value of the Average property for this object.
     *
     * @return The value of the Average property for this object.
     */
    public Double getAverage() {
        return average;
    }
    
    /**
     * Sets the value of the Average property for this object.
     *
     * @param average The new value for the Average property for this object.
     */
    public void setAverage(Double average) {
        this.average = average;
    }
    
    /**
     * Sets the value of the Average property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param average The new value for the Average property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Datapoint withAverage(Double average) {
        this.average = average;
        return this;
    }
    
    
    /**
     * Returns the value of the Sum property for this object.
     *
     * @return The value of the Sum property for this object.
     */
    public Double getSum() {
        return sum;
    }
    
    /**
     * Sets the value of the Sum property for this object.
     *
     * @param sum The new value for the Sum property for this object.
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }
    
    /**
     * Sets the value of the Sum property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sum The new value for the Sum property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Datapoint withSum(Double sum) {
        this.sum = sum;
        return this;
    }
    
    
    /**
     * Returns the value of the Minimum property for this object.
     *
     * @return The value of the Minimum property for this object.
     */
    public Double getMinimum() {
        return minimum;
    }
    
    /**
     * Sets the value of the Minimum property for this object.
     *
     * @param minimum The new value for the Minimum property for this object.
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }
    
    /**
     * Sets the value of the Minimum property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimum The new value for the Minimum property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Datapoint withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }
    
    
    /**
     * Returns the value of the Maximum property for this object.
     *
     * @return The value of the Maximum property for this object.
     */
    public Double getMaximum() {
        return maximum;
    }
    
    /**
     * Sets the value of the Maximum property for this object.
     *
     * @param maximum The new value for the Maximum property for this object.
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }
    
    /**
     * Sets the value of the Maximum property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maximum The new value for the Maximum property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Datapoint withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }
    
    
    /**
     * Returns the value of the Unit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @return The value of the Unit property for this object.
     *
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * Sets the value of the Unit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The new value for the Unit property for this object.
     *
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * Sets the value of the Unit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The new value for the Unit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see StandardUnit
     */
    public Datapoint withUnit(String unit) {
        this.unit = unit;
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
        sb.append("Timestamp: " + timestamp + ", ");
        sb.append("SampleCount: " + sampleCount + ", ");
        sb.append("Average: " + average + ", ");
        sb.append("Sum: " + sum + ", ");
        sb.append("Minimum: " + minimum + ", ");
        sb.append("Maximum: " + maximum + ", ");
        sb.append("Unit: " + unit + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    