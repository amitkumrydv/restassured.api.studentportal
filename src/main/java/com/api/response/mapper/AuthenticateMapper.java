package com.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.comman.JsonPojoArrayValidator;
import com.api.pojoClass.AuthenticationPojo;
import com.api.pojoClass.FeatureViseAccessPojo;
import com.api.pojoClass.RegDataPojo;
import com.api.pojoClass.StudentPojo;
import com.api.response.validation.AuthenticateResponseValidation;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class AuthenticateMapper implements AuthenticateResponseValidation {
	
	
	private static final Logger logger = LoggerFactory.getLogger(GetVideosForHomeMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	JsonPojoArrayValidator jsonPojoArrayValidator = new JsonPojoArrayValidator(mapper);

	@Override
	public void authenticateResponseValidation(Response response){
		
        logger.info("Start the authenticate API Respons validation...");

        ResponseBody responsebody = response.body();
		String responseBodyData =responsebody.asString();
		
		jsonPojoArrayValidator.validateJsonWithPojo(responseBodyData, AuthenticationPojo.class);		
		
	}
	
	
	
	
	
	
	
}
