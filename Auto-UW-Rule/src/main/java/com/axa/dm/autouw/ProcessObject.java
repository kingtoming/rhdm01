package com.axa.dm.autouw;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProcessObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Agent")
	private Agent agent;
	@org.kie.api.definition.type.Label("Policy")
	private java.util.List<com.axa.dm.autouw.Policy> policy;
	@org.kie.api.definition.type.Label("Application")
	private java.util.List<com.axa.dm.autouw.Application> application;
	@org.kie.api.definition.type.Label("Application Rider")
	private java.util.List<com.axa.dm.autouw.ApplicationRider> applicationRider;
	@org.kie.api.definition.type.Label("Special Case")
	private java.util.List<com.axa.dm.autouw.SpecialCase> specialCase;
	@org.kie.api.definition.type.Label("Fraud")
	private java.util.List<com.axa.dm.autouw.Fraud> fraud;
	@org.kie.api.definition.type.Label("Claim")
	private java.util.List<com.axa.dm.autouw.Claim> claim;

	@org.kie.api.definition.type.Label("Policy Change")
	private java.util.List<com.axa.dm.autouw.PolicyChange> policyChange;

	@org.kie.api.definition.type.Label("CurrentApplication")
	private com.axa.dm.autouw.CurrentApplication currentApplication;

	@org.kie.api.definition.type.Label("Policy Rider")
	private java.util.List<com.axa.dm.autouw.PolicyRider> policyRider;

	@org.kie.api.definition.type.Label("Rule 12 Processed?")
	private boolean rule12Processed;

	@org.kie.api.definition.type.Label("Rule Set")
	private java.lang.String ruleSet;

	@org.kie.api.definition.type.Label("Rule 12A Processed")
	private boolean rule12AProcessed;

	@org.kie.api.definition.type.Label("Process Start Time")
	private java.util.Date startTime;

	@org.kie.api.definition.type.Label("Rule 13 Processed?")
	private boolean rule13Processed;

	@org.kie.api.definition.type.Label("Rule 14 Processed?")
	private boolean rule14Processed;

	@org.kie.api.definition.type.Label("Initialization completed?")
	private boolean initProcessed;

	@org.kie.api.definition.type.Label("Rule 10 Processed?")
	private boolean rule10Processed;

	@org.kie.api.definition.type.Label("Rule 11 Processed?")
	private boolean rule11Processed;

	@org.kie.api.definition.type.Label("Rule 8 Processed?")
	private boolean rule8Processed;

	@org.kie.api.definition.type.Label("Rule 9 Processed?")
	private boolean rule9Processed;

	@org.kie.api.definition.type.Label("rule3InsuredProcessed")
	private boolean rule3InsuredProcessed;

	@org.kie.api.definition.type.Label("rule3OwnerProcessed")
	private boolean rule3OwnerProcessed;

	@org.kie.api.definition.type.Label("rule3FinalProcessed")
	private boolean rule3FinalProcessed;

	@org.kie.api.definition.type.Label("rule2FinalProcessed")
	private boolean rule2FinalProcessed;

	@org.kie.api.definition.type.Label("rule2InsuredProcessed")
	private boolean rule2InsuredProcessed;

	@org.kie.api.definition.type.Label("rule2OwnerProcessed")
	private boolean rule2OwnerProcessed;

	@org.kie.api.definition.type.Label("rule31Processed")
	private boolean rule31Processed;

	@org.kie.api.definition.type.Label("rule2Processed")
	private boolean rule2Processed;

	@org.kie.api.definition.type.Label("rule5Processed")
	private boolean rule5Processed;

	@org.kie.api.definition.type.Label("rule4InsuredProcessed")
	private boolean rule4InsuredProcessed;

	@org.kie.api.definition.type.Label("rule4OwnerProcessed")
	private boolean rule4OwnerProcessed;

	@org.kie.api.definition.type.Label("rule4FinalProcessed")
	private boolean rule4FinalProcessed;

	@org.kie.api.definition.type.Label("rule6InsuredProcessed")
	private boolean rule6InsuredProcessed;

	@org.kie.api.definition.type.Label("rule6OwnerProcessed")
	private boolean rule6OwnerProcessed;

	@org.kie.api.definition.type.Label("rule6FinalProcessed")
	private boolean rule6FinalProcessed;

	@org.kie.api.definition.type.Label("rule7FinalProcessed")
	private boolean rule7FinalProcessed;

	@org.kie.api.definition.type.Label("rule7InsuredProcessed")
	private boolean rule7InsuredProcessed;

	@org.kie.api.definition.type.Label("rule7OwnerProcessed")
	private boolean rule7OwnerProcessed;

	@org.kie.api.definition.type.Label("rule21InsuredProcessed")
	private boolean rule21InsuredProcessed;

	@org.kie.api.definition.type.Label("rule21OwnerProcessed")
	private boolean rule21OwnerProcessed;

	@org.kie.api.definition.type.Label("rule21FinalProcessed")
	private boolean rule21FinalProcessed;

	@org.kie.api.definition.type.Label("rule22FinalProcessed")
	private boolean rule22FinalProcessed;

	@org.kie.api.definition.type.Label("rule22OwnerProcessed")
	private boolean rule22OwnerProcessed;

	@org.kie.api.definition.type.Label("rule22InsuredProcessed")
	private boolean rule22InsuredProcessed;

	@org.kie.api.definition.type.Label("rule27Processed")
	private boolean rule27Processed;

	@org.kie.api.definition.type.Label("rule32HKProcessed")
	private boolean rule32HKProcessed;

	@org.kie.api.definition.type.Label("rule32MCVProcessed")
	private boolean rule32MCVProcessed;

	@org.kie.api.definition.type.Label("rule32FinalProcessed")
	private boolean rule32FinalProcessed;

	@org.kie.api.definition.type.Label("rule34Processed")
	private boolean rule34Processed;

	@org.kie.api.definition.type.Label("rule42Processed")
	private boolean rule42Processed;

	@org.kie.api.definition.type.Label("rule43InsuredProcessed")
	private boolean rule43InsuredProcessed;

	@org.kie.api.definition.type.Label("rule43OwnerProcessed")
	private boolean rule43OwnerProcessed;

	@org.kie.api.definition.type.Label("rule43FinalProcessed")
	private boolean rule43FinalProcessed;

	@org.kie.api.definition.type.Label("rule41Processed")
	private boolean rule41Processed;

	@org.kie.api.definition.type.Label("rule39Processed")
	private boolean rule39Processed;

	@org.kie.api.definition.type.Label("rule38Processed")
	private boolean rule38Processed;

	@org.kie.api.definition.type.Label("rule18Processed")
	private boolean rule18Processed;

	@org.kie.api.definition.type.Label("Rule 15A Processed?")
	private boolean rule15AProcessed;

	@org.kie.api.definition.type.Label("Rule 15 Processed?")
	private boolean rule15BProcessed;

	@org.kie.api.definition.type.Label("Rule 17 Processed?")
	private boolean rule17Processed;

	@org.kie.api.definition.type.Label("Rule 15C Processed?")
	private boolean rule15CProcessed;

	@org.kie.api.definition.type.Label("rule19Processed")
	private boolean rule19Processed;

	@org.kie.api.definition.type.Label("rule26Processed")
	private boolean rule26Processed;

	@org.kie.api.definition.type.Label("rule28Processed")
	private boolean rule28Processed;

	@org.kie.api.definition.type.Label("Rule 15 Processed?")
	private boolean rule15DProcessed;

	@org.kie.api.definition.type.Label("Rule 15E Processed?")
	private boolean rule15EProcessed;

	@org.kie.api.definition.type.Label("Rule 17A Processed?")
	private boolean rule17AProcessed;

	@org.kie.api.definition.type.Label("Rule 1 Processed?")
	private boolean rule1Processed;

	@org.kie.api.definition.type.Label("Rule 16 Processed?")
	private boolean rule16Processed;

	@org.kie.api.definition.type.Label("Rule 23 Processed?")
	private boolean rule23Processed;

	@org.kie.api.definition.type.Label("Rule 24 Processed?")
	private boolean rule24Processed;

	@org.kie.api.definition.type.Label("Rule 29 Processed?")
	private boolean rule29Processed;

	@org.kie.api.definition.type.Label("Rule 40 Processed?")
	private boolean rule40Processed;

	@org.kie.api.definition.type.Label("Application Count")
	private Integer applicationCount;
	@org.kie.api.definition.type.Label("insured")
	private java.util.List<com.axa.dm.autouw.Insured> insured;

	@org.kie.api.definition.type.Label("owner")
	private java.util.List<com.axa.dm.autouw.Owner> owner;

	@org.kie.api.definition.type.Label("rule25Processed")
	private boolean rule25Processed;

	@org.kie.api.definition.type.Label("rule20Processed")
	private boolean rule20Processed;

	@org.kie.api.definition.type.Label("rule36Processed")
	private boolean rule36Processed;

	@org.kie.api.definition.type.Label("rule55Processed")
	private boolean rule55Processed;

	@org.kie.api.definition.type.Label(value = "rule45Processed")
	private boolean rule45Processed;

	public ProcessObject() {
	}

	public java.util.List<com.axa.dm.autouw.Policy> getPolicy() {
		return this.policy;
	}

	public void setPolicy(java.util.List<com.axa.dm.autouw.Policy> policy) {
		this.policy = policy;
	}

	public java.util.List<com.axa.dm.autouw.Application> getApplication() {
		return this.application;
	}

	public void setApplication(
			java.util.List<com.axa.dm.autouw.Application> application) {
		this.application = application;
	}

	public java.util.List<com.axa.dm.autouw.ApplicationRider> getApplicationRider() {
		return this.applicationRider;
	}

	public void setApplicationRider(
			java.util.List<com.axa.dm.autouw.ApplicationRider> applicationRider) {
		this.applicationRider = applicationRider;
	}

	public java.util.List<com.axa.dm.autouw.SpecialCase> getSpecialCase() {
		return this.specialCase;
	}

	public void setSpecialCase(
			java.util.List<com.axa.dm.autouw.SpecialCase> specialCase) {
		this.specialCase = specialCase;
	}

	public java.util.List<com.axa.dm.autouw.Fraud> getFraud() {
		return this.fraud;
	}

	public void setFraud(java.util.List<com.axa.dm.autouw.Fraud> fraud) {
		this.fraud = fraud;
	}

	public java.util.List<com.axa.dm.autouw.Claim> getClaim() {
		return this.claim;
	}

	public void setClaim(java.util.List<com.axa.dm.autouw.Claim> claim) {
		this.claim = claim;
	}

	public java.util.List<com.axa.dm.autouw.PolicyChange> getPolicyChange() {
		return this.policyChange;
	}

	public void setPolicyChange(
			java.util.List<com.axa.dm.autouw.PolicyChange> policyChange) {
		this.policyChange = policyChange;
	}

	public com.axa.dm.autouw.CurrentApplication getCurrentApplication() {
		return this.currentApplication;
	}

	public void setCurrentApplication(
			com.axa.dm.autouw.CurrentApplication currentApplication) {
		this.currentApplication = currentApplication;
	}

	public java.util.List<com.axa.dm.autouw.PolicyRider> getPolicyRider() {
		return this.policyRider;
	}

	public void setPolicyRider(
			java.util.List<com.axa.dm.autouw.PolicyRider> policyRider) {
		this.policyRider = policyRider;
	}

	public boolean isRule12Processed() {
		return this.rule12Processed;
	}

	public void setRule12Processed(boolean rule12Processed) {
		this.rule12Processed = rule12Processed;
	}

	public java.lang.String getRuleSet() {
		return this.ruleSet;
	}

	public void setRuleSet(java.lang.String ruleSet) {
		this.ruleSet = ruleSet;
	}

	public boolean isRule12AProcessed() {
		return this.rule12AProcessed;
	}

	public void setRule12AProcessed(boolean rule12AProcessed) {
		this.rule12AProcessed = rule12AProcessed;
	}

	public java.util.Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}

	public boolean isRule3InsuredProcessed() {
		return this.rule3InsuredProcessed;
	}

	public void setRule3InsuredProcessed(boolean rule3InsuredProcessed) {
		this.rule3InsuredProcessed = rule3InsuredProcessed;
	}

	public boolean isRule3OwnerProcessed() {
		return this.rule3OwnerProcessed;
	}

	public void setRule3OwnerProcessed(boolean rule3OwnerProcessed) {
		this.rule3OwnerProcessed = rule3OwnerProcessed;
	}

	public boolean isRule3FinalProcessed() {
		return this.rule3FinalProcessed;
	}

	public void setRule3FinalProcessed(boolean rule3FinalProcessed) {
		this.rule3FinalProcessed = rule3FinalProcessed;
	}

	public boolean isRule2FinalProcessed() {
		return this.rule2FinalProcessed;
	}

	public void setRule2FinalProcessed(boolean rule2FinalProcessed) {
		this.rule2FinalProcessed = rule2FinalProcessed;
	}

	public boolean isRule2InsuredProcessed() {
		return this.rule2InsuredProcessed;
	}

	public void setRule2InsuredProcessed(boolean rule2InsuredProcessed) {
		this.rule2InsuredProcessed = rule2InsuredProcessed;
	}

	public boolean isRule2OwnerProcessed() {
		return this.rule2OwnerProcessed;
	}

	public void setRule2OwnerProcessed(boolean rule2OwnerProcessed) {
		this.rule2OwnerProcessed = rule2OwnerProcessed;
	}

	public boolean isRule31Processed() {
		return this.rule31Processed;
	}

	public void setRule31Processed(boolean rule31Processed) {
		this.rule31Processed = rule31Processed;
	}

	public boolean isRule2Processed() {
		return this.rule2Processed;
	}

	public void setRule2Processed(boolean rule2Processed) {
		this.rule2Processed = rule2Processed;
	}

	public Date withinPastSixMonth() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -6);
		return cal.getTime();
	}

	public Date withinPastTwoYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -2);
		return cal.getTime();
	}

	public Date getCurrentDate() {
		return new Date();
	}

	public Date workWithDates(Date date, String operator, int entity, int number) {
		if (date != null) {
			java.util.Calendar newCal = java.util.Calendar.getInstance();
			newCal.setTime(date);
			if (operator.equals("-")) { // normally we would add, except if we
										// want to subtract
				number = -number;
			}
			if (entity == 1) { // years
				newCal.add(java.util.Calendar.YEAR, number);
			} else if (entity == 2) { // months
				newCal.add(java.util.Calendar.MONTH, number);
			} else if (entity == 3) { // days
				newCal.add(java.util.Calendar.DATE, number);
			} else if (entity == 4) { // hours
				newCal.add(java.util.Calendar.HOUR, number);
			} else if (entity == 5) { // minutes
				newCal.add(java.util.Calendar.MINUTE, number);
			} else if (entity == 6) { // seconds
				newCal.add(java.util.Calendar.SECOND, number);
			}
			return newCal.getTime();

		} else {
			return date;
		}
	}

	public long getCurrentDateTime() {
		return new Date().getTime();
	}

	public boolean isRule5Processed() {
		return this.rule5Processed;
	}

	public void setRule5Processed(boolean rule5Processed) {
		this.rule5Processed = rule5Processed;
	}

	public boolean isRule4InsuredProcessed() {
		return this.rule4InsuredProcessed;
	}

	public void setRule4InsuredProcessed(boolean rule4InsuredProcessed) {
		this.rule4InsuredProcessed = rule4InsuredProcessed;
	}

	public boolean isRule4OwnerProcessed() {
		return this.rule4OwnerProcessed;
	}

	public void setRule4OwnerProcessed(boolean rule4OwnerProcessed) {
		this.rule4OwnerProcessed = rule4OwnerProcessed;
	}

	public boolean isRule4FinalProcessed() {
		return this.rule4FinalProcessed;
	}

	public void setRule4FinalProcessed(boolean rule4FinalProcessed) {
		this.rule4FinalProcessed = rule4FinalProcessed;
	}

	public boolean isRule6InsuredProcessed() {
		return this.rule6InsuredProcessed;
	}

	public void setRule6InsuredProcessed(boolean rule6InsuredProcessed) {
		this.rule6InsuredProcessed = rule6InsuredProcessed;
	}

	public boolean isRule6OwnerProcessed() {
		return this.rule6OwnerProcessed;
	}

	public void setRule6OwnerProcessed(boolean rule6OwnerProcessed) {
		this.rule6OwnerProcessed = rule6OwnerProcessed;
	}

	public boolean isRule6FinalProcessed() {
		return this.rule6FinalProcessed;
	}

	public void setRule6FinalProcessed(boolean rule6FinalProcessed) {
		this.rule6FinalProcessed = rule6FinalProcessed;
	}

	public boolean isRule7FinalProcessed() {
		return this.rule7FinalProcessed;
	}

	public void setRule7FinalProcessed(boolean rule7FinalProcessed) {
		this.rule7FinalProcessed = rule7FinalProcessed;
	}

	public boolean isRule7InsuredProcessed() {
		return this.rule7InsuredProcessed;
	}

	public void setRule7InsuredProcessed(boolean rule7InsuredProcessed) {
		this.rule7InsuredProcessed = rule7InsuredProcessed;
	}

	public boolean isRule7OwnerProcessed() {
		return this.rule7OwnerProcessed;
	}

	public void setRule7OwnerProcessed(boolean rule7OwnerProcessed) {
		this.rule7OwnerProcessed = rule7OwnerProcessed;
	}

	public boolean isRule21InsuredProcessed() {
		return this.rule21InsuredProcessed;
	}

	public void setRule21InsuredProcessed(boolean rule21InsuredProcessed) {
		this.rule21InsuredProcessed = rule21InsuredProcessed;
	}

	public boolean isRule21OwnerProcessed() {
		return this.rule21OwnerProcessed;
	}

	public void setRule21OwnerProcessed(boolean rule21OwnerProcessed) {
		this.rule21OwnerProcessed = rule21OwnerProcessed;
	}

	public boolean isRule21FinalProcessed() {
		return this.rule21FinalProcessed;
	}

	public void setRule21FinalProcessed(boolean rule21FinalProcessed) {
		this.rule21FinalProcessed = rule21FinalProcessed;
	}

	public boolean isRule22FinalProcessed() {
		return this.rule22FinalProcessed;
	}

	public void setRule22FinalProcessed(boolean rule22FinalProcessed) {
		this.rule22FinalProcessed = rule22FinalProcessed;
	}

	public boolean isRule22OwnerProcessed() {
		return this.rule22OwnerProcessed;
	}

	public void setRule22OwnerProcessed(boolean rule22OwnerProcessed) {
		this.rule22OwnerProcessed = rule22OwnerProcessed;
	}

	public boolean isRule22InsuredProcessed() {
		return this.rule22InsuredProcessed;
	}

	public void setRule22InsuredProcessed(boolean rule22InsuredProcessed) {
		this.rule22InsuredProcessed = rule22InsuredProcessed;
	}

	public boolean isRule13Processed() {
		return this.rule13Processed;
	}

	public void setRule13Processed(boolean rule13Processed) {
		this.rule13Processed = rule13Processed;
	}

	public boolean isRule14Processed() {
		return this.rule14Processed;
	}

	public void setRule14Processed(boolean rule14Processed) {
		this.rule14Processed = rule14Processed;
	}

	public boolean isInitProcessed() {
		return this.initProcessed;
	}

	public void setInitProcessed(boolean initProcessed) {
		this.initProcessed = initProcessed;
	}

	public boolean isRule10Processed() {
		return this.rule10Processed;
	}

	public void setRule10Processed(boolean rule10Processed) {
		this.rule10Processed = rule10Processed;
	}

	public boolean isRule11Processed() {
		return this.rule11Processed;
	}

	public void setRule11Processed(boolean rule11Processed) {
		this.rule11Processed = rule11Processed;
	}

	public boolean isRule8Processed() {
		return this.rule8Processed;
	}

	public void setRule8Processed(boolean rule8Processed) {
		this.rule8Processed = rule8Processed;
	}

	public boolean isRule9Processed() {
		return this.rule9Processed;
	}

	public void setRule9Processed(boolean rule9Processed) {
		this.rule9Processed = rule9Processed;
	}

	public boolean isRule27Processed() {
		return this.rule27Processed;
	}

	public void setRule27Processed(boolean rule27Processed) {
		this.rule27Processed = rule27Processed;
	}

	public boolean isRule32HKProcessed() {
		return this.rule32HKProcessed;
	}

	public void setRule32HKProcessed(boolean rule32HKProcessed) {
		this.rule32HKProcessed = rule32HKProcessed;
	}

	public boolean isRule32MCVProcessed() {
		return this.rule32MCVProcessed;
	}

	public void setRule32MCVProcessed(boolean rule32MCVProcessed) {
		this.rule32MCVProcessed = rule32MCVProcessed;
	}

	public boolean isRule32FinalProcessed() {
		return this.rule32FinalProcessed;
	}

	public void setRule32FinalProcessed(boolean rule32FinalProcessed) {
		this.rule32FinalProcessed = rule32FinalProcessed;
	}

	public boolean isRule34Processed() {
		return this.rule34Processed;
	}

	public void setRule34Processed(boolean rule34Processed) {
		this.rule34Processed = rule34Processed;
	}

	public boolean isRule42Processed() {
		return this.rule42Processed;
	}

	public void setRule42Processed(boolean rule42Processed) {
		this.rule42Processed = rule42Processed;
	}

	public boolean isRule43InsuredProcessed() {
		return this.rule43InsuredProcessed;
	}

	public void setRule43InsuredProcessed(boolean rule43InsuredProcessed) {
		this.rule43InsuredProcessed = rule43InsuredProcessed;
	}

	public boolean isRule43OwnerProcessed() {
		return this.rule43OwnerProcessed;
	}

	public void setRule43OwnerProcessed(boolean rule43OwnerProcessed) {
		this.rule43OwnerProcessed = rule43OwnerProcessed;
	}

	public boolean isRule43FinalProcessed() {
		return this.rule43FinalProcessed;
	}

	public void setRule43FinalProcessed(boolean rule43FinalProcessed) {
		this.rule43FinalProcessed = rule43FinalProcessed;
	}

	public boolean isRule15AProcessed() {
		return this.rule15AProcessed;
	}

	public void setRule15AProcessed(boolean rule15AProcessed) {
		this.rule15AProcessed = rule15AProcessed;
	}

	public boolean isRule15BProcessed() {
		return this.rule15BProcessed;
	}

	public void setRule15BProcessed(boolean rule15BProcessed) {
		this.rule15BProcessed = rule15BProcessed;
	}

	public boolean isRule17Processed() {
		return this.rule17Processed;
	}

	public void setRule17Processed(boolean rule17Processed) {
		this.rule17Processed = rule17Processed;
	}

	public boolean isRule15CProcessed() {
		return this.rule15CProcessed;
	}

	public void setRule15CProcessed(boolean rule15CProcessed) {
		this.rule15CProcessed = rule15CProcessed;
	}

	public boolean isRule41Processed() {
		return this.rule41Processed;
	}

	public void setRule41Processed(boolean rule41Processed) {
		this.rule41Processed = rule41Processed;
	}

	public boolean isRule39Processed() {
		return this.rule39Processed;
	}

	public void setRule39Processed(boolean rule39Processed) {
		this.rule39Processed = rule39Processed;
	}

	public boolean isRule38Processed() {
		return this.rule38Processed;
	}

	public void setRule38Processed(boolean rule38Processed) {
		this.rule38Processed = rule38Processed;
	}

	public boolean isRule18Processed() {
		return this.rule18Processed;
	}

	public void setRule18Processed(boolean rule18Processed) {
		this.rule18Processed = rule18Processed;
	}

	public boolean isRule19Processed() {
		return this.rule19Processed;
	}

	public void setRule19Processed(boolean rule19Processed) {
		this.rule19Processed = rule19Processed;
	}

	public boolean isRule26Processed() {
		return this.rule26Processed;
	}

	public void setRule26Processed(boolean rule26Processed) {
		this.rule26Processed = rule26Processed;
	}

	public boolean isRule28Processed() {
		return this.rule28Processed;
	}

	public void setRule28Processed(boolean rule28Processed) {
		this.rule28Processed = rule28Processed;
	}

	public boolean isRule15DProcessed() {
		return this.rule15DProcessed;
	}

	public void setRule15DProcessed(boolean rule15DProcessed) {
		this.rule15DProcessed = rule15DProcessed;
	}

	public boolean isRule15EProcessed() {
		return this.rule15EProcessed;
	}

	public void setRule15EProcessed(boolean rule15EProcessed) {
		this.rule15EProcessed = rule15EProcessed;
	}

	public boolean isRule17AProcessed() {
		return this.rule17AProcessed;
	}

	public void setRule17AProcessed(boolean rule17AProcessed) {
		this.rule17AProcessed = rule17AProcessed;
	}

	public boolean isRule1Processed() {
		return this.rule1Processed;
	}

	public void setRule1Processed(boolean rule1Processed) {
		this.rule1Processed = rule1Processed;
	}

	public boolean isRule16Processed() {
		return this.rule16Processed;
	}

	public void setRule16Processed(boolean rule16Processed) {
		this.rule16Processed = rule16Processed;
	}

	public boolean isRule23Processed() {
		return this.rule23Processed;
	}

	public void setRule23Processed(boolean rule23Processed) {
		this.rule23Processed = rule23Processed;
	}

	public boolean isRule24Processed() {
		return this.rule24Processed;
	}

	public void setRule24Processed(boolean rule24Processed) {
		this.rule24Processed = rule24Processed;
	}

	public boolean isRule29Processed() {
		return this.rule29Processed;
	}

	public void setRule29Processed(boolean rule29Processed) {
		this.rule29Processed = rule29Processed;
	}

	public boolean isRule40Processed() {
		return this.rule40Processed;
	}

	public void setRule40Processed(boolean rule40Processed) {
		this.rule40Processed = rule40Processed;
	}

	public java.lang.Integer getApplicationCount() {
		return this.applicationCount;
	}

	public void setApplicationCount(java.lang.Integer applicationCount) {
		this.applicationCount = applicationCount;
	}

	public com.axa.dm.autouw.Agent getAgent() {
		return this.agent;
	}

	public void setAgent(com.axa.dm.autouw.Agent agent) {
		this.agent = agent;
	}

	public java.util.List<com.axa.dm.autouw.Insured> getInsured() {
		return this.insured;
	}

	public void setInsured(java.util.List<com.axa.dm.autouw.Insured> insured) {
		this.insured = insured;
	}

	public java.util.List<com.axa.dm.autouw.Owner> getOwner() {
		return this.owner;
	}

	public void setOwner(java.util.List<com.axa.dm.autouw.Owner> owner) {
		this.owner = owner;
	}

	public boolean isRule25Processed() {
		return this.rule25Processed;
	}

	public void setRule25Processed(boolean rule25Processed) {
		this.rule25Processed = rule25Processed;
	}

	public boolean isRule20Processed() {
		return this.rule20Processed;
	}

	public void setRule20Processed(boolean rule20Processed) {
		this.rule20Processed = rule20Processed;
	}

	public boolean isRule36Processed() {
		return this.rule36Processed;
	}

	public void setRule36Processed(boolean rule36Processed) {
		this.rule36Processed = rule36Processed;
	}

	public boolean isRule55Processed() {
		return this.rule55Processed;
	}

	public void setRule55Processed(boolean rule55Processed) {
		this.rule55Processed = rule55Processed;
	}

	public String toJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonInString = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(this);
			return jsonInString;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
			return null;
		} catch (JsonMappingException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean isRule45Processed() {
		return this.rule45Processed;
	}

	public void setRule45Processed(boolean rule45Processed) {
		this.rule45Processed = rule45Processed;
	}

	public ProcessObject(
			com.axa.dm.autouw.Agent agent,
			java.util.List<com.axa.dm.autouw.Policy> policy,
			java.util.List<com.axa.dm.autouw.Application> application,
			java.util.List<com.axa.dm.autouw.ApplicationRider> applicationRider,
			java.util.List<com.axa.dm.autouw.SpecialCase> specialCase,
			java.util.List<com.axa.dm.autouw.Fraud> fraud,
			java.util.List<com.axa.dm.autouw.Claim> claim,
			java.util.List<com.axa.dm.autouw.PolicyChange> policyChange,
			com.axa.dm.autouw.CurrentApplication currentApplication,
			java.util.List<com.axa.dm.autouw.PolicyRider> policyRider,
			boolean rule12Processed, java.lang.String ruleSet,
			boolean rule12AProcessed, java.util.Date startTime,
			boolean rule13Processed, boolean rule14Processed,
			boolean initProcessed, boolean rule10Processed,
			boolean rule11Processed, boolean rule8Processed,
			boolean rule9Processed, boolean rule3InsuredProcessed,
			boolean rule3OwnerProcessed, boolean rule3FinalProcessed,
			boolean rule2FinalProcessed, boolean rule2InsuredProcessed,
			boolean rule2OwnerProcessed, boolean rule31Processed,
			boolean rule2Processed, boolean rule5Processed,
			boolean rule4InsuredProcessed, boolean rule4OwnerProcessed,
			boolean rule4FinalProcessed, boolean rule6InsuredProcessed,
			boolean rule6OwnerProcessed, boolean rule6FinalProcessed,
			boolean rule7FinalProcessed, boolean rule7InsuredProcessed,
			boolean rule7OwnerProcessed, boolean rule21InsuredProcessed,
			boolean rule21OwnerProcessed, boolean rule21FinalProcessed,
			boolean rule22FinalProcessed, boolean rule22OwnerProcessed,
			boolean rule22InsuredProcessed, boolean rule27Processed,
			boolean rule32HKProcessed, boolean rule32MCVProcessed,
			boolean rule32FinalProcessed, boolean rule34Processed,
			boolean rule42Processed, boolean rule43InsuredProcessed,
			boolean rule43OwnerProcessed, boolean rule43FinalProcessed,
			boolean rule41Processed, boolean rule39Processed,
			boolean rule38Processed, boolean rule18Processed,
			boolean rule15AProcessed, boolean rule15BProcessed,
			boolean rule17Processed, boolean rule15CProcessed,
			boolean rule19Processed, boolean rule26Processed,
			boolean rule28Processed, boolean rule15DProcessed,
			boolean rule15EProcessed, boolean rule17AProcessed,
			boolean rule1Processed, boolean rule16Processed,
			boolean rule23Processed, boolean rule24Processed,
			boolean rule29Processed, boolean rule40Processed,
			java.lang.Integer applicationCount,
			java.util.List<com.axa.dm.autouw.Insured> insured,
			java.util.List<com.axa.dm.autouw.Owner> owner,
			boolean rule25Processed, boolean rule20Processed,
			boolean rule36Processed, boolean rule55Processed,
			boolean rule45Processed) {
		this.agent = agent;
		this.policy = policy;
		this.application = application;
		this.applicationRider = applicationRider;
		this.specialCase = specialCase;
		this.fraud = fraud;
		this.claim = claim;
		this.policyChange = policyChange;
		this.currentApplication = currentApplication;
		this.policyRider = policyRider;
		this.rule12Processed = rule12Processed;
		this.ruleSet = ruleSet;
		this.rule12AProcessed = rule12AProcessed;
		this.startTime = startTime;
		this.rule13Processed = rule13Processed;
		this.rule14Processed = rule14Processed;
		this.initProcessed = initProcessed;
		this.rule10Processed = rule10Processed;
		this.rule11Processed = rule11Processed;
		this.rule8Processed = rule8Processed;
		this.rule9Processed = rule9Processed;
		this.rule3InsuredProcessed = rule3InsuredProcessed;
		this.rule3OwnerProcessed = rule3OwnerProcessed;
		this.rule3FinalProcessed = rule3FinalProcessed;
		this.rule2FinalProcessed = rule2FinalProcessed;
		this.rule2InsuredProcessed = rule2InsuredProcessed;
		this.rule2OwnerProcessed = rule2OwnerProcessed;
		this.rule31Processed = rule31Processed;
		this.rule2Processed = rule2Processed;
		this.rule5Processed = rule5Processed;
		this.rule4InsuredProcessed = rule4InsuredProcessed;
		this.rule4OwnerProcessed = rule4OwnerProcessed;
		this.rule4FinalProcessed = rule4FinalProcessed;
		this.rule6InsuredProcessed = rule6InsuredProcessed;
		this.rule6OwnerProcessed = rule6OwnerProcessed;
		this.rule6FinalProcessed = rule6FinalProcessed;
		this.rule7FinalProcessed = rule7FinalProcessed;
		this.rule7InsuredProcessed = rule7InsuredProcessed;
		this.rule7OwnerProcessed = rule7OwnerProcessed;
		this.rule21InsuredProcessed = rule21InsuredProcessed;
		this.rule21OwnerProcessed = rule21OwnerProcessed;
		this.rule21FinalProcessed = rule21FinalProcessed;
		this.rule22FinalProcessed = rule22FinalProcessed;
		this.rule22OwnerProcessed = rule22OwnerProcessed;
		this.rule22InsuredProcessed = rule22InsuredProcessed;
		this.rule27Processed = rule27Processed;
		this.rule32HKProcessed = rule32HKProcessed;
		this.rule32MCVProcessed = rule32MCVProcessed;
		this.rule32FinalProcessed = rule32FinalProcessed;
		this.rule34Processed = rule34Processed;
		this.rule42Processed = rule42Processed;
		this.rule43InsuredProcessed = rule43InsuredProcessed;
		this.rule43OwnerProcessed = rule43OwnerProcessed;
		this.rule43FinalProcessed = rule43FinalProcessed;
		this.rule41Processed = rule41Processed;
		this.rule39Processed = rule39Processed;
		this.rule38Processed = rule38Processed;
		this.rule18Processed = rule18Processed;
		this.rule15AProcessed = rule15AProcessed;
		this.rule15BProcessed = rule15BProcessed;
		this.rule17Processed = rule17Processed;
		this.rule15CProcessed = rule15CProcessed;
		this.rule19Processed = rule19Processed;
		this.rule26Processed = rule26Processed;
		this.rule28Processed = rule28Processed;
		this.rule15DProcessed = rule15DProcessed;
		this.rule15EProcessed = rule15EProcessed;
		this.rule17AProcessed = rule17AProcessed;
		this.rule1Processed = rule1Processed;
		this.rule16Processed = rule16Processed;
		this.rule23Processed = rule23Processed;
		this.rule24Processed = rule24Processed;
		this.rule29Processed = rule29Processed;
		this.rule40Processed = rule40Processed;
		this.applicationCount = applicationCount;
		this.insured = insured;
		this.owner = owner;
		this.rule25Processed = rule25Processed;
		this.rule20Processed = rule20Processed;
		this.rule36Processed = rule36Processed;
		this.rule55Processed = rule55Processed;
		this.rule45Processed = rule45Processed;
	}

}