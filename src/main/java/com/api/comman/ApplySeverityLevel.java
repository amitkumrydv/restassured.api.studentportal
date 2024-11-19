package com.api.comman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.qameta.allure.Allure;

public class ApplySeverityLevel {
	
	public static final Logger logger = LoggerFactory.getLogger(ApplySeverityLevel.class);
	public static void severityForPOST(int statusCode) {
		String severity;
		if (statusCode == 200) {
			severity = "normal";
		} else if (statusCode == 404) {
			severity = "minor";
		} else if (statusCode >= 500) {
			severity = "critical";
		} else {
			severity = "trivial";
		}

		// Add dynamic severity to Allure report
		Allure.label("severity", severity);

		logger.info("severity lavel for succesfuly post method: {} ",severity);
		
	}
	
	
	
	public static void setSeverityForPostUsingAnotherMethod(int statusCode) {
		String severity;
		if (statusCode == 200) {
			severity = "minor";
		} else if (statusCode == 405) {
			severity = "normal";		
		} else if (statusCode == 404) {
			severity = "blocker";
		} else if (statusCode >= 500) {
			severity = "critical";
		} else {
			severity = "trivial";
		}

		// Add dynamic severity to Allure report

		Allure.label("severity", severity); 

		logger.info("severity lavel: {} ",severity);
		
	}
	
	
	public static String setSeverityLevelEmptyPayload(int statusCode) {
	  if (statusCode == 200) {
	        return "Low Severity";
	    } else if (statusCode == 201) {
	        return "Medium Severity";
	    } else if (statusCode == 400) {
	        return "High Severity";
	    } else if (statusCode == 404 || statusCode == 500) {
	        return "Critical Severity";
	    } else {
	        return "Trivial Severity";
	    }
	}

	
	

}
