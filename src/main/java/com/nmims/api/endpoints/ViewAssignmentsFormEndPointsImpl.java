package com.nmims.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.contract.endpoints.ViewAssignmentsFormEndPoint;
import com.nmims.api.model.StudentModel;
import com.nmims.api.payload.ViewAssignmentsFormPayload;
import com.nmims.api.test.ViewAssignmentsFormTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ViewAssignmentsFormEndPointsImpl implements ViewAssignmentsFormEndPoint {
	
	

	//@formatter:off
    private static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormTest.class);

    // Apply POST method
    @Override
    public  Response viewAssignmentsFormEndPointHeaderPost() {
        logger.info("Initiating POST request to view assignments form endpoint.");

        ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
        StudentModel requestBody = viewAssignmentsFormPayload.viewAssignmentsFormData();

        logger.debug("Request payload for POST: {}", requestBody);
        
        

        Response response;
        try {
            response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .when()
                    .post(Routs.post_url_viewAssignmentsForm);

            logger.info("POST request completed with status code: {}", response.getStatusCode());
        } catch (Exception e) {
            logger.error("Exception occurred for the ", Routs.post_url_viewAssignmentsForm, " ",e);
            throw e;
        }

        return response;
    }

    // Apply GET method
    @Override
    public Response viewAssignmentsFormEndPointHeaderGET() {
        logger.info("Initiating GET request to view assignments form endpoint.");

        ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
        StudentModel requestBody = viewAssignmentsFormPayload.viewAssignmentsFormData();

        logger.debug("Request payload for GET (will be ignored by most GET requests): {}", requestBody);

        Response response;
        try {
            response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .when()
                    .get(Routs.post_url_viewAssignmentsForm);

            logger.info("GET request completed with status code: {}", response.getStatusCode());
        } catch (Exception e) {
            logger.error("Exception occurred during GET request: ", e);
            throw e;
        }

        return response;
    }

    // Apply DELETE method
    @Override
    public Response viewAssignmentsFormEndPointHeaderDELETE() {
        logger.info("Initiating DELETE request to view assignments form endpoint.");

        ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
        StudentModel requestBody = viewAssignmentsFormPayload.viewAssignmentsFormData();

        logger.debug("Request payload for DELETE (if applicable): {}", requestBody);

        Response response;
        try {
            response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .when()
                    .delete(Routs.post_url_viewAssignmentsForm);

            logger.info("DELETE request completed with status code: {}", response.getStatusCode());
            logger.debug("DELETE response body: {}", response.getBody().asString());
        } catch (Exception e) {
            logger.error("Exception occurred during DELETE request: ", e);
            throw e;
        }

        return response;
    }
    
    
    // Empty payload
    @Override
    public Response viewAssignmentsFormEmptyPayload() {
        // Sending an empty payload
        String emptyPayload = "";
        Response response;
        try {
            response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(emptyPayload)
                    .when()
                    .post(Routs.post_url_viewAssignmentsForm);

      
        logger.info("Actual status code :{}",response.statusCode());
        } catch (Exception e) {
            logger.error("Exception occurred during Empty request: ", e);
            throw e;
        }
        return response;
    }

    //Invalid Payload
    @Override
    public Response viewAssignmentsFormInvalidPayload() {
        // Sending an invalid payload (malformed JSON)
        String invalidPayload = "{ invalidJson ";
        Response response;
        try {
            response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(invalidPayload)
                    .when()
                    .post(Routs.post_url_viewAssignmentsForm);

      
        logger.info("Actual status code :{}",response.statusCode());
        } catch (Exception e) {
            logger.error("Exception occurred during Invalid request: ", e);
            throw e;
        }
        return response;
    }

  
    
  //@formatter:on
}
	
	
	


