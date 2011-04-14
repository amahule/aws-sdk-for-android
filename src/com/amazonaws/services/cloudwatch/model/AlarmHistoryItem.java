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
 * Alarm History Item
 */
public class AlarmHistoryItem {

    private String alarmName;

    private java.util.Date timestamp;

    private String historyItemType;

    private String historySummary;

    private String historyData;

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
    public AlarmHistoryItem withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    
    
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
    public AlarmHistoryItem withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
    public AlarmHistoryItem withHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
        return this;
    }
    
    
    /**
     * Returns the value of the HistorySummary property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the HistorySummary property for this object.
     */
    public String getHistorySummary() {
        return historySummary;
    }
    
    /**
     * Sets the value of the HistorySummary property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param historySummary The new value for the HistorySummary property for this object.
     */
    public void setHistorySummary(String historySummary) {
        this.historySummary = historySummary;
    }
    
    /**
     * Sets the value of the HistorySummary property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param historySummary The new value for the HistorySummary property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AlarmHistoryItem withHistorySummary(String historySummary) {
        this.historySummary = historySummary;
        return this;
    }
    
    
    /**
     * Returns the value of the HistoryData property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     *
     * @return The value of the HistoryData property for this object.
     */
    public String getHistoryData() {
        return historyData;
    }
    
    /**
     * Sets the value of the HistoryData property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     *
     * @param historyData The new value for the HistoryData property for this object.
     */
    public void setHistoryData(String historyData) {
        this.historyData = historyData;
    }
    
    /**
     * Sets the value of the HistoryData property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     *
     * @param historyData The new value for the HistoryData property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AlarmHistoryItem withHistoryData(String historyData) {
        this.historyData = historyData;
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
        sb.append("Timestamp: " + timestamp + ", ");
        sb.append("HistoryItemType: " + historyItemType + ", ");
        sb.append("HistorySummary: " + historySummary + ", ");
        sb.append("HistoryData: " + historyData + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    