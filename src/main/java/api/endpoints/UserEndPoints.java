package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import api.payload.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	
	
	
	

	public static Response createUser() {
		
		String payload = "{\n" +
			    "  \"currentAcadMonth\": \"Jul\",\n" +
			    "  \"currentAcadYear\": \"2024\",\n" +
			    "  \"currentSemPSSId\": [2549, 2550, 2551, 2552, 2553, 2554]\n" +
			    "}";
		
		
 

		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)

			.when().post(Routs.post_url);

		return response;
	}

	
}
