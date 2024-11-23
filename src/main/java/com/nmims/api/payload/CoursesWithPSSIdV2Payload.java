package com.nmims.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.StudentModel;
import com.nmims.api.utilities.ReadConfig;

public class CoursesWithPSSIdV2Payload {
	
	
	private static final Logger logger= LoggerFactory.getLogger(CoursesWithPSSIdV2Payload.class);
	ReadConfig readConfig = new ReadConfig();
	StudentModel payloaddataForCoursesPSSID = new StudentModel();
	
	
	public StudentModel coursesWithPSSIdV2PayloadData() {
		try {
			String userName = readConfig.getUsername();
			payloaddataForCoursesPSSID.setSapId(userName);
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return payloaddataForCoursesPSSID;
		
	}
	
	
	
	
	
	
	
	
}
