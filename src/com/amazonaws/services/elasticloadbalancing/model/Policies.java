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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Policies
 */
public class Policies {

    private java.util.List<AppCookieStickinessPolicy> appCookieStickinessPolicies;

    private java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPolicies;

    private java.util.List<String> otherPolicies;

    /**
     * Default constructor for a new Policies object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Policies() {}
    
    /**
     * Returns the value of the AppCookieStickinessPolicies property for this
     * object.
     *
     * @return The value of the AppCookieStickinessPolicies property for this object.
     */
    public java.util.List<AppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
        if (appCookieStickinessPolicies == null) {
            appCookieStickinessPolicies = new java.util.ArrayList<AppCookieStickinessPolicy>();
        }
        return appCookieStickinessPolicies;
    }
    
    /**
     * Sets the value of the AppCookieStickinessPolicies property for this
     * object.
     *
     * @param appCookieStickinessPolicies The new value for the AppCookieStickinessPolicies property for this
     *         object.
     */
    public void setAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        java.util.List<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new java.util.ArrayList<AppCookieStickinessPolicy>();
        if (appCookieStickinessPolicies != null) {
            appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
        }
        this.appCookieStickinessPolicies = appCookieStickinessPoliciesCopy;
    }
    
    /**
     * Sets the value of the AppCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appCookieStickinessPolicies The new value for the AppCookieStickinessPolicies property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withAppCookieStickinessPolicies(AppCookieStickinessPolicy... appCookieStickinessPolicies) {
        for (AppCookieStickinessPolicy value : appCookieStickinessPolicies) {
            getAppCookieStickinessPolicies().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AppCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appCookieStickinessPolicies The new value for the AppCookieStickinessPolicies property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        java.util.List<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new java.util.ArrayList<AppCookieStickinessPolicy>();
        if (appCookieStickinessPolicies != null) {
            appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
        }
        this.appCookieStickinessPolicies = appCookieStickinessPoliciesCopy;

        return this;
    }
    
    /**
     * Returns the value of the LBCookieStickinessPolicies property for this
     * object.
     *
     * @return The value of the LBCookieStickinessPolicies property for this object.
     */
    public java.util.List<LBCookieStickinessPolicy> getLBCookieStickinessPolicies() {
        if (lBCookieStickinessPolicies == null) {
            lBCookieStickinessPolicies = new java.util.ArrayList<LBCookieStickinessPolicy>();
        }
        return lBCookieStickinessPolicies;
    }
    
    /**
     * Sets the value of the LBCookieStickinessPolicies property for this
     * object.
     *
     * @param lBCookieStickinessPolicies The new value for the LBCookieStickinessPolicies property for this
     *         object.
     */
    public void setLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new java.util.ArrayList<LBCookieStickinessPolicy>();
        if (lBCookieStickinessPolicies != null) {
            lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
        }
        this.lBCookieStickinessPolicies = lBCookieStickinessPoliciesCopy;
    }
    
    /**
     * Sets the value of the LBCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lBCookieStickinessPolicies The new value for the LBCookieStickinessPolicies property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withLBCookieStickinessPolicies(LBCookieStickinessPolicy... lBCookieStickinessPolicies) {
        for (LBCookieStickinessPolicy value : lBCookieStickinessPolicies) {
            getLBCookieStickinessPolicies().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the LBCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lBCookieStickinessPolicies The new value for the LBCookieStickinessPolicies property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new java.util.ArrayList<LBCookieStickinessPolicy>();
        if (lBCookieStickinessPolicies != null) {
            lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
        }
        this.lBCookieStickinessPolicies = lBCookieStickinessPoliciesCopy;

        return this;
    }
    
    /**
     * Returns the value of the OtherPolicies property for this object.
     *
     * @return The value of the OtherPolicies property for this object.
     */
    public java.util.List<String> getOtherPolicies() {
        if (otherPolicies == null) {
            otherPolicies = new java.util.ArrayList<String>();
        }
        return otherPolicies;
    }
    
    /**
     * Sets the value of the OtherPolicies property for this object.
     *
     * @param otherPolicies The new value for the OtherPolicies property for this object.
     */
    public void setOtherPolicies(java.util.Collection<String> otherPolicies) {
        java.util.List<String> otherPoliciesCopy = new java.util.ArrayList<String>();
        if (otherPolicies != null) {
            otherPoliciesCopy.addAll(otherPolicies);
        }
        this.otherPolicies = otherPoliciesCopy;
    }
    
    /**
     * Sets the value of the OtherPolicies property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param otherPolicies The new value for the OtherPolicies property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withOtherPolicies(String... otherPolicies) {
        for (String value : otherPolicies) {
            getOtherPolicies().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the OtherPolicies property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param otherPolicies The new value for the OtherPolicies property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withOtherPolicies(java.util.Collection<String> otherPolicies) {
        java.util.List<String> otherPoliciesCopy = new java.util.ArrayList<String>();
        if (otherPolicies != null) {
            otherPoliciesCopy.addAll(otherPolicies);
        }
        this.otherPolicies = otherPoliciesCopy;

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
        sb.append("AppCookieStickinessPolicies: " + appCookieStickinessPolicies + ", ");
        sb.append("LBCookieStickinessPolicies: " + lBCookieStickinessPolicies + ", ");
        sb.append("OtherPolicies: " + otherPolicies + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    