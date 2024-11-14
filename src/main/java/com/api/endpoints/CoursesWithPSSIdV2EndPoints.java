package com.api.endpoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CoursesWithPSSIdV2EndPoints {
	


	public static Response coursesWithPSSIdV2Resopons() {
		
		Response response = RestAssured.given()
				                             .contentType(ContentType.JSON)
				                             .accept(ContentType.JSON)
				                             .body(null)
				                       .when()
				                             .post(Routs.post_url_CoursesWithPSSIdV2);
				                       
		
	
		
		
		
		
		return null;
		
		
	}
	  
}
