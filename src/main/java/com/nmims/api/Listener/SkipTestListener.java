package com.nmims.api.Listener;

import org.junit.Assume;

import com.nmims.api.ListenerImpl.SkipTestListenerImpl;
import com.nmims.api.comman.ResponseContainerComman;
import com.nmims.api.utilities.DateValidations;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class SkipTestListener implements SkipTestListenerImpl{
	
	
	DateValidations dateValidations = new DateValidations();
	ResponseContainerComman ResponseContainerComman = new ResponseContainerComman();
	CommanListner commanListner = new CommanListner();
	
	@Step("Check the program validity end or not and alao check program cleared status. ")
	public boolean skipTestForValidityEndAndProgramCleared() {
		
		String isClearedProgramStatus =ResponseContainerComman.isProgramCleared();
		
		
	    // Check if the test should be skipped based on validity end date
	    if (dateValidations.programEndDateValidation()) {
	    	commanListner.logSkipReason("Program Validity ended");
	    	Allure.label("status", "skipped");
	      //  Assume.assumeTrue("Test skipped because validity has ended", false);
	    }

	    // Check if the student has cleared the program
	    else if (isClearedProgramStatus.equalsIgnoreCase("Y")) {
	    	commanListner.logSkipReason("The user have cleared the program");
	            // Bypass test logic without throwing an exception
	            Allure.label("status", "skipped");
	     //   Assume.assumeTrue("Test skipped because the student has cleared the program", false);
	    }else {
	    	
	    	return true;
	    }

	    // Test will proceed if no skip conditions are met
	    return true;
	}

        
}

