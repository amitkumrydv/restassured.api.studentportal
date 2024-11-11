package com.api.test;

import static org.testng.Assert.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.comman.HeaderValidator;
import com.api.endpoints.ViewAssignmentsFormEndPoint;
import com.api.response.mapper.ViewAssignmentsFormMpper;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;




@Epic(value = "")
@Story("")
@Feature("")
public class ViewAssignmentsFormTest {
	
	
	private static Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormTest.class);
	HeaderValidator headerValidator = new HeaderValidator();
	ViewAssignmentsFormMpper viewAssignment = new ViewAssignmentsFormMpper();
	
	
	@Test(priority = 1)
	@Step("")
	@Severity(SeverityLevel.CRITICAL)
	@Description("")
	public void viewAssignmentsFormPOSTHeaderTest() {
		
		
		Response response= ViewAssignmentsFormEndPoint.viewAssignmentsFormEndPointHeaderPost();
		Long responseTime = response.getTime();
		
		try {
			headerValidator.validateCommonHeaders(response);
			
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
	
	
	
	
		


