package com.nmims.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
Only consider the specified fields
Ignore all others JSON.
@JsonProperty This annotation is particularly useful when the JSON property name differs from the field name in the Java object 
*/

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewAssignmentsFormModel {

	  @JsonProperty("month")
	    private String month;

	    @JsonProperty("year")
	    private String year;

	    @JsonProperty("currentYearList")
	    private List<Integer> currentYearList;

	    @JsonProperty("subjectList")
	    private List<String> subjectList;

	    @JsonProperty("error")
	    private String error;

	    @JsonProperty("yearMonth")
	    private String yearMonth;

	    @JsonProperty("success")
	    private Boolean success;

	    @JsonProperty("successMessage")
	    private String successMessage;

	    @JsonProperty("maxAttempts")
	    private Integer maxAttempts;

	    @JsonProperty("currentSemSubjectsCount")
	    private Integer currentSemSubjectsCount;

	    @JsonProperty("currentSemSubmissionCount")
	    private Integer currentSemSubmissionCount;

	    @JsonProperty("failSubjectsCount")
	    private Integer failSubjectsCount;

	    @JsonProperty("failSubjectSubmissionCount")
	    private Integer failSubjectSubmissionCount;

	    @JsonProperty("currentSemEndDateTime")
	    private String currentSemEndDateTime;

	    @JsonProperty("failSubjectsEndDateTime")
	    private String failSubjectsEndDateTime;

	    @JsonProperty("timeExtendedStudentIdSubjectList")
	    private List<String> timeExtendedStudentIdSubjectList;

	    @JsonProperty("applicableSubjects")
	    private List<String> applicableSubjects;

	    @JsonProperty("subjectsNotAllowedToSubmit")
	    private List<String> subjectsNotAllowedToSubmit;

	    @JsonProperty("assignmentFile")
	    private String assignmentFile;

	    @JsonProperty("subject")
	    private String subject;

	    @JsonProperty("allAssignmentFilesList")
	    private List<String> allAssignmentFilesList;

	    @JsonProperty("errorMessage")
	    private String errorMessage;

	@JsonProperty("currentSemAssignmentFilesList")
	private List<CurrentSemAssignmentFilesListModel> currentSemAssignmentFilesListModel;

	@JsonProperty("failSubjectsAssignmentFilesList")
	private List<FailSubjectsAssignmentFilesListModel> failSubjectsAssignmentFilesListModel;

}
