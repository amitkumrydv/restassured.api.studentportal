package com.api.pojoClass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



/*
Only consider the specified fields
Ignore all others JSON.
*/

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationPojo {
	
	private String sapid;
	private String lastName;
	private String firstName;
	private String middleName;
	private String fatherName;
	private String husbandName;
	private String motherName;
	private String gender;
	private String program;
	private String enrollmentMonth;
	private String enrollmentYear;
	private String emailId;
	private String mobile;
	private String altPhone;
	private String dob;
	private String regDate;
	private String address;
	private String houseNoName;
	private String street;
	private String landMark;
	private String locality;
	private String city;
	private String state;
	private String country;
	private String examMode;
	private String designation;
	private String industry;
	private String pin;
	private String centerCode;
	private String centerName;
	private String validityEndMonth;
	private String validityEndYear;
	private String createdBy;
	private String createdDate;
	private String lastModifiedBy;
	private String lastModifiedDate;
	private String errorMessage;
	private boolean errorRecord;
	private String prgmStructApplicable;
	private String imageUrl;
	private String programForHeader;
	private boolean programCleared;
	private boolean changedPassword;
	private String programType;
	private boolean louConfirmedTimestamp;
	private int ufm_notice_viewed;
	private boolean readWelcomeNote;
	private boolean errorFlag;
	private int totalExperience;
	private String companyName;
	
	
	private int age;
	private String highestQualification; 
	private String consumerType;
	private int consumerProgramStructureId;
	private String firebaseToken;


	private boolean error;
	private boolean detailsConfirmedByStudent;

	private boolean purchasedOtherPackages;
	private int highContrast;
	private int textToSpeech;
	private int coachMark;

	private int provisionalAdmission;
	private boolean validStudent;

	private boolean certificateStudent;
	private boolean corporateExamCenterStudent;
	private int rconsumerProgramStructureId;

	
	// using for payload
	private String userId;
	private String password;
	
	
	
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		

}
