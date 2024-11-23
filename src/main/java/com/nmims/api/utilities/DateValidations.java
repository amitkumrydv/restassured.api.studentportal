package com.nmims.api.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


import com.nmims.api.comman.ResponseContainerComman;
import com.nmims.api.model.AuthenticationModel;

public class DateValidations {
	
	
//	ResponseContainerComman responseContainerCommanImpl = new ResponseContainerComman();
//	
//	public void programEndDateValidation() {
//		
//		AuthenticationModel programValidityDate=responseContainerCommanImpl.programValidityEndDate();	
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//	
//	LocalDate currentDate=LocalDate.now();
//	
//	LocalDate comparedDate= LocalDate.parse(programValidityDate, formatter);
//	
//	  // Calculate the difference
//    long daysDifference = ChronoUnit.DAYS.between(currentDate, comparedDate);
//	
//	 if (daysDifference > 0) {
//         System.out.println("The date " + comparedDate + " is " + daysDifference + " days in the future.");
//     } else if (daysDifference < 0) {
//         System.out.println("The date " + comparedDate + " was " + Math.abs(daysDifference) + " days ago.");
//     } else {
//         System.out.println("The date " + comparedDate + " is today.");
//     }
//
//
// }
//	
	
	
	ResponseContainerComman responseContainerCommanImpl = new ResponseContainerComman();

    public void programEndDateValidation() {
        try {
        	
        	System.out.println("programEndDateValidation -------------> ");
            // Fetch program validity date from the model
            AuthenticationModel programValidityDate = responseContainerCommanImpl.programValidityEndDate();
            System.out.println("store data in programValidityDate -------------> ");
            // Assuming the date is stored as a String in "yyyy-MM-dd" format
            String programEndDateStr = programValidityDate.getValidityEndDate(); // Replace with the actual getter for the date field
            
            // Define date formatter
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Parse dates
            LocalDate currentDate = LocalDate.now();
            LocalDate comparedDate = LocalDate.parse(programEndDateStr, formatter);

            // Calculate the difference in days
            long daysDifference = ChronoUnit.DAYS.between(currentDate, comparedDate);

            // Output results
            if (daysDifference > 0) {
                System.out.println("The program end date ----------" + comparedDate + " is " + daysDifference + " days in the future.");
            } else if (daysDifference < 0) {
                System.out.println("The program end date ---------->" + comparedDate + " was " + Math.abs(daysDifference) + " days ago.");
            } else {
                System.out.println("The program end date ----------> " + comparedDate + " is today.");
            }
        } catch (Exception e) {
            System.err.println("Error validating program end date: " + e.getMessage());
        }
    }
	
	
	
	
	
	
	
	
	

}
