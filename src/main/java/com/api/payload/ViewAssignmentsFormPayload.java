package com.api.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.pojoClass.StudentPojo;
import com.api.utilities.ReadConfig;

public class ViewAssignmentsFormPayload {

	private static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormPayload.class);
	ReadConfig readConfig = new ReadConfig();
	StudentPojo payloadData = new StudentPojo();

	public StudentPojo viewAssignmentsFormData() {
		try {
			String userName = readConfig.getUsername();
			payloadData.setSapId(userName);
			;
		} catch (Exception e) {
			logger.error("An error occurred while fetching payload data", e);
		}
		return payloadData;
	}

}
