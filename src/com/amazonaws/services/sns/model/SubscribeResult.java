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
 * Subscribe Result
 */
public class SubscribeResult {

    /**
     * The ARN of the subscription, if the service was able to create a
     * subscription immediately (without requiring endpoint owner
     * confirmation).
     */
    private String subscriptionArn;

    /**
     * The ARN of the subscription, if the service was able to create a
     * subscription immediately (without requiring endpoint owner
     * confirmation).
     *
     * @return The ARN of the subscription, if the service was able to create a
     *         subscription immediately (without requiring endpoint owner
     *         confirmation).
     */
    public String getSubscriptionArn() {
        return subscriptionArn;
    }
    
    /**
     * The ARN of the subscription, if the service was able to create a
     * subscription immediately (without requiring endpoint owner
     * confirmation).
     *
     * @param subscriptionArn The ARN of the subscription, if the service was able to create a
     *         subscription immediately (without requiring endpoint owner
     *         confirmation).
     */
    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }
    
    /**
     * The ARN of the subscription, if the service was able to create a
     * subscription immediately (without requiring endpoint owner
     * confirmation).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionArn The ARN of the subscription, if the service was able to create a
     *         subscription immediately (without requiring endpoint owner
     *         confirmation).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SubscribeResult withSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
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
        if (subscriptionArn != null) sb.append("SubscriptionArn: " + subscriptionArn + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof SubscribeResult == false) return false;
        SubscribeResult other = (SubscribeResult)obj;
        
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null) return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false) return false; 
        return true;
    }
    
}
    