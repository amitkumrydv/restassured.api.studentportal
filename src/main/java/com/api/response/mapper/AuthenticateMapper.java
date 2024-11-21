package com.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.comman.JsonPojoArrayValidator;
import com.api.pojoClass.AuthenticationPojo;
import com.api.response.validation.AuthenticateResponseValidation;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class AuthenticateMapper implements AuthenticateResponseValidation {
	
	
	private static final Logger logger = LoggerFactory.getLogger(GetVideosForHomeMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	JsonPojoArrayValidator jsonPojoArrayValidator = new JsonPojoArrayValidator(mapper);

	
	public void authenticateResponseValidation(Response response){
		
        logger.info("Starting the Respons validation...");

        ResponseBody responsebody = response.body();
		String responseBodyData =responsebody.asString();
		
		jsonPojoArrayValidator.validateJsonWithPojo(responseBodyData,  AuthenticationPojo.class);
		
		
		
		
		
	}
}
