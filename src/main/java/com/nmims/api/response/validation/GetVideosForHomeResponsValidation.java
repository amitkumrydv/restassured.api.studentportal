package com.nmims.api.response.validation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.response.Response;

public interface GetVideosForHomeResponsValidation {
	
	
	public void GetVideosForHomeResponsValidation(Response response) throws JsonMappingException, JsonProcessingException;


}
