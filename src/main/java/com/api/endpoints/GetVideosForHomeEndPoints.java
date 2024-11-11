package com.api.endpoints;

import static io.restassured.RestAssured.given;
import com.api.jsonPath.AuthenticateJSONPath;
import com.api.payload.GetVideosForHomePaload;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetVideosForHomeEndPoints {

	public static Response getVideosForHomeHeaderPost() {

		// @formatter:off
        //Request body
		Response response = given()
				                 .contentType(ContentType.JSON)
				                 .accept(ContentType.JSON)
				                 .body(GetVideosForHomePaload.getVideosForHomePaloadData())

			               .when()
			                    .post(Routs.post_url_getVideosForHome);

		return response;
	}
	
	
   public static Response getVideosForHomeHeaderGet() {

		
        //Request body
		Response response = given()
				                 .contentType(ContentType.JSON)
				                 .accept(ContentType.JSON)
				                 .body(AuthenticateJSONPath .authenticateJSONPath())

			              .when()
			                    .get(Routs.post_url_getVideosForHome);

		return response;
	}
	
	
	

	
}
