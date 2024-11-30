package com.nmims.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.contract.endpoints.AuthenticateEndpoint;
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.payload.AuthenticatePayload;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AuthenticateEndPointImpl implements AuthenticateEndpoint{
	
        //@formatter:off
	    private static  final Logger  logger = LoggerFactory.getLogger(AuthenticateEndPointImpl.class);
	    public static AuthenticationModel authenticationModel;
	    public static AuthenticatePayload authenticate = new AuthenticatePayload();
	    
	    Response postResponse;

	    @Override
	    @Step("Send the request with post  ")
	    public  Response authenticateResponseForPOST() {

	    	logger.info("Sending POST request for authentication .");
	        
	       postResponse = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .log().headers()
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .post(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", postResponse.getStatusCode());
	        authenticationModel=postResponse.as(AuthenticationModel.class);
	        
	        
	        return postResponse;
    }
	
	    
	    @Override
	    @Step("Send the request with get  ")
        public  Response authenticateResponseForGET() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending Get request for authentication ");
	        
	        Response getResponse = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .get(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", getResponse.getStatusCode());

	        return getResponse;
	    }
	    
	    @Override
	    @Step("Send the request with delete  ")
	    public Response authenticateResponseForDELETE() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending DELETE request for authentication ");
	        
	        Response deleteResponse = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .delete(Routs.Authenticate_url);

	        logger.info("Actual status code: {}", deleteResponse.getStatusCode());

	        return deleteResponse;
	    }
	    
	    // Empty payload
	    @Override
	    @Step("Send the request with Empty payload  ")
	    public  Response authenticateResponseForEmptyPayload() {
	        // Sending an empty payload
	    	
	    	logger.info("Sending empty payload request for authentication ");
	        String emptyPayload = "";

	        Response EmptyPayloadResponse = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(emptyPayload)
	                .when()
	                .post(Routs.Authenticate_url);


	      
	        logger.info("Actual status code :{}",EmptyPayloadResponse.statusCode());
	        
	        return EmptyPayloadResponse;
	    }

        //Invalid Payload
	    @Override
	    @Step("Send the request with Invalid Payload  ")
	    public  Response authenticateResponseForInvalidPayload() {
	    	
	    	logger.info("Sending Invalid Payload request for authentication ");
	        // Sending an invalid payload (malformed JSON)
	        String invalidPayload = "{ invalidJson ";

	        Response invalidPayloadresponse = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(invalidPayload)
	                .when()
	                .post(Routs.Authenticate_url);


	        
	        logger.info("Actual status code :{}",invalidPayloadresponse.statusCode());
	        return invalidPayloadresponse;
	    }


	    // Missing "body"
	    @Override
	    @Step("Send the request with Missing body  ")
	    public  Response authenticateResponseForMissingFieldsPayload() {
	    	
	    	logger.info("Sending Missing payload body request for authentication ");
	        // Sending a payload with missing required fields (assuming "title" and "body" are required)
	        
	        
	        Response nissingBodyResponse = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadDataForMissingFields())
	                .when()
	                .post(Routs.Authenticate_url);


	       
	        logger.info("Actual status code :{}",nissingBodyResponse.statusCode());
	        return nissingBodyResponse;
	    }
	    
	    

}
