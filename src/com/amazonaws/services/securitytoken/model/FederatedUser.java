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
package com.amazonaws.services.securitytoken.model;

/**
 * <p>
 * Identifiers for the federated user associated with the credentials.
 * </p>
 */
public class FederatedUser {

    /**
     * The string identifying the federated user associated with the
     * credentials, similar to the UserId of an IAM user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@-\:]*<br/>
     */
    private String federatedUserId;

    /**
     * The ARN specifying the federated user associated with the credentials.
     * For more information about ARNs and how to use them in policies, see
     * <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * Default constructor for a new FederatedUser object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public FederatedUser() {}
    
    /**
     * Constructs a new FederatedUser object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param federatedUserId The string identifying the federated user
     * associated with the credentials, similar to the UserId of an IAM user.
     * @param arn The ARN specifying the federated user associated with the
     * credentials. For more information about ARNs and how to use them in
     * policies, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     */
    public FederatedUser(String federatedUserId, String arn) {
        this.federatedUserId = federatedUserId;
        this.arn = arn;
    }

    
    
    /**
     * The string identifying the federated user associated with the
     * credentials, similar to the UserId of an IAM user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@-\:]*<br/>
     *
     * @return The string identifying the federated user associated with the
     *         credentials, similar to the UserId of an IAM user.
     */
    public String getFederatedUserId() {
        return federatedUserId;
    }
    
    /**
     * The string identifying the federated user associated with the
     * credentials, similar to the UserId of an IAM user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@-\:]*<br/>
     *
     * @param federatedUserId The string identifying the federated user associated with the
     *         credentials, similar to the UserId of an IAM user.
     */
    public void setFederatedUserId(String federatedUserId) {
        this.federatedUserId = federatedUserId;
    }
    
    /**
     * The string identifying the federated user associated with the
     * credentials, similar to the UserId of an IAM user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@-\:]*<br/>
     *
     * @param federatedUserId The string identifying the federated user associated with the
     *         credentials, similar to the UserId of an IAM user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public FederatedUser withFederatedUserId(String federatedUserId) {
        this.federatedUserId = federatedUserId;
        return this;
    }
    
    
    /**
     * The ARN specifying the federated user associated with the credentials.
     * For more information about ARNs and how to use them in policies, see
     * <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The ARN specifying the federated user associated with the credentials.
     *         For more information about ARNs and how to use them in policies, see
     *         <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The ARN specifying the federated user associated with the credentials.
     * For more information about ARNs and how to use them in policies, see
     * <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The ARN specifying the federated user associated with the credentials.
     *         For more information about ARNs and how to use them in policies, see
     *         <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The ARN specifying the federated user associated with the credentials.
     * For more information about ARNs and how to use them in policies, see
     * <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The ARN specifying the federated user associated with the credentials.
     *         For more information about ARNs and how to use them in policies, see
     *         <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public FederatedUser withArn(String arn) {
        this.arn = arn;
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
        if (federatedUserId != null) sb.append("FederatedUserId: " + federatedUserId + ", ");
        if (arn != null) sb.append("Arn: " + arn + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFederatedUserId() == null) ? 0 : getFederatedUserId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof FederatedUser == false) return false;
        FederatedUser other = (FederatedUser)obj;
        
        if (other.getFederatedUserId() == null ^ this.getFederatedUserId() == null) return false;
        if (other.getFederatedUserId() != null && other.getFederatedUserId().equals(this.getFederatedUserId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        return true;
    }
    
}
    