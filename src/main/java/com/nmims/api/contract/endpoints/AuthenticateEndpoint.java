package com.nmims.api.contract.endpoints;

import io.restassured.response.Response;

public interface AuthenticateEndpoint {
	
	
	
	 public Response authenticateResponseForPOST();
	 public Response authenticateResponseForGET();
	 public Response authenticateResponseForDELETE();
	 public Response authenticateResponseForEmptyPayload();
	 public Response authenticateResponseForInvalidPayload();
	 public Response authenticateResponseForMissingFieldsPayload();

}
