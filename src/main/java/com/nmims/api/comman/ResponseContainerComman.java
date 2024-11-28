package com.nmims.api.comman;

import com.aventstack.extentreports.util.Assert;
import com.nmims.api.endpoints.AuthenticateEndPointImpl;
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.StudentModel;

import junit.framework.TestListener;

public class ResponseContainerComman {
	
	
	 public static AuthenticationModel responseData = AuthenticateEndPointImpl.authenticationModel;
//	 public static StudentModel studentData = AuthenticateEndPointImpl.studentModelData;

	public static AuthenticationModel programValidityEndDate() {
		responseData.getValidityEndDate();	
	 Assert.notNull(responseData, "Program validity End Date Empty.");	
		return responseData;
		
	}
	
	
	
//	public static String isprogramCleared() {
//		String isProgramClearedResponse=studentData.getProgramCleared();
//		Assert.notNull(isProgramClearedResponse, "Program validity End Date Empty.");
//		return isProgramClearedResponse;
//	}
	
	
	
	
}
