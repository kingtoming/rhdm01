package com.axa.dm.autouw;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rule29Obj implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Case 1 hit")
	private boolean case1;
	@org.kie.api.definition.type.Label("Case 2 hit")
	private boolean case2;
	@org.kie.api.definition.type.Label("Case 3 hit")
	private boolean case3;
	@org.kie.api.definition.type.Label("Case 4 hit")
	private boolean case4;
	@org.kie.api.definition.type.Label("Case 5 hit")
	private boolean case5;

	public Rule29Obj() {
	}

	public boolean isCase1() {
		return this.case1;
	}

	public void setCase1(boolean case1) {
		this.case1 = case1;
	}

	public boolean isCase2() {
		return this.case2;
	}

	public void setCase2(boolean case2) {
		this.case2 = case2;
	}

	public boolean isCase3() {
		return this.case3;
	}

	public void setCase3(boolean case3) {
		this.case3 = case3;
	}

	public boolean isCase4() {
		return this.case4;
	}

	public void setCase4(boolean case4) {
		this.case4 = case4;
	}

	public boolean isCase5() {
		return this.case5;
	}

	public void setCase5(boolean case5) {
		this.case5 = case5;
	}

	public Rule29Obj(boolean case1, boolean case2, boolean case3,
			boolean case4, boolean case5) {
		this.case1 = case1;
		this.case2 = case2;
		this.case3 = case3;
		this.case4 = case4;
		this.case5 = case5;
	}

}