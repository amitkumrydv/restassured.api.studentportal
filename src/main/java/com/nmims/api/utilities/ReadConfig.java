package com.nmims.api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {

			FileInputStream fls = new FileInputStream(src);

			pro = new Properties();
			pro.load(fls);

		} catch (Exception e) {
			System.out.print("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username=pro.getProperty("userName");
		return username;
	}
	
	public String getPassword() {
		String password=pro.getProperty("Password");
		return password;
	}


	public String getStudentDetailsExcel() {
		String studentDetailsExcel = pro.getProperty("STUDENT_BASIC_DETAILS");
		return studentDetailsExcel;
	}

	public String getCurrentAcadMonth() {
		String currentAcadMonth = pro.getProperty("CURRENT_ACAD_MONTH");
		return currentAcadMonth;
	}
	
	public String getCurrentAcadYear() {
		String currentAcadYear = pro.getProperty("CURRENT_ACAD_YEAR");
		return currentAcadYear;
	}

	public String getAssignmentLiveStatus() {
		String Assignment_Live=pro.getProperty("Assignment_Live");
		return Assignment_Live;
	}
	
}
