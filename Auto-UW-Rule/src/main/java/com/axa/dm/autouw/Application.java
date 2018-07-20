package com.axa.dm.autouw;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Application implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	private static List activeList;

	@org.kie.api.definition.type.Label("Lump Sum in HKD")
	private java.math.BigDecimal lumpSumHkd;

	@org.kie.api.definition.type.Label("Rated")
	private boolean rated;

	@org.kie.api.definition.type.Label("Daily Income")
	private java.math.BigDecimal dailyIncome;

	@org.kie.api.definition.type.Label("Product Series")
	private java.lang.String productSeries;
	@org.kie.api.definition.type.Label("Product Series High level")
	private java.lang.String productSeriesHigh;
	@org.kie.api.definition.type.Label("Product Series Low level")
	private java.lang.String productSeriesLow;
	@org.kie.api.definition.type.Label("Indexation")
	private boolean indexation;

	@org.kie.api.definition.type.Label("productType2")
	private java.lang.String productType2;
	@org.kie.api.definition.type.Label("productType3")
	private java.lang.String productType3;
	@org.kie.api.definition.type.Label("productType4")
	private java.lang.String productType4;

	@org.kie.api.definition.type.Label("Standard Class")
	private Boolean standardClass;

	@org.kie.api.definition.type.Label("productSeriesConcat")
	private java.lang.String productSeriesConcat;

	@org.kie.api.definition.type.Label(value = "fin limit for rule 45")
	private java.math.BigDecimal finLimit45;

	static {
		activeList = new ArrayList();
		activeList.add("00");
		activeList.add("01");
		activeList.add("02");
		activeList.add("04");
		activeList.add("05");
		activeList.add("06");
		activeList.add("07");
	}

	@org.kie.api.definition.type.Label("Role")
	private java.lang.String role;
	@org.kie.api.definition.type.Label("Application No")
	private java.lang.String applicationNo;
	@org.kie.api.definition.type.Label("Plan Code")
	private java.lang.String planCode;
	@org.kie.api.definition.type.Label("Currency")
	private java.lang.String currency;
	@org.kie.api.definition.type.Label("Application Status")
	private java.lang.String applicationStatus;
	@org.kie.api.definition.type.Label("Sum Insured")
	private java.math.BigDecimal sumInsured;
	@org.kie.api.definition.type.Label("Lump Sum")
	private java.math.BigDecimal lumpSum;
	@org.kie.api.definition.type.Label("Initial Lump Sum Premium")
	private java.math.BigDecimal initialLumpsumPremium;
	@org.kie.api.definition.type.Label("Top-up Premium")
	private java.math.BigDecimal topupPremium;
	@org.kie.api.definition.type.Label("Modal Regular Premium Exclude Topup")
	private java.math.BigDecimal modalRegularPremiumexcludeTopup;
	@org.kie.api.definition.type.Label("Date of Submission")
	private java.lang.String dateofSubmission;
	@org.kie.api.definition.type.Label("Payment Mode")
	private java.lang.String paymentMode;
	@org.kie.api.definition.type.Label("Last Underwriting Date")
	private String lastUnderwritingDate;
	@org.kie.api.definition.type.Label("Class Code")
	private java.lang.String classCode;
	@org.kie.api.definition.type.Label("Exclusion Code Status")
	private java.lang.String exclusionCodeStatus;
	@org.kie.api.definition.type.Label("Temp Loading")
	private java.math.BigDecimal tempLoading;
	@org.kie.api.definition.type.Label("Loading")
	private java.math.BigDecimal loading;

	@org.kie.api.definition.type.Label("currentRole")
	private java.lang.String currentRole;

	@org.kie.api.definition.type.Label("Regular Premium")
	private java.math.BigDecimal regularPremium;

	@org.kie.api.definition.type.Label("Sum Insured in HKD")
	private java.math.BigDecimal sumInsuredHkd;

	@org.kie.api.definition.type.Label("Annual Regular Premium in HKD")
	private java.math.BigDecimal annualRegularPremiumHkd;

	@org.kie.api.definition.type.Label("Fin Limit Multiplier")
	private java.math.BigDecimal finLimitMultiplier;

	@org.kie.api.definition.type.Label("Product Type")
	private java.lang.String productType;

	@org.kie.api.definition.type.Label("Product Group")
	private java.lang.String productGroup;

	public Application() {
	}

	public java.lang.String getRole() {
		return this.role;
	}

	public void setRole(java.lang.String role) {
		this.role = role;
	}

	public java.lang.String getApplicationNo() {
		return this.applicationNo;
	}

	public void setApplicationNo(java.lang.String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public java.lang.String getPlanCode() {
		return this.planCode;
	}

	public void setPlanCode(java.lang.String planCode) {
		this.planCode = planCode;
	}

	public java.lang.String getCurrency() {
		return this.currency;
	}

	public void setCurrency(java.lang.String currency) {
		this.currency = currency;
	}

	public java.lang.String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(java.lang.String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public java.math.BigDecimal getSumInsured() {
		return this.sumInsured;
	}

	public void setSumInsured(java.math.BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}

	public java.math.BigDecimal getLumpSum() {
		return this.lumpSum;
	}

	public void setLumpSum(java.math.BigDecimal lumpSum) {
		this.lumpSum = lumpSum;
	}

	public java.math.BigDecimal getInitialLumpsumPremium() {
		return this.initialLumpsumPremium;
	}

	public void setInitialLumpsumPremium(
			java.math.BigDecimal initialLumpsumPremium) {
		this.initialLumpsumPremium = initialLumpsumPremium;
	}

	public java.math.BigDecimal getTopupPremium() {
		return this.topupPremium;
	}

	public void setTopupPremium(java.math.BigDecimal topupPremium) {
		this.topupPremium = topupPremium;
	}

	public java.math.BigDecimal getModalRegularPremiumexcludeTopup() {
		return this.modalRegularPremiumexcludeTopup;
	}

	public void setModalRegularPremiumexcludeTopup(
			java.math.BigDecimal modalRegularPremiumexcludeTopup) {
		this.modalRegularPremiumexcludeTopup = modalRegularPremiumexcludeTopup;
	}

	public java.lang.String getDateofSubmission() {
		return this.dateofSubmission;
	}

	public java.util.Date getDateofSubmissionCal() {
		try {
			if (this.dateofSubmission != null
					&& !this.dateofSubmission.isEmpty()) {
				java.util.Date newDate = new SimpleDateFormat("yyyy-MM-dd")
						.parse(this.dateofSubmission);
				return newDate;
			}

			return null;
		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}
	}

	public void setDateofSubmission(java.lang.String dateofSubmission) {
		this.dateofSubmission = dateofSubmission;
	}

	public java.lang.String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(java.lang.String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public java.lang.String getLastUnderwritingDate() {
		return this.lastUnderwritingDate;
	}

	public java.util.Date getLastUnderwritingDateCal() {
		try {
			if (this.lastUnderwritingDate != null
					&& !this.lastUnderwritingDate.isEmpty()) {
				java.util.Date newDate = new SimpleDateFormat("yyyy-MM-dd")
						.parse(this.lastUnderwritingDate);
				return newDate;
			}

			return null;
		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}
	}

	public void setLastUnderwritingDate(java.lang.String lastUnderwritingDate) {
		this.lastUnderwritingDate = lastUnderwritingDate;
	}

	public java.lang.String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(java.lang.String classCode) {
		this.classCode = classCode;
	}

	public java.lang.String getExclusionCodeStatus() {
		return this.exclusionCodeStatus;
	}

	public void setExclusionCodeStatus(java.lang.String exclusionCodeStatus) {
		this.exclusionCodeStatus = exclusionCodeStatus;
	}

	public java.math.BigDecimal getTempLoading() {
		return this.tempLoading;
	}

	public void setTempLoading(java.math.BigDecimal tempLoading) {
		this.tempLoading = tempLoading;
	}

	public java.math.BigDecimal getLoading() {
		return this.loading;
	}

	public void setLoading(java.math.BigDecimal loading) {
		this.loading = loading;
	}

	public java.lang.String getCurrentRole() {
		return this.currentRole;
	}

	public void setCurrentRole(java.lang.String currentRole) {
		this.currentRole = currentRole;
	}

	public java.math.BigDecimal getRegularPremium() {
		return this.regularPremium;
	}

	public void setRegularPremium(java.math.BigDecimal regularPremium) {
		this.regularPremium = regularPremium;
	}

	public java.math.BigDecimal getSumInsuredHkd() {
		return this.sumInsuredHkd;
	}

	public void setSumInsuredHkd(java.math.BigDecimal sumInsuredHkd) {
		this.sumInsuredHkd = sumInsuredHkd;
	}

	public java.math.BigDecimal getAnnualRegularPremiumHkd() {
		return this.annualRegularPremiumHkd;
	}

	public void setAnnualRegularPremiumHkd(
			java.math.BigDecimal annualRegularPremiumHkd) {
		this.annualRegularPremiumHkd = annualRegularPremiumHkd;
	}

	public java.math.BigDecimal getFinLimitMultiplier() {
		return this.finLimitMultiplier;
	}

	public void setFinLimitMultiplier(java.math.BigDecimal finLimitMultiplier) {
		this.finLimitMultiplier = finLimitMultiplier;
	}

	public java.lang.String getProductType() {
		return this.productType;
	}

	public void setProductType(java.lang.String productType) {
		this.productType = productType;
	}

	public java.lang.String getProductGroup() {
		return this.productGroup;
	}

	public void setProductGroup(java.lang.String productGroup) {
		this.productGroup = productGroup;
	}

	public boolean isActive(String appStatus) {
		if (activeList.contains(appStatus))
			return true;
		return false;
	}

	public java.math.BigDecimal getLumpSumHkd() {
		return this.lumpSumHkd;
	}

	public void setLumpSumHkd(java.math.BigDecimal lumpSumHkd) {
		this.lumpSumHkd = lumpSumHkd;
	}

	public boolean isRated() {
		return this.rated;
	}

	public void setRated(boolean rated) {
		this.rated = rated;
	}

	public java.math.BigDecimal getDailyIncome() {
		return this.dailyIncome;
	}

	public void setDailyIncome(java.math.BigDecimal dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public java.lang.String getProductSeries() {
		return this.productSeries;
	}

	public void setProductSeries(java.lang.String productSeries) {
		this.productSeries = productSeries;
	}

	public java.lang.String getProductSeriesHigh() {
		return this.productSeriesHigh;
	}

	public void setProductSeriesHigh(java.lang.String productSeriesHigh) {
		this.productSeriesHigh = productSeriesHigh;
	}

	public java.lang.String getProductSeriesLow() {
		return this.productSeriesLow;
	}

	public void setProductSeriesLow(java.lang.String productSeriesLow) {
		this.productSeriesLow = productSeriesLow;
	}

	public boolean isIndexation() {
		return this.indexation;
	}

	public void setIndexation(boolean indexation) {
		this.indexation = indexation;
	}

	public java.lang.String getProductType2() {
		return this.productType2;
	}

	public void setProductType2(java.lang.String productType2) {
		this.productType2 = productType2;
	}

	public java.lang.String getProductType3() {
		return this.productType3;
	}

	public void setProductType3(java.lang.String productType3) {
		this.productType3 = productType3;
	}

	public java.lang.String getProductType4() {
		return this.productType4;
	}

	public void setProductType4(java.lang.String productType4) {
		this.productType4 = productType4;
	}

	public boolean isValidProduct(String... strings) {
		for (String s : strings) {
			if (s.equalsIgnoreCase(this.planCode))
				return true;
			if (s.equalsIgnoreCase(this.productType))
				return true;
			if (s.equalsIgnoreCase(this.productSeries))
				return true;
			if (s.equalsIgnoreCase(this.productSeriesHigh))
				return true;
			if (s.equalsIgnoreCase(this.productSeriesLow))
				return true;
		}
		return false;
	}

	public java.lang.Boolean getStandardClass() {
		return this.standardClass;
	}

	public void setStandardClass(java.lang.Boolean standardClass) {
		this.standardClass = standardClass;
	}

	public java.lang.String getProductSeriesConcat() {
		String s = "";
		if (this.productType != null && !"".equals(this.productType))
			s = s + "," + this.productType;

		if (this.productSeries != null && !"".equals(this.productSeries))
			s = s + "," + this.productSeries;

		if (this.productSeriesHigh != null
				&& !"".equals(this.productSeriesHigh))
			s = s + "," + this.productSeriesHigh;

		if (this.productSeriesLow != null && !"".equals(this.productSeriesLow))
			s = s + "," + this.productSeriesLow;

		return ("".equals(s)) ? s : s.substring(1);
	}

	public void setProductSeriesConcat(java.lang.String productSeriesConcat) {
		this.productSeriesConcat = productSeriesConcat;
	}

	public java.math.BigDecimal getFinLimit45() {
		return this.finLimit45;
	}

	public void setFinLimit45(java.math.BigDecimal finLimit45) {
		this.finLimit45 = finLimit45;
	}

	public Application(java.math.BigDecimal lumpSumHkd, boolean rated,
			java.math.BigDecimal dailyIncome, java.lang.String productSeries,
			java.lang.String productSeriesHigh,
			java.lang.String productSeriesLow, boolean indexation,
			java.lang.String productType2, java.lang.String productType3,
			java.lang.String productType4, java.lang.Boolean standardClass,
			java.lang.String productSeriesConcat,
			java.math.BigDecimal finLimit45, java.lang.String role,
			java.lang.String applicationNo, java.lang.String planCode,
			java.lang.String currency, java.lang.String applicationStatus,
			java.math.BigDecimal sumInsured, java.math.BigDecimal lumpSum,
			java.math.BigDecimal initialLumpsumPremium,
			java.math.BigDecimal topupPremium,
			java.math.BigDecimal modalRegularPremiumexcludeTopup,
			java.lang.String dateofSubmission, java.lang.String paymentMode,
			java.lang.String lastUnderwritingDate, java.lang.String classCode,
			java.lang.String exclusionCodeStatus,
			java.math.BigDecimal tempLoading, java.math.BigDecimal loading,
			java.lang.String currentRole, java.math.BigDecimal regularPremium,
			java.math.BigDecimal sumInsuredHkd,
			java.math.BigDecimal annualRegularPremiumHkd,
			java.math.BigDecimal finLimitMultiplier,
			java.lang.String productType, java.lang.String productGroup) {
		this.lumpSumHkd = lumpSumHkd;
		this.rated = rated;
		this.dailyIncome = dailyIncome;
		this.productSeries = productSeries;
		this.productSeriesHigh = productSeriesHigh;
		this.productSeriesLow = productSeriesLow;
		this.indexation = indexation;
		this.productType2 = productType2;
		this.productType3 = productType3;
		this.productType4 = productType4;
		this.standardClass = standardClass;
		this.productSeriesConcat = productSeriesConcat;
		this.finLimit45 = finLimit45;
		this.role = role;
		this.applicationNo = applicationNo;
		this.planCode = planCode;
		this.currency = currency;
		this.applicationStatus = applicationStatus;
		this.sumInsured = sumInsured;
		this.lumpSum = lumpSum;
		this.initialLumpsumPremium = initialLumpsumPremium;
		this.topupPremium = topupPremium;
		this.modalRegularPremiumexcludeTopup = modalRegularPremiumexcludeTopup;
		this.dateofSubmission = dateofSubmission;
		this.paymentMode = paymentMode;
		this.lastUnderwritingDate = lastUnderwritingDate;
		this.classCode = classCode;
		this.exclusionCodeStatus = exclusionCodeStatus;
		this.tempLoading = tempLoading;
		this.loading = loading;
		this.currentRole = currentRole;
		this.regularPremium = regularPremium;
		this.sumInsuredHkd = sumInsuredHkd;
		this.annualRegularPremiumHkd = annualRegularPremiumHkd;
		this.finLimitMultiplier = finLimitMultiplier;
		this.productType = productType;
		this.productGroup = productGroup;
	}

}