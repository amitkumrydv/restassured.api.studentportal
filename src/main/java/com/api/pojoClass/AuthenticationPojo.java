package com.api.pojoClass;
import java.util.LinkedHashMap;
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
	
	 @JsonProperty("student")
	    private StudentPojo student;


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



	    @JsonProperty("applicableSubjects")
	    private Object applicableSubjects;

	    @JsonProperty("regData")
	    private RegistrationDataPojo regData;

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
	    private  FeatureViseAccessPojo featureViseAccess;

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
	    
	    
// Student data
	    

	    @JsonProperty("certificatePrograms")
	    private String certificatePrograms;

	    @JsonProperty("sapid")
	    private String sapId;

	    @JsonProperty("sem")
	    private String sem;

	    @JsonProperty("email")
	    private String email;

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
	    private String isReReg;

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
	    private String shippingAddress;

	    @JsonProperty("examMode")
	    private String examMode;

	    @JsonProperty("designation")
	    private String designation;

	    @JsonProperty("industry")
	    private String industry;

//	    @JsonProperty("userId")
//	    private String userId;

	    @JsonProperty("password")
	    private String password;

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

	    @JsonProperty("errorMessage")
	    private String errorMessage;

	    @JsonProperty("errorRecord")
	    private boolean errorRecord;

	    @JsonProperty("prgmStructApplicable")
	    private String prgmStructApplicable;

	    @JsonProperty("updatedByStudent")
	    private String updatedByStudent;

	    @JsonProperty("imageUrl")
	    private String imageUrl;

	    @JsonProperty("subjectsCleared")
	    private String subjectsCleared;

	    @JsonProperty("oldProgram")
	    private String oldProgram;

	    @JsonProperty("programChanged")
	    private String programChanged;

	    @JsonProperty("acadYear")
	    private String acadYear;

	    @JsonProperty("acadMonth")
	    private String acadMonth;

	    @JsonProperty("subject")
	    private String subject;

	    @JsonProperty("fromEmailId")
	    private String fromEmailId;

	    @JsonProperty("spouseName")
	    private String spouseName;

	    @JsonProperty("body")
	    private String body;

	    @JsonProperty("previousStudentId")
	    private String previousStudentId;

	    @JsonProperty("waivedOffSubjects")
	    private String[] waivedOffSubjects;

	    @JsonProperty("waivedInSubjects")
	    private String[] waivedInSubjects;

	    @JsonProperty("waivedInSubjectSemMapping")
	    private Object waivedInSubjectSemMapping;

	    @JsonProperty("programForHeader")
	    private String programForHeader;

	    @JsonProperty("programStatus")
	    private String programStatus;

	    @JsonProperty("programRemarks")
	    private String programRemarks;

	    @JsonProperty("smsContent")
	    private String smsContent;

	    @JsonProperty("notificationType")
	    private String notificationType;

	    @JsonProperty("programCleared")
	    private String programCleared;

	    @JsonProperty("deRegistered")
	    private String deRegistered;

	    @JsonProperty("onesignalId")
	    private String onesignalId;

	    @JsonProperty("isPushnotification")
	    private Boolean isPushnotification;

	    @JsonProperty("pushContent")
	    private String pushContent;

	    @JsonProperty("changedPassword")
	    private String changedPassword;

	    @JsonProperty("n_Password")
	    private String n_Password;

	    @JsonProperty("c_password")
	    private String c_password;

	    @JsonProperty("programStructure")
	    private String programStructure;

	    @JsonProperty("role")
	    private String role;

	    @JsonProperty("loginType")
	    private String loginType;

	    @JsonProperty("programSemSubjectId")
	    private String programSemSubjectId;

	    @JsonProperty("bloodGroup")
	    private String bloodGroup;

	    @JsonProperty("programType")
	    private String programType;

	    @JsonProperty("lc")
	    private String lc;

	    @JsonProperty("newConsumerProgramStructureId")
	    private String newConsumerProgramStructureId;

	    @JsonProperty("louConfirmed")
	    private boolean louConfirmed;

	    @JsonProperty("louConfirmedTimestamp")
	    private String louConfirmedTimestamp;

	    @JsonProperty("batchName")
	    private String batchName;

	    @JsonProperty("abcId")
	    private String abcId;

	    @JsonProperty("settingType")
	    private String settingType;

	    @JsonProperty("isEnable")
	    private Boolean isEnable;

	    @JsonProperty("ufm_notice_viewed")
	    private int ufmNoticeViewed;

	    @JsonProperty("linkedinUrl")
	    private String linkedinUrl;

	    @JsonProperty("readWelcomeNote")
	    private boolean readWelcomeNote;

	    @JsonProperty("perspective")
	    private String perspective;

	    @JsonProperty("validityExpired")
	    private String validityExpired;

	    @JsonProperty("almashinesId")
	    private int almashinesId;

	    @JsonProperty("industryList")
	    private String[] industryList;

	    @JsonProperty("designationList")
	    private String[] designationList;

	    @JsonProperty("year")
	    private String year;

	    @JsonProperty("month")
	    private String month;

	    @JsonProperty("emailSentProgramCleared")
	    private String emailSentProgramCleared;

	    @JsonProperty("existingStudentNoForDiscount")
	    private String existingStudentNoForDiscount;

	    @JsonProperty("errorFlag")
	    private String errorFlag;

	    @JsonProperty("totalExperience")
	    private String totalExperience;

	    @JsonProperty("annualSalary")
	    private String annualSalary;

	    @JsonProperty("companyName")
	    private String companyName;

	    @JsonProperty("ugQualification")
	    private String ugQualification;

	    @JsonProperty("age")
	    private String age;

	    @JsonProperty("highestQualification")
	    private String highestQualification;

	    @JsonProperty("consumerType")
	    private String consumerType;

	    @JsonProperty("consumerProgramStructureId")
	    private String consumerProgramStructureId;

	    @JsonProperty("firebaseToken")
	    private String firebaseToken;

	    @JsonProperty("leadId")
	    private String leadId;

	    @JsonProperty("registrationNum")
	    private String registrationNum;

	    @JsonProperty("error")
	    private boolean error;

	    @JsonProperty("detailsConfirmedByStudent")
	    private String detailsConfirmedByStudent;

	    @JsonProperty("status")
	    private String status;

	    @JsonProperty("purchasedOtherPackages")
	    private boolean purchasedOtherPackages;

	    @JsonProperty("highContrast")
	    private int highContrast;

	    @JsonProperty("textToSpeech")
	    private int textToSpeech;

	    @JsonProperty("coachMark")
	    private int coachMark;

	    @JsonProperty("subjectsCount")
	    private String subjectsCount;

	    @JsonProperty("provisionalAdmission")
	    private int provisionalAdmission;

	    @JsonProperty("validStudent")
	    private boolean validStudent;

	    @JsonProperty("rconsumerProgramStructureId")
	    private int rconsumerProgramStructureId;

	    @JsonProperty("corporateExamCenterStudent")
	    private boolean corporateExamCenterStudent;

	    @JsonProperty("postalCode")
	    private String postalCode;

	    @JsonProperty("certificateStudent")
	    private boolean certificateStudent;
	    
	    
	    


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

		public Object getApplicableSubjects() {
			return applicableSubjects;
		}

		public void setApplicableSubjects(Object applicableSubjects) {
			this.applicableSubjects = applicableSubjects;
		}

		public RegistrationDataPojo getRegData() {
			return regData;
		}

		public void setRegData(RegistrationDataPojo regData) {
			this.regData = regData;
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

		public FeatureViseAccessPojo getFeatureViseAccess() {
			return featureViseAccess;
		}

		public void setFeatureViseAccess(FeatureViseAccessPojo featureViseAccess) {
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

		public StudentPojo getStudent() {
			return student;
		}

		public void setStudent(StudentPojo student) {
			this.student = student;
		}

		public String getCertificatePrograms() {
			return certificatePrograms;
		}

		public void setCertificatePrograms(String certificatePrograms) {
			this.certificatePrograms = certificatePrograms;
		}

		public String getSapId() {
			return sapId;
		}

		public void setSapId(String sapId) {
			this.sapId = sapId;
		}

		public String getSem() {
			return sem;
		}

		public void setSem(String sem) {
			this.sem = sem;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
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

		public String getIsReReg() {
			return isReReg;
		}

		public void setIsReReg(String isReReg) {
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

		public String getShippingAddress() {
			return shippingAddress;
		}

		public void setShippingAddress(String shippingAddress) {
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
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

		public String getUpdatedByStudent() {
			return updatedByStudent;
		}

		public void setUpdatedByStudent(String updatedByStudent) {
			this.updatedByStudent = updatedByStudent;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getSubjectsCleared() {
			return subjectsCleared;
		}

		public void setSubjectsCleared(String subjectsCleared) {
			this.subjectsCleared = subjectsCleared;
		}

		public String getOldProgram() {
			return oldProgram;
		}

		public void setOldProgram(String oldProgram) {
			this.oldProgram = oldProgram;
		}

		public String getProgramChanged() {
			return programChanged;
		}

		public void setProgramChanged(String programChanged) {
			this.programChanged = programChanged;
		}

		public String getAcadYear() {
			return acadYear;
		}

		public void setAcadYear(String acadYear) {
			this.acadYear = acadYear;
		}

		public String getAcadMonth() {
			return acadMonth;
		}

		public void setAcadMonth(String acadMonth) {
			this.acadMonth = acadMonth;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getFromEmailId() {
			return fromEmailId;
		}

		public void setFromEmailId(String fromEmailId) {
			this.fromEmailId = fromEmailId;
		}

		public String getSpouseName() {
			return spouseName;
		}

		public void setSpouseName(String spouseName) {
			this.spouseName = spouseName;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getPreviousStudentId() {
			return previousStudentId;
		}

		public void setPreviousStudentId(String previousStudentId) {
			this.previousStudentId = previousStudentId;
		}

		public String[] getWaivedOffSubjects() {
			return waivedOffSubjects;
		}

		public void setWaivedOffSubjects(String[] waivedOffSubjects) {
			this.waivedOffSubjects = waivedOffSubjects;
		}

		public String[] getWaivedInSubjects() {
			return waivedInSubjects;
		}

		public void setWaivedInSubjects(String[] waivedInSubjects) {
			this.waivedInSubjects = waivedInSubjects;
		}

		public Object getWaivedInSubjectSemMapping() {
			return waivedInSubjectSemMapping;
		}

		public void setWaivedInSubjectSemMapping(Object waivedInSubjectSemMapping) {
			this.waivedInSubjectSemMapping = waivedInSubjectSemMapping;
		}

		public String getProgramForHeader() {
			return programForHeader;
		}

		public void setProgramForHeader(String programForHeader) {
			this.programForHeader = programForHeader;
		}

		public String getProgramStatus() {
			return programStatus;
		}

		public void setProgramStatus(String programStatus) {
			this.programStatus = programStatus;
		}

		public String getProgramRemarks() {
			return programRemarks;
		}

		public void setProgramRemarks(String programRemarks) {
			this.programRemarks = programRemarks;
		}

		public String getSmsContent() {
			return smsContent;
		}

		public void setSmsContent(String smsContent) {
			this.smsContent = smsContent;
		}

		public String getNotificationType() {
			return notificationType;
		}

		public void setNotificationType(String notificationType) {
			this.notificationType = notificationType;
		}

		public String getProgramCleared() {
			return programCleared;
		}

		public void setProgramCleared(String programCleared) {
			this.programCleared = programCleared;
		}

		public String getDeRegistered() {
			return deRegistered;
		}

		public void setDeRegistered(String deRegistered) {
			this.deRegistered = deRegistered;
		}

		public String getOnesignalId() {
			return onesignalId;
		}

		public void setOnesignalId(String onesignalId) {
			this.onesignalId = onesignalId;
		}

		public Boolean getIsPushnotification() {
			return isPushnotification;
		}

		public void setIsPushnotification(Boolean isPushnotification) {
			this.isPushnotification = isPushnotification;
		}

		public String getPushContent() {
			return pushContent;
		}

		public void setPushContent(String pushContent) {
			this.pushContent = pushContent;
		}

		public String getChangedPassword() {
			return changedPassword;
		}

		public void setChangedPassword(String changedPassword) {
			this.changedPassword = changedPassword;
		}

		public String getN_Password() {
			return n_Password;
		}

		public void setN_Password(String n_Password) {
			this.n_Password = n_Password;
		}

		public String getC_password() {
			return c_password;
		}

		public void setC_password(String c_password) {
			this.c_password = c_password;
		}

		public String getProgramStructure() {
			return programStructure;
		}

		public void setProgramStructure(String programStructure) {
			this.programStructure = programStructure;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getLoginType() {
			return loginType;
		}

		public void setLoginType(String loginType) {
			this.loginType = loginType;
		}

		public String getProgramSemSubjectId() {
			return programSemSubjectId;
		}

		public void setProgramSemSubjectId(String programSemSubjectId) {
			this.programSemSubjectId = programSemSubjectId;
		}

		public String getBloodGroup() {
			return bloodGroup;
		}

		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}

		public String getProgramType() {
			return programType;
		}

		public void setProgramType(String programType) {
			this.programType = programType;
		}

		public String getLc() {
			return lc;
		}

		public void setLc(String lc) {
			this.lc = lc;
		}

		public String getNewConsumerProgramStructureId() {
			return newConsumerProgramStructureId;
		}

		public void setNewConsumerProgramStructureId(String newConsumerProgramStructureId) {
			this.newConsumerProgramStructureId = newConsumerProgramStructureId;
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

		public String getBatchName() {
			return batchName;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public String getAbcId() {
			return abcId;
		}

		public void setAbcId(String abcId) {
			this.abcId = abcId;
		}

		public String getSettingType() {
			return settingType;
		}

		public void setSettingType(String settingType) {
			this.settingType = settingType;
		}

		public Boolean getIsEnable() {
			return isEnable;
		}

		public void setIsEnable(Boolean isEnable) {
			this.isEnable = isEnable;
		}

		public int getUfmNoticeViewed() {
			return ufmNoticeViewed;
		}

		public void setUfmNoticeViewed(int ufmNoticeViewed) {
			this.ufmNoticeViewed = ufmNoticeViewed;
		}

		public String getLinkedinUrl() {
			return linkedinUrl;
		}

		public void setLinkedinUrl(String linkedinUrl) {
			this.linkedinUrl = linkedinUrl;
		}

		public boolean isReadWelcomeNote() {
			return readWelcomeNote;
		}

		public void setReadWelcomeNote(boolean readWelcomeNote) {
			this.readWelcomeNote = readWelcomeNote;
		}

		public String getPerspective() {
			return perspective;
		}

		public void setPerspective(String perspective) {
			this.perspective = perspective;
		}

		public String getValidityExpired() {
			return validityExpired;
		}

		public void setValidityExpired(String validityExpired) {
			this.validityExpired = validityExpired;
		}

		public int getAlmashinesId() {
			return almashinesId;
		}

		public void setAlmashinesId(int almashinesId) {
			this.almashinesId = almashinesId;
		}

		public String[] getIndustryList() {
			return industryList;
		}

		public void setIndustryList(String[] industryList) {
			this.industryList = industryList;
		}

		public String[] getDesignationList() {
			return designationList;
		}

		public void setDesignationList(String[] designationList) {
			this.designationList = designationList;
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

		public String getEmailSentProgramCleared() {
			return emailSentProgramCleared;
		}

		public void setEmailSentProgramCleared(String emailSentProgramCleared) {
			this.emailSentProgramCleared = emailSentProgramCleared;
		}

		public String getExistingStudentNoForDiscount() {
			return existingStudentNoForDiscount;
		}

		public void setExistingStudentNoForDiscount(String existingStudentNoForDiscount) {
			this.existingStudentNoForDiscount = existingStudentNoForDiscount;
		}

		public String getErrorFlag() {
			return errorFlag;
		}

		public void setErrorFlag(String errorFlag) {
			this.errorFlag = errorFlag;
		}

		public String getTotalExperience() {
			return totalExperience;
		}

		public void setTotalExperience(String totalExperience) {
			this.totalExperience = totalExperience;
		}

		public String getAnnualSalary() {
			return annualSalary;
		}

		public void setAnnualSalary(String annualSalary) {
			this.annualSalary = annualSalary;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getUgQualification() {
			return ugQualification;
		}

		public void setUgQualification(String ugQualification) {
			this.ugQualification = ugQualification;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
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

		public String getConsumerProgramStructureId() {
			return consumerProgramStructureId;
		}

		public void setConsumerProgramStructureId(String consumerProgramStructureId) {
			this.consumerProgramStructureId = consumerProgramStructureId;
		}

		public String getFirebaseToken() {
			return firebaseToken;
		}

		public void setFirebaseToken(String firebaseToken) {
			this.firebaseToken = firebaseToken;
		}

		public String getLeadId() {
			return leadId;
		}

		public void setLeadId(String leadId) {
			this.leadId = leadId;
		}

		public String getRegistrationNum() {
			return registrationNum;
		}

		public void setRegistrationNum(String registrationNum) {
			this.registrationNum = registrationNum;
		}

		public boolean isError() {
			return error;
		}

		public void setError(boolean error) {
			this.error = error;
		}

		public String getDetailsConfirmedByStudent() {
			return detailsConfirmedByStudent;
		}

		public void setDetailsConfirmedByStudent(String detailsConfirmedByStudent) {
			this.detailsConfirmedByStudent = detailsConfirmedByStudent;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getSubjectsCount() {
			return subjectsCount;
		}

		public void setSubjectsCount(String subjectsCount) {
			this.subjectsCount = subjectsCount;
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

		public int getRconsumerProgramStructureId() {
			return rconsumerProgramStructureId;
		}

		public void setRconsumerProgramStructureId(int rconsumerProgramStructureId) {
			this.rconsumerProgramStructureId = rconsumerProgramStructureId;
		}

		public boolean isCorporateExamCenterStudent() {
			return corporateExamCenterStudent;
		}

		public void setCorporateExamCenterStudent(boolean corporateExamCenterStudent) {
			this.corporateExamCenterStudent = corporateExamCenterStudent;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public boolean isCertificateStudent() {
			return certificateStudent;
		}

		public void setCertificateStudent(boolean certificateStudent) {
			this.certificateStudent = certificateStudent;
		}

		
// new

	       

	    

}
