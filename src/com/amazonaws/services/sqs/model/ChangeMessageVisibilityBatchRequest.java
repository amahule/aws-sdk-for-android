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
package com.amazonaws.services.sqs.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest) ChangeMessageVisibilityBatch operation}.
 * <p>
 * This is a batch version of ChangeMessageVisibility. It takes multiple receipt handles and performs the operation on each of the them. The result of
 * the operation on each message is reported individually in the response.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest)
 */
public class ChangeMessageVisibilityBatchRequest extends AmazonWebServiceRequest {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     */
    private java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries;

    /**
     * Default constructor for a new ChangeMessageVisibilityBatchRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityBatchRequest() {}
    
    /**
     * Constructs a new ChangeMessageVisibilityBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param entries A list of receipt handles of the messages for which the
     * visibility timeout must be changed.
     */
    public ChangeMessageVisibilityBatchRequest(String queueUrl, java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {
        this.queueUrl = queueUrl;
        this.entries = entries;
    }

    
    
    /**
     * The URL of the SQS queue to take action on.
     *
     * @return The URL of the SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     *
     * @return A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     */
    public java.util.List<ChangeMessageVisibilityBatchRequestEntry> getEntries() {
        
        if (entries == null) {
            entries = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>();
        }
        return entries;
    }
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     *
     * @param entries A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     */
    public void setEntries(java.util.Collection<ChangeMessageVisibilityBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        java.util.List<ChangeMessageVisibilityBatchRequestEntry> entriesCopy = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>(entries.size());
        entriesCopy.addAll(entries);
        this.entries = entriesCopy;
    }
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityBatchRequest withEntries(ChangeMessageVisibilityBatchRequestEntry... entries) {
        if (getEntries() == null) setEntries(new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>(entries.length));
        for (ChangeMessageVisibilityBatchRequestEntry value : entries) {
            getEntries().add(value);
        }
        return this;
    }
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityBatchRequest withEntries(java.util.Collection<ChangeMessageVisibilityBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
        } else {
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entriesCopy = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>(entries.size());
            entriesCopy.addAll(entries);
            this.entries = entriesCopy;
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
        if (queueUrl != null) sb.append("QueueUrl: " + queueUrl + ", ");
        if (entries != null) sb.append("Entries: " + entries + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ChangeMessageVisibilityBatchRequest == false) return false;
        ChangeMessageVisibilityBatchRequest other = (ChangeMessageVisibilityBatchRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getEntries() == null ^ this.getEntries() == null) return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false) return false; 
        return true;
    }
    
}
    