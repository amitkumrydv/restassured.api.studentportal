package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;


public class AuthenticateEndPoint {
	
	static String  json_string =  "{\"spaid\": \"77221782653\"}";
	
	
	public  static Response authenticateResponse() {
		
		Response resonse = given()
				              .contentType(ContentType.JSON)
				              .accept(ContentType.JSON)
				              .body(json_string)
				          .when()
				              .post(Routs.Authenticate_url);
				     
				           
				    return resonse;      
		
		
	}

}
