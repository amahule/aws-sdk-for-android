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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricAlarm(PutMetricAlarmRequest) PutMetricAlarm operation}.
 * 
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricAlarm(PutMetricAlarmRequest)
 */
public class PutMetricAlarmRequest extends AmazonWebServiceRequest {

    private String alarmName;

    private String alarmDescription;

    private Boolean actionsEnabled;

    private java.util.List<String> oKActions;

    private java.util.List<String> alarmActions;

    private java.util.List<String> insufficientDataActions;

    private String metricName;

    private String namespace;

    private String statistic;

    private java.util.List<Dimension> dimensions;

    private Integer period;

    private String unit;

    private Integer evaluationPeriods;

    private Double threshold;

    private String comparisonOperator;

    /**
     * Returns the value of the AlarmName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the AlarmName property for this object.
     */
    public String getAlarmName() {
        return alarmName;
    }
    
    /**
     * Sets the value of the AlarmName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName The new value for the AlarmName property for this object.
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }
    
    /**
     * Sets the value of the AlarmName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName The new value for the AlarmName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    
    
    /**
     * Returns the value of the AlarmDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The value of the AlarmDescription property for this object.
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }
    
    /**
     * Sets the value of the AlarmDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param alarmDescription The new value for the AlarmDescription property for this object.
     */
    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }
    
    /**
     * Sets the value of the AlarmDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param alarmDescription The new value for the AlarmDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }
    
    
    /**
     * Returns the value of the ActionsEnabled property for this object.
     *
     * @return The value of the ActionsEnabled property for this object.
     */
    public Boolean isActionsEnabled() {
        return actionsEnabled;
    }
    
    /**
     * Sets the value of the ActionsEnabled property for this object.
     *
     * @param actionsEnabled The new value for the ActionsEnabled property for this object.
     */
    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }
    
    /**
     * Sets the value of the ActionsEnabled property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionsEnabled The new value for the ActionsEnabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
        return this;
    }
    
    
    /**
     * Returns the value of the ActionsEnabled property for this object.
     *
     * @return The value of the ActionsEnabled property for this object.
     */
    public Boolean getActionsEnabled() {
        return actionsEnabled;
    }
    
    /**
     * Returns the value of the OKActions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The value of the OKActions property for this object.
     */
    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
            oKActions = new java.util.ArrayList<String>();
        }
        return oKActions;
    }
    
    /**
     * Sets the value of the OKActions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param oKActions The new value for the OKActions property for this object.
     */
    public void setOKActions(java.util.Collection<String> oKActions) {
        java.util.List<String> oKActionsCopy = new java.util.ArrayList<String>();
        if (oKActions != null) {
            oKActionsCopy.addAll(oKActions);
        }
        this.oKActions = oKActionsCopy;
    }
    
    /**
     * Sets the value of the OKActions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param oKActions The new value for the OKActions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withOKActions(String... oKActions) {
        for (String value : oKActions) {
            getOKActions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the OKActions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param oKActions The new value for the OKActions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withOKActions(java.util.Collection<String> oKActions) {
        java.util.List<String> oKActionsCopy = new java.util.ArrayList<String>();
        if (oKActions != null) {
            oKActionsCopy.addAll(oKActions);
        }
        this.oKActions = oKActionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the AlarmActions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The value of the AlarmActions property for this object.
     */
    public java.util.List<String> getAlarmActions() {
        if (alarmActions == null) {
            alarmActions = new java.util.ArrayList<String>();
        }
        return alarmActions;
    }
    
    /**
     * Sets the value of the AlarmActions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param alarmActions The new value for the AlarmActions property for this object.
     */
    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        java.util.List<String> alarmActionsCopy = new java.util.ArrayList<String>();
        if (alarmActions != null) {
            alarmActionsCopy.addAll(alarmActions);
        }
        this.alarmActions = alarmActionsCopy;
    }
    
    /**
     * Sets the value of the AlarmActions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param alarmActions The new value for the AlarmActions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withAlarmActions(String... alarmActions) {
        for (String value : alarmActions) {
            getAlarmActions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AlarmActions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param alarmActions The new value for the AlarmActions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withAlarmActions(java.util.Collection<String> alarmActions) {
        java.util.List<String> alarmActionsCopy = new java.util.ArrayList<String>();
        if (alarmActions != null) {
            alarmActionsCopy.addAll(alarmActions);
        }
        this.alarmActions = alarmActionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the InsufficientDataActions property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The value of the InsufficientDataActions property for this object.
     */
    public java.util.List<String> getInsufficientDataActions() {
        if (insufficientDataActions == null) {
            insufficientDataActions = new java.util.ArrayList<String>();
        }
        return insufficientDataActions;
    }
    
    /**
     * Sets the value of the InsufficientDataActions property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param insufficientDataActions The new value for the InsufficientDataActions property for this
     *         object.
     */
    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        java.util.List<String> insufficientDataActionsCopy = new java.util.ArrayList<String>();
        if (insufficientDataActions != null) {
            insufficientDataActionsCopy.addAll(insufficientDataActions);
        }
        this.insufficientDataActions = insufficientDataActionsCopy;
    }
    
    /**
     * Sets the value of the InsufficientDataActions property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param insufficientDataActions The new value for the InsufficientDataActions property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withInsufficientDataActions(String... insufficientDataActions) {
        for (String value : insufficientDataActions) {
            getInsufficientDataActions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the InsufficientDataActions property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param insufficientDataActions The new value for the InsufficientDataActions property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        java.util.List<String> insufficientDataActionsCopy = new java.util.ArrayList<String>();
        if (insufficientDataActions != null) {
            insufficientDataActionsCopy.addAll(insufficientDataActions);
        }
        this.insufficientDataActions = insufficientDataActionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the MetricName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the MetricName property for this object.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * Sets the value of the MetricName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The new value for the MetricName property for this object.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * Sets the value of the MetricName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The new value for the MetricName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    
    
    /**
     * Returns the value of the Namespace property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The value of the Namespace property for this object.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * Sets the value of the Namespace property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The new value for the Namespace property for this object.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * Sets the value of the Namespace property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The new value for the Namespace property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * Returns the value of the Statistic property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @return The value of the Statistic property for this object.
     *
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }
    
    /**
     * Sets the value of the Statistic property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The new value for the Statistic property for this object.
     *
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }
    
    /**
     * Sets the value of the Statistic property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The new value for the Statistic property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Statistic
     */
    public PutMetricAlarmRequest withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }
    
    
    /**
     * Returns the value of the Dimensions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return The value of the Dimensions property for this object.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new java.util.ArrayList<Dimension>();
        }
        return dimensions;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The new value for the Dimensions property for this object.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The new value for the Dimensions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withDimensions(Dimension... dimensions) {
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The new value for the Dimensions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Period property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return The value of the Period property for this object.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * Sets the value of the Period property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The new value for the Period property for this object.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * Sets the value of the Period property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The new value for the Period property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withPeriod(Integer period) {
        this.period = period;
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
    public PutMetricAlarmRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    
    
    /**
     * Returns the value of the EvaluationPeriods property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the EvaluationPeriods property for this object.
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }
    
    /**
     * Sets the value of the EvaluationPeriods property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods The new value for the EvaluationPeriods property for this object.
     */
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }
    
    /**
     * Sets the value of the EvaluationPeriods property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods The new value for the EvaluationPeriods property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }
    
    
    /**
     * Returns the value of the Threshold property for this object.
     *
     * @return The value of the Threshold property for this object.
     */
    public Double getThreshold() {
        return threshold;
    }
    
    /**
     * Sets the value of the Threshold property for this object.
     *
     * @param threshold The new value for the Threshold property for this object.
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
    
    /**
     * Sets the value of the Threshold property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param threshold The new value for the Threshold property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricAlarmRequest withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    
    
    /**
     * Returns the value of the ComparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @return The value of the ComparisonOperator property for this object.
     *
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }
    
    /**
     * Sets the value of the ComparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator The new value for the ComparisonOperator property for this object.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }
    
    /**
     * Sets the value of the ComparisonOperator property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator The new value for the ComparisonOperator property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ComparisonOperator
     */
    public PutMetricAlarmRequest withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
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
        sb.append("AlarmName: " + alarmName + ", ");
        sb.append("AlarmDescription: " + alarmDescription + ", ");
        sb.append("ActionsEnabled: " + actionsEnabled + ", ");
        sb.append("OKActions: " + oKActions + ", ");
        sb.append("AlarmActions: " + alarmActions + ", ");
        sb.append("InsufficientDataActions: " + insufficientDataActions + ", ");
        sb.append("MetricName: " + metricName + ", ");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("Statistic: " + statistic + ", ");
        sb.append("Dimensions: " + dimensions + ", ");
        sb.append("Period: " + period + ", ");
        sb.append("Unit: " + unit + ", ");
        sb.append("EvaluationPeriods: " + evaluationPeriods + ", ");
        sb.append("Threshold: " + threshold + ", ");
        sb.append("ComparisonOperator: " + comparisonOperator + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    