package com.api.comman;


import org.hamcrest.Matchers;

import com.api.response.validation.HeaderResponceValidation;

import io.restassured.response.Response;


public class HeaderValidator implements HeaderResponceValidation{
	
	@Override
	public void validateCommonHeaders(Response response) {
        response.then()
            .header("Content-Type", "application/json")
            .header("Cache-Control", Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
            .header("Connection",  Matchers.equalTo("keep-alive"));
    }
	@Override
	  public void validateAuthenticateHeaders(Response response) {
	        response.then()
	        .header("Content-Type", "application/json; charset=utf-8")
            .header("Cache-Control", "no-cache")
	        .header("Connection", Matchers.equalTo("keep-alive"));
	    }
	

}
