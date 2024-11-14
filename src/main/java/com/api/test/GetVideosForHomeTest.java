package com.api.test;

import static org.testng.Assert.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.comman.HeaderValidatorComman;
import com.api.endpoints.GetVideosForHomeEndPoints;
import com.api.response.mapper.GetVideosForHomeMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.restassured.response.Response;

public class GetVideosForHomeTest {

	// @formatter:off
	private static final Logger logger = LoggerFactory.getLogger(GetVideosForHomeTest.class);

	@Test
	public void getVideosForHomePostHeaderTest() throws JsonMappingException, JsonProcessingException {
		HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
		GetVideosForHomeMapper getVideosForHomeMapper = new GetVideosForHomeMapper();

		Response response = GetVideosForHomeEndPoints.getVideosForHomeHeaderPost();
		Long responseTime = response.getTime();
		
		
	        
		try {
			headerValidatorComman.validateCommonHeaders(response);
			getVideosForHomeMapper.GetVideosForHomeResponsValidation(response);
			
			
			// Validate the response status code
			Assert.assertEquals(response.getStatusCode(), 200, "Status code validation");
			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body validation");
			assertTrue(responseTime < 1500, "Response time is within acceptable range");

		}
		// Rethrow the assertion error to mark the test as failed
		catch (AssertionError assertionError) {
			logger.error("Assertion error: " + assertionError.getMessage());

			throw assertionError;
		}
		// Optionally re-throw this exception to fail the test as well
		catch (Exception e) {
			logger.warn("An error occurred: " + e.getMessage());

			throw new RuntimeException(e); // Mark as failed due to a non-assertion error
		}

	}

	@Test(dependsOnMethods = "getVideosForHomePostHeaderTest")
	public void getVideosForHomeGetHeaderTest() {

		Response response = GetVideosForHomeEndPoints.getVideosForHomeHeaderGet();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(405);

			String cookieValue = response.getCookie("SESSION");
			logger.info(" cookieValue -----------" + cookieValue);

			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");

		}
		// Rethrow the assertion error to mark the test as failed
		catch (AssertionError assertionError) {
			logger.error("Assertion error: " + assertionError.getMessage());
			// This will mark the test as failed
			throw assertionError;
		}
		// Optionally re-throw this exception to fail the test as well
		catch (Exception e) {
			logger.warn("An error occurred: " + e.getMessage());
			// Mark as failed due to a non-assertion error
			throw new RuntimeException(e);
		}

	}

}
