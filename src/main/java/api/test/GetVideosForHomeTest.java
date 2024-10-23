package api.test;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import api.endpoints.GetVideosForHomeEndPoints;
import api.payload.GetVideosForHomePaload;
import api.responce.GetVideosForHomeResponse;
import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetVideosForHomeTest {

	@Test
	public void getVideosForHomeTestAPI() throws FileNotFoundException {
		Gson gson = new Gson();

		Response response = GetVideosForHomeEndPoints.createUser();

		response.then()
				// Verify that the response Content-Type is JSON
				.contentType("application/json")

				.log().all();

		// Validate JSON data using JSONPATH
		
		  JsonPath jsonView = response.jsonPath(); int id = jsonView.get("[1].id");
		  System.out.println("id " + id);
		  
		  Assert.assertEquals(id, 53372, "id verified");
		 

		// Validate the response status code
		Assert.assertEquals(response.getStatusCode(), 200, "Status code validation");

		// Validate the response body is not empty
		Assert.assertNotNull(response.getBody(), "Response body validation");

	}

}
