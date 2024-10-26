package api.test;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.testng.annotations.Test;

import api.endpoints.AuthenticateEndPoint;
import io.restassured.response.Response;

public class AuthenticateTest {
	
	
	
	@Test
	public void AuthenticateTestApi() {
		
		Response response = AuthenticateEndPoint.authenticateResponse();

		response.then()
				// Verify that the response Content-Type is JSON
				.contentType("application/json; charset=UTF-8")

				  .log().all()
				 .and().
		            body("sem", instanceOf(Integer.class)).
                    body("sapid", instanceOf(String.class));
                int codeStatus = response.getStatusCode();
		        String contenttype = response.getContentType();
		        
		        System.out.println("codeStatus-->  "+codeStatus + " contenttype --> "+contenttype);
		        

	
		
		
	}

}
