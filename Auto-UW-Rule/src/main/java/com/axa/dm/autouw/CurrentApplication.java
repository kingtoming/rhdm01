package com.axa.dm.autouw;

import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CurrentApplication implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Policy No")
	private java.lang.String policyNo;
	@org.kie.api.definition.type.Label("Agent Code")
	private java.lang.String agentCode;
	@org.kie.api.definition.type.Label("Currency")
	private java.lang.String currency;
	@org.kie.api.definition.type.Label("Exchange Rate")
	private java.math.BigDecimal exchangeRate;
	@org.kie.api.definition.type.Label("Insured to Owner")
	private java.lang.String insuredtoOwner;
	@org.kie.api.definition.type.Label("Exclusion")
	private java.lang.String exclusion;
	@org.kie.api.definition.type.Label("Application Status")
	private java.lang.String applicationStatus;
	@org.kie.api.definition.type.Label("Policy Location Code")
	private java.lang.String policyLocationCode;
	@org.kie.api.definition.type.Label("Free Text Flag")
	private boolean freeTextFlag;
	@org.kie.api.definition.type.Label("Total Premium")
	private java.math.BigDecimal totalPremium;

	@org.kie.api.definition.type.Label("Form ID")
	private java.lang.String formId;

	@org.kie.api.definition.type.Label("Basic")
	private java.util.List<com.axa.dm.autouw.Basic> basic;

	@org.kie.api.definition.type.Label("Rider")
	private java.util.List<com.axa.dm.autouw.Rider> rider;

	@org.kie.api.definition.type.Label("Insured")
	private java.util.List<com.axa.dm.autouw.Insured> insured;

	@org.kie.api.definition.type.Label("Owner")
	private java.util.List<com.axa.dm.autouw.Owner> owner;

	@org.kie.api.definition.type.Label("Beneficiaries")
	private java.util.List<com.axa.dm.autouw.Beneficiary> beneficiaries;

	@org.kie.api.definition.type.Label("specialField")
	private java.util.List<com.axa.dm.autouw.SpecialField> specialField;

	@org.kie.api.definition.type.Label("Insured is owner")
	private boolean insuredIsOwner;

	@org.kie.api.definition.type.Label("Payment Mode")
	private java.lang.String paymentMode;

	@org.kie.api.definition.type.Label("declareExceedLimitWA")
	private boolean declareExceedLimitWA;

	@org.kie.api.definition.type.Label(value = "Application Date")
	private java.lang.String applicationDate;

	@org.kie.api.definition.type.Label(value = "Application Date for Calculation")
	private java.util.Date applicationDateCal;

	public CurrentApplication() {
	}

	public java.lang.String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(java.lang.String policyNo) {
		this.policyNo = policyNo;
	}

	public java.lang.String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(java.lang.String agentCode) {
		this.agentCode = agentCode;
	}

	public java.lang.String getCurrency() {
		return this.currency;
	}

	public void setCurrency(java.lang.String currency) {
		this.currency = currency;
	}

	public java.math.BigDecimal getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(java.math.BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public java.lang.String getInsuredtoOwner() {
		return this.insuredtoOwner;
	}

	public void setInsuredtoOwner(java.lang.String insuredtoOwner) {
		this.insuredtoOwner = insuredtoOwner;
	}

	public java.lang.String getExclusion() {
		return this.exclusion;
	}

	public void setExclusion(java.lang.String exclusion) {
		this.exclusion = exclusion;
	}

	public java.lang.String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(java.lang.String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public java.lang.String getPolicyLocationCode() {
		return this.policyLocationCode;
	}

	public void setPolicyLocationCode(java.lang.String policyLocationCode) {
		this.policyLocationCode = policyLocationCode;
	}

	public boolean isFreeTextFlag() {
		return this.freeTextFlag;
	}

	public void setFreeTextFlag(boolean freeTextFlag) {
		this.freeTextFlag = freeTextFlag;
	}

	public java.math.BigDecimal getTotalPremium() {
		return this.totalPremium;
	}

	public void setTotalPremium(java.math.BigDecimal totalPremium) {
		this.totalPremium = totalPremium;
	}

	public java.lang.String getFormId() {
		return this.formId;
	}

	public void setFormId(java.lang.String formId) {
		this.formId = formId;
	}

	public java.util.List<com.axa.dm.autouw.Basic> getBasic() {
		return this.basic;
	}

	public void setBasic(java.util.List<com.axa.dm.autouw.Basic> basic) {
		this.basic = basic;
	}

	public java.util.List<com.axa.dm.autouw.Rider> getRider() {
		return this.rider;
	}

	public void setRider(java.util.List<com.axa.dm.autouw.Rider> rider) {
		this.rider = rider;
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

	public java.util.List<com.axa.dm.autouw.Beneficiary> getBeneficiaries() {
		return this.beneficiaries;
	}

	public void setBeneficiaries(
			java.util.List<com.axa.dm.autouw.Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public java.util.List<com.axa.dm.autouw.SpecialField> getSpecialField() {
		return this.specialField;
	}

	public void setSpecialField(
			java.util.List<com.axa.dm.autouw.SpecialField> specialField) {
		this.specialField = specialField;
	}

	public boolean isInsuredIsOwner() {
		return this.insuredIsOwner;
	}

	public boolean isDeclareExceedLimitWA() {
		return this.declareExceedLimitWA;
	}

	public void setInsuredIsOwner(boolean insuredIsOwner) {
		this.insuredIsOwner = insuredIsOwner;
	}

	public java.lang.String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(java.lang.String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setDeclareExceedLimitWA(boolean declareExceedLimitWA) {
		this.declareExceedLimitWA = declareExceedLimitWA;
	}

	public java.lang.String getApplicationDate() {
		return this.applicationDate;
	}

	public void setApplicationDate(java.lang.String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public java.util.Date getApplicationDateCal() {
		try{
	        
	         if(this.applicationDate != null && !this.applicationDate.isEmpty()){
	            java.util.Date newDate=new SimpleDateFormat("yyyy-MM-dd").parse(this.applicationDate);  
	            return newDate;    
	        }
	        
	        return null;
	    } catch (ParseException e){
	       // e.printStackTrace();
	        return null;
	    }
	}

	public void setApplicationDateCal(java.util.Date applicationDateCal) {
		this.applicationDateCal = applicationDateCal;
	}

	public CurrentApplication(java.lang.String policyNo,
			java.lang.String agentCode, java.lang.String currency,
			java.math.BigDecimal exchangeRate, java.lang.String insuredtoOwner,
			java.lang.String exclusion, java.lang.String applicationStatus,
			java.lang.String policyLocationCode, boolean freeTextFlag,
			java.math.BigDecimal totalPremium, java.lang.String formId,
			java.util.List<com.axa.dm.autouw.Basic> basic,
			java.util.List<com.axa.dm.autouw.Rider> rider,
			java.util.List<com.axa.dm.autouw.Insured> insured,
			java.util.List<com.axa.dm.autouw.Owner> owner,
			java.util.List<com.axa.dm.autouw.Beneficiary> beneficiaries,
			java.util.List<com.axa.dm.autouw.SpecialField> specialField,
			boolean insuredIsOwner, java.lang.String paymentMode,
			boolean declareExceedLimitWA, java.lang.String applicationDate,
			java.util.Date applicationDateCal) {
		this.policyNo = policyNo;
		this.agentCode = agentCode;
		this.currency = currency;
		this.exchangeRate = exchangeRate;
		this.insuredtoOwner = insuredtoOwner;
		this.exclusion = exclusion;
		this.applicationStatus = applicationStatus;
		this.policyLocationCode = policyLocationCode;
		this.freeTextFlag = freeTextFlag;
		this.totalPremium = totalPremium;
		this.formId = formId;
		this.basic = basic;
		this.rider = rider;
		this.insured = insured;
		this.owner = owner;
		this.beneficiaries = beneficiaries;
		this.specialField = specialField;
		this.insuredIsOwner = insuredIsOwner;
		this.paymentMode = paymentMode;
		this.declareExceedLimitWA = declareExceedLimitWA;
		this.applicationDate = applicationDate;
		this.applicationDateCal = applicationDateCal;
	}

}