package com.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.pojoClass.AuthenticationPojo;
import com.api.utilities.ReadConfig;

public class CoursesWithPSSIdV2Payload {
	
	
	private static final Logger logger= LoggerFactory.getLogger(CoursesWithPSSIdV2Payload.class);
	ReadConfig readConfig = new ReadConfig();
	AuthenticationPojo payloaddataForCoursesPSSID = new AuthenticationPojo();
	
	
	public AuthenticationPojo coursesWithPSSIdV2PayloadData() {
		try {
			String userName = readConfig.getUsername();
			payloaddataForCoursesPSSID.setSapId(userName);
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return payloaddataForCoursesPSSID;
		
	}
	
	
	
	
	
	
	
	
}
