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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest) AuthorizeSecurityGroupIngress operation}.
 * <p>
 * The AuthorizeSecurityGroupIngress operation adds permissions to a security group.
 * </p>
 * <p>
 * Permissions are specified by the IP protocol (TCP, UDP or ICMP), the source of the request (by IP range or an Amazon EC2 user-group pair), the source
 * and destination port ranges (for TCP and UDP), and the ICMP codes and types (for ICMP). When authorizing ICMP, <code>-1</code> can be used as a
 * wildcard in the type and code fields.
 * </p>
 * <p>
 * Permission changes are propagated to instances within the security group as quickly as possible. However, depending on the number of instances, a
 * small delay might occur.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest)
 */
public class AuthorizeSecurityGroupIngressRequest extends AmazonWebServiceRequest {

    /**
     * Name of the standard (EC2) security group to modify. The group must
     * belong to your account. Can be used instead of GroupID for standard
     * (EC2) security groups.
     */
    private String groupName;

    /**
     * ID of the standard (EC2) or VPC security group to modify. The group
     * must belong to your account. Required for VPC security groups; can be
     * used instead of GroupName for standard (EC2) security groups.
     */
    private String groupId;

    /**
     * Deprecated
     */
    private String sourceSecurityGroupName;

    /**
     * Deprecated
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * Deprecated
     */
    private String ipProtocol;

    /**
     * Deprecated
     */
    private Integer fromPort;

    /**
     * Deprecated
     */
    private Integer toPort;

    /**
     * Deprecated
     */
    private String cidrIp;

    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     */
    private java.util.List<IpPermission> ipPermissions;

    /**
     * Default constructor for a new AuthorizeSecurityGroupIngressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AuthorizeSecurityGroupIngressRequest() {}
    
    /**
     * Constructs a new AuthorizeSecurityGroupIngressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName Name of the standard (EC2) security group to modify.
     * The group must belong to your account. Can be used instead of GroupID
     * for standard (EC2) security groups.
     * @param ipPermissions List of IP permissions to authorize on the
     * specified security group. Specifying permissions through IP
     * permissions is the preferred way of authorizing permissions since it
     * offers more flexibility and control.
     */
    public AuthorizeSecurityGroupIngressRequest(String groupName, java.util.List<IpPermission> ipPermissions) {
        this.groupName = groupName;
        this.ipPermissions = ipPermissions;
    }

    
    
    /**
     * Name of the standard (EC2) security group to modify. The group must
     * belong to your account. Can be used instead of GroupID for standard
     * (EC2) security groups.
     *
     * @return Name of the standard (EC2) security group to modify. The group must
     *         belong to your account. Can be used instead of GroupID for standard
     *         (EC2) security groups.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the standard (EC2) security group to modify. The group must
     * belong to your account. Can be used instead of GroupID for standard
     * (EC2) security groups.
     *
     * @param groupName Name of the standard (EC2) security group to modify. The group must
     *         belong to your account. Can be used instead of GroupID for standard
     *         (EC2) security groups.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the standard (EC2) security group to modify. The group must
     * belong to your account. Can be used instead of GroupID for standard
     * (EC2) security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName Name of the standard (EC2) security group to modify. The group must
     *         belong to your account. Can be used instead of GroupID for standard
     *         (EC2) security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    
    
    /**
     * ID of the standard (EC2) or VPC security group to modify. The group
     * must belong to your account. Required for VPC security groups; can be
     * used instead of GroupName for standard (EC2) security groups.
     *
     * @return ID of the standard (EC2) or VPC security group to modify. The group
     *         must belong to your account. Required for VPC security groups; can be
     *         used instead of GroupName for standard (EC2) security groups.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * ID of the standard (EC2) or VPC security group to modify. The group
     * must belong to your account. Required for VPC security groups; can be
     * used instead of GroupName for standard (EC2) security groups.
     *
     * @param groupId ID of the standard (EC2) or VPC security group to modify. The group
     *         must belong to your account. Required for VPC security groups; can be
     *         used instead of GroupName for standard (EC2) security groups.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * ID of the standard (EC2) or VPC security group to modify. The group
     * must belong to your account. Required for VPC security groups; can be
     * used instead of GroupName for standard (EC2) security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId ID of the standard (EC2) or VPC security group to modify. The group
     *         must belong to your account. Required for VPC security groups; can be
     *         used instead of GroupName for standard (EC2) security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    
    
    /**
     * Deprecated
     *
     * @return Deprecated
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }
    
    /**
     * Deprecated
     *
     * @param sourceSecurityGroupName Deprecated
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }
    
    /**
     * Deprecated
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupName Deprecated
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }
    
    
    /**
     * Deprecated
     *
     * @return Deprecated
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }
    
    /**
     * Deprecated
     *
     * @param sourceSecurityGroupOwnerId Deprecated
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }
    
    /**
     * Deprecated
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupOwnerId Deprecated
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }
    
    
    /**
     * Deprecated
     *
     * @return Deprecated
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * Deprecated
     *
     * @param ipProtocol Deprecated
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * Deprecated
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol Deprecated
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    
    
    /**
     * Deprecated
     *
     * @return Deprecated
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * Deprecated
     *
     * @param fromPort Deprecated
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * Deprecated
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort Deprecated
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    
    
    /**
     * Deprecated
     *
     * @return Deprecated
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * Deprecated
     *
     * @param toPort Deprecated
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * Deprecated
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort Deprecated
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    
    
    /**
     * Deprecated
     *
     * @return Deprecated
     */
    public String getCidrIp() {
        return cidrIp;
    }
    
