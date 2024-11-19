package com.api.pojoClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
Only consider the specified fields
Ignore all others JSON.
*/

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationPojo {
	
//	    @JsonProperty("student")
//	    private Student student;

	    @JsonProperty("announcements")
	    private Object announcements;

	    @JsonProperty("userId")
	    private String userId;

	    @JsonProperty("isStudent")
	    private Boolean isStudent;

	    @JsonProperty("personDetails")
	    private Object personDetails;

	    @JsonProperty("userBean")
	    private Object userBean;

	    @JsonProperty("validityExpired")
	    private String validityExpired;

	    @JsonProperty("applicableSubjects")
	    private Object applicableSubjects;

//	    @JsonProperty("regData")
//	    private RegistrationData regData;

	    @JsonProperty("stukent")
	    private Object stukent;

	    @JsonProperty("harvard")
	    private Object harvard;

	    @JsonProperty("regOrder")
	    private double regOrder;

	    @JsonProperty("maxOrderWhereContentLive")
	    private double maxOrderWhereContentLive;

	    @JsonProperty("currentOrder")
	    private double currentOrder;

	    @JsonProperty("currentSemPSSId")
	    private List<Integer> currentSemPSSId;

	    @JsonProperty("isLoginAsLead")
	    private Object isLoginAsLead;

	    @JsonProperty("earlyAccess")
	    private String earlyAccess;

	    @JsonProperty("liveSessionPssIdAccess")
	    private List<Integer> liveSessionPssIdAccess;

	    @JsonProperty("featureViseAccess")
	    private Map<String, Boolean> featureViseAccess;

	    @JsonProperty("consumerProgramStructureHasCSAccess")
	    private boolean consumerProgramStructureHasCSAccess;

	    @JsonProperty("acadSessionLiveOrder")
	    private double acadSessionLiveOrder;

	    @JsonProperty("csAdmin")
	    private Object csAdmin;

	    @JsonProperty("courseraAccess")
	    private boolean courseraAccess;

	    @JsonProperty("validityEndDate")
	    private String validityEndDate;

	    @JsonProperty("errorMessage")
	    private Object errorMessage;

	    @JsonProperty("encryptedSapId")
	    private String encryptedSapId;

	    @JsonProperty("subjectCodeId")
	    private List<Integer> subjectCodeId;

	    @JsonProperty("currentSubjectCodeIds")
	    private List<Integer> currentSubjectCodeIds;

	    @JsonProperty("backlogSubjectCodeIds")
	    private Object backlogSubjectCodeIds;

	    @JsonProperty("defaultAcadsUrl")
	    private String defaultAcadsUrl;

	    @JsonProperty("defaultExamUrl")
	    private String defaultExamUrl;

	    @JsonProperty("defaultContentUrl")
	    private String defaultContentUrl;

	    @JsonProperty("defaultAnnouncementUrl")
	    private String defaultAnnouncementUrl;

	    @JsonProperty("defaultknowyourpolicyUrl")
	    private String defaultKnowYourPolicyUrl;

	    @JsonProperty("defaultjobsearchUrl")
	    private String defaultJobSearchUrl;

	    @JsonProperty("defaultMarksheetUrl")
	    private String defaultMarksheetUrl;

	    @JsonProperty("defaultalmashinesyUrl")
	    private String defaultAlmashinesyUrl;

	    @JsonProperty("defaultinternalassessmentyUrl")
	    private String defaultInternalAssessmentyUrl;

	    @JsonProperty("defaultservicerequestUrl")
	    private String defaultServiceRequestUrl;

	    @JsonProperty("defaultreportingtoolUrl")
	    private String defaultReportingToolUrl;

	    @JsonProperty("defaultltidemoUrl")
	    private String defaultLtidemoUrl;

	    @JsonProperty("currentAcadMonth")
	    private String currentAcadMonth;

	    @JsonProperty("currentAcadYear")
	    private String currentAcadYear;

	    @JsonProperty("defaultSearchAppUrl")
	    private String defaultSearchAppUrl;

	    @JsonProperty("defaultForumUrl")
	    private String defaultForumUrl;

	    @JsonProperty("defaultStudentportalUrl")
	    private String defaultStudentPortalUrl;

	    @JsonProperty("defaultIAUrl")
	    private String defaultIAUrl;

	    @JsonProperty("defaultAcademicSessionUrl")
	    private String defaultAcademicSessionUrl;

	    @JsonProperty("error")
	    private boolean error;


	        @JsonProperty("certificatePrograms")
	        private Object certificatePrograms;
	        @JsonProperty("sapid")
	        private String sapid;
	        @JsonProperty("sapId")
	        private String sapId;
	        @JsonProperty("sem")
	        private Object sem;
	        @JsonProperty("email")
	        private Object email;
	        @JsonProperty("lastName")
	        private String lastName;
	        @JsonProperty("firstName")
	        private String firstName;
	        @JsonProperty("middleName")
	        private String middleName;
	        @JsonProperty("fatherName")
	        private String fatherName;
	        @JsonProperty("husbandName")
	        private String husbandName;
	        @JsonProperty("motherName")
	        private String motherName;
	        @JsonProperty("gender")
	        private String gender;
	        @JsonProperty("program")
	        private String program;
	        @JsonProperty("enrollmentMonth")
	        private String enrollmentMonth;
	        @JsonProperty("enrollmentYear")
	        private String enrollmentYear;
	        @JsonProperty("emailId")
	        private String emailId;
	        @JsonProperty("mobile")
	        private String mobile;
	        @JsonProperty("altPhone")
	        private String altPhone;
	        @JsonProperty("dob")
	        private String dob;
	        @JsonProperty("regDate")
	        private String regDate;
	        @JsonProperty("isLateral")
	        private String isLateral;
	        @JsonProperty("isReReg")
	        private Object isReReg;
	        @JsonProperty("address")
	        private String address;
	        @JsonProperty("houseNoName")
	        private String houseNoName;
	        @JsonProperty("street")
	        private String street;
	        @JsonProperty("landMark")
	        private String landMark;
	        @JsonProperty("locality")
	        private String locality;
	        @JsonProperty("city")
	        private String city;
	        @JsonProperty("state")
	        private String state;
	        @JsonProperty("country")
	        private String country;
	        @JsonProperty("shippingAddress")
	        private Object shippingAddress;
	        @JsonProperty("examMode")
	        private String examMode;
	        @JsonProperty("designation")
	        private String designation;
	        @JsonProperty("industry")
	        private String industry;

	        @JsonProperty("password")
	        private Object password;
	        @JsonProperty("pin")
	        private String pin;
	        @JsonProperty("centerCode")
	        private String centerCode;
	        @JsonProperty("centerName")
	        private String centerName;
	        @JsonProperty("validityEndMonth")
	        private String validityEndMonth;
	        @JsonProperty("validityEndYear")
	        private String validityEndYear;
	        @JsonProperty("createdBy")
	        private String createdBy;
	        @JsonProperty("createdDate")
	        private String createdDate;
	        @JsonProperty("lastModifiedBy")
	        private String lastModifiedBy;
	        @JsonProperty("lastModifiedDate")
	        private String lastModifiedDate;

	        @JsonProperty("errorRecord")
	        private boolean errorRecord;
	        @JsonProperty("prgmStructApplicable")
	        private String prgmStructApplicable;
	        @JsonProperty("updatedByStudent")
	        private Object updatedByStudent;
	        @JsonProperty("imageUrl")
	        private String imageUrl;
	        @JsonProperty("subjectsCleared")
	        private Object subjectsCleared;
	        @JsonProperty("programCleared")
	        private String programCleared;
	        @JsonProperty("age")
	        private String age;
	        // Add other properties as necessary





	        @JsonProperty("consumerProgramStructureId")
	        private String consumerProgramStructureId;


	        @JsonProperty("louConfirmed")
	        private boolean louConfirmed;
	        @JsonProperty("louConfirmedTimestamp")
	        private String louConfirmedTimestamp;
	        @JsonProperty("year")
	        private String year;
	        @JsonProperty("month")
	        private String month;
	        
	        
	        
	        // Add other properties as necessary
			public Object getAnnouncements() {
				return announcements;
			}
			public void setAnnouncements(Object announcements) {
				this.announcements = announcements;
			}
			public String getUserId() {
				return userId;
			}
			public void setUserId(String userId) {
				this.userId = userId;
			}
			public Boolean getIsStudent() {
				return isStudent;
			}
			public void setIsStudent(Boolean isStudent) {
				this.isStudent = isStudent;
			}
			public Object getPersonDetails() {
				return personDetails;
			}
			public void setPersonDetails(Object personDetails) {
				this.personDetails = personDetails;
			}
			public Object getUserBean() {
				return userBean;
			}
			public void setUserBean(Object userBean) {
				this.userBean = userBean;
			}
			public String getValidityExpired() {
				return validityExpired;
			}
			public void setValidityExpired(String validityExpired) {
				this.validityExpired = validityExpired;
			}
			public Object getApplicableSubjects() {
				return applicableSubjects;
			}
			public void setApplicableSubjects(Object applicableSubjects) {
				this.applicableSubjects = applicableSubjects;
			}
			public Object getStukent() {
				return stukent;
			}
			public void setStukent(Object stukent) {
				this.stukent = stukent;
			}
			public Object getHarvard() {
				return harvard;
			}
			public void setHarvard(Object harvard) {
				this.harvard = harvard;
			}
			public double getRegOrder() {
				return regOrder;
			}
			public void setRegOrder(double regOrder) {
				this.regOrder = regOrder;
			}
			public double getMaxOrderWhereContentLive() {
				return maxOrderWhereContentLive;
			}
			public void setMaxOrderWhereContentLive(double maxOrderWhereContentLive) {
				this.maxOrderWhereContentLive = maxOrderWhereContentLive;
			}
			public double getCurrentOrder() {
				return currentOrder;
			}
			public void setCurrentOrder(double currentOrder) {
				this.currentOrder = currentOrder;
			}
			public List<Integer> getCurrentSemPSSId() {
				return currentSemPSSId;
			}
			public void setCurrentSemPSSId(List<Integer> currentSemPSSId) {
				this.currentSemPSSId = currentSemPSSId;
			}
			public Object getIsLoginAsLead() {
				return isLoginAsLead;
			}
			public void setIsLoginAsLead(Object isLoginAsLead) {
				this.isLoginAsLead = isLoginAsLead;
			}
			public String getEarlyAccess() {
				return earlyAccess;
			}
			public void setEarlyAccess(String earlyAccess) {
				this.earlyAccess = earlyAccess;
			}
			public List<Integer> getLiveSessionPssIdAccess() {
				return liveSessionPssIdAccess;
			}
			public void setLiveSessionPssIdAccess(List<Integer> liveSessionPssIdAccess) {
				this.liveSessionPssIdAccess = liveSessionPssIdAccess;
			}
			public Map<String, Boolean> getFeatureViseAccess() {
				return featureViseAccess;
			}
			public void setFeatureViseAccess(Map<String, Boolean> featureViseAccess) {
				this.featureViseAccess = featureViseAccess;
			}
			public boolean isConsumerProgramStructureHasCSAccess() {
				return consumerProgramStructureHasCSAccess;
			}
			public void setConsumerProgramStructureHasCSAccess(boolean consumerProgramStructureHasCSAccess) {
				this.consumerProgramStructureHasCSAccess = consumerProgramStructureHasCSAccess;
			}
			public double getAcadSessionLiveOrder() {
				return acadSessionLiveOrder;
			}
			public void setAcadSessionLiveOrder(double acadSessionLiveOrder) {
				this.acadSessionLiveOrder = acadSessionLiveOrder;
			}
			public Object getCsAdmin() {
				return csAdmin;
			}
			public void setCsAdmin(Object csAdmin) {
				this.csAdmin = csAdmin;
			}
			public boolean isCourseraAccess() {
				return courseraAccess;
			}
			public void setCourseraAccess(boolean courseraAccess) {
				this.courseraAccess = courseraAccess;
			}
			public String getValidityEndDate() {
				return validityEndDate;
			}
			public void setValidityEndDate(String validityEndDate) {
				this.validityEndDate = validityEndDate;
			}
			public Object getErrorMessage() {
				return errorMessage;
			}
			public void setErrorMessage(Object errorMessage) {
				this.errorMessage = errorMessage;
			}
			public String getEncryptedSapId() {
				return encryptedSapId;
			}
			public void setEncryptedSapId(String encryptedSapId) {
				this.encryptedSapId = encryptedSapId;
			}
			public List<Integer> getSubjectCodeId() {
				return subjectCodeId;
			}
			public void setSubjectCodeId(List<Integer> subjectCodeId) {
				this.subjectCodeId = subjectCodeId;
			}
			public List<Integer> getCurrentSubjectCodeIds() {
				return currentSubjectCodeIds;
			}
			public void setCurrentSubjectCodeIds(List<Integer> currentSubjectCodeIds) {
				this.currentSubjectCodeIds = currentSubjectCodeIds;
			}
			public Object getBacklogSubjectCodeIds() {
				return backlogSubjectCodeIds;
			}
			public void setBacklogSubjectCodeIds(Object backlogSubjectCodeIds) {
				this.backlogSubjectCodeIds = backlogSubjectCodeIds;
			}
			public String getDefaultAcadsUrl() {
				return defaultAcadsUrl;
			}
			public void setDefaultAcadsUrl(String defaultAcadsUrl) {
				this.defaultAcadsUrl = defaultAcadsUrl;
			}
			public String getDefaultExamUrl() {
				return defaultExamUrl;
			}
			public void setDefaultExamUrl(String defaultExamUrl) {
				this.defaultExamUrl = defaultExamUrl;
			}
			public String getDefaultContentUrl() {
				return defaultContentUrl;
			}
			public void setDefaultContentUrl(String defaultContentUrl) {
				this.defaultContentUrl = defaultContentUrl;
			}
			public String getDefaultAnnouncementUrl() {
				return defaultAnnouncementUrl;
			}
			public void setDefaultAnnouncementUrl(String defaultAnnouncementUrl) {
				this.defaultAnnouncementUrl = defaultAnnouncementUrl;
			}
			public String getDefaultKnowYourPolicyUrl() {
				return defaultKnowYourPolicyUrl;
			}
			public void setDefaultKnowYourPolicyUrl(String defaultKnowYourPolicyUrl) {
				this.defaultKnowYourPolicyUrl = defaultKnowYourPolicyUrl;
			}
			public String getDefaultJobSearchUrl() {
				return defaultJobSearchUrl;
			}
			public void setDefaultJobSearchUrl(String defaultJobSearchUrl) {
				this.defaultJobSearchUrl = defaultJobSearchUrl;
			}
			public String getDefaultMarksheetUrl() {
				return defaultMarksheetUrl;
			}
			public void setDefaultMarksheetUrl(String defaultMarksheetUrl) {
				this.defaultMarksheetUrl = defaultMarksheetUrl;
			}
			public String getDefaultAlmashinesyUrl() {
				return defaultAlmashinesyUrl;
			}
			public void setDefaultAlmashinesyUrl(String defaultAlmashinesyUrl) {
				this.defaultAlmashinesyUrl = defaultAlmashinesyUrl;
			}
			public String getDefaultInternalAssessmentyUrl() {
				return defaultInternalAssessmentyUrl;
			}
			public void setDefaultInternalAssessmentyUrl(String defaultInternalAssessmentyUrl) {
				this.defaultInternalAssessmentyUrl = defaultInternalAssessmentyUrl;
			}
			public String getDefaultServiceRequestUrl() {
				return defaultServiceRequestUrl;
			}
			public void setDefaultServiceRequestUrl(String defaultServiceRequestUrl) {
				this.defaultServiceRequestUrl = defaultServiceRequestUrl;
			}
			public String getDefaultReportingToolUrl() {
				return defaultReportingToolUrl;
			}
			public void setDefaultReportingToolUrl(String defaultReportingToolUrl) {
				this.defaultReportingToolUrl = defaultReportingToolUrl;
			}
			public String getDefaultLtidemoUrl() {
				return defaultLtidemoUrl;
			}
			public void setDefaultLtidemoUrl(String defaultLtidemoUrl) {
				this.defaultLtidemoUrl = defaultLtidemoUrl;
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
			public String getDefaultSearchAppUrl() {
				return defaultSearchAppUrl;
			}
			public void setDefaultSearchAppUrl(String defaultSearchAppUrl) {
				this.defaultSearchAppUrl = defaultSearchAppUrl;
			}
			public String getDefaultForumUrl() {
				return defaultForumUrl;
			}
			public void setDefaultForumUrl(String defaultForumUrl) {
				this.defaultForumUrl = defaultForumUrl;
			}
			public String getDefaultStudentPortalUrl() {
				return defaultStudentPortalUrl;
			}
			public void setDefaultStudentPortalUrl(String defaultStudentPortalUrl) {
				this.defaultStudentPortalUrl = defaultStudentPortalUrl;
			}
			public String getDefaultIAUrl() {
				return defaultIAUrl;
			}
			public void setDefaultIAUrl(String defaultIAUrl) {
				this.defaultIAUrl = defaultIAUrl;
			}
			public String getDefaultAcademicSessionUrl() {
				return defaultAcademicSessionUrl;
			}
			public void setDefaultAcademicSessionUrl(String defaultAcademicSessionUrl) {
				this.defaultAcademicSessionUrl = defaultAcademicSessionUrl;
			}
			public boolean isError() {
				return error;
			}
			public void setError(boolean error) {
				this.error = error;
			}
			public Object getCertificatePrograms() {
				return certificatePrograms;
			}
			public void setCertificatePrograms(Object certificatePrograms) {
				this.certificatePrograms = certificatePrograms;
			}
			public String getSapid() {
				return sapid;
			}
			public void setSapid(String sapid) {
				this.sapid = sapid;
			}
			public Object getSem() {
				return sem;
			}
			public void setSem(Object sem) {
				this.sem = sem;
			}
			public Object getEmail() {
				return email;
			}
			public void setEmail(Object email) {
				this.email = email;
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
			public String getIsLateral() {
				return isLateral;
			}
			public void setIsLateral(String isLateral) {
				this.isLateral = isLateral;
			}
			public Object getIsReReg() {
				return isReReg;
			}
			public void setIsReReg(Object isReReg) {
				this.isReReg = isReReg;
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
			public Object getShippingAddress() {
				return shippingAddress;
			}
			public void setShippingAddress(Object shippingAddress) {
				this.shippingAddress = shippingAddress;
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
			public Object getPassword() {
				return password;
			}
			public void setPassword(Object password) {
				this.password = password;
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
			public Object getUpdatedByStudent() {
				return updatedByStudent;
			}
			public void setUpdatedByStudent(Object updatedByStudent) {
				this.updatedByStudent = updatedByStudent;
			}
			public String getImageUrl() {
				return imageUrl;
			}
			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}
			public Object getSubjectsCleared() {
				return subjectsCleared;
			}
			public void setSubjectsCleared(Object subjectsCleared) {
				this.subjectsCleared = subjectsCleared;
			}
			public String getProgramCleared() {
				return programCleared;
			}
			public void setProgramCleared(String programCleared) {
				this.programCleared = programCleared;
			}
			public String getAge() {
				return age;
			}
			public void setAge(String age) {
				this.age = age;
			}
			public String getConsumerProgramStructureId() {
				return consumerProgramStructureId;
			}
			public void setConsumerProgramStructureId(String consumerProgramStructureId) {
				this.consumerProgramStructureId = consumerProgramStructureId;
			}
			public boolean isLouConfirmed() {
				return louConfirmed;
			}
			public void setLouConfirmed(boolean louConfirmed) {
				this.louConfirmed = louConfirmed;
			}
			public String getLouConfirmedTimestamp() {
				return louConfirmedTimestamp;
			}
			public void setLouConfirmedTimestamp(String louConfirmedTimestamp) {
				this.louConfirmedTimestamp = louConfirmedTimestamp;
			}
			public String getYear() {
				return year;
			}
			public void setYear(String year) {
				this.year = year;
			}
			public String getMonth() {
				return month;
			}
			public void setMonth(String month) {
				this.month = month;
			}
			public String getSapId() {
				return sapId;
			}
			public void setSapId(String sapId) {
				this.sapId = sapId;
			}



	    

}
