package com.api.payload;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.AuthenticationPojo;
import com.api.utilities.ReadConfig;

public class AuthenticatePyload {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthenticatePyload.class);
	
	
	public AuthenticationPojo authenticatePyloadData() {
		
		logger.info("Set the userId and password in the Authentication payload ");
		ReadConfig readConfig = new ReadConfig();
		String userName=readConfig.getUsername();
		String password=readConfig.getPassword();
		
		AuthenticationPojo  authenticationPojo = new AuthenticationPojo();
		
		authenticationPojo.setUserId(userName);
		authenticationPojo.setPassword(password);
		
		return authenticationPojo;
		
	}

}
