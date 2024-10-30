package com.api.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.api.endpoints.AuthenticateEndPoint;

import io.restassured.response.Response;

public class AuthenticateTest {

	@Test
	public void AuthenticateTestApi() {
		
		

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponse();
		Long responseTime = response.getTime();

		response.then()
				      // Verify that the response Content-Type is JSON
				     .contentType("application/json; charset=UTF-8")
				     .log().all();
		
		
		assertTrue(responseTime < 1500, "Response time is within acceptable range");

	}

}
