package com.api.response.validation;

import io.restassured.response.Response;

public interface AuthenticateResponseValidation {
	
	public void authenticateResponseValidation(Response response);

}
