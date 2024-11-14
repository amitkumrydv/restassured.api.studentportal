package com.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.AuthenticationPojo;
import com.api.pojoClass.CoursesWithPSSIdV2Pojo;
import com.api.utilities.ReadConfig;

public class CoursesWithPSSIdV2Payload {
	
	
	private static final Logger logger= LoggerFactory.getLogger(CoursesWithPSSIdV2Payload.class);
	ReadConfig readConfig = new ReadConfig();
	AuthenticationPojo  authenticationPojo = new AuthenticationPojo();
	
	public AuthenticationPojo coursesWithPSSIdV2PayloadData() {
		
		
		logger.info("Set the userId and password in the CoursesWithPSSIdV2 Payload ");
        String userName=readConfig.getUsername();
        authenticationPojo.setUserId(userName);
        
        return authenticationPojo;
		
	}
	
	
	
	
	
	
	
	
}
