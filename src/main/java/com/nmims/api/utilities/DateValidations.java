package com.nmims.api.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.comman.ResponseContainerComman;
import com.nmims.api.model.AuthenticationModel;

import io.qameta.allure.Step;


public class DateValidations {
	
	
	private static Logger logger = LoggerFactory.getLogger(DateValidations.class);
	public ResponseContainerComman responseContainerCommanImpl = new ResponseContainerComman();

	
	 @Step("Validating program end date")
	public Boolean programEndDateValidation() {
	    try {
	        // Fetch program validity date from the model
	        AuthenticationModel programValidityDate = responseContainerCommanImpl.programValidityEndDate();

	        // Assuming the date is stored as a String
	        String programEndDateStr = programValidityDate.getValidityEndDate(); // Replace with the actual getter for the date field
	        
	        // Validate if the date string is not null or empty
	        if (programEndDateStr == null || programEndDateStr.isEmpty()) {
	            logger.error("Program end date is null or empty.");
	           
	            return false;
	        }

	        // Define date formatter matching the actual format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");

	        // Parse dates
	        LocalDate currentDate = LocalDate.now();
	        LocalDate comparedDate;
	        try {
	            comparedDate = LocalDate.parse(programEndDateStr, formatter);
	        } catch (DateTimeParseException e) {
	            logger.error("Error parsing the program end date '{}': {}", programEndDateStr, e.getMessage(), e);
	            return false;
	        }

	        // Calculate the difference in days
	        long daysDifference = ChronoUnit.DAYS.between(currentDate, comparedDate);

	        // Output results
	        if (daysDifference > 0 || currentDate.equals(comparedDate)) {
	            logger.info("The program end date {} is {} days in the future.", comparedDate, daysDifference);
	            return true;
	        } else if (daysDifference < 0) {
	            logger.info("The program end date {} was {} days ago.", comparedDate, Math.abs(daysDifference));
	            return false;
	        } else {
	            logger.info("The program end date {} is today.", comparedDate);
	            return false;
	        }
	    } catch (Exception e) {
	        logger.error("Unexpected error while validating program end date: {}", e.getMessage(), e);
	        return false;
	    }
	}


	
	
	
	
	
	
	

}
