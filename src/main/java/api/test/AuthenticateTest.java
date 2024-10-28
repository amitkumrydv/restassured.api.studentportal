package api.test;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.testng.annotations.Test;

import api.endpoints.AuthenticateEndPoint;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class AuthenticateTest {
	
	
	
	@Test
	public void AuthenticateTestApi() {
		
		Response response = AuthenticateEndPoint.authenticateResponse();

		response.then()
				// Verify that the response Content-Type is JSON
				.contentType("application/json; charset=UTF-8")
				 .assertThat()
			//	  .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("authenticateJSONSchema.json"))
				  .log().all()
				  .extract()
		          .response();
		          
		
		// Extract a specific field from the JSON response
        String sapid = response.path("student.sapid"); // Replace 'fieldName' with the actual field name
        System.out.println("The value of the specific field is: " + sapid);
	
		  // Optional: Print response for debugging
    //    System.out.println(response.asPrettyString());
		
	}

}
