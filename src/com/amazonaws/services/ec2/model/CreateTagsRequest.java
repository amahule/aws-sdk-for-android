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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createTags(CreateTagsRequest) CreateTags operation}.
 * <p>
 * Adds or overwrites tags for the specified resources. Each resource can have a maximum of 10 tags. Each tag consists of a key-value pair. Tag keys
 * must be unique per resource.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createTags(CreateTagsRequest)
 */
public class CreateTagsRequest extends AmazonWebServiceRequest {

    /**
     * One or more IDs of resources to tag. This could be the ID of an AMI,
     * an instance, an EBS volume, or snapshot, etc.
     */
    private java.util.List<String> resources;

    /**
     * The tags to add or overwrite for the specified resources. Each tag
     * item consists of a key-value pair.
     */
    private java.util.List<Tag> tags;

    /**
     * Default constructor for a new CreateTagsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateTagsRequest() {}
    
    /**
     * Constructs a new CreateTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resources One or more IDs of resources to tag. This could be
     * the ID of an AMI, an instance, an EBS volume, or snapshot, etc.
     * @param tags The tags to add or overwrite for the specified resources.
     * Each tag item consists of a key-value pair.
     */
    public CreateTagsRequest(java.util.List<String> resources, java.util.List<Tag> tags) {
        this.resources = resources;
        this.tags = tags;
    }

    
    
    /**
     * One or more IDs of resources to tag. This could be the ID of an AMI,
     * an instance, an EBS volume, or snapshot, etc.
     *
     * @return One or more IDs of resources to tag. This could be the ID of an AMI,
     *         an instance, an EBS volume, or snapshot, etc.
     */
    public java.util.List<String> getResources() {
        
        if (resources == null) {
            resources = new java.util.ArrayList<String>();
        }
        return resources;
    }
    
    /**
     * One or more IDs of resources to tag. This could be the ID of an AMI,
     * an instance, an EBS volume, or snapshot, etc.
     *
     * @param resources One or more IDs of resources to tag. This could be the ID of an AMI,
     *         an instance, an EBS volume, or snapshot, etc.
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        java.util.List<String> resourcesCopy = new java.util.ArrayList<String>(resources.size());
        resourcesCopy.addAll(resources);
        this.resources = resourcesCopy;
    }
    
    /**
     * One or more IDs of resources to tag. This could be the ID of an AMI,
     * an instance, an EBS volume, or snapshot, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources One or more IDs of resources to tag. This could be the ID of an AMI,
     *         an instance, an EBS volume, or snapshot, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTagsRequest withResources(String... resources) {
        if (getResources() == null) setResources(new java.util.ArrayList<String>(resources.length));
        for (String value : resources) {
            getResources().add(value);
        }
        return this;
    }
    
    /**
     * One or more IDs of resources to tag. This could be the ID of an AMI,
     * an instance, an EBS volume, or snapshot, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources One or more IDs of resources to tag. This could be the ID of an AMI,
     *         an instance, an EBS volume, or snapshot, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTagsRequest withResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
        } else {
            java.util.List<String> resourcesCopy = new java.util.ArrayList<String>(resources.size());
            resourcesCopy.addAll(resources);
            this.resources = resourcesCopy;
        }

        return this;
    }
    
    /**
     * The tags to add or overwrite for the specified resources. Each tag
     * item consists of a key-value pair.
     *
     * @return The tags to add or overwrite for the specified resources. Each tag
     *         item consists of a key-value pair.
     */
    public java.util.List<Tag> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * The tags to add or overwrite for the specified resources. Each tag
     * item consists of a key-value pair.
     *
     * @param tags The tags to add or overwrite for the specified resources. Each tag
     *         item consists of a key-value pair.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * The tags to add or overwrite for the specified resources. Each tag
     * item consists of a key-value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to add or overwrite for the specified resources. Each tag
     *         item consists of a key-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tags to add or overwrite for the specified resources. Each tag
     * item consists of a key-value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to add or overwrite for the specified resources. Each tag
     *         item consists of a key-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (resources != null) sb.append("Resources: " + resources + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateTagsRequest == false) return false;
        CreateTagsRequest other = (CreateTagsRequest)obj;
        
        if (other.getResources() == null ^ this.getResources() == null) return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    