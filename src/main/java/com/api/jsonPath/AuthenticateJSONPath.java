package com.api.jsonPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.api.endpoints.AuthenticateEndPoint;
import com.api.pojoClass.GetVideosForHomePojo;

import io.restassured.response.Response;

public class AuthenticateJSONPath {
	
	
	
	/*
	 * 1. This method use to read the response of the 
	 *    authenticateResponse()
	 * 2. Read the response fields using the JSON path
	 */
	public static GetVideosForHomePojo  authenticateJSONPath() {
		
		Response authenticateResponse = AuthenticateEndPoint.authenticateResponse();
		GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();
		

		
		String currentStudentAcadMonth = authenticateResponse.path("currentAcadMonth");
		
		System.out.println("currentStudentAcadMonth---------------" +currentStudentAcadMonth);
		
		String currentStudentAcadYear = authenticateResponse.path("currentAcadYear");
		
		
		getVideosForHomePojo.setCurrentAcadMonth(currentStudentAcadMonth);
		getVideosForHomePojo.setCurrentAcadYear(currentStudentAcadYear);
		
		 ArrayList<Integer> currentSemPSSIdList = authenticateResponse.path("currentSemPSSId");
	//	 int[] currentSemPSSIdArr = currentSemPSSIdList.stream().mapToInt(Integer::intValue).toArray();
		
		
		
		
		getVideosForHomePojo.setCurrentSemPSSId(currentSemPSSIdList);
		
		return getVideosForHomePojo;
		
	}
	
	
	
	

}
