package com.api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import com.api.payload.AuthenticatePyload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class AuthenticateEndPoint {
	
	
	
	
	public  static Response authenticateResponse() {
	 AuthenticatePyload authenticate = new AuthenticatePyload();
		
		Response resonse = RestAssured.given()
				              .contentType(ContentType.JSON)
				              .accept(ContentType.JSON)
				              .body(authenticate.authenticatePyloadData())
				          .when()
				              .post(Routs.Authenticate_url);
				     
				           
				    return resonse;      
		
		
	}

}
