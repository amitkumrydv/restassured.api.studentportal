package com.nmims.api.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.comman.ResponseContainerComman;
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.test.ViewAssignmentsFormTest;

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
	private static Logger logger = LoggerFactory.getLogger(DateValidations.class);
	ResponseContainerComman responseContainerCommanImpl = new ResponseContainerComman();
	
//	public void programEndDateValidation() {
//	    try {
//	        // Fetch program validity date from the model
//	        AuthenticationModel programValidityDate = responseContainerCommanImpl.programValidityEndDate();
//
//	        // Assuming the date is stored as a String in "yyyy-MM-dd" format
//	        String programEndDateStr = programValidityDate.getValidityEndDate(); // Replace with the actual getter for the date field
//
//	        // Validate if the date string is not null or empty
//	        if (programEndDateStr == null || programEndDateStr.isEmpty()) {
//	            System.err.println("Program end date is null or empty.");
//	            return;
//	        }
//
//	        // Define date formatter
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//	        // Parse dates
//	        LocalDate currentDate = LocalDate.now();
//	        LocalDate comparedDate = LocalDate.parse(programEndDateStr, formatter);
//
//	        // Debug logs for verification
//	        System.out.println("Current Date: " + currentDate);
//	        System.out.println("Program End Date: " + comparedDate);
//
//	        // Calculate the difference in days
//	        long daysDifference = ChronoUnit.DAYS.between(currentDate, comparedDate);
//
//	        // Output results
//	        if (daysDifference > 0) {
//	            System.out.println("The program end date ----------> " + comparedDate + " is " + daysDifference + " days in the future.");
//	        } else if (daysDifference < 0) {
//	            System.out.println("The program end date ----------> " + comparedDate + " was " + Math.abs(daysDifference) + " days ago.");
//	        } else {
//	            System.out.println("The program end date ----------> " + comparedDate + " is today.");
//	        }
//	    } catch (DateTimeParseException e) {
//	        System.err.println("Error parsing the program end date: " + e.getMessage());
//	    } catch (Exception e) {
//	        System.err.println("Error validating program end date: " + e.getMessage());
//	    }
//	}

	
	public Boolean programEndDateValidation() {
	    try {
	        // Fetch program validity date from the model
	        AuthenticationModel programValidityDate = responseContainerCommanImpl.programValidityEndDate();

	        // Assuming the date is stored as a String
	        String programEndDateStr = programValidityDate.getValidityEndDate(); // Replace with the actual getter for the date field

	        // Validate if the date string is not null or empty
	        if (programEndDateStr == null || programEndDateStr.isEmpty()) {
	            System.err.println("Program end date is null or empty.");
	            return false ;
	        }

	        // Define date formatter matching the actual format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

	        // Parse dates
	        LocalDate currentDate = LocalDate.now();
	        LocalDate comparedDate = LocalDate.parse(programEndDateStr, formatter);

	        // Calculate the difference in days
	        long daysDifference = ChronoUnit.DAYS.between(currentDate, comparedDate);

	        // Output results
	        if (daysDifference > 0 || currentDate.equals(comparedDate)) {
	            logger.info("The program end date ----------> " + comparedDate + " is " + daysDifference + " days in the future.");
	            return true ;
	        } else if (daysDifference < 0) {
	            System.out.println("The program end date ----------> " + comparedDate + " was " + Math.abs(daysDifference) + " days ago.");
	            return false ;
	        } else {
	            System.out.println("The program end date ----------> " + comparedDate + " is today.");
	            return false ;
	        }
	    } catch (DateTimeParseException e) {
	        logger.error("Error parsing the program end date: " , e.getMessage());
	    } catch (Exception e) {
	        logger.error("Error parsing the program end date: " , e.getMessage());
	    }
	    
	    return false;
	}

	
	
	
	
	
	
	

}
