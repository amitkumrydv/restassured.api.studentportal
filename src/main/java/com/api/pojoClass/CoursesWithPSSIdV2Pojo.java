package com.api.pojoClass;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;



public class CoursesWithPSSIdV2Pojo {
	
	
	

	 @JsonProperty("currentSemSubjectsmap")
	    private Map<String, String> currentSemSubjectsMap;

	    @JsonProperty("failedSubjectListsmap")
	    private Map<String, String> failedSubjectListsMap;

	    @JsonProperty("listOfApplicableSUbjectssmap")
	    private Map<String, String> listOfApplicableSubjectsMap;

	    @JsonProperty("subjectCodeId")
	    private List<Integer> subjectCodeIds;

	    @JsonProperty("currentSubjectCodeIds")
	    private List<Integer> currentSubjectCodeIds;

	    @JsonProperty("backlogSubjectCodeIds")
	    private List<Integer> backlogSubjectCodeIds;

	    @JsonProperty("isRedis")
	    private Boolean isRedis;

	    // Getters and Setters

	    public Map<String, String> getCurrentSemSubjectsMap() {
	        return currentSemSubjectsMap;
	    }

	    public void setCurrentSemSubjectsMap(Map<String, String> currentSemSubjectsMap) {
	        this.currentSemSubjectsMap = currentSemSubjectsMap;
	    }

	    public Map<String, String> getFailedSubjectListsMap() {
	        return failedSubjectListsMap;
	    }

	    public void setFailedSubjectListsMap(Map<String, String> failedSubjectListsMap) {
	        this.failedSubjectListsMap = failedSubjectListsMap;
	    }

	    public Map<String, String> getListOfApplicableSubjectsMap() {
	        return listOfApplicableSubjectsMap;
	    }

	    public void setListOfApplicableSubjectsMap(Map<String, String> listOfApplicableSubjectsMap) {
	        this.listOfApplicableSubjectsMap = listOfApplicableSubjectsMap;
	    }

	    public List<Integer> getSubjectCodeIds() {
	        return subjectCodeIds;
	    }

	    public void setSubjectCodeIds(List<Integer> subjectCodeIds) {
	        this.subjectCodeIds = subjectCodeIds;
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

	    public Boolean isRedis() {
	        return isRedis;
	    }

	    public void setRedis(Boolean isRedis) {
	        this.isRedis = isRedis;
	    }
}