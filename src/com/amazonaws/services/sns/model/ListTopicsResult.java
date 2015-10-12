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
package com.amazonaws.services.sns.model;

/**
 * List Topics Result
 */
public class ListTopicsResult {

    /**
     * A list of topic ARNs.
     */
    private java.util.List<Topic> topics;

    /**
     * Token to pass along to the next ListTopics request. This element is
     * returned if there are additional topics to retrieve.
     */
    private String nextToken;

    /**
     * A list of topic ARNs.
     *
     * @return A list of topic ARNs.
     */
    public java.util.List<Topic> getTopics() {
        
        if (topics == null) {
            topics = new java.util.ArrayList<Topic>();
        }
        return topics;
    }
    
    /**
     * A list of topic ARNs.
     *
     * @param topics A list of topic ARNs.
     */
    public void setTopics(java.util.Collection<Topic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        java.util.List<Topic> topicsCopy = new java.util.ArrayList<Topic>(topics.size());
        topicsCopy.addAll(topics);
        this.topics = topicsCopy;
    }
    
    /**
     * A list of topic ARNs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topics A list of topic ARNs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTopicsResult withTopics(Topic... topics) {
        if (getTopics() == null) setTopics(new java.util.ArrayList<Topic>(topics.length));
        for (Topic value : topics) {
            getTopics().add(value);
        }
        return this;
    }
    
    /**
     * A list of topic ARNs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topics A list of topic ARNs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTopicsResult withTopics(java.util.Collection<Topic> topics) {
        if (topics == null) {
            this.topics = null;
        } else {
            java.util.List<Topic> topicsCopy = new java.util.ArrayList<Topic>(topics.size());
            topicsCopy.addAll(topics);
            this.topics = topicsCopy;
        }

        return this;
    }
    
    /**
     * Token to pass along to the next ListTopics request. This element is
     * returned if there are additional topics to retrieve.
     *
     * @return Token to pass along to the next ListTopics request. This element is
     *         returned if there are additional topics to retrieve.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Token to pass along to the next ListTopics request. This element is
     * returned if there are additional topics to retrieve.
     *
     * @param nextToken Token to pass along to the next ListTopics request. This element is
     *         returned if there are additional topics to retrieve.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Token to pass along to the next ListTopics request. This element is
     * returned if there are additional topics to retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Token to pass along to the next ListTopics request. This element is
     *         returned if there are additional topics to retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTopicsResult withNextToken(String nextToken) {
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
        if (topics != null) sb.append("Topics: " + topics + ", ");
        if (nextToken != null) sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListTopicsResult == false) return false;
        ListTopicsResult other = (ListTopicsResult)obj;
        
        if (other.getTopics() == null ^ this.getTopics() == null) return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    