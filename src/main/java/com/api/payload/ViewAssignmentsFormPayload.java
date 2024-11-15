package com.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.comman.PayloadPojoComman;
import com.api.pojoClass.ViewAssignmentsFormPojo;
import com.api.utilities.ReadConfig;

public class ViewAssignmentsFormPayload {

	private static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormPayload.class);
	ReadConfig readConfig = new ReadConfig();
	PayloadPojoComman payloadPojoComman = new PayloadPojoComman();

	public PayloadPojoComman viewAssignmentsFormData() {
		try {
			String userName = readConfig.getUsername();
			payloadPojoComman.setSapId(userName);
			;
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return payloadPojoComman;
	}

}
