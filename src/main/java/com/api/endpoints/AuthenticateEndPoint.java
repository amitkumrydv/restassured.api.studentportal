package com.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.payload.AuthenticatePayload;
import com.api.pojoClass.AuthenticationPojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AuthenticateEndPoint {
	
        //@formatter:off
	    private static  final Logger  logger = LoggerFactory.getLogger(AuthenticateEndPoint.class);
	    public static AuthenticationPojo authenticationPojo;
	    public static AuthenticatePayload authenticate = new AuthenticatePayload();

	    public static Response authenticateResponseForPOST() {

	        logger.info("Sending authentication request to URL: {}", Routs.Authenticate_url);
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .post(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", response.getStatusCode());
	        authenticationPojo=response.as(AuthenticationPojo.class);

	        return response;
	    }
	
	    
     public static Response authenticateResponseForGET() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending authentication request to URL: {}", Routs.Authenticate_url);
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .get(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", response.getStatusCode());

	        return response;
	    }
	    
	    
	    public static Response authenticateResponseForDELETE() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending authentication request to URL: {}", Routs.Authenticate_url);
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .delete(Routs.Authenticate_url);

	        logger.info("Actual status code: {}", response.getStatusCode());

	        return response;
	    }
	    
	    // Empty payload
	    public static Response authenticateResponseForEmptyPayload() {
	        // Sending an empty payload
	        String emptyPayload = "";

	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(emptyPayload)
	                .when()
	                .post(Routs.Authenticate_url);


	      
	        logger.info("Actual status code :{}",response.statusCode());
	        
	        return response;
	    }

        //Invalid Payload
	    public static Response authenticateResponseForInvalidPayload() {
	        // Sending an invalid payload (malformed JSON)
	        String invalidPayload = "{ invalidJson ";

	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(invalidPayload)
	                .when()
	                .post(Routs.Authenticate_url);


	        
	        logger.info("Actual status code :{}",response.statusCode());
	        return response;
	    }


	    // Missing "body"
	    public static Response authenticateResponseForMissingFieldsPayload() {
	        // Sending a payload with missing required fields (assuming "title" and "body" are required)
	        
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadDataForMissingFields())
	                .when()
	                .post(Routs.Authenticate_url);


	       
	        logger.info("Actual status code :{}",response.statusCode());
	        return response;
	    }
	    
	    

}
