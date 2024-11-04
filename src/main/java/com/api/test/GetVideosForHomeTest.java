package com.api.test;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.comman.HeaderValidator;
import com.api.endpoints.GetVideosForHomeEndPoints;
import com.api.pojoClass.GetVideosForHomePojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.assertj.core.api.Assertions.assertThat;

import io.restassured.response.Response;

public class GetVideosForHomeTest {

	// @formatter:off
	private static final Logger logger = (Logger) LoggerFactory.getLogger(GetVideosForHomeTest.class);
	HeaderValidator headerValidator;
	@Test
	public void getVideosForHomePostHeaderTest() throws JsonMappingException, JsonProcessingException {

		Response response = GetVideosForHomeEndPoints.getVideosForHomeHeaderPost();
		Long responseTime = response.getTime();
		
		ObjectMapper mapper = new ObjectMapper();

        List<GetVideosForHomePojo> videos = mapper.readValue(
            response.asString(),
            new TypeReference<List<GetVideosForHomePojo>>() {}
        );

	        // Validate data types
        for (GetVideosForHomePojo video : videos) {
          
        	int id = video.getId(); // Replace `getIsActive` with the actual getter

        	    assertThat(id).isNotNull().isInstanceOf(Integer.class);
        }
	        
		try {
			headerValidator.validateCommonHeaders(response);
		//	response.then()
             //  .body("id", notNullValue());
			     //   .assertThat(getVideosForHomePojo.getId()).isInstanceOf(Integer.class);
			
			
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
			System.out.println(" cookieValue -----------" + cookieValue);

			System.out.println("response method message " + response.body());
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
