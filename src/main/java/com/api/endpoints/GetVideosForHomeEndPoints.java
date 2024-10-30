package com.api.endpoints;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.json.JSONObject;

import com.api.jsonPath.AuthenticateJSONPath;
import com.api.payload.GetVideosForHomePaload;
import com.api.pojoClass.GetVideosForHomePojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetVideosForHomeEndPoints {
	
	 
	
	

	public static Response createUser() {

		
        //Request body
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(AuthenticateJSONPath .authenticateJSONPath())

			.when().post(Routs.post_url_getVideosForHome);

		return response;
	}
	
	
// Validate JSON
	
	
	

	
}
