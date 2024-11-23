package com.nmims.api.contract.validations;

import io.restassured.response.Response;

public interface HeaderResponceValidation {
	

	public void commonHeadersValidation(Response response);

	public void authenticateHeadersValidation(Response response);

	public void getVideosForHomeHeadersValidation(Response response);

}
