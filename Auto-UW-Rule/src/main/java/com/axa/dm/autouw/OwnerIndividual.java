package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OwnerIndividual implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Decision")
	private java.lang.String decision;
	@org.kie.api.definition.type.Label(value = "failed Reasons")
	private java.util.List<java.lang.String> failedReasons;
	@org.kie.api.definition.type.Label(value = "Other Details")
	private java.util.List<com.axa.dm.autouw.OtherDetailObj> otherDetails;

	public OwnerIndividual() {
	}

	public java.lang.String getDecision() {
		return this.decision;
	}

	public void setDecision(java.lang.String decision) {
		this.decision = decision;
	}

	public java.util.List<java.lang.String> getFailedReasons() {
		return this.failedReasons;
	}

	public void setFailedReasons(java.util.List<java.lang.String> failedReasons) {
		this.failedReasons = failedReasons;
	}

	public java.util.List<com.axa.dm.autouw.OtherDetailObj> getOtherDetails() {
		return this.otherDetails;
	}

	public void setOtherDetails(
			java.util.List<com.axa.dm.autouw.OtherDetailObj> otherDetails) {
		this.otherDetails = otherDetails;
	}

	public OwnerIndividual(java.lang.String decision,
			java.util.List<java.lang.String> failedReasons,
			java.util.List<com.axa.dm.autouw.OtherDetailObj> otherDetails) {
		this.decision = decision;
		this.failedReasons = failedReasons;
		this.otherDetails = otherDetails;
	}

}