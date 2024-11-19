package com.api.comman;

import org.hamcrest.Matchers;

import com.api.response.validation.HeaderResponceValidation;

import io.restassured.response.Response;

public class HeaderValidatorComman implements HeaderResponceValidation {

	//@formatter:off
	@Override
	public void commonHeadersValidation(Response response) {
		response.then()
		        .header(HeaderConstants.CONTENT_TYPE, "application/json")
				.header(HeaderConstants.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
				.header(HeaderConstants.CONNECTION, Matchers.equalTo("keep-alive"));
	}

	@Override
	public void authenticateHeadersValidation(Response response) {
		response.then()
		        .header(HeaderConstants.CONTENT_TYPE, "application/json;charset=UTF-8")
				.header(HeaderConstants.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
				.header(HeaderConstants.CONNECTION, Matchers.equalTo("keep-alive"));
	}

	@Override
	public void getVideosForHomeHeadersValidation(Response response) {

		response.then()
        .header(HeaderConstants.CONTENT_TYPE, "application/json")
		.header(HeaderConstants.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
		.header(HeaderConstants.CONNECTION, Matchers.equalTo("keep-alive"));

	}

	
	//@formatter:on
}