    /**
     * Deprecated
     *
     * @param cidrIp Deprecated
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }
    
    /**
     * Deprecated
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrIp Deprecated
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     *
     * @return List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     */
    public java.util.List<IpPermission> getIpPermissions() {
        
        if (ipPermissions == null) {
            ipPermissions = new java.util.ArrayList<IpPermission>();
        }
        return ipPermissions;
    }
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     *
     * @param ipPermissions List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        java.util.List<IpPermission> ipPermissionsCopy = new java.util.ArrayList<IpPermission>(ipPermissions.size());
        ipPermissionsCopy.addAll(ipPermissions);
        this.ipPermissions = ipPermissionsCopy;
    }
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) setIpPermissions(new java.util.ArrayList<IpPermission>(ipPermissions.length));
        for (IpPermission value : ipPermissions) {
            getIpPermissions().add(value);
        }
        return this;
    }
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
        } else {
            java.util.List<IpPermission> ipPermissionsCopy = new java.util.ArrayList<IpPermission>(ipPermissions.size());
            ipPermissionsCopy.addAll(ipPermissions);
            this.ipPermissions = ipPermissionsCopy;
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
        if (groupName != null) sb.append("GroupName: " + groupName + ", ");
        if (groupId != null) sb.append("GroupId: " + groupId + ", ");
        if (sourceSecurityGroupName != null) sb.append("SourceSecurityGroupName: " + sourceSecurityGroupName + ", ");
        if (sourceSecurityGroupOwnerId != null) sb.append("SourceSecurityGroupOwnerId: " + sourceSecurityGroupOwnerId + ", ");
        if (ipProtocol != null) sb.append("IpProtocol: " + ipProtocol + ", ");
        if (fromPort != null) sb.append("FromPort: " + fromPort + ", ");
        if (toPort != null) sb.append("ToPort: " + toPort + ", ");
        if (cidrIp != null) sb.append("CidrIp: " + cidrIp + ", ");
        if (ipPermissions != null) sb.append("IpPermissions: " + ipPermissions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode()); 
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode()); 
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode()); 
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof AuthorizeSecurityGroupIngressRequest == false) return false;
        AuthorizeSecurityGroupIngressRequest other = (AuthorizeSecurityGroupIngressRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null) return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false) return false; 
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null) return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false) return false; 
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null) return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false) return false; 
        if (other.getFromPort() == null ^ this.getFromPort() == null) return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false) return false; 
        if (other.getToPort() == null ^ this.getToPort() == null) return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false) return false; 
        if (other.getCidrIp() == null ^ this.getCidrIp() == null) return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false) return false; 
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null) return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false) return false; 
        return true;
    }
    
}
    