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
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#describeAlarmHistory(DescribeAlarmHistoryRequest) DescribeAlarmHistory operation}.
 * 
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#describeAlarmHistory(DescribeAlarmHistoryRequest)
 */
public class DescribeAlarmHistoryRequest extends AmazonWebServiceRequest {

    private String alarmName;

    private String historyItemType;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private Integer maxRecords;

    private String nextToken;

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
    public DescribeAlarmHistoryRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    
    
    /**
     * Returns the value of the HistoryItemType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @return The value of the HistoryItemType property for this object.
     *
     * @see HistoryItemType
     */
    public String getHistoryItemType() {
        return historyItemType;
    }
    
    /**
     * Sets the value of the HistoryItemType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType The new value for the HistoryItemType property for this object.
     *
     * @see HistoryItemType
     */
    public void setHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
    }
    
    /**
     * Sets the value of the HistoryItemType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType The new value for the HistoryItemType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see HistoryItemType
     */
    public DescribeAlarmHistoryRequest withHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
        return this;
    }
    
    
    /**
     * Returns the value of the StartDate property for this object.
     *
     * @return The value of the StartDate property for this object.
     */
    public java.util.Date getStartDate() {
        return startDate;
    }
    
    /**
     * Sets the value of the StartDate property for this object.
     *
     * @param startDate The new value for the StartDate property for this object.
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Sets the value of the StartDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDate The new value for the StartDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmHistoryRequest withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }
    
    
    /**
     * Returns the value of the EndDate property for this object.
     *
     * @return The value of the EndDate property for this object.
     */
    public java.util.Date getEndDate() {
        return endDate;
    }
    
    /**
     * Sets the value of the EndDate property for this object.
     *
     * @param endDate The new value for the EndDate property for this object.
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }
    
    /**
     * Sets the value of the EndDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDate The new value for the EndDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmHistoryRequest withEndDate(java.util.Date endDate) {
        this.endDate = endDate;
        return this;
    }
    
    
    /**
     * Returns the value of the MaxRecords property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return The value of the MaxRecords property for this object.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * Sets the value of the MaxRecords property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxRecords The new value for the MaxRecords property for this object.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * Sets the value of the MaxRecords property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxRecords The new value for the MaxRecords property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmHistoryRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * Returns the value of the NextToken property for this object.
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("HistoryItemType: " + historyItemType + ", ");
        sb.append("StartDate: " + startDate + ", ");
        sb.append("EndDate: " + endDate + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    