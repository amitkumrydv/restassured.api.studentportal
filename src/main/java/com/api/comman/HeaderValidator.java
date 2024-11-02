package com.api.comman;

import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class HeaderValidator  {
	
	
	public static void validateCommonHeaders(Response response) {
        response.then()
            .header("Content-Type", "application/json")
            .header("Cache-Control", Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
            .header("Connection",  Matchers.equalTo("keep-alive"));
    }
	
	  public static void validateAuthenticateHeaders(Response response) {
	        response.then()
	        .header("Content-Type", "application/json; charset=utf-8")
            .header("Cache-Control", "no-cache")
	        .header("Connection", Matchers.equalTo("keep-alive"));
	    }
	

}
