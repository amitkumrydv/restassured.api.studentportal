package com.nmims.api.comman;

import com.nmims.api.endpoints.AuthenticateEndPointImpl;
import com.nmims.api.model.AuthenticationModel;

public class ResponseContainerComman {
	
	
	 public static AuthenticationModel responseData = AuthenticateEndPointImpl.authenticationModel;

	public static AuthenticationModel programValidityEndDate() {
		
		System.out.println(" start method programValidityEndDate --------->");
		responseData.getValidityEndDate();
		
		String endDate= responseData.getValidityEndDate();
		System.out.println("endDate--------- "+ endDate);
		return responseData;
		
	}
	
	
}
