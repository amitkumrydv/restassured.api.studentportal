package com.api.response.validation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.response.Response;

public interface ViewAssignmentsFormResponseValidation {
	
	public void ViewAssignmentsFormMapperResponsValidation(String responBodyData)
	        throws JsonMappingException, JsonProcessingException;

}
