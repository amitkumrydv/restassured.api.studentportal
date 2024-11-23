package com.nmims.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nmims.api.comman.JsonPojoArrayValidator;
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.FeatureViseAccessModel;
import com.nmims.api.model.RegDataModel;
import com.nmims.api.model.StudentModel;
import com.nmims.api.response.validation.AuthenticateResponseValidation;

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
		
		jsonPojoArrayValidator.validateJsonWithPojo(responseBodyData, AuthenticationModel.class);		
		
	}
	
	
	
	
	
	
	
}
