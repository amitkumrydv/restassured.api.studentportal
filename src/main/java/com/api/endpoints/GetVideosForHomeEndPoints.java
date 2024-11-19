package com.api.endpoints;

import static io.restassured.RestAssured.given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.jsonPath.AuthenticateJSONPath;
import com.api.payload.GetVideosForHomePayload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetVideosForHomeEndPoints {
	
	
	//@formatter:off
	private static Logger logger = LoggerFactory.getLogger(GetVideosForHomeEndPoints.class);

	public static Response getVideosForHomeHeaderPost() {
        logger.info("Sending POST request to get videos for home header");

        // Request body
        Response response = given()
                             .contentType(ContentType.JSON)
                             .accept(ContentType.JSON)
                             .body(GetVideosForHomePayload.getVideosForHomePaloadData())
                           .when()
                             .post(Routs.post_url_getVideosForHome);

        logger.info("Received response with status code: " + response.statusCode());


        return response;
    }

    public static Response getVideosForHomeHeaderGet() {
        logger.info("Sending GET request to get videos for home header");

        // Request body
        Response response = given()
                             .contentType(ContentType.JSON)
                             .accept(ContentType.JSON)
                             .body(GetVideosForHomePayload.getVideosForHomePaloadData())
                           .when()
                             .get(Routs.post_url_getVideosForHome);

        logger.info("Received response with status code: " + response.statusCode());
        logger.debug("Response body: " + response.getBody().asString());

        return response;
    }

    public static Response getVideosForHomeHeaderDELETE() {
        logger.info("Sending DELETE request to get videos for home header");

        // Request body
        Response response = given()
                             .contentType(ContentType.JSON)
                             .accept(ContentType.JSON)
                             .body(GetVideosForHomePayload.getVideosForHomePaloadData())
                           .when()
                             .delete(Routs.post_url_getVideosForHome);

        logger.info("Received response with status code: " + response.statusCode());
        logger.debug("Response body: " + response.getBody().asString());

        return response;
    }
    
    
    
    // Empty payload
    public static Response getVideosForHomeEmptyPayload() {
        // Sending an empty payload
        String emptyPayload = "";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(emptyPayload)
                .when()
                .post(Routs.post_url_getVideosForHome);


      
        logger.info("Expected status code :{}",response.statusCode());
        
        return response;
    }

    //Invalid Payload
    public static Response getVideosForHomeInvalidPayload() {
        // Sending an invalid payload (malformed JSON)
        String invalidPayload = "{ invalidJson ";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(invalidPayload)
                .when()
                .post(Routs.post_url_getVideosForHome);


        
        logger.info("Expected status code :{}",response.statusCode());
        return response;
    }


    // Missing "body"
    public static Response getVideosForHomeMissingFields() {
        // Sending a payload with missing required fields (assuming "title" and "body" are required)
        
        
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(GetVideosForHomePayload.authenticateResponseForMissingFieldsPayload())
                .when()
                .post(Routs.post_url_getVideosForHome);


       
        logger.info("Expected status code :{}",response.statusCode());
        return response;
    } 
    
    
    
    
}
	
	

	
