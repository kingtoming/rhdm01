package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rule27Object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "planCodeList")
	private java.util.List<java.lang.String> planCodeList;
	@org.kie.api.definition.type.Label(value = "policyNoList")
	private java.util.List<java.lang.String> policyNoList;

	public Rule27Object() {
	}

	public java.util.List<java.lang.String> getPlanCodeList() {
		return this.planCodeList;
	}

	public void setPlanCodeList(java.util.List<java.lang.String> planCodeList) {
		this.planCodeList = planCodeList;
	}

	public java.util.List<java.lang.String> getPolicyNoList() {
		return this.policyNoList;
	}

	public void setPolicyNoList(java.util.List<java.lang.String> policyNoList) {
		this.policyNoList = policyNoList;
	}

	public Rule27Object(java.util.List<java.lang.String> planCodeList,
			java.util.List<java.lang.String> policyNoList) {
		this.planCodeList = planCodeList;
		this.policyNoList = policyNoList;
	}

}