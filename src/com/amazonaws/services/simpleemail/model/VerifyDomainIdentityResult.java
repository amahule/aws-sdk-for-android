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
package com.amazonaws.services.simpleemail.model;

/**
 * <p>
 * Represents a token used for domain ownership verification.
 * </p>
 */
public class VerifyDomainIdentityResult {

    /**
     * A value that must be entered into a TXT record in the DNS settings for
     * the domain, in order to complete domain verification.
     */
    private String verificationToken;

    /**
     * A value that must be entered into a TXT record in the DNS settings for
     * the domain, in order to complete domain verification.
     *
     * @return A value that must be entered into a TXT record in the DNS settings for
     *         the domain, in order to complete domain verification.
     */
    public String getVerificationToken() {
        return verificationToken;
    }
    
    /**
     * A value that must be entered into a TXT record in the DNS settings for
     * the domain, in order to complete domain verification.
     *
     * @param verificationToken A value that must be entered into a TXT record in the DNS settings for
     *         the domain, in order to complete domain verification.
     */
    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }
    
    /**
     * A value that must be entered into a TXT record in the DNS settings for
     * the domain, in order to complete domain verification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param verificationToken A value that must be entered into a TXT record in the DNS settings for
     *         the domain, in order to complete domain verification.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VerifyDomainIdentityResult withVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
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
        if (verificationToken != null) sb.append("VerificationToken: " + verificationToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVerificationToken() == null) ? 0 : getVerificationToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof VerifyDomainIdentityResult == false) return false;
        VerifyDomainIdentityResult other = (VerifyDomainIdentityResult)obj;
        
        if (other.getVerificationToken() == null ^ this.getVerificationToken() == null) return false;
        if (other.getVerificationToken() != null && other.getVerificationToken().equals(this.getVerificationToken()) == false) return false; 
        return true;
    }
    
}
    