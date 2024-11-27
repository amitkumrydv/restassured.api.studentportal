package com.nmims.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticationModel {



	    @JsonProperty("student")
	    private StudentModel student;
	    
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

		    @JsonProperty("regData")
		    private RegDataModel regData;

		    @JsonProperty("stukent")
		    private Object stukent;

		    @JsonProperty("harvard")
		    private Object harvard;

		    @JsonProperty("regOrder")
		    private Double regOrder;

		    @JsonProperty("maxOrderWhereContentLive")
		    private Double maxOrderWhereContentLive;

		    @JsonProperty("currentOrder")
		    private Double currentOrder;

		    @JsonProperty("currentSemPSSId")
		    private List<Integer> currentSemPSSId;

		    @JsonProperty("isLoginAsLead")
		    private Boolean isLoginAsLead;

		    @JsonProperty("earlyAccess")
		    private String earlyAccess;

		    @JsonProperty("liveSessionPssIdAccess")
		    private List<Integer> liveSessionPssIdAccess;

		    @JsonProperty("featureViseAccess")
		    private FeatureViseAccessModel featureViseAccess;

		    @JsonProperty("consumerProgramStructureHasCSAccess")
		    private Boolean consumerProgramStructureHasCSAccess;

		    @JsonProperty("acadSessionLiveOrder")
		    private Double acadSessionLiveOrder;

		    @JsonProperty("csAdmin")
		    private Object csAdmin;

		    @JsonProperty("courseraAccess")
		    private Boolean courseraAccess;

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
		    private List<Integer> backlogSubjectCodeIds;

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
		    private String defaultAlmaShinesUrl;

		    @JsonProperty("defaultinternalassessmentyUrl")
		    private String defaultInternalAssessmentUrl;

		    @JsonProperty("defaultservicerequestUrl")
		    private String defaultServiceRequestUrl;

		    @JsonProperty("defaultreportingtoolUrl")
		    private String defaultReportingToolUrl;

		    @JsonProperty("defaultltidemoUrl")
		    private String defaultLtiDemoUrl;

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
		    private Boolean error;

			public StudentModel getStudent() {
				return student;
			}

			public void setStudent(StudentModel student) {
				this.student = student;
			}

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

			public RegDataModel getRegData() {
				return regData;
			}

			public void setRegData(RegDataModel regData) {
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

			public Double getRegOrder() {
				return regOrder;
			}

			public void setRegOrder(Double regOrder) {
				this.regOrder = regOrder;
			}

			public Double getMaxOrderWhereContentLive() {
				return maxOrderWhereContentLive;
			}

			public void setMaxOrderWhereContentLive(Double maxOrderWhereContentLive) {
				this.maxOrderWhereContentLive = maxOrderWhereContentLive;
			}

			public Double getCurrentOrder() {
				return currentOrder;
			}

			public void setCurrentOrder(Double currentOrder) {
				this.currentOrder = currentOrder;
			}

			public List<Integer> getCurrentSemPSSId() {
				return currentSemPSSId;
			}

			public void setCurrentSemPSSId(List<Integer> currentSemPSSId) {
				this.currentSemPSSId = currentSemPSSId;
			}

			public Boolean getIsLoginAsLead() {
				return isLoginAsLead;
			}

			public void setIsLoginAsLead(Boolean isLoginAsLead) {
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

			public FeatureViseAccessModel getFeatureViseAccess() {
				return featureViseAccess;
			}

			public void setFeatureViseAccess(FeatureViseAccessModel featureViseAccess) {
				this.featureViseAccess = featureViseAccess;
			}

			public Boolean getConsumerProgramStructureHasCSAccess() {
				return consumerProgramStructureHasCSAccess;
			}

			public void setConsumerProgramStructureHasCSAccess(Boolean consumerProgramStructureHasCSAccess) {
				this.consumerProgramStructureHasCSAccess = consumerProgramStructureHasCSAccess;
			}

			public Double getAcadSessionLiveOrder() {
				return acadSessionLiveOrder;
			}

			public void setAcadSessionLiveOrder(Double acadSessionLiveOrder) {
				this.acadSessionLiveOrder = acadSessionLiveOrder;
			}

			public Object getCsAdmin() {
				return csAdmin;
			}

			public void setCsAdmin(Object csAdmin) {
				this.csAdmin = csAdmin;
			}

			public Boolean getCourseraAccess() {
				return courseraAccess;
			}

			public void setCourseraAccess(Boolean courseraAccess) {
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

			public List<Integer> getBacklogSubjectCodeIds() {
				return backlogSubjectCodeIds;
			}

			public void setBacklogSubjectCodeIds(List<Integer> backlogSubjectCodeIds) {
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

			public String getDefaultAlmaShinesUrl() {
				return defaultAlmaShinesUrl;
			}

			public void setDefaultAlmaShinesUrl(String defaultAlmaShinesUrl) {
				this.defaultAlmaShinesUrl = defaultAlmaShinesUrl;
			}

			public String getDefaultInternalAssessmentUrl() {
				return defaultInternalAssessmentUrl;
			}

			public void setDefaultInternalAssessmentUrl(String defaultInternalAssessmentUrl) {
				this.defaultInternalAssessmentUrl = defaultInternalAssessmentUrl;
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

			public String getDefaultLtiDemoUrl() {
				return defaultLtiDemoUrl;
			}

			public void setDefaultLtiDemoUrl(String defaultLtiDemoUrl) {
				this.defaultLtiDemoUrl = defaultLtiDemoUrl;
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

			public Boolean getError() {
				return error;
			}

			public void setError(Boolean error) {
				this.error = error;
			}

		
		

}
