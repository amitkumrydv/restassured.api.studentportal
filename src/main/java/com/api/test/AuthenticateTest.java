package com.api.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.api.comman.HeaderValidator;
import com.api.endpoints.AuthenticateEndPoint;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticateTest {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(AuthenticateTest.class);

	@Test
	public void authenticateTestApi() throws JsonMappingException, JsonProcessingException {
		
		HeaderValidator headerValidator = new HeaderValidator();
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponse();
		Long responseTime = response.getTime();
		  try {
			  headerValidator.validateAuthenticateHeaders(response);
		
		
	 //   assertTrue(responseTime < 1500, "Response time is within acceptable range");
		
		
	    // Log the response body
       logger.info("Response: " + response.getBody().asString());


		    } catch (AssertionError assertionError) {
	            logger.error("Assertion error: " + assertionError.getMessage());
	            // Rethrow the assertion error to mark the test as failed
	            throw assertionError;  // This will mark the test as failed
	        } catch (Exception e) {
	            logger.warn("An error occurred: " + e.getMessage());
	            // Optionally rethrow this exception to fail the test as well
	            throw new RuntimeException(e); // Mark as failed due to a non-assertion error
	        }
		

	}

}
