package com.nmims.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nmims.api.comman.JsonPojoArrayValidator;
import com.nmims.api.model.AuthenticationModel;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class AuthenticateMapper  {
	
	
	private static final Logger logger = LoggerFactory.getLogger(AuthenticateMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	JsonPojoArrayValidator jsonPojoArrayValidator = new JsonPojoArrayValidator(mapper);


	public void authenticateResponseValidation(Response response){
		
        logger.info("Start the authenticate API Respons validation...");
        

        ResponseBody responsebody = response.body();
		String responseBodyData =responsebody.asString();
		
		jsonPojoArrayValidator.validateAuthenticateJsonWithPojo(responseBodyData, AuthenticationModel.class);		
		
	}
	
	
	
	
	
	
	
}
