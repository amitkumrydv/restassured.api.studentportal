package com.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.ViewAssignmentsFormPojo;
import com.api.utilities.ReadConfig;

public class ViewAssignmentsFormPayload {
	
	
	private static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormPayload.class);
	ReadConfig readConfig = new ReadConfig();
	ViewAssignmentsFormPojo viewAssignmentsFormPojo = new ViewAssignmentsFormPojo();
	
	public ViewAssignmentsFormPojo viewAssignmentsFormData() {
		
		 String userName=readConfig.getUsername();
		 viewAssignmentsFormPojo.setSapId(userName);;

		   
		
		return viewAssignmentsFormPojo;
	}

}
