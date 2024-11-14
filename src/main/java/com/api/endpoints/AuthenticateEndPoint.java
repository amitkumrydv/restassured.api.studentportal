package com.api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.payload.AuthenticatePayload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class AuthenticateEndPoint {
	
	
	
	
	 private static  final Logger  logger = LoggerFactory.getLogger(AuthenticateEndPoint.class);

	    public static Response authenticateResponse() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending authentication request to URL: {}", Routs.Authenticate_url);
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .post(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", response.getStatusCode());
	        logger.debug("Response body: {}", response.getBody().asPrettyString());

	        return response;
	    }
	

}
