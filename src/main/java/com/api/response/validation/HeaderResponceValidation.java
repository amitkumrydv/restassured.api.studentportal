package com.api.response.validation;

import io.restassured.response.Response;

public interface HeaderResponceValidation {
	

	void commonHeadersValidation(Response response);

	void getVideosForHomeHeadersValidation(Response response);

	void authenticateHeadersValidation(Response response);

}
