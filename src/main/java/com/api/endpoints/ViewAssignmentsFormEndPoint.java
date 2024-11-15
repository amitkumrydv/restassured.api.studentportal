package com.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.comman.PayloadPojoComman;
import com.api.payload.ViewAssignmentsFormPayload;
import com.api.test.ViewAssignmentsFormTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ViewAssignmentsFormEndPoint {
	
	

	//@formatter:off
    private static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormTest.class);

    // Apply POST method
    public static Response viewAssignmentsFormEndPointHeaderPost() {
        logger.info("Initiating POST request to view assignments form endpoint.");

        ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
        PayloadPojoComman requestBody = viewAssignmentsFormPayload.viewAssignmentsFormData();

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
    public static Response viewAssignmentsFormEndPointHeaderGET() {
        logger.info("Initiating GET request to view assignments form endpoint.");

        ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
        PayloadPojoComman requestBody = viewAssignmentsFormPayload.viewAssignmentsFormData();

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
    public static Response viewAssignmentsFormEndPointHeaderDELETE() {
        logger.info("Initiating DELETE request to view assignments form endpoint.");

        ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
        PayloadPojoComman requestBody = viewAssignmentsFormPayload.viewAssignmentsFormData();

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
    
  //@formatter:on
}
	
	
	


