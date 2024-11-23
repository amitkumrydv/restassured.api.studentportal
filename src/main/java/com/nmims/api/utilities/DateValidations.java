package com.nmims.api.utilities;

import java.time.format.DateTimeFormatter;

import org.joda.time.LocalDate;

public class DateValidations {
	
	
	
	public 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	LocalDate currentDate=LocalDate.now();
	
	LocalDate comparedDate= LocalDate.parse(, formatter);
	
	 if (daysDifference > 0) {
         System.out.println("The date " + comparedDate + " is " + daysDifference + " days in the future.");
     } else if (daysDifference < 0) {
         System.out.println("The date " + comparedDate + " was " + Math.abs(daysDifference) + " days ago.");
     } else {
         System.out.println("The date " + comparedDate + " is today.");
     }


 }
	

}
