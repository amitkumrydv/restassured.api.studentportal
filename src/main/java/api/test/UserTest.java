package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import io.restassured.response.Response;

public class UserTest {


	
    @Test
	public void testPostUser() {
		
		

		Response response = UserEndPoints.createUser();

		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

	}

	
}
