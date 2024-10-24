package api.test;

import org.testng.annotations.Test;

import api.endpoints.AuthenticateEndPoint;
import io.restassured.response.Response;

public class AuthenticateTest {
	
	
	
	@Test
	public void AuthenticateTestApi() {
		
		Response response = AuthenticateEndPoint.authenticateResponse();

		response.then()
				// Verify that the response Content-Type is JSON
				.contentType("")

				.log().all();

		
		        
		        int codeStatus = response.getStatusCode();
		        
		        System.out.println("codeStatus-->  "+codeStatus);
		        

	
		
		
	}

}
