package com.api.test;

import static org.testng.Assert.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.comman.HeaderValidator;
import com.api.endpoints.ViewAssignmentsFormEndPoint;
import com.api.response.mapper.ViewAssignmentsFormMpper;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ViewAssignmentsFormTest {
	
	
	private static Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormTest.class);
	HeaderValidator headerValidator = new HeaderValidator();
	ViewAssignmentsFormMpper viewAssignment = new ViewAssignmentsFormMpper();
	
	
	@Test
	public void viewAssignmentsFormPostHeaderTest() {
		
		
		Response response= ViewAssignmentsFormEndPoint.viewAssignmentsFormEndPointHeaderPost();
		Long responseTime = response.getTime();
		
		try {
			headerValidator.validateCommonHeaders(response);
			
			ResponseBody responsebody = response.body();
			String data =responsebody.asString();
			viewAssignment.ViewAssignmentsFormMapperResponsValidation(data);
			
			
			
			
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
		
		
		
	}


