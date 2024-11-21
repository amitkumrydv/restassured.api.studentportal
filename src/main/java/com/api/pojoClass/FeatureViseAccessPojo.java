package com.api.pojoClass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeatureViseAccessPojo {
	
	 @JsonProperty("Career_Forum")
	    private boolean careerForum;

	    @JsonProperty("Learning_Portal")
	    private boolean learningPortal;

	    @JsonProperty("Job_Search")
	    private boolean jobSearch;

	    @JsonProperty("Career_Counselling")
	    private boolean careerCounselling;

	    @JsonProperty("Practice_Interviews")
	    private boolean practiceInterviews;

	    @JsonProperty("newCSAccess")
	    private boolean newCSAccess;

	

}
