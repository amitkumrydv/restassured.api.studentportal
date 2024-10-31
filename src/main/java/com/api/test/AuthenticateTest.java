package com.api.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.api.endpoints.AuthenticateEndPoint;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticateTest {
	
	private static final Logger logger =  (Logger) LoggerFactory.getLogger(AuthenticateTest.class);

	@Test
	public void authenticateTestApi() {
		logger.info("Start authenticateTestApi test");
		

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponse();
		Long responseTime = response.getTime();
		  try {
		response.then()
				      // Verify that the response Content-Type is JSON
				     .contentType("application/json; charset=UTF-8")
				     .log().ifError() // Log the response if there is an error
	                 .assertThat()
	                 .statusCode(200);
		
		
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
