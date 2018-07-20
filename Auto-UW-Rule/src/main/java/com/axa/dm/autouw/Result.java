package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Result implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Medical Tests Required")
	private java.util.List<java.lang.String> medicalTestsRequired;
	@org.kie.api.definition.type.Label("Individual Result")
	private java.util.List<com.axa.dm.autouw.IndividualResult> individualResult;

	public Result() {
	}

	public java.util.List<java.lang.String> getMedicalTestsRequired() {
		return this.medicalTestsRequired;
	}

	public void setMedicalTestsRequired(
			java.util.List<java.lang.String> medicalTestsRequired) {
		this.medicalTestsRequired = medicalTestsRequired;
	}

	public java.util.List<com.axa.dm.autouw.IndividualResult> getIndividualResult() {
		return this.individualResult;
	}

	public void setIndividualResult(
			java.util.List<com.axa.dm.autouw.IndividualResult> individualResult) {
		this.individualResult = individualResult;
	}

	public Result(java.util.List<java.lang.String> medicalTestsRequired,
			java.util.List<com.axa.dm.autouw.IndividualResult> individualResult) {
		this.medicalTestsRequired = medicalTestsRequired;
		this.individualResult = individualResult;
	}

}