package com.nmims.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.contract.endpoints.AuthenticateEndpoint;
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.StudentModel;
import com.nmims.api.payload.AuthenticatePayload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AuthenticateEndPointImpl implements AuthenticateEndpoint{
	
        //@formatter:off
	    private static  final Logger  logger = LoggerFactory.getLogger(AuthenticateEndPointImpl.class);
	    public static AuthenticationModel authenticationModel;
	    public static AuthenticatePayload authenticate = new AuthenticatePayload();

	    @Override
	    public  Response authenticateResponseForPOST() {

	    	logger.info("Sending POST request for authentication .");
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .log().headers()
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .post(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", response.getStatusCode());
	        authenticationModel=response.as(AuthenticationModel.class);

	        return response;
    }
	
	    
	    @Override   
        public  Response authenticateResponseForGET() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending Get request for authentication ");
	        
	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .body(authenticate.authenticatePyloadData())
	                .when()
	                .get(Routs.Authenticate_url);

	        logger.info("Received response with status code: {}", response.getStatusCode());

	        return response;
	    }
	    
	    @Override
	    public Response authenticateResponseForDELETE() {
	        AuthenticatePayload authenticate = new AuthenticatePayload();

	        logger.info("Sending DELETE request for authentication ");
	        
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
	    @Override
	    public  Response authenticateResponseForEmptyPayload() {
	        // Sending an empty payload
	    	
	    	logger.info("Sending empty payload request for authentication ");
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
	    @Override
	    public  Response authenticateResponseForInvalidPayload() {
	    	
	    	logger.info("Sending Invalid Payload request for authentication ");
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
	    @Override
	    public  Response authenticateResponseForMissingFieldsPayload() {
	    	
	    	logger.info("Sending Missing payload body request for authentication ");
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
