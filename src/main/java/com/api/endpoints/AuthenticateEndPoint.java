package com.api.endpoints;

import io.restassured.response.Response;
import com.api.payload.AuthenticatePyload;
import com.api.pojoClass.AuthenticationPojo;
import com.api.pojoClass.CommanPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class AuthenticateEndPoint {
	

	
	public  static Response authenticateResponse() throws JsonMappingException, JsonProcessingException {
	 AuthenticatePyload authenticate = new AuthenticatePyload();

		
		Response response = RestAssured.given()
				              .contentType(ContentType.JSON)
				              .accept(ContentType.JSON)
				              .body(authenticate.authenticatePyloadData())
				          .when()
				              .post(Routs.Authenticate_url);
		
				   
		  // Deserialize and store the response in the shared context
	    AuthenticationPojo storeAuthenticationResponse = response.as(AuthenticationPojo.class);
	    CommanPojo.setAuthenticationPojo(storeAuthenticationResponse);
	  
	 
				           
return response;      
		
		
	}

}
