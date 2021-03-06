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
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#domainMetadata(DomainMetadataRequest) DomainMetadata operation}.
 * <p>
 * Returns information about the domain, including when the domain was
 * created, the number of items and attributes in the domain, and the
 * size of the attribute names and values.
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#domainMetadata(DomainMetadataRequest)
 */
public class DomainMetadataRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain for which to display the metadata of.
     */
    private String domainName;

    /**
     * Default constructor for a new DomainMetadataRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DomainMetadataRequest() {}
    
    /**
     * Constructs a new DomainMetadataRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain for which to display the
     * metadata of.
     */
    public DomainMetadataRequest(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain for which to display the metadata of.
     *
     * @return The name of the domain for which to display the metadata of.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain for which to display the metadata of.
     *
     * @param domainName The name of the domain for which to display the metadata of.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain for which to display the metadata of.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain for which to display the metadata of.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DomainMetadataRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    