package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rule34Object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("planList")
	private java.util.List<java.lang.String> planList;

	@org.kie.api.definition.type.Label(value = "rule34ExtractedProcessed")
	private boolean rule34ExtractedProcessed;

	public Rule34Object() {
	}

	public java.util.List<java.lang.String> getPlanList() {
		return this.planList;
	}

	public void setPlanList(java.util.List<java.lang.String> planList) {
		this.planList = planList;
	}

	public boolean isRule34ExtractedProcessed() {
		return this.rule34ExtractedProcessed;
	}

	public void setRule34ExtractedProcessed(boolean rule34ExtractedProcessed) {
		this.rule34ExtractedProcessed = rule34ExtractedProcessed;
	}

	public Rule34Object(java.util.List<java.lang.String> planList,
			boolean rule34ExtractedProcessed) {
		this.planList = planList;
		this.rule34ExtractedProcessed = rule34ExtractedProcessed;
	}

}