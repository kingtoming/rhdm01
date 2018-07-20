package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rule28Object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("changeTypeInsuredList")
	private java.util.List<java.lang.String> changeTypeInsuredList;
	@org.kie.api.definition.type.Label("changeTypeOwnerList")
	private java.util.List<java.lang.String> changeTypeOwnerList;
	@org.kie.api.definition.type.Label("rule28OwnerProcessed")
	private boolean rule28OwnerProcessed;
	@org.kie.api.definition.type.Label("rule28InsuredProcessed")
	private boolean rule28InsuredProcessed;

	@org.kie.api.definition.type.Label(value = "policyNoInsuredList")
	private java.util.List<java.lang.String> policyNoInsuredList;

	@org.kie.api.definition.type.Label(value = "policyNoOwnerList")
	private java.util.List<java.lang.String> policyNoOwnerList;

	public Rule28Object() {
	}

	public java.util.List<java.lang.String> getChangeTypeInsuredList() {
		return this.changeTypeInsuredList;
	}

	public void setChangeTypeInsuredList(
			java.util.List<java.lang.String> changeTypeInsuredList) {
		this.changeTypeInsuredList = changeTypeInsuredList;
	}

	public java.util.List<java.lang.String> getChangeTypeOwnerList() {
		return this.changeTypeOwnerList;
	}

	public void setChangeTypeOwnerList(
			java.util.List<java.lang.String> changeTypeOwnerList) {
		this.changeTypeOwnerList = changeTypeOwnerList;
	}

	public boolean isRule28OwnerProcessed() {
		return this.rule28OwnerProcessed;
	}

	public void setRule28OwnerProcessed(boolean rule28OwnerProcessed) {
		this.rule28OwnerProcessed = rule28OwnerProcessed;
	}

	public boolean isRule28InsuredProcessed() {
		return this.rule28InsuredProcessed;
	}

	public void setRule28InsuredProcessed(boolean rule28InsuredProcessed) {
		this.rule28InsuredProcessed = rule28InsuredProcessed;
	}

	public java.util.List<java.lang.String> getPolicyNoInsuredList() {
		return this.policyNoInsuredList;
	}

	public void setPolicyNoInsuredList(
			java.util.List<java.lang.String> policyNoInsuredList) {
		this.policyNoInsuredList = policyNoInsuredList;
	}

	public java.util.List<java.lang.String> getPolicyNoOwnerList() {
		return this.policyNoOwnerList;
	}

	public void setPolicyNoOwnerList(
			java.util.List<java.lang.String> policyNoOwnerList) {
		this.policyNoOwnerList = policyNoOwnerList;
	}

	public Rule28Object(java.util.List<java.lang.String> changeTypeInsuredList,
			java.util.List<java.lang.String> changeTypeOwnerList,
			boolean rule28OwnerProcessed, boolean rule28InsuredProcessed,
			java.util.List<java.lang.String> policyNoInsuredList,
			java.util.List<java.lang.String> policyNoOwnerList) {
		this.changeTypeInsuredList = changeTypeInsuredList;
		this.changeTypeOwnerList = changeTypeOwnerList;
		this.rule28OwnerProcessed = rule28OwnerProcessed;
		this.rule28InsuredProcessed = rule28InsuredProcessed;
		this.policyNoInsuredList = policyNoInsuredList;
		this.policyNoOwnerList = policyNoOwnerList;
	}

}