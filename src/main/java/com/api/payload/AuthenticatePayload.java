package com.api.payload;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.AuthenticationPojo;
import com.api.pojoClass.StudentPojo;
import com.api.utilities.ReadConfig;

public class AuthenticatePayload {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthenticatePayload.class);
	ReadConfig readConfig = new ReadConfig();
    
	
	public StudentPojo authenticatePyloadData() {
		StudentPojo  authenticationPojo = new StudentPojo();
		
		logger.info("Set the userId and password in the Authentication payload ");
		try {
        String userName=readConfig.getUsername();
		String password=readConfig.getPassword();
		authenticationPojo.setUserId(userName);
		authenticationPojo.setPassword(password);
		
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return authenticationPojo;
		
	}
	
	// Missing payload 
    public AuthenticationPojo authenticatePyloadDataForMissingFields() {
    	AuthenticationPojo  authenticationPojo = new AuthenticationPojo();
		
		logger.info("Set the userId and password in the Authentication payload ");
		try {
//        String userName=readConfig.getUsername();
//		authenticationPojo.setUserId(userName);	
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return authenticationPojo;
		
	}

}
