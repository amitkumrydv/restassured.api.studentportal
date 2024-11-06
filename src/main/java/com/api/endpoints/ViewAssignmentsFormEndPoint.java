package com.api.endpoints;

import com.api.payload.ViewAssignmentsFormPayload;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ViewAssignmentsFormEndPoint {

	//@formatter:off
	public static Response viewAssignmentsFormEndPointHeaderPost() {
		
		ViewAssignmentsFormPayload viewAssignmentsFormPayload = new ViewAssignmentsFormPayload();
		
		Response response = RestAssured.given()
				                  .header("Content-Type", "application/json")				                 
				                  .body(viewAssignmentsFormPayload.viewAssignmentsFormData())
				           .when()
				                  .post(Routs.post_url_viewAssignmentsForm);
		
		
		return response;
	}
	//@formatter:on
	

}
