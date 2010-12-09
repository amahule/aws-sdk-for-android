/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#batchDeleteAttributes(BatchDeleteAttributesRequest) BatchDeleteAttributes operation}.
 * <p>
 * Deletes one or more attributes associated with one or more items. If
 * all attributes of an item are deleted, the item is deleted.
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#batchDeleteAttributes(BatchDeleteAttributesRequest)
 */
public class BatchDeleteAttributesRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain in which the attributes are being deleted.
     */
    private String domainName;

    /**
     * A list of items on which to perform the operation.
     */
    private java.util.List<DeletableItem> items;

    /**
     * Default constructor for a new BatchDeleteAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BatchDeleteAttributesRequest() {}
    
    /**
     * Constructs a new BatchDeleteAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which the attributes are
     * being deleted.
     * @param items A list of items on which to perform the operation.
     */
    public BatchDeleteAttributesRequest(String domainName, java.util.List<DeletableItem> items) {
        this.domainName = domainName;
        this.items = items;
    }
    
    /**
     * The name of the domain in which the attributes are being deleted.
     *
     * @return The name of the domain in which the attributes are being deleted.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain in which the attributes are being deleted.
     *
     * @param domainName The name of the domain in which the attributes are being deleted.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain in which the attributes are being deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain in which the attributes are being deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchDeleteAttributesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    
    /**
     * A list of items on which to perform the operation.
     *
     * @return A list of items on which to perform the operation.
     */
    public java.util.List<DeletableItem> getItems() {
        if (items == null) {
            items = new java.util.ArrayList<DeletableItem>();
        }
        return items;
    }
    
    /**
     * A list of items on which to perform the operation.
     *
     * @param items A list of items on which to perform the operation.
     */
    public void setItems(java.util.Collection<DeletableItem> items) {
        java.util.List<DeletableItem> itemsCopy = new java.util.ArrayList<DeletableItem>();
        if (items != null) {
            itemsCopy.addAll(items);
        }
        this.items = itemsCopy;
    }
    
    /**
     * A list of items on which to perform the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A list of items on which to perform the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchDeleteAttributesRequest withItems(DeletableItem... items) {
        for (DeletableItem value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * A list of items on which to perform the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A list of items on which to perform the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchDeleteAttributesRequest withItems(java.util.Collection<DeletableItem> items) {
        java.util.List<DeletableItem> itemsCopy = new java.util.ArrayList<DeletableItem>();
        if (items != null) {
            itemsCopy.addAll(items);
        }
        this.items = itemsCopy;

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
        sb.append("DomainName: " + domainName + ", ");
        sb.append("Items: " + items + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    