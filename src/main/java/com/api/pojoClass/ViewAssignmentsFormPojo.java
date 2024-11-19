package com.api.pojoClass;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
Only consider the specified fields
Ignore all others JSON.
@JsonProperty This annotation is particularly useful when the JSON property name differs from the field name in the Java object 
*/

//@JsonIgnoreProperties(ignoreUnknown = true)
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

//	    @JsonProperty("currentSemAssignmentFilesList")
//	    private ArrayList<CurrentSemAssignmentFilesList> currentSemAssignmentFilesList;

	@JsonProperty("numberOfAssignments")
	private ArrayList<Integer> numberOfAssignments;

	@JsonProperty("unMarkCCList")
	private ArrayList<Integer> unMarkCCList;

	@JsonProperty("failSubjectSubmissionCount")
	private int failSubjectSubmissionCount;

	@JsonProperty("failSubjectsEndDateTime")
	private String failSubjectsEndDateTime;

	@JsonProperty("currentSemEndDateTime")
	private String currentSemEndDateTime;

	@JsonProperty("failSubjectsCount")
	private int failSubjectsCount;

	@JsonProperty("successMessage")
	private String successMessage;

	@JsonProperty("faculties")
	private ArrayList<String> faculties;

	@JsonProperty("indexes")
	private ArrayList<String> indexes;

	@JsonProperty("revalAssignments")
	private ArrayList<String> revalAssignments;
	
	@JsonProperty("currentSemAssignmentFilesList")
	private ArrayList<CurrentSemAssignmentFilesList> currentSemAssignmentFilesList;
	
	@JsonProperty("failSubjectsAssignmentFilesList")
	private ArrayList<FailSubjectsAssignmentFilesList> failSubjectsAssignmentFilesList;
	
	

}
