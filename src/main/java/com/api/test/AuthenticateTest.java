package com.api.test;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.comman.HeaderValidatorComman;
import com.api.endpoints.AuthenticateEndPoint;
import com.api.endpoints.Routs;
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

	@Test(priority=1)
	@Description("Send a POST request to the authentication URL and validate the response")
	public void authenticatePOSTHeaderTest() {
		
		HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForPOST();
		Long responseTime = response.getTime();
		  try {
			  headerValidatorComman.validateAuthenticateHeaders(response);
		
		
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
	
	
	@Test(priority=2, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a GET request to the authentication URL and validate the response")
	public void authenticateGETHeaderTest() {
		
		HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForGET();
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
	
	
	
	
	@Test(priority=3, dependsOnMethods="authenticatePOSTHeaderTest")
	@Description("Send a DELETE request to the authentication URL and validate the response")
	public void authenticateDELETEHeaderTest() {
		
		HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
		logger.info("Start authenticateTestApi test");

		// @formatter:off
		Response response = AuthenticateEndPoint.authenticateResponseForDELETE();
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
