package com.nmims.api.test;

import static org.testng.Assert.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nmims.api.comman.ApplySeverityLevel;
import com.nmims.api.comman.HeaderValidatorComman;
import com.nmims.api.comman.HttpStatusConstants;
import com.nmims.api.endpoints.ViewAssignmentsFormEndPointsImpl;
import com.nmims.api.response.mapper.ViewAssignmentsFormMpper;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

@Epic("Assignments")
@Feature("Applicable Assignment")
@Story("Assignments for fail and pass Subject")
public class ViewAssignmentsFormTest {
	
	
	private static Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormTest.class);
	HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
	ViewAssignmentsFormMpper viewAssignment = new ViewAssignmentsFormMpper();
	ViewAssignmentsFormEndPointsImpl viewAssignmentsFormEndPointsImpl = new ViewAssignmentsFormEndPointsImpl();
	
	
	@Test(priority=1)
	@Description("Send a POST request to the ViewAssignmentsFormTest API and validate the response")
	public void viewAssignmentsFormPOSTHeaderTest() {
		
		
		Response response= viewAssignmentsFormEndPointsImpl.viewAssignmentsFormEndPointHeaderPost();
		Long responseTime = response.getTime();
		
		try {
			
			// Validate the response status code
			Assert.assertEquals(response.getStatusCode(), 200, "Status code validation");			
			headerValidatorComman.commonHeadersValidation(response);
			
			// Convert response body into String
			ResponseBody responsebody = response.body();
			String data =responsebody.asString();
			viewAssignment.ViewAssignmentsFormMapperResponsValidation(data);
			
			ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());
			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue " ,cookieValue);
			
			// Validate the response status code
			Assert.assertEquals(response.getStatusCode(), HttpStatusConstants.OK, "Status code validation");
			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body validation");
			assertTrue(responseTime < 1500, "Response time is within acceptable range");

		}
		// Assertion error to mark the test as failed
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
		
	
	
	
	@Test(priority=2 , dependsOnMethods = "viewAssignmentsFormPOSTHeaderTest")
	@Description("Send a GET request to the ViewAssignmentsFormTest URL and validate the response")
	public void viewAssignmentsFormGETHeaderTest() {
		
		Response response= viewAssignmentsFormEndPointsImpl.viewAssignmentsFormEndPointHeaderGET();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					     .statusCode(HttpStatusConstants.METHOD_NOT_ALLOWED);

			ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());
			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue " ,cookieValue);
			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");

		}
		// Assertion error to mark the test as failed
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
	
	
	@Test(priority=3 , dependsOnMethods = "viewAssignmentsFormPOSTHeaderTest")
	@Description("Send a DELETE request to the ViewAssignmentsFormTest URL and validate the response")
	public void viewAssignmentsFormDELETEHeaderTest() {
		
		Response response= viewAssignmentsFormEndPointsImpl.viewAssignmentsFormEndPointHeaderDELETE();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					     .statusCode(HttpStatusConstants.METHOD_NOT_ALLOWED);
			ApplySeverityLevel.setSeverityForPostUsingAnotherMethod(response.getStatusCode());
			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue " ,cookieValue);
			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body Null");

			assertTrue(responseTime < 2000, "Response time is within acceptable range");

		}
		// Assertion error to mark the test as failed
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
	
	
	
	// Empty payload
	@Test(priority=4, dependsOnMethods = "viewAssignmentsFormPOSTHeaderTest")
	@Description("Send a Empty payload request and validate the response")
	public void ViewAssignmentsFormEmptyPayloadTest() {
		
		logger.info("Start ViewAssignmentsForm API Response For Empty Payload test");
      try {
		// @formatter:off
    	  Response response= viewAssignmentsFormEndPointsImpl.viewAssignmentsFormEmptyPayload();
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
	
	
	
	//Invalid payload 
	@Test(priority=5, dependsOnMethods = "viewAssignmentsFormPOSTHeaderTest")
	@Description("Send a Invalid payload request and validate the response")
	public void ViewAssignmentsFormInvalidPayloadTest() {
		
		logger.info("Start ViewAssignmentsForm API Response For Empty Payload test");
      try {
		// @formatter:off
    	  Response response= viewAssignmentsFormEndPointsImpl. viewAssignmentsFormInvalidPayload();
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
	
	
	
	
		
}
	
	
	
	
		


