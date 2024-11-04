package com.api.response.validation;

import io.restassured.response.Response;

public interface HeaderResponceValidation {
	
	public void validateCommonHeaders(Response response);

	void validateAuthenticateHeaders(Response response);

}
