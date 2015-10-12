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
package com.amazonaws.services.elasticloadbalancing.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerListeners(CreateLoadBalancerListenersRequest) CreateLoadBalancerListeners operation}.
 * <p>
 * Creates one or more listeners on a LoadBalancer for the specified port. If a listener with the given port does not already exist, it will be created;
 * otherwise, the properties of the new listener must match the properties of the existing listener.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerListeners(CreateLoadBalancerListenersRequest)
 */
public class CreateLoadBalancerListenersRequest extends AmazonWebServiceRequest {

    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     */
    private java.util.List<Listener> listeners;

    /**
     * Default constructor for a new CreateLoadBalancerListenersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateLoadBalancerListenersRequest() {}
    
    /**
     * Constructs a new CreateLoadBalancerListenersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name of the new LoadBalancer. The name
     * must be unique within your AWS account.
     * @param listeners A list of <code>LoadBalancerPort</code>,
     * <code>InstancePort</code>, <code>Protocol</code>, and
     * <code>SSLCertificateId</code> items.
     */
    public CreateLoadBalancerListenersRequest(String loadBalancerName, java.util.List<Listener> listeners) {
        this.loadBalancerName = loadBalancerName;
        this.listeners = listeners;
    }

    
    
    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     *
     * @return The name of the new LoadBalancer. The name must be unique within your
     *         AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     *
     * @param loadBalancerName The name of the new LoadBalancer. The name must be unique within your
     *         AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the new LoadBalancer. The name must be unique within your
     *         AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerListenersRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     *
     * @return A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     */
    public java.util.List<Listener> getListeners() {
        
        if (listeners == null) {
            listeners = new java.util.ArrayList<Listener>();
        }
        return listeners;
    }
    
    /**
     * A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     *
     * @param listeners A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>(listeners.size());
        listenersCopy.addAll(listeners);
        this.listeners = listenersCopy;
    }
    
    /**
     * A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerListenersRequest withListeners(Listener... listeners) {
        if (getListeners() == null) setListeners(new java.util.ArrayList<Listener>(listeners.length));
        for (Listener value : listeners) {
            getListeners().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of <code>LoadBalancerPort</code>, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateId</code> items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerListenersRequest withListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
        } else {
            java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>(listeners.size());
            listenersCopy.addAll(listeners);
            this.listeners = listenersCopy;
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
        if (loadBalancerName != null) sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        if (listeners != null) sb.append("Listeners: " + listeners + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateLoadBalancerListenersRequest == false) return false;
        CreateLoadBalancerListenersRequest other = (CreateLoadBalancerListenersRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getListeners() == null ^ this.getListeners() == null) return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false) return false; 
        return true;
    }
    
}
    