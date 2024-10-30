package com.api.payload;

import com.api.pojoClass.AuthenticationPojo;
import com.api.utilities.ReadConfig;

public class AuthenticatePyload {
	
	AuthenticationPojo  authenticationPojo;
	
	
	public AuthenticationPojo authenticatePyloadData() {
		ReadConfig readConfig = new ReadConfig();
		AuthenticationPojo  authenticationPojo = new AuthenticationPojo();
		
		authenticationPojo.setUserId("77777777168");
		authenticationPojo.setPassword("admin@ngasce20");
		
		return authenticationPojo;
		
	}

}
