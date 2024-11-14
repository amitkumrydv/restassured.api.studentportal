package com.api.test;

import static org.testng.Assert.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.comman.HeaderValidatorComman;
import com.api.endpoints.ViewAssignmentsFormEndPoint;
import com.api.response.mapper.ViewAssignmentsFormMpper;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ViewAssignmentsFormTest {
	
	
	private static Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormTest.class);
	HeaderValidatorComman headerValidatorComman = new HeaderValidatorComman();
	ViewAssignmentsFormMpper viewAssignment = new ViewAssignmentsFormMpper();
	
	
	@Test
	public void viewAssignmentsFormPOSTHeaderTest() {
		
		
		Response response= ViewAssignmentsFormEndPoint.viewAssignmentsFormEndPointHeaderPost();
		Long responseTime = response.getTime();
		
		try {
			headerValidatorComman.validateCommonHeaders(response);
			
			ResponseBody responsebody = response.body();
			String data =responsebody.asString();
			viewAssignment.ViewAssignmentsFormMapperResponsValidation(data);
			
			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue " ,cookieValue);
			
			// Validate the response status code
			Assert.assertEquals(response.getStatusCode(), 200, "Status code validation");
			// Validate the response body is not empty
			Assert.assertNotNull(response.getBody(), "Response body validation");
			assertTrue(responseTime < 1500, "Response time is within acceptable range");

		}
		// Re-throw the assertion error to mark the test as failed
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
		
	
	
	@Test(dependsOnMethods = "viewAssignmentsFormPOSTHeaderTest")
	public void viewAssignmentsFormGETHeaderTest() {
		
		Response response= ViewAssignmentsFormEndPoint.viewAssignmentsFormEndPointHeaderGET();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					     .statusCode(500);

			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue " ,cookieValue);
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
	
	
	@Test(dependsOnMethods = "viewAssignmentsFormGETHeaderTest")
	public void viewAssignmentsFormDELETEHeaderTest() {
		
		Response response= ViewAssignmentsFormEndPoint.viewAssignmentsFormEndPointHeaderDELETE();
		Long responseTime = response.getTime();
		try {
			response.then()
			             .assertThat()
					     .statusCode(405);

			String cookieValue = response.getCookie("SESSION");
			logger.info("cookieValue " ,cookieValue);
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
	
	
	
	
		


