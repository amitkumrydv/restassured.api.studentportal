package com.nmims.api.Listener;

import org.junit.Assume;

import com.nmims.api.ListenerImpl.ViewAssignmentsFormListenerImpl;
import com.nmims.api.comman.ResponseContainerComman;
import com.nmims.api.utilities.DateValidations;

import io.qameta.allure.Allure;

public class ViewAssignmentsFormListener implements ViewAssignmentsFormListenerImpl{
	
	
	DateValidations dateValidations = new DateValidations();
	ResponseContainerComman ResponseContainerComman = new ResponseContainerComman();
	public boolean skipTestForViewAssignmentsForm() {
		
		String isProgramCleared = ResponseContainerComman.isprogramCleared();
	
		
		 // Skip the test if the current date is after the validity end date
		
        Assume.assumeTrue("Test skipped because validity has ended", dateValidations.programEndDateValidation());
        
        
        if ("Y".equalsIgnoreCase(isProgramCleared)) {
            Allure.step("Test skipped because response value is: " + isProgramCleared);
            // Skip the test
            Assume.assumeTrue("Test skipped because response value is: " + isProgramCleared, false);
		
		
        }
        
        return true;
	}
        
}

