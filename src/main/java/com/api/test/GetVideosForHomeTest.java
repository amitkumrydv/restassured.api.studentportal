package com.api.test;


import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.endpoints.GetVideosForHomeEndPoints;

import io.restassured.response.Response;

public class GetVideosForHomeTest {

	@Test
	public void getVideosForHomeTestAPI() {

		Response response = GetVideosForHomeEndPoints.createUser();
		Long responseTime = response.getTime();

		response.then()
				// Verify that the response Content-Type is JSON
				.contentType("application/json")

				.log().all();

		// Validate the response status code
		Assert.assertEquals(response.getStatusCode(), 200, "Status code validation");

		// Validate the response body is not empty
		Assert.assertNotNull(response.getBody(), "Response body validation");
		
		assertTrue(responseTime < 1500, "Response time is within acceptable range");

	}

}
