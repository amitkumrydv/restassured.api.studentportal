package com.api.pojoClass;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



/*
Only consider the specified fields
Ignore all others JSON.
*/

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationPojo {
	
	private String sapid;
	private String lastName;
	private String firstName;
	private String middleName;
	private String fatherName;
	private String husbandName;
	private String motherName;
	private String gender;
	private String program;
	private String enrollmentMonth;
	private String enrollmentYear;
	private String emailId;
	private String mobile;
	private String altPhone;
	private String dob;
	private String regDate;
	private String address;
	private String houseNoName;
	private String street;
	private String landMark;
	private String locality;
	private String city;
	private String state;
	private String country;
	private String examMode;
	private String designation;
	private String industry;
	private String pin;
	private String centerCode;
	private String centerName;
	private String validityEndMonth;
	private String validityEndYear;
	private String createdBy;
	private String createdDate;
	private String lastModifiedBy;
	private String lastModifiedDate;
	private String errorMessage;
	private boolean errorRecord;
	private String prgmStructApplicable;
	private String imageUrl;
	private String programForHeader;
	private boolean programCleared;
	private boolean changedPassword;
	private String programType;
	private boolean louConfirmedTimestamp;
	private int ufm_notice_viewed;
	private boolean readWelcomeNote;
	private boolean errorFlag;
	private int totalExperience;
	private String companyName;
	
	
	private int age;
	private String highestQualification; 
	private String consumerType;
	private int consumerProgramStructureId;
	private String firebaseToken;
	
	@JsonProperty("currentAcadMonth")
	private String currentAcadMonth;
	private String currentAcadYear;
	private ArrayList<Integer> currentSemPSSId;
	


	private boolean error;
	private boolean detailsConfirmedByStudent;

	private boolean purchasedOtherPackages;
	private int highContrast;
	private int textToSpeech;
	private int coachMark;

	private int provisionalAdmission;
	private boolean validStudent;

	private boolean certificateStudent;
	private boolean corporateExamCenterStudent;
	private int rconsumerProgramStructureId;

	
	// using for payload
	private String userId;
	private String password;
	
	
	public String getSapid() {
		return sapid;
	}
	public void setSapid(String sapid) {
		this.sapid = sapid;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getHusbandName() {
		return husbandName;
	}
	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getEnrollmentMonth() {
		return enrollmentMonth;
	}
	public void setEnrollmentMonth(String enrollmentMonth) {
		this.enrollmentMonth = enrollmentMonth;
	}
	public String getEnrollmentYear() {
		return enrollmentYear;
	}
	public void setEnrollmentYear(String enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAltPhone() {
		return altPhone;
	}
	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHouseNoName() {
		return houseNoName;
	}
	public void setHouseNoName(String houseNoName) {
		this.houseNoName = houseNoName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getExamMode() {
		return examMode;
	}
	public void setExamMode(String examMode) {
		this.examMode = examMode;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCenterCode() {
		return centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getValidityEndMonth() {
		return validityEndMonth;
	}
	public void setValidityEndMonth(String validityEndMonth) {
		this.validityEndMonth = validityEndMonth;
	}
	public String getValidityEndYear() {
		return validityEndYear;
	}
	public void setValidityEndYear(String validityEndYear) {
		this.validityEndYear = validityEndYear;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public boolean isErrorRecord() {
		return errorRecord;
	}
	public void setErrorRecord(boolean errorRecord) {
		this.errorRecord = errorRecord;
	}
	public String getPrgmStructApplicable() {
		return prgmStructApplicable;
	}
	public void setPrgmStructApplicable(String prgmStructApplicable) {
		this.prgmStructApplicable = prgmStructApplicable;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getProgramForHeader() {
		return programForHeader;
	}
	public void setProgramForHeader(String programForHeader) {
		this.programForHeader = programForHeader;
	}
	public boolean isProgramCleared() {
		return programCleared;
	}
	public void setProgramCleared(boolean programCleared) {
		this.programCleared = programCleared;
	}
	public boolean isChangedPassword() {
		return changedPassword;
	}
	public void setChangedPassword(boolean changedPassword) {
		this.changedPassword = changedPassword;
	}
	public String getProgramType() {
		return programType;
	}
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	public boolean isLouConfirmedTimestamp() {
		return louConfirmedTimestamp;
	}
	public void setLouConfirmedTimestamp(boolean louConfirmedTimestamp) {
		this.louConfirmedTimestamp = louConfirmedTimestamp;
	}
	public int getUfm_notice_viewed() {
		return ufm_notice_viewed;
	}
	public void setUfm_notice_viewed(int ufm_notice_viewed) {
		this.ufm_notice_viewed = ufm_notice_viewed;
	}
	public boolean isReadWelcomeNote() {
		return readWelcomeNote;
	}
	public void setReadWelcomeNote(boolean readWelcomeNote) {
		this.readWelcomeNote = readWelcomeNote;
	}
	public boolean isErrorFlag() {
		return errorFlag;
	}
	public void setErrorFlag(boolean errorFlag) {
		this.errorFlag = errorFlag;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getConsumerType() {
		return consumerType;
	}
	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}
	public int getConsumerProgramStructureId() {
		return consumerProgramStructureId;
	}
	public void setConsumerProgramStructureId(int consumerProgramStructureId) {
		this.consumerProgramStructureId = consumerProgramStructureId;
	}
	public String getFirebaseToken() {
		return firebaseToken;
	}
	public void setFirebaseToken(String firebaseToken) {
		this.firebaseToken = firebaseToken;
	}
	public String getCurrentAcadMonth() {
		return currentAcadMonth;
	}
	public void setCurrentAcadMonth(String currentAcadMonth) {
		this.currentAcadMonth = currentAcadMonth;
	}
	public String getCurrentAcadYear() {
		return currentAcadYear;
	}
	public void setCurrentAcadYear(String currentAcadYear) {
		this.currentAcadYear = currentAcadYear;
	}
	public ArrayList<Integer> getCurrentSemPSSId() {
		return currentSemPSSId;
	}
	public void setCurrentSemPSSId(ArrayList<Integer> currentSemPSSId) {
		this.currentSemPSSId = currentSemPSSId;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public boolean isDetailsConfirmedByStudent() {
		return detailsConfirmedByStudent;
	}
	public void setDetailsConfirmedByStudent(boolean detailsConfirmedByStudent) {
		this.detailsConfirmedByStudent = detailsConfirmedByStudent;
	}
	public boolean isPurchasedOtherPackages() {
		return purchasedOtherPackages;
	}
	public void setPurchasedOtherPackages(boolean purchasedOtherPackages) {
		this.purchasedOtherPackages = purchasedOtherPackages;
	}
	public int getHighContrast() {
		return highContrast;
	}
	public void setHighContrast(int highContrast) {
		this.highContrast = highContrast;
	}
	public int getTextToSpeech() {
		return textToSpeech;
	}
	public void setTextToSpeech(int textToSpeech) {
		this.textToSpeech = textToSpeech;
	}
	public int getCoachMark() {
		return coachMark;
	}
	public void setCoachMark(int coachMark) {
		this.coachMark = coachMark;
	}
	public int getProvisionalAdmission() {
		return provisionalAdmission;
	}
	public void setProvisionalAdmission(int provisionalAdmission) {
		this.provisionalAdmission = provisionalAdmission;
	}
	public boolean isValidStudent() {
		return validStudent;
	}
	public void setValidStudent(boolean validStudent) {
		this.validStudent = validStudent;
	}
	public boolean isCertificateStudent() {
		return certificateStudent;
	}
	public void setCertificateStudent(boolean certificateStudent) {
		this.certificateStudent = certificateStudent;
	}
	public boolean isCorporateExamCenterStudent() {
		return corporateExamCenterStudent;
	}
	public void setCorporateExamCenterStudent(boolean corporateExamCenterStudent) {
		this.corporateExamCenterStudent = corporateExamCenterStudent;
	}
	public int getRconsumerProgramStructureId() {
		return rconsumerProgramStructureId;
	}
	public void setRconsumerProgramStructureId(int rconsumerProgramStructureId) {
		this.rconsumerProgramStructureId = rconsumerProgramStructureId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	


}
