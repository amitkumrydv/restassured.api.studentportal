package com.api.payload;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.AuthenticationPojo;
import com.api.utilities.ReadConfig;

public class AuthenticatePayload {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthenticatePayload.class);
	ReadConfig readConfig = new ReadConfig();
    AuthenticationPojo  authenticationPojo = new AuthenticationPojo();
	
	public AuthenticationPojo authenticatePyloadData() {
		
		logger.info("Set the userId and password in the Authentication payload ");
        String userName=readConfig.getUsername();
		String password=readConfig.getPassword();
		authenticationPojo.setUserId(userName);
		authenticationPojo.setPassword(password);
		
		return authenticationPojo;
		
	}

}
