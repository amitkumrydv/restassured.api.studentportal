package com.nmims.api.payload;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.StudentModel;
import com.nmims.api.utilities.ReadConfig;

public class AuthenticatePayload {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthenticatePayload.class);
	ReadConfig readConfig = new ReadConfig();
    
	
	public StudentModel authenticatePyloadData() {
		StudentModel  authenticationPojo = new StudentModel();
		
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
    public AuthenticationModel authenticatePyloadDataForMissingFields() {
    	AuthenticationModel  authenticationModel = new AuthenticationModel();
		
		logger.info("Set the userId and password in the Authentication payload ");
		try {
//        String userName=readConfig.getUsername();
//		authenticationModel.setUserId(userName);	
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return authenticationModel;
		
	}

}
