package com.api.pojoClass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class GetVideosForHomePojo {
	
	//Using for the response validation
	
	  @JsonProperty("createdBy")
	    private Object createdBy;

	    @JsonProperty("createdDate")
	    private Object createdDate;

	    @JsonProperty("lastModifiedBy")
	    private Object lastModifiedBy;

	    @JsonProperty("lastModifiedDate")
	    private Object lastModifiedDate;

	    @JsonProperty("id")
	    private int id;

	    @JsonProperty("year")
	    private Object year;

	    @JsonProperty("month")
	    private Object month;

	    @JsonProperty("subject")
	    private String subject;

	    @JsonProperty("fileName")
	    private Object fileName;

	    @JsonProperty("keywords")
	    private Object keywords;

	    @JsonProperty("description")
	    private String description;

	    @JsonProperty("defaultVideo")
	    private Object defaultVideo;

	    @JsonProperty("errorMessage")
	    private String errorMessage;

	    @JsonProperty("errorRecord")
	    private boolean errorRecord;

	    @JsonProperty("duration")
	    private Object duration;

	    @JsonProperty("viewCount")
	    private Object viewCount;

	    @JsonProperty("addedBy")
	    private Object addedBy;

	    @JsonProperty("addedOn")
	    private Object addedOn;

	    @JsonProperty("videoLink")
	    private Object videoLink;

	    @JsonProperty("parentVideoId")
	    private int parentVideoId;

	    @JsonProperty("startTime")
	    private Object startTime;

	    @JsonProperty("endTime")
	    private Object endTime;

	    @JsonProperty("thumbnailUrl")
	    private String thumbnailUrl;

	    @JsonProperty("mobileUrl")
	    private Object mobileUrl;

	    @JsonProperty("sessionId")
	    private Object sessionId;

	    @JsonProperty("mobileUrlHd")
	    private Object mobileUrlHd;

	    @JsonProperty("mobileUrlSd1")
	    private Object mobileUrlSd1;

	    @JsonProperty("mobileUrlSd2")
	    private Object mobileUrlSd2;

	    @JsonProperty("type")
	    private Object type;

	    @JsonProperty("facultyId")
	    private Object facultyId;

	    @JsonProperty("sessionDate")
	    private String sessionDate;

	    @JsonProperty("facultyName")
	    private String facultyName;

	    @JsonProperty("academicCycle")
	    private Object academicCycle;

	    @JsonProperty("track")
	    private String track;

	    @JsonProperty("meetingKey")
	    private Object meetingKey;

	    @JsonProperty("bookmarked")
	    private Object bookmarked;

	    @JsonProperty("sapId")
	    private Object sapId;

	    @JsonProperty("programSemSubjectId")
	    private String programSemSubjectId;
	
}
