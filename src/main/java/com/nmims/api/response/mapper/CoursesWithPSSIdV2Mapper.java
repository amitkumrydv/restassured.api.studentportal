package com.nmims.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class CoursesWithPSSIdV2Mapper {
	
	private static final Logger logger = LoggerFactory.getLogger(CoursesWithPSSIdV2Mapper.class);
	ObjectMapper mapper = new ObjectMapper();
	

     public void CoursesWithPSSIdV2ResponsValidation(Response response) {
		
		 logger.info("Start the CoursesWithPSSIdV2 API Respons validation...");

	        ResponseBody responsebody = response.body();
			String responseBodyData =responsebody.asString();
    	 
    	 
     }
	
	
	


}
