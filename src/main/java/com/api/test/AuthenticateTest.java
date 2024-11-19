package com.api.test;

import static org.testng.Assert.assertTrue;

import java.net.http.HttpClient;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.comman.ApplySeverityLevel;
import com.api.comman.HeaderValidatorComman;
import com.api.endpoints.AuthenticateEndPoint;
import com.api.endpoints.Routs;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Epic("Authentication")
@Feature("User Authentication")
@Story("User submits valid credentials (userid and password) for login")
public class AuthenticateTest {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(AuthenticateTest.class);
	

	@Test(priority = 1)
	@Description("Send a POST request to the authentication URL and validate the response")
	public static void  authenticatePOSTHeaderTest() {

		HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForPOST();
		Long responseTime = response.getTime();
		  try {
			  
				// Validate the response status code
				Assert.assertEquals(response.getStatusCode(), 200, "Status code validation");
			    headerValidatorComman.authenticateHeadersValidation(response);

	            assertTrue(responseTime < 2000, "Response time is within acceptable range");
	            
               ApplySeverityLevel.severityForPOST(response.getStatusCode());

		    } catch (AssertionError assertionError) {
	            logger.error("Assertion error: " + assertionError.getMessage());
	         // Assertion error to mark the test as failed
	            throw assertionError;  // This will mark the test as failed
	        } catch (Exception e) {
	            logger.warn("An error occurred: " + e.getMessage());
	            // Optionally re-throw this exception to fail the test as well
	            throw new RuntimeException(e); // Mark as failed due to a non-assertion error
	        }

	}
	
	
	@Test(priority=2, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a GET request to the authentication URL and validate the response")
	public void authenticateGETHeaderTest() {
		
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForGET();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(405);
			ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());

			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue:" + cookieValue);
			
			

			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");


		    } catch (AssertionError assertionError) {
	            logger.error("Assertion error: " + assertionError.getMessage());
	         // Assertion error to mark the test as failed
	            throw assertionError;  // This will mark the test as failed
	        } catch (Exception e) {
	            logger.warn("An error occurred: " + e.getMessage());
	            // Optionally re-throw this exception to fail the test as well
	            throw new RuntimeException(e); // Mark as failed due to a non-assertion error
	        }
		

	}
	
	
	
	
	@Test(priority=3, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a DELETE request to the authentication URL and validate the response")
	public void authenticateDELETEHeaderTest() {
		
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForDELETE();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(405);

			ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());
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
	
	
	// Empty payload
	@Test(priority=4, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a Empty payload request and validate the response")
	public void authenticateResponseForEmptyPayloadTest() {
		
		logger.info("Start authenticate Response For Empty Payload test");
      try {
		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForEmptyPayload();
		Long responseTime = response.getTime();
	
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(400);
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
	
	
	
	
	@Test(priority=5, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a Invalid payload request and validate the response")
	public void authenticateResponseForInvalidPayloadTest() {
		
		logger.info("Start authenticate Response For Empty Payload test");
      try {
		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForInvalidPayload();
		Long responseTime = response.getTime();
	
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(400);

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
	
	
	@Test(priority=6, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a missing fields payload request and validate the response")
	public void authenticateResponseForMissingFieldsTest() {
		
		logger.info("Start authenticate Response For Empty Payload test");
      try {
		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForMissingFieldsPayload();
		Long responseTime = response.getTime();
	
			response.then()
			             .assertThat()
					      // Assert that the status code is 405
					     .statusCode(400);

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
