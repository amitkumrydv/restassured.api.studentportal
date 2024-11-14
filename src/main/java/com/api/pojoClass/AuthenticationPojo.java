package com.api.pojoClass;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
Only consider the specified fields
Ignore all others JSON.
*/

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationPojo {
	
	


	
	    @JsonProperty("careerForum")
	    private Boolean careerForum;

	    @JsonProperty("learningPortal")
	    private Boolean learningPortal;

	    @JsonProperty("jobSearch")
	    private Boolean jobSearch;

	    @JsonProperty("careerCounselling")
	    private Boolean careerCounselling;

	    @JsonProperty("practiceInterviews")
	    private Boolean practiceInterviews;

	    @JsonProperty("newCSAccess")
	    private Boolean newCSAccess;

	    @JsonProperty("certificatePrograms")
	    private Object certificatePrograms;

	    @JsonProperty("sapid")
	    private String sapid;

	    @JsonProperty("sem")
	    private String sem;

	    @JsonProperty("email")
	    private Object email;

	    @JsonProperty("lastName")
	    private Object lastName;

	    @JsonProperty("firstName")
	    private Object firstName;

	    @JsonProperty("middleName")
	    private Object middleName;

	    @JsonProperty("fatherName")
	    private Object fatherName;

	    @JsonProperty("husbandName")
	    private Object husbandName;

	    @JsonProperty("motherName")
	    private Object motherName;

	    @JsonProperty("gender")
	    private Object gender;

	    @JsonProperty("program")
	    private String program;

	    @JsonProperty("enrollmentMonth")
	    private Object enrollmentMonth;

	    @JsonProperty("enrollmentYear")
	    private Object enrollmentYear;

	    @JsonProperty("emailId")
	    private Object emailId;

	    @JsonProperty("mobile")
	    private Object mobile;

	    @JsonProperty("altPhone")
	    private Object altPhone;

	    @JsonProperty("dob")
	    private Object dob;

	    @JsonProperty("regDate")
	    private Object regDate;

	    @JsonProperty("isLateral")
	    private Object isLateral;

	    @JsonProperty("isReReg")
	    private Object isReReg;

	    @JsonProperty("address")
	    private Object address;

	    @JsonProperty("houseNoName")
	    private Object houseNoName;

	    @JsonProperty("street")
	    private Object street;

	    @JsonProperty("landMark")
	    private Object landMark;

	    @JsonProperty("locality")
	    private Object locality;

	    @JsonProperty("city")
	    private Object city;

	    @JsonProperty("state")
	    private Object state;

	    @JsonProperty("country")
	    private Object country;

	    @JsonProperty("shippingAddress")
	    private Object shippingAddress;

	    @JsonProperty("examMode")
	    private String examMode;

	    @JsonProperty("designation")
	    private Object designation;

	    @JsonProperty("industry")
	    private Object industry;

	    @JsonProperty("userId")
	    private String userId;

	    @JsonProperty("password")
	    private String password;

	    @JsonProperty("pin")
	    private Object pin;

	    @JsonProperty("centerCode")
	    private Object centerCode;

	    @JsonProperty("centerName")
	    private Object centerName;

	    @JsonProperty("validityEndMonth")
	    private Object validityEndMonth;

	    @JsonProperty("validityEndYear")
	    private Object validityEndYear;

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
	    private Boolean errorRecord;

	    @JsonProperty("prgmStructApplicable")
	    private Object prgmStructApplicable;

	    @JsonProperty("updatedByStudent")
	    private Object updatedByStudent;

	    @JsonProperty("imageUrl")
	    private Object imageUrl;

	    @JsonProperty("subjectsCleared")
	    private Object subjectsCleared;

	    @JsonProperty("oldProgram")
	    private Object oldProgram;

	    @JsonProperty("programChanged")
	    private Object programChanged;

	    @JsonProperty("acadYear")
	    private Object acadYear;

	    @JsonProperty("acadMonth")
	    private Object acadMonth;

	    @JsonProperty("subject")
	    private Object subject;

	    @JsonProperty("fromEmailId")
	    private Object fromEmailId;

	    @JsonProperty("spouseName")
	    private Object spouseName;

	    @JsonProperty("body")
	    private Object body;

	    @JsonProperty("previousStudentId")
	    private Object previousStudentId;

	    @JsonProperty("programForHeader")
	    private String programForHeader;

	    @JsonProperty("programStatus")
	    private Object programStatus;

	    @JsonProperty("programRemarks")
	    private Object programRemarks;

	    @JsonProperty("smsContent")
	    private Object smsContent;

	    @JsonProperty("notificationType")
	    private Object notificationType;

	    @JsonProperty("programCleared")
	    private Object programCleared;

	    @JsonProperty("deRegistered")
	    private Object deRegistered;

	    @JsonProperty("onesignalId")
	    private Object onesignalId;

	    @JsonProperty("isPushnotification")
	    private Object isPushnotification;

	    @JsonProperty("pushContent")
	    private Object pushContent;

	    @JsonProperty("changedPassword")
	    private Object changedPassword;

	    @JsonProperty("nPassword")
	    private Object nPassword;

	    @JsonProperty("cPassword")
	    private Object cPassword;

	    @JsonProperty("programStructure")
	    private Object programStructure;

	    @JsonProperty("role")
	    private Object role;

	    @JsonProperty("loginType")
	    private Object loginType;

	    @JsonProperty("programSemSubjectId")
	    private Object programSemSubjectId;

	    @JsonProperty("bloodGroup")
	    private Object bloodGroup;

	    @JsonProperty("programType")
	    private Object programType;

	    @JsonProperty("lc")
	    private Object lc;

	    @JsonProperty("newConsumerProgramStructureId")
	    private Object newConsumerProgramStructureId;

	    @JsonProperty("louConfirmed")
	    private Boolean louConfirmed;

	    @JsonProperty("louConfirmedTimestamp")
	    private Object louConfirmedTimestamp;

	    @JsonProperty("batchName")
	    private Object batchName;

	    @JsonProperty("abcId")
	    private Object abcId;

	    @JsonProperty("settingType")
	    private Object settingType;

	    @JsonProperty("isEnable")
	    private Object isEnable;

	    @JsonProperty("ufmNoticeViewed")
	    private Integer ufmNoticeViewed;

	    @JsonProperty("linkedinUrl")
	    private Object linkedinUrl;

	    @JsonProperty("readWelcomeNote")
	    private Boolean readWelcomeNote;

	    @JsonProperty("perspective")
	    private Object perspective;

	    @JsonProperty("validityExpired")
	    private Object validityExpired;

	    @JsonProperty("almashinesId")
	    private Object almashinesId;

	    @JsonProperty("industryList")
	    private List<Object> industryList = new ArrayList<>();

	    @JsonProperty("designationList")
	    private List<Object> designationList = new ArrayList<>();

	    @JsonProperty("year")
	    private String year;

	    @JsonProperty("month")
	    private String month;

	    @JsonProperty("emailSentProgramCleared")
	    private Object emailSentProgramCleared;

	    @JsonProperty("existingStudentNoForDiscount")
	    private Object existingStudentNoForDiscount;

	    @JsonProperty("errorFlag")
	    private Object errorFlag;

	    @JsonProperty("totalExperience")
	    private Object totalExperience;

	    @JsonProperty("annualSalary")
	    private Object annualSalary;

	    @JsonProperty("companyName")
	    private Object companyName;

	    @JsonProperty("ugQualification")
	    private Object ugQualification;

	    @JsonProperty("age")
	    private Object age;

	    @JsonProperty("highestQualification")
	    private Object highestQualification;

	    @JsonProperty("consumerType")
	    private Object consumerType;

	    @JsonProperty("consumerProgramStructureId")
	    private String consumerProgramStructureId;

	    @JsonProperty("firebaseToken")
	    private Object firebaseToken;

	    @JsonProperty("leadId")
	    private Object leadId;

	    @JsonProperty("registrationNum")
	    private Object registrationNum;

	    @JsonProperty("error")
	    private Boolean error;

	    @JsonProperty("detailsConfirmedByStudent")
	    private Object detailsConfirmedByStudent;

	    @JsonProperty("status")
	    private Object status;

	    @JsonProperty("purchasedOtherPackages")
	    private Boolean purchasedOtherPackages;

	    @JsonProperty("highContrast")
	    private Integer highContrast;

	    @JsonProperty("textToSpeech")
	    private Integer textToSpeech;

	    @JsonProperty("coachMark")
	    private Integer coachMark;

	    @JsonProperty("subjectsCount")
	    private Object subjectsCount;

	    @JsonProperty("provisionalAdmission")
	    private Object provisionalAdmission;

	    @JsonProperty("validStudent")
	    private Boolean validStudent;

	    @JsonProperty("certificateStudent")
	    private Boolean certificateStudent;

	    @JsonProperty("rconsumerProgramStructureId")
	    private Integer rconsumerProgramStructureId;

	    @JsonProperty("corporateExamCenterStudent")
	    private Boolean corporateExamCenterStudent;

	    @JsonProperty("postalCode")
	    private Object postalCode;

	    @JsonProperty("announcements")
	    private Object announcements;

	    @JsonProperty("isStudent")
	    private Object isStudent;
	    @JsonProperty("number_of_assignments")
	    private int numberOfAssignments;

	    @JsonProperty("unmark_cc_list")
	    private int unMarkCCList;

	    @JsonProperty("fail_subject_submission_count")
	    private int failSubjectSubmissionCount;

	    @JsonProperty("fail_subjects_end_date_time")
	    private String failSubjectsEndDateTime;

	    @JsonProperty("current_sem_end_date_time")
	    private String currentSemEndDateTime;

	    @JsonProperty("fail_subjects_count")
	    private int failSubjectsCount;

	    @JsonProperty("success_message")
	    private String successMessage;

	    @JsonProperty("faculties")
	    private String faculties;

		public Boolean getCareerForum() {
			return careerForum;
		}

		public void setCareerForum(Boolean careerForum) {
			this.careerForum = careerForum;
		}

		public Boolean getLearningPortal() {
			return learningPortal;
		}

		public void setLearningPortal(Boolean learningPortal) {
			this.learningPortal = learningPortal;
		}

		public Boolean getJobSearch() {
			return jobSearch;
		}

		public void setJobSearch(Boolean jobSearch) {
			this.jobSearch = jobSearch;
		}

		public Boolean getCareerCounselling() {
			return careerCounselling;
		}

		public void setCareerCounselling(Boolean careerCounselling) {
			this.careerCounselling = careerCounselling;
		}

		public Boolean getPracticeInterviews() {
			return practiceInterviews;
		}

		public void setPracticeInterviews(Boolean practiceInterviews) {
			this.practiceInterviews = practiceInterviews;
		}

		public Boolean getNewCSAccess() {
			return newCSAccess;
		}

		public void setNewCSAccess(Boolean newCSAccess) {
			this.newCSAccess = newCSAccess;
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

		public String getSem() {
			return sem;
		}

		public void setSem(String sem) {
			this.sem = sem;
		}

		public Object getEmail() {
			return email;
		}

		public void setEmail(Object email) {
			this.email = email;
		}

		public Object getLastName() {
			return lastName;
		}

		public void setLastName(Object lastName) {
			this.lastName = lastName;
		}

		public Object getFirstName() {
			return firstName;
		}

		public void setFirstName(Object firstName) {
			this.firstName = firstName;
		}

		public Object getMiddleName() {
			return middleName;
		}

		public void setMiddleName(Object middleName) {
			this.middleName = middleName;
		}

		public Object getFatherName() {
			return fatherName;
		}

		public void setFatherName(Object fatherName) {
			this.fatherName = fatherName;
		}

		public Object getHusbandName() {
			return husbandName;
		}

		public void setHusbandName(Object husbandName) {
			this.husbandName = husbandName;
		}

		public Object getMotherName() {
			return motherName;
		}

		public void setMotherName(Object motherName) {
			this.motherName = motherName;
		}

		public Object getGender() {
			return gender;
		}

		public void setGender(Object gender) {
			this.gender = gender;
		}

		public String getProgram() {
			return program;
		}

		public void setProgram(String program) {
			this.program = program;
		}

		public Object getEnrollmentMonth() {
			return enrollmentMonth;
		}

		public void setEnrollmentMonth(Object enrollmentMonth) {
			this.enrollmentMonth = enrollmentMonth;
		}

		public Object getEnrollmentYear() {
			return enrollmentYear;
		}

		public void setEnrollmentYear(Object enrollmentYear) {
			this.enrollmentYear = enrollmentYear;
		}

		public Object getEmailId() {
			return emailId;
		}

		public void setEmailId(Object emailId) {
			this.emailId = emailId;
		}

		public Object getMobile() {
			return mobile;
		}

		public void setMobile(Object mobile) {
			this.mobile = mobile;
		}

		public Object getAltPhone() {
			return altPhone;
		}

		public void setAltPhone(Object altPhone) {
			this.altPhone = altPhone;
		}

		public Object getDob() {
			return dob;
		}

		public void setDob(Object dob) {
			this.dob = dob;
		}

		public Object getRegDate() {
			return regDate;
		}

		public void setRegDate(Object regDate) {
			this.regDate = regDate;
		}

		public Object getIsLateral() {
			return isLateral;
		}

		public void setIsLateral(Object isLateral) {
			this.isLateral = isLateral;
		}

		public Object getIsReReg() {
			return isReReg;
		}

		public void setIsReReg(Object isReReg) {
			this.isReReg = isReReg;
		}

		public Object getAddress() {
			return address;
		}

		public void setAddress(Object address) {
			this.address = address;
		}

		public Object getHouseNoName() {
			return houseNoName;
		}

		public void setHouseNoName(Object houseNoName) {
			this.houseNoName = houseNoName;
		}

		public Object getStreet() {
			return street;
		}

		public void setStreet(Object street) {
			this.street = street;
		}

		public Object getLandMark() {
			return landMark;
		}

		public void setLandMark(Object landMark) {
			this.landMark = landMark;
		}

		public Object getLocality() {
			return locality;
		}

		public void setLocality(Object locality) {
			this.locality = locality;
		}

		public Object getCity() {
			return city;
		}

		public void setCity(Object city) {
			this.city = city;
		}

		public Object getState() {
			return state;
		}

		public void setState(Object state) {
			this.state = state;
		}

		public Object getCountry() {
			return country;
		}

		public void setCountry(Object country) {
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

		public Object getDesignation() {
			return designation;
		}

		public void setDesignation(Object designation) {
			this.designation = designation;
		}

		public Object getIndustry() {
			return industry;
		}

		public void setIndustry(Object industry) {
			this.industry = industry;
		}

		public Object getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Object getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Object getPin() {
			return pin;
		}

		public void setPin(Object pin) {
			this.pin = pin;
		}

		public Object getCenterCode() {
			return centerCode;
		}

		public void setCenterCode(Object centerCode) {
			this.centerCode = centerCode;
		}

		public Object getCenterName() {
			return centerName;
		}

		public void setCenterName(Object centerName) {
			this.centerName = centerName;
		}

		public Object getValidityEndMonth() {
			return validityEndMonth;
		}

		public void setValidityEndMonth(Object validityEndMonth) {
			this.validityEndMonth = validityEndMonth;
		}

		public Object getValidityEndYear() {
			return validityEndYear;
		}

		public void setValidityEndYear(Object validityEndYear) {
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

		public Boolean getErrorRecord() {
			return errorRecord;
		}

		public void setErrorRecord(Boolean errorRecord) {
			this.errorRecord = errorRecord;
		}

		public Object getPrgmStructApplicable() {
			return prgmStructApplicable;
		}

		public void setPrgmStructApplicable(Object prgmStructApplicable) {
			this.prgmStructApplicable = prgmStructApplicable;
		}

		public Object getUpdatedByStudent() {
			return updatedByStudent;
		}

		public void setUpdatedByStudent(Object updatedByStudent) {
			this.updatedByStudent = updatedByStudent;
		}

		public Object getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(Object imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Object getSubjectsCleared() {
			return subjectsCleared;
		}

		public void setSubjectsCleared(Object subjectsCleared) {
			this.subjectsCleared = subjectsCleared;
		}

		public Object getOldProgram() {
			return oldProgram;
		}

		public void setOldProgram(Object oldProgram) {
			this.oldProgram = oldProgram;
		}

		public Object getProgramChanged() {
			return programChanged;
		}

		public void setProgramChanged(Object programChanged) {
			this.programChanged = programChanged;
		}

		public Object getAcadYear() {
			return acadYear;
		}

		public void setAcadYear(Object acadYear) {
			this.acadYear = acadYear;
		}

		public Object getAcadMonth() {
			return acadMonth;
		}

		public void setAcadMonth(Object acadMonth) {
			this.acadMonth = acadMonth;
		}

		public Object getSubject() {
			return subject;
		}

		public void setSubject(Object subject) {
			this.subject = subject;
		}

		public Object getFromEmailId() {
			return fromEmailId;
		}

		public void setFromEmailId(Object fromEmailId) {
			this.fromEmailId = fromEmailId;
		}

		public Object getSpouseName() {
			return spouseName;
		}

		public void setSpouseName(Object spouseName) {
			this.spouseName = spouseName;
		}

		public Object getBody() {
			return body;
		}

		public void setBody(Object body) {
			this.body = body;
		}

		public Object getPreviousStudentId() {
			return previousStudentId;
		}

		public void setPreviousStudentId(Object previousStudentId) {
			this.previousStudentId = previousStudentId;
		}

		public String getProgramForHeader() {
			return programForHeader;
		}

		public void setProgramForHeader(String programForHeader) {
			this.programForHeader = programForHeader;
		}

		public Object getProgramStatus() {
			return programStatus;
		}

		public void setProgramStatus(Object programStatus) {
			this.programStatus = programStatus;
		}

		public Object getProgramRemarks() {
			return programRemarks;
		}

		public void setProgramRemarks(Object programRemarks) {
			this.programRemarks = programRemarks;
		}

		public Object getSmsContent() {
			return smsContent;
		}

		public void setSmsContent(Object smsContent) {
			this.smsContent = smsContent;
		}

		public Object getNotificationType() {
			return notificationType;
		}

		public void setNotificationType(Object notificationType) {
			this.notificationType = notificationType;
		}

		public Object getProgramCleared() {
			return programCleared;
		}

		public void setProgramCleared(Object programCleared) {
			this.programCleared = programCleared;
		}

		public Object getDeRegistered() {
			return deRegistered;
		}

		public void setDeRegistered(Object deRegistered) {
			this.deRegistered = deRegistered;
		}

		public Object getOnesignalId() {
			return onesignalId;
		}

		public void setOnesignalId(Object onesignalId) {
			this.onesignalId = onesignalId;
		}

		public Object getIsPushnotification() {
			return isPushnotification;
		}

		public void setIsPushnotification(Object isPushnotification) {
			this.isPushnotification = isPushnotification;
		}

		public Object getPushContent() {
			return pushContent;
		}

		public void setPushContent(Object pushContent) {
			this.pushContent = pushContent;
		}

		public Object getChangedPassword() {
			return changedPassword;
		}

		public void setChangedPassword(Object changedPassword) {
			this.changedPassword = changedPassword;
		}

		public Object getnPassword() {
			return nPassword;
		}

		public void setnPassword(Object nPassword) {
			this.nPassword = nPassword;
		}

		public Object getcPassword() {
			return cPassword;
		}

		public void setcPassword(Object cPassword) {
			this.cPassword = cPassword;
		}

		public Object getProgramStructure() {
			return programStructure;
		}

		public void setProgramStructure(Object programStructure) {
			this.programStructure = programStructure;
		}

		public Object getRole() {
			return role;
		}

		public void setRole(Object role) {
			this.role = role;
		}

		public Object getLoginType() {
			return loginType;
		}

		public void setLoginType(Object loginType) {
			this.loginType = loginType;
		}

		public Object getProgramSemSubjectId() {
			return programSemSubjectId;
		}

		public void setProgramSemSubjectId(Object programSemSubjectId) {
			this.programSemSubjectId = programSemSubjectId;
		}

		public Object getBloodGroup() {
			return bloodGroup;
		}

		public void setBloodGroup(Object bloodGroup) {
			this.bloodGroup = bloodGroup;
		}

		public Object getProgramType() {
			return programType;
		}

		public void setProgramType(Object programType) {
			this.programType = programType;
		}

		public Object getLc() {
			return lc;
		}

		public void setLc(Object lc) {
			this.lc = lc;
		}

		public Object getNewConsumerProgramStructureId() {
			return newConsumerProgramStructureId;
		}

		public void setNewConsumerProgramStructureId(Object newConsumerProgramStructureId) {
			this.newConsumerProgramStructureId = newConsumerProgramStructureId;
		}

		public Boolean getLouConfirmed() {
			return louConfirmed;
		}

		public void setLouConfirmed(Boolean louConfirmed) {
			this.louConfirmed = louConfirmed;
		}

		public Object getLouConfirmedTimestamp() {
			return louConfirmedTimestamp;
		}

		public void setLouConfirmedTimestamp(Object louConfirmedTimestamp) {
			this.louConfirmedTimestamp = louConfirmedTimestamp;
		}

		public Object getBatchName() {
			return batchName;
		}

		public void setBatchName(Object batchName) {
			this.batchName = batchName;
		}

		public Object getAbcId() {
			return abcId;
		}

		public void setAbcId(Object abcId) {
			this.abcId = abcId;
		}

		public Object getSettingType() {
			return settingType;
		}

		public void setSettingType(Object settingType) {
			this.settingType = settingType;
		}

		public Object getIsEnable() {
			return isEnable;
		}

		public void setIsEnable(Object isEnable) {
			this.isEnable = isEnable;
		}

		public Integer getUfmNoticeViewed() {
			return ufmNoticeViewed;
		}

		public void setUfmNoticeViewed(Integer ufmNoticeViewed) {
			this.ufmNoticeViewed = ufmNoticeViewed;
		}

		public Object getLinkedinUrl() {
			return linkedinUrl;
		}

		public void setLinkedinUrl(Object linkedinUrl) {
			this.linkedinUrl = linkedinUrl;
		}

		public Boolean getReadWelcomeNote() {
			return readWelcomeNote;
		}

		public void setReadWelcomeNote(Boolean readWelcomeNote) {
			this.readWelcomeNote = readWelcomeNote;
		}

		public Object getPerspective() {
			return perspective;
		}

		public void setPerspective(Object perspective) {
			this.perspective = perspective;
		}

		public Object getValidityExpired() {
			return validityExpired;
		}

		public void setValidityExpired(Object validityExpired) {
			this.validityExpired = validityExpired;
		}

		public Object getAlmashinesId() {
			return almashinesId;
		}

		public void setAlmashinesId(Object almashinesId) {
			this.almashinesId = almashinesId;
		}

		public List<Object> getIndustryList() {
			return industryList;
		}

		public void setIndustryList(List<Object> industryList) {
			this.industryList = industryList;
		}

		public List<Object> getDesignationList() {
			return designationList;
		}

		public void setDesignationList(List<Object> designationList) {
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

		public Object getEmailSentProgramCleared() {
			return emailSentProgramCleared;
		}

		public void setEmailSentProgramCleared(Object emailSentProgramCleared) {
			this.emailSentProgramCleared = emailSentProgramCleared;
		}

		public Object getExistingStudentNoForDiscount() {
			return existingStudentNoForDiscount;
		}

		public void setExistingStudentNoForDiscount(Object existingStudentNoForDiscount) {
			this.existingStudentNoForDiscount = existingStudentNoForDiscount;
		}

		public Object getErrorFlag() {
			return errorFlag;
		}

		public void setErrorFlag(Object errorFlag) {
			this.errorFlag = errorFlag;
		}

		public Object getTotalExperience() {
			return totalExperience;
		}

		public void setTotalExperience(Object totalExperience) {
			this.totalExperience = totalExperience;
		}

		public Object getAnnualSalary() {
			return annualSalary;
		}

		public void setAnnualSalary(Object annualSalary) {
			this.annualSalary = annualSalary;
		}

		public Object getCompanyName() {
			return companyName;
		}

		public void setCompanyName(Object companyName) {
			this.companyName = companyName;
		}

		public Object getUgQualification() {
			return ugQualification;
		}

		public void setUgQualification(Object ugQualification) {
			this.ugQualification = ugQualification;
		}

		public Object getAge() {
			return age;
		}

		public void setAge(Object age) {
			this.age = age;
		}

		public Object getHighestQualification() {
			return highestQualification;
		}

		public void setHighestQualification(Object highestQualification) {
			this.highestQualification = highestQualification;
		}

		public Object getConsumerType() {
			return consumerType;
		}

		public void setConsumerType(Object consumerType) {
			this.consumerType = consumerType;
		}

		public String getConsumerProgramStructureId() {
			return consumerProgramStructureId;
		}

		public void setConsumerProgramStructureId(String consumerProgramStructureId) {
			this.consumerProgramStructureId = consumerProgramStructureId;
		}

		public Object getFirebaseToken() {
			return firebaseToken;
		}

		public void setFirebaseToken(Object firebaseToken) {
			this.firebaseToken = firebaseToken;
		}

		public Object getLeadId() {
			return leadId;
		}

		public void setLeadId(Object leadId) {
			this.leadId = leadId;
		}

		public Object getRegistrationNum() {
			return registrationNum;
		}

		public void setRegistrationNum(Object registrationNum) {
			this.registrationNum = registrationNum;
		}

		public Boolean getError() {
			return error;
		}

		public void setError(Boolean error) {
			this.error = error;
		}

		public Object getDetailsConfirmedByStudent() {
			return detailsConfirmedByStudent;
		}

		public void setDetailsConfirmedByStudent(Object detailsConfirmedByStudent) {
			this.detailsConfirmedByStudent = detailsConfirmedByStudent;
		}

		public Object getStatus() {
			return status;
		}

		public void setStatus(Object status) {
			this.status = status;
		}

		public Boolean getPurchasedOtherPackages() {
			return purchasedOtherPackages;
		}

		public void setPurchasedOtherPackages(Boolean purchasedOtherPackages) {
			this.purchasedOtherPackages = purchasedOtherPackages;
		}

		public Integer getHighContrast() {
			return highContrast;
		}

		public void setHighContrast(Integer highContrast) {
			this.highContrast = highContrast;
		}

		public Integer getTextToSpeech() {
			return textToSpeech;
		}

		public void setTextToSpeech(Integer textToSpeech) {
			this.textToSpeech = textToSpeech;
		}

		public Integer getCoachMark() {
			return coachMark;
		}

		public void setCoachMark(Integer coachMark) {
			this.coachMark = coachMark;
		}

		public Object getSubjectsCount() {
			return subjectsCount;
		}

		public void setSubjectsCount(Object subjectsCount) {
			this.subjectsCount = subjectsCount;
		}

		public Object getProvisionalAdmission() {
			return provisionalAdmission;
		}

		public void setProvisionalAdmission(Object provisionalAdmission) {
			this.provisionalAdmission = provisionalAdmission;
		}

		public Boolean getValidStudent() {
			return validStudent;
		}

		public void setValidStudent(Boolean validStudent) {
			this.validStudent = validStudent;
		}

		public Boolean getCertificateStudent() {
			return certificateStudent;
		}

		public void setCertificateStudent(Boolean certificateStudent) {
			this.certificateStudent = certificateStudent;
		}

		public Integer getRconsumerProgramStructureId() {
			return rconsumerProgramStructureId;
		}

		public void setRconsumerProgramStructureId(Integer rconsumerProgramStructureId) {
			this.rconsumerProgramStructureId = rconsumerProgramStructureId;
		}

		public Boolean getCorporateExamCenterStudent() {
			return corporateExamCenterStudent;
		}

		public void setCorporateExamCenterStudent(Boolean corporateExamCenterStudent) {
			this.corporateExamCenterStudent = corporateExamCenterStudent;
		}

		public Object getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(Object postalCode) {
			this.postalCode = postalCode;
		}

		public Object getAnnouncements() {
			return announcements;
		}

		public void setAnnouncements(Object announcements) {
			this.announcements = announcements;
		}

		public Object getIsStudent() {
			return isStudent;
		}

		public void setIsStudent(Object isStudent) {
			this.isStudent = isStudent;
		}

		public int getNumberOfAssignments() {
			return numberOfAssignments;
		}

		public void setNumberOfAssignments(int numberOfAssignments) {
			this.numberOfAssignments = numberOfAssignments;
		}

		public int getUnMarkCCList() {
			return unMarkCCList;
		}

		public void setUnMarkCCList(int unMarkCCList) {
			this.unMarkCCList = unMarkCCList;
		}

		public int getFailSubjectSubmissionCount() {
			return failSubjectSubmissionCount;
		}

		public void setFailSubjectSubmissionCount(int failSubjectSubmissionCount) {
			this.failSubjectSubmissionCount = failSubjectSubmissionCount;
		}

		public String getFailSubjectsEndDateTime() {
			return failSubjectsEndDateTime;
		}

		public void setFailSubjectsEndDateTime(String failSubjectsEndDateTime) {
			this.failSubjectsEndDateTime = failSubjectsEndDateTime;
		}

		public String getCurrentSemEndDateTime() {
			return currentSemEndDateTime;
		}

		public void setCurrentSemEndDateTime(String currentSemEndDateTime) {
			this.currentSemEndDateTime = currentSemEndDateTime;
		}

		public int getFailSubjectsCount() {
			return failSubjectsCount;
		}

		public void setFailSubjectsCount(int failSubjectsCount) {
			this.failSubjectsCount = failSubjectsCount;
		}

		public String getSuccessMessage() {
			return successMessage;
		}

		public void setSuccessMessage(String successMessage) {
			this.successMessage = successMessage;
		}

		public String getFaculties() {
			return faculties;
		}

		public void setFaculties(String faculties) {
			this.faculties = faculties;
		}

	    // Continue for remaining fields...



	    

}
