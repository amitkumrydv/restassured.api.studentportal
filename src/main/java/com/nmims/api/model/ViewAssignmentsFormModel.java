package com.nmims.api.model;

import java.util.ArrayList;

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
	    private Object currentYearList;

	    @JsonProperty("subjectList")
	    private Object subjectList;

	    @JsonProperty("error")
	    private Object error;

	    @JsonProperty("yearMonth")
	    private Object yearMonth;

	    @JsonProperty("failSubjectsCount")
	    private int failSubjectsCount;

	    @JsonProperty("failSubjectSubmissionCount")
	    private int failSubjectSubmissionCount;

	    @JsonProperty("currentSemEndDateTime")
	    private String  currentSemEndDateTime;

	    @JsonProperty("failSubjectsEndDateTime")
	    private String failSubjectsEndDateTime;

	    @JsonProperty("timeExtendedStudentIdSubjectList")
	    private Object timeExtendedStudentIdSubjectList;

	    @JsonProperty("applicableSubjects")
	    private Object applicableSubjects;

	    @JsonProperty("subjectsNotAllowedToSubmit")
	    private Object subjectsNotAllowedToSubmit;

	    @JsonProperty("assignmentFile")
	    private Object assignmentFile;

	    @JsonProperty("subject")
	    private Object subject;

	    @JsonProperty("allAssignmentFilesList")
	    private Object allAssignmentFilesList;

	    @JsonProperty("errorMessage")
	    private Object errorMessage;


	@JsonProperty("currentSemAssignmentFilesListModel")
	private ArrayList<CurrentSemAssignmentFilesListModel> currentSemAssignmentFilesListModel;

	@JsonProperty("failSubjectsAssignmentFilesListModel")
	private ArrayList<FailSubjectsAssignmentFilesListModel> failSubjectsAssignmentFilesListModel;

}
