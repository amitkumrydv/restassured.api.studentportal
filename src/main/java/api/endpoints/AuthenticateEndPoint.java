package api.endpoints;

import api.payload.AuthenticatePyload;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;


public class AuthenticateEndPoint {
	
	
	
	
	public  static Response authenticateResponse() {
	 AuthenticatePyload authenticate = new AuthenticatePyload();
		
		Response resonse = given()
				              .contentType(ContentType.JSON)
				              .accept(ContentType.JSON)
				              .body(authenticate.authenticatePyloadData())
				          .when()
				              .post(Routs.Authenticate_url);
				     
				           
				    return resonse;      
		
		
	}

}
