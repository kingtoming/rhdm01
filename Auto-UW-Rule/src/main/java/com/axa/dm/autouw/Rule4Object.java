package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rule4Object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("ownerFullName")
	private java.lang.String ownerFullName;

	@org.kie.api.definition.type.Label("insuredFlag")
	private boolean insuredFlag;

	@org.kie.api.definition.type.Label("ownerFlag")
	private boolean ownerFlag;

	@org.kie.api.definition.type.Label(value = "insuredFullName")
	private java.lang.String insuredFullName;

	public Rule4Object() {
	}

	public java.lang.String getOwnerFullName() {
		return this.ownerFullName;
	}

	public void setOwnerFullName(java.lang.String ownerFullName) {
		this.ownerFullName = ownerFullName;
	}

	public boolean isInsuredFlag() {
		return this.insuredFlag;
	}

	public void setInsuredFlag(boolean insuredFlag) {
		this.insuredFlag = insuredFlag;
	}

	public boolean isOwnerFlag() {
		return this.ownerFlag;
	}

	public void setOwnerFlag(boolean ownerFlag) {
		this.ownerFlag = ownerFlag;
	}

	public java.lang.String getInsuredFullName() {
		return this.insuredFullName;
	}

	public void setInsuredFullName(java.lang.String insuredFullName) {
		this.insuredFullName = insuredFullName;
	}

	public Rule4Object(java.lang.String ownerFullName, boolean insuredFlag,
			boolean ownerFlag, java.lang.String insuredFullName) {
		this.ownerFullName = ownerFullName;
		this.insuredFlag = insuredFlag;
		this.ownerFlag = ownerFlag;
		this.insuredFullName = insuredFullName;
	}

}