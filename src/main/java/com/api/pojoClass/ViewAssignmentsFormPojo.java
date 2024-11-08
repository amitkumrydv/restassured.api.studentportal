package com.api.pojoClass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/*
Only consider the specified fields
Ignore all others JSON.
@JsonProperty This annotation is particularly useful when the JSON property name differs from the field name in the Java object 
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewAssignmentsFormPojo {
	
	    @JsonProperty("count")
	    private Integer count;

	    @JsonProperty("year")
	    private String year;

	    @JsonProperty("month")
	    private String month;

	    @JsonProperty("subject")
	    private String subject;

	    @JsonProperty("sem")
	    private String sem;

	    @JsonProperty("startDate")
	    private String startDate;

	    @JsonProperty("endDate")
	    private String endDate;

	    @JsonProperty("createdBy")
	    private String createdBy;

	    @JsonProperty("createdDate")
	    private String createdDate;

	    @JsonProperty("lastModifiedBy")
	    private String lastModifiedBy;

	    @JsonProperty("lastModifiedDate")
	    private String lastModifiedDate;

	    @JsonProperty("sapId")
	    private String sapId;

	    @JsonProperty("questionFilePreviewPath")
	    private String questionFilePreviewPath;

	    @JsonProperty("attempts")
	    private String attempts;

	    @JsonProperty("status")
	    private String status;

	    @JsonProperty("attemptsLeft")
	    private String attemptsLeft;

	    @JsonProperty("errorMessage")
	    private String errorMessage;

	    @JsonProperty("errorRecord")
	    private Boolean errorRecord;

	    @JsonProperty("evaluated")
	    private String evaluated;

	    @JsonProperty("evaluationCount")
	    private String evaluationCount;

	    @JsonProperty("markedForRevaluation")
	    private String markedForRevaluation;

	    @JsonProperty("revaluated")
	    private String revaluated;

	    @JsonProperty("revaluationCount")
	    private String revaluationCount;

	    @JsonProperty("revisited")
	    private String revisited;

	    @JsonProperty("faculty2EvaluationCount")
	    private String faculty2EvaluationCount;

	    @JsonProperty("faculty3EvaluationCount")
	    private String faculty3EvaluationCount;

	    @JsonProperty("minMatchPercent")
	    private Integer minMatchPercent;

	    @JsonProperty("toBeEvaluated")
	    private String toBeEvaluated;

	    @JsonProperty("submissionAllowed")
	    private Boolean submissionAllowed;

	    @JsonProperty("submissionAllow")
	    private String submissionAllow;

	    @JsonProperty("threshold2")
	    private Integer threshold2;

	    @JsonProperty("currentSemSubject")
	    private String currentSemSubject;

	    //    @JsonProperty("currentSemAssignmentFilesList")
	    //    private ArrayList<CurrentSemAssignmentFilesList> currentSemAssignmentFilesList;

	    @JsonProperty("failSubjectsCount")
	    private int failSubjectsCount;

	    @JsonProperty("failSubjectSubmissionCount")
	    private int failSubjectSubmissionCount;

	    @JsonProperty("currentSemEndDateTime")
	    private String currentSemEndDateTime;

	    @JsonProperty("failSubjectsEndDateTime")
	    private String failSubjectsEndDateTime;
	    
	    
	    //Getter and setter
		public Integer getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
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
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getSem() {
			return sem;
		}
		public void setSem(String sem) {
			this.sem = sem;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
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
		public String getSapId() {
			return sapId;
		}
		public void setSapId(String sapId) {
			this.sapId = sapId;
		}
		public String getQuestionFilePreviewPath() {
			return questionFilePreviewPath;
		}
		public void setQuestionFilePreviewPath(String questionFilePreviewPath) {
			this.questionFilePreviewPath = questionFilePreviewPath;
		}
		public String getAttempts() {
			return attempts;
		}
		public void setAttempts(String attempts) {
			this.attempts = attempts;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getAttemptsLeft() {
			return attemptsLeft;
		}
		public void setAttemptsLeft(String attemptsLeft) {
			this.attemptsLeft = attemptsLeft;
		}
		public String getErrorMessage() {
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public Boolean isErrorRecord() {
			return errorRecord;
		}
		public void setErrorRecord(boolean errorRecord) {
			this.errorRecord = errorRecord;
		}
		public String getEvaluated() {
			return evaluated;
		}
		public void setEvaluated(String evaluated) {
			this.evaluated = evaluated;
		}
		public String getEvaluationCount() {
			return evaluationCount;
		}
		public void setEvaluationCount(String evaluationCount) {
			this.evaluationCount = evaluationCount;
		}
		public String getMarkedForRevaluation() {
			return markedForRevaluation;
		}
		public void setMarkedForRevaluation(String markedForRevaluation) {
			this.markedForRevaluation = markedForRevaluation;
		}
		public String getRevaluated() {
			return revaluated;
		}
		public void setRevaluated(String revaluated) {
			this.revaluated = revaluated;
		}
		public String getRevaluationCount() {
			return revaluationCount;
		}
		public void setRevaluationCount(String revaluationCount) {
			this.revaluationCount = revaluationCount;
		}
		public String getRevisited() {
			return revisited;
		}
		public void setRevisited(String revisited) {
			this.revisited = revisited;
		}
		public String getFaculty2EvaluationCount() {
			return faculty2EvaluationCount;
		}
		public void setFaculty2EvaluationCount(String faculty2EvaluationCount) {
			this.faculty2EvaluationCount = faculty2EvaluationCount;
		}
		public String getFaculty3EvaluationCount() {
			return faculty3EvaluationCount;
		}
		public void setFaculty3EvaluationCount(String faculty3EvaluationCount) {
			this.faculty3EvaluationCount = faculty3EvaluationCount;
		}
		public Integer getMinMatchPercent() {
			return minMatchPercent;
		}
		public void setMinMatchPercent(int minMatchPercent) {
			this.minMatchPercent = minMatchPercent;
		}
		public String getToBeEvaluated() {
			return toBeEvaluated;
		}
		public void setToBeEvaluated(String toBeEvaluated) {
			this.toBeEvaluated = toBeEvaluated;
		}
		public Boolean isSubmissionAllowed() {
			return submissionAllowed;
		}
		public void setSubmissionAllowed(boolean submissionAllowed) {
			this.submissionAllowed = submissionAllowed;
		}
		public String getSubmissionAllow() {
			return submissionAllow;
		}
		public void setSubmissionAllow(String submissionAllow) {
			this.submissionAllow = submissionAllow;
		}
		public Integer getThreshold2() {
			return threshold2;
		}
		public void setThreshold2(int threshold2) {
			this.threshold2 = threshold2;
		}
		public String getCurrentSemSubject() {
			return currentSemSubject;
		}
		public void setCurrentSemSubject(String currentSemSubject) {
			this.currentSemSubject = currentSemSubject;
		}
		public int getFailSubjectsCount() {
			return failSubjectsCount;
		}
		public void setFailSubjectsCount(int failSubjectsCount) {
			this.failSubjectsCount = failSubjectsCount;
		}
		public int getFailSubjectSubmissionCount() {
			return failSubjectSubmissionCount;
		}
		public void setFailSubjectSubmissionCount(int failSubjectSubmissionCount) {
			this.failSubjectSubmissionCount = failSubjectSubmissionCount;
		}
		public String getCurrentSemEndDateTime() {
			return currentSemEndDateTime;
		}
		public void setCurrentSemEndDateTime(String currentSemEndDateTime) {
			this.currentSemEndDateTime = currentSemEndDateTime;
		}
		public String getFailSubjectsEndDateTime() {
			return failSubjectsEndDateTime;
		}
		public void setFailSubjectsEndDateTime(String failSubjectsEndDateTime) {
			this.failSubjectsEndDateTime = failSubjectsEndDateTime;
		}
	
	

}
