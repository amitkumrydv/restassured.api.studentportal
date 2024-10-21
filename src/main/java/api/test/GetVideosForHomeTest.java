package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetVideosForHomeTest {

	@Test
	public void getVideosForHomeTestAPI() {

		Response response = UserEndPoints.createUser();

		response.then()
		      // Verify that the response Content-Type is JSON
				.contentType("application/json") 

				.log().all();

		
        // Validate JSON data using JSONPATH
		JsonPath jsonView = response.jsonPath();
		int id = jsonView.get("[1].id");
		System.out.println("id " + id);

		Assert.assertEquals(id, 53361, "id verified");

	// Assert.assertEquals(response.getStatusCode(), 200);

	}

}
