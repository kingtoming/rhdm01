package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rule32Object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "dobCalHKList")
	private java.util.List<java.util.Date> dobCalHKList;
	@org.kie.api.definition.type.Label(value = "dobCalMCVList")
	private java.util.List<java.util.Date> dobCalMCVList;

	public Rule32Object() {
	}

	public java.util.List<java.util.Date> getDobCalHKList() {
		return this.dobCalHKList;
	}

	public void setDobCalHKList(java.util.List<java.util.Date> dobCalHKList) {
		this.dobCalHKList = dobCalHKList;
	}

	public java.util.List<java.util.Date> getDobCalMCVList() {
		return this.dobCalMCVList;
	}

	public void setDobCalMCVList(java.util.List<java.util.Date> dobCalMCVList) {
		this.dobCalMCVList = dobCalMCVList;
	}

	public Rule32Object(java.util.List<java.util.Date> dobCalHKList,
			java.util.List<java.util.Date> dobCalMCVList) {
		this.dobCalHKList = dobCalHKList;
		this.dobCalMCVList = dobCalMCVList;
	}

}