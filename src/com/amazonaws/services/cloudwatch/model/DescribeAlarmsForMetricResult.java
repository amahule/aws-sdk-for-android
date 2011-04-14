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
 * Describe Alarms For Metric Result
 */
public class DescribeAlarmsForMetricResult {

    private java.util.List<MetricAlarm> metricAlarms;

    /**
     * Returns the value of the MetricAlarms property for this object.
     *
     * @return The value of the MetricAlarms property for this object.
     */
    public java.util.List<MetricAlarm> getMetricAlarms() {
        if (metricAlarms == null) {
            metricAlarms = new java.util.ArrayList<MetricAlarm>();
        }
        return metricAlarms;
    }
    
    /**
     * Sets the value of the MetricAlarms property for this object.
     *
     * @param metricAlarms The new value for the MetricAlarms property for this object.
     */
    public void setMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        java.util.List<MetricAlarm> metricAlarmsCopy = new java.util.ArrayList<MetricAlarm>();
        if (metricAlarms != null) {
            metricAlarmsCopy.addAll(metricAlarms);
        }
        this.metricAlarms = metricAlarmsCopy;
    }
    
    /**
     * Sets the value of the MetricAlarms property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricAlarms The new value for the MetricAlarms property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricResult withMetricAlarms(MetricAlarm... metricAlarms) {
        for (MetricAlarm value : metricAlarms) {
            getMetricAlarms().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the MetricAlarms property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricAlarms The new value for the MetricAlarms property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricResult withMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        java.util.List<MetricAlarm> metricAlarmsCopy = new java.util.ArrayList<MetricAlarm>();
        if (metricAlarms != null) {
            metricAlarmsCopy.addAll(metricAlarms);
        }
        this.metricAlarms = metricAlarmsCopy;

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
        sb.append("MetricAlarms: " + metricAlarms + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    