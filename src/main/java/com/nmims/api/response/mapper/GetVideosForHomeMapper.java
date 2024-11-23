package com.nmims.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nmims.api.comman.JsonPojoArrayValidator;
import com.nmims.api.model.GetVideosForHomeModel;
import com.nmims.api.response.validation.GetVideosForHomeResponsValidation;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetVideosForHomeMapper implements GetVideosForHomeResponsValidation {

	private static final Logger logger = LoggerFactory.getLogger(GetVideosForHomeMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	JsonPojoArrayValidator jsonPojoArrayValidator = new JsonPojoArrayValidator(mapper);
	
	    @Override
	    public void GetVideosForHomeResponsValidation(Response response) 
	            throws JsonMappingException, JsonProcessingException {
	        
	        logger.info("Starting GetVideosForHomeResponsValidation method");

	        ResponseBody responsebody = response.body();
			String responseBodyData =responsebody.asString(); 
	        
			jsonPojoArrayValidator.validateJsonArrayAgainstPojo(responseBodyData, GetVideosForHomeModel.class);
	    }
	    
    
	}
	
	

