package com.api.test;

import static org.testng.Assert.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.comman.ApplySeverityLevel;
import com.api.comman.HeaderValidatorComman;
import com.api.comman.HttpStatusConstants;
import com.api.endpoints.GetVideosForHomeEndPoints;
import com.api.response.mapper.GetVideosForHomeMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;


@Epic("Get Videos For Home")
@Feature("session visible on the Dashboard")
@Story("Applicable sessions are should be visible")
public class GetVideosForHomeTest {

	// @formatter:off
	private static final Logger logger = LoggerFactory.getLogger(GetVideosForHomeTest.class);

	/*
	 * This test method depends on the response of the authenticatePOSTHeaderTest.
	 * The response from that method is used as payload data for this test.
	 */
	@Test(priority = 1)
	@Description("Send a POST request to the getVideosForHome URL and validate the response")
	public void getVideosForHomePostHeaderTest() throws JsonMappingException, JsonProcessingException {
	    HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
	    GetVideosForHomeMapper getVideosForHomeMapper = new GetVideosForHomeMapper();

	    Response response = GetVideosForHomeEndPoints.getVideosForHomeHeaderPost();
	    Long responseTime = response.getTime();

	    try {
	    	// Set severity Dynamically
	    	ApplySeverityLevel.severityForPOST(response.getStatusCode());
	        // Validate that the response status code is 200
	        Assert.assertEquals(response.getStatusCode(), HttpStatusConstants.OK, "Status code validation");

	        // Validate headers in the response
	        headerValidatorComman.getVideosForHomeHeadersValidation(response);

	        // Validate the response body structure and values
	        getVideosForHomeMapper.GetVideosForHomeResponsValidation(response);
	        
	        logger.info("Severity level: {}", response.getStatusCode() == HttpStatusConstants.OK ? "NORMAL" : "CRITICAL");


	        // Ensure the response body is not null
	        Assert.assertNotNull(response.getBody(), "Response body validation");

	        // Verify the response time is within acceptable limits
	        assertTrue(responseTime < 1500, "Response time is within acceptable range");

	    } catch (AssertionError assertionError) {
	        // Log assertion errors and throw to mark the test as failed
	        logger.error("Assertion error: " + assertionError.getMessage());
	        throw assertionError;
	    } catch (Exception e) {
	        // Log any unexpected errors and throw as RuntimeException
	        logger.warn("An error occurred: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}

	@Test(priority = 2, dependsOnMethods = "getVideosForHomePostHeaderTest")
	@Description("Send a GET request to the getVideosForHome URL and validate the response")
	public void getVideosForHomeGetHeaderTest() {

	    // Send the GET request to the getVideosForHome end-point
	    Response response = GetVideosForHomeEndPoints.getVideosForHomeHeaderGet();
	    Long responseTime = response.getTime();

	    try {
	        // Validate that the response status code is 405 (method not allowed)
	        response.then()
	                .assertThat()
	                .statusCode(HttpStatusConstants.METHOD_NOT_ALLOWED);

	        ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());
	        
	        // Retrieve and log the SESSION cookie from the response
	        String cookieValue = response.getCookie("SESSION");
	        logger.info("cookieValue: " + cookieValue);

	        // Ensure the response body is not null
	        Assert.assertNotNull(response.getBody(), "Response body Null");

	        // Verify the response time is within acceptable limits
	        assertTrue(responseTime < 2000, "Response time is within acceptable range");
	    } catch (AssertionError assertionError) {
	        // Log assertion errors and throw to mark the test as failed
	        logger.error("Assertion error: " + assertionError.getMessage());
	        throw assertionError;
	    } catch (Exception e) {
	        // Log any unexpected errors and throw as RuntimeException
	        logger.warn("An error occurred: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}

	@Test(priority = 3, dependsOnMethods = "getVideosForHomePostHeaderTest")
	@Description("Send a DELETE request to the getVideosForHome URL and validate the response")
	public void getVideosForHomeDELETEHeaderTest() {

	    // Send the DELETE request to the getVideosForHome endpoint
	    Response response = GetVideosForHomeEndPoints.getVideosForHomeHeaderDELETE();
	    Long responseTime = response.getTime();

	    try {
	        // Validate that the response status code is 405 (method not allowed)
	        response.then().assertThat().statusCode(405);
	        
	        ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());

	        // Retrieve and log the SESSION cookie from the response
	        String cookieValue = response.getCookie("SESSION");
	        logger.info("cookieValue: " + cookieValue);

	        // Ensure the response body is not null
	        Assert.assertNotNull(response.getBody(), "Response body Null");

	        // Verify the response time is within acceptable limits
	        assertTrue(responseTime < 2000, "Response time is within acceptable range");
	    } catch (AssertionError assertionError) {
	        // Log assertion errors and throw to mark the test as failed
	        logger.error("Assertion error: " + assertionError.getMessage());
	        throw assertionError;
	    } catch (Exception e) {
	        // Log any unexpected errors and throw as RuntimeException
	        logger.warn("An error occurred: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}

	
	// Empty payload
	@Test(priority=4, dependsOnMethods = "getVideosForHomePostHeaderTest")
	@Description("Send a Empty payload request and validate the response")
	public void getVideosForHomeEmptyPayloadTest() {
		
		logger.info("Start getVideosForHome API Response For Empty Payload test");
      try {
    	  Response response = GetVideosForHomeEndPoints.getVideosForHomeEmptyPayload();
		Long responseTime = response.getTime();
	
			response.then()
			             .assertThat()
					     .statusCode(HttpStatusConstants.BAD_REQUEST);
			
			ApplySeverityLevel.setSeverityLevelEmptyPayload(response.getStatusCode());

			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue:" + cookieValue);

			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");
			
			// Assertion error to mark the test as failed
		    } catch (AssertionError assertionError) {
	            logger.error("Assertion error: " + assertionError.getMessage());
	  
	            throw assertionError;  // This will mark the test as failed
	        } catch (Exception e) {
	            logger.warn("An error occurred: " + e.getMessage());
	            // Optionally re-throw this exception to fail the test as well
	            throw new RuntimeException(e); // Mark as failed due to a non-assertion error
	        }
		}
	
	
	
	// Invalid payload
	@Test(priority=5, dependsOnMethods = "getVideosForHomePostHeaderTest")
	@Description("Send a Invalid payload request and validate the response")
	public void getVideosForHomeInvalidPayloadTest() {
		
		logger.info("Start getVideosForHome API Response For Empty Payload test");
      try {
		// @formatter:off
    	  Response response = GetVideosForHomeEndPoints.getVideosForHomeInvalidPayload();
		Long responseTime = response.getTime();
	
			response.then()
			             .assertThat()
					     .statusCode(HttpStatusConstants.BAD_REQUEST);

			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue:" + cookieValue);

			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");
			
			// Assertion error to mark the test as failed
		    } catch (AssertionError assertionError) {
	            logger.error("Assertion error: " + assertionError.getMessage());
	  
	            throw assertionError;  // This will mark the test as failed
	        } catch (Exception e) {
	            logger.warn("An error occurred: " + e.getMessage());
	            // Optionally re-throw this exception to fail the test as well
	            throw new RuntimeException(e); // Mark as failed due to a non-assertion error
	        }
		}
	
	// Missing fields
	@Test(priority=6, dependsOnMethods = "getVideosForHomePostHeaderTest")
	@Description("Send a missing fields payload request and validate the response")
	public void getVideosForHomeMissingFieldsTest() {
		
		logger.info("Start getVideosForHome API Response For Empty Payload test");
      try {
		// @formatter:off
    	  Response response = GetVideosForHomeEndPoints.getVideosForHomeMissingFields();
		Long responseTime = response.getTime();
	
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(HttpStatusConstants.BAD_REQUEST);

			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue:" + cookieValue);

			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");
			
			// Assertion error to mark the test as failed
		    } catch (AssertionError assertionError) {
	            logger.error("Assertion error: " + assertionError.getMessage());
	  
	            throw assertionError;  // This will mark the test as failed
	        } catch (Exception e) {
	            logger.warn("An error occurred: " + e.getMessage());
	            // Optionally re-throw this exception to fail the test as well
	            throw new RuntimeException(e); // Mark as failed due to a non-assertion error
	        }
		}
	
	
	
	
	
	
	
	
	
	
	

}
