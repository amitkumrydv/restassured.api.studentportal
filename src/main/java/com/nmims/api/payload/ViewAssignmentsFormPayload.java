package com.nmims.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.model.StudentModel;
import com.nmims.api.utilities.ReadConfig;

public class ViewAssignmentsFormPayload {

	private static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormPayload.class);
    ReadConfig readConfig = new ReadConfig();
  //  StudentModel payloadData = new StudentModel();

	public String viewAssignmentsFormData() {
		
//		 String payloadData = "";
//	        try {
//	            String userName = readConfig.getUsername();
//	            // Create payload string
//	            payloadData = "sapId=" + userName;
//		} catch (Exception e) {
//			logger.error("An error occurred while fetching payload data", e);
//		}
		
		
		 String sapId = readConfig.getUsername();
		    return "{\"sapId\": \"" + sapId + "\"}";
		
		
	//	return payloadData;
	}

}
