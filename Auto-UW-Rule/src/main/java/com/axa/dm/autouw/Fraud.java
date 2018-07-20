package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Fraud implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Role")
	private java.lang.String role;
	@org.kie.api.definition.type.Label(value = "Policy No")
	private java.lang.String policyNo;
	@org.kie.api.definition.type.Label(value = "Suspicious Flag")
	private java.lang.String suspiciousFlag;

	public Fraud() {
	}

	public java.lang.String getRole() {
		return this.role;
	}

	public void setRole(java.lang.String role) {
		this.role = role;
	}

	public java.lang.String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(java.lang.String policyNo) {
		this.policyNo = policyNo;
	}

	public java.lang.String getSuspiciousFlag() {
		return this.suspiciousFlag;
	}

	public void setSuspiciousFlag(java.lang.String suspiciousFlag) {
		this.suspiciousFlag = suspiciousFlag;
	}

	public Fraud(java.lang.String role, java.lang.String policyNo,
			java.lang.String suspiciousFlag) {
		this.role = role;
		this.policyNo = policyNo;
		this.suspiciousFlag = suspiciousFlag;
	}

}