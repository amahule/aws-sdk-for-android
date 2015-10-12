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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#listTopics(ListTopicsRequest) ListTopics operation}.
 * <p>
 * The ListTopics action returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a
 * NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#listTopics(ListTopicsRequest)
 */
public class ListTopicsRequest extends AmazonWebServiceRequest {

    /**
     * Token returned by the previous ListTopics request.
     */
    private String nextToken;

    /**
     * Default constructor for a new ListTopicsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListTopicsRequest() {}
    
    /**
     * Constructs a new ListTopicsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param nextToken Token returned by the previous ListTopics request.
     */
    public ListTopicsRequest(String nextToken) {
        this.nextToken = nextToken;
    }

    
    
    /**
     * Token returned by the previous ListTopics request.
     *
     * @return Token returned by the previous ListTopics request.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Token returned by the previous ListTopics request.
     *
     * @param nextToken Token returned by the previous ListTopics request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Token returned by the previous ListTopics request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Token returned by the previous ListTopics request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTopicsRequest withNextToken(String nextToken) {
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
        if (nextToken != null) sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListTopicsRequest == false) return false;
        ListTopicsRequest other = (ListTopicsRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    