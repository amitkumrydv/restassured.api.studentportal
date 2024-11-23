package com.nmims.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.contract.endpoints.CoursesWithPSSIdV2EndPoints;
import com.nmims.api.payload.AuthenticatePayload;
import com.nmims.api.payload.CoursesWithPSSIdV2Payload;
import com.nmims.api.utilities.ReadConfig;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CoursesWithPSSIdV2EndPointsImpl implements CoursesWithPSSIdV2EndPoints{

	//@formatter:off
	private static final Logger logger = LoggerFactory.getLogger(AuthenticatePayload.class);
	ReadConfig readConfig = new ReadConfig();
    CoursesWithPSSIdV2Payload  coursesWithPSSIdV2Payload = new CoursesWithPSSIdV2Payload();
    
    @Override
    public Response coursesWithPSSIdV2Resopons() {
		
		Response response = RestAssured.given()
				                             .contentType(ContentType.JSON)
				                             .accept(ContentType.JSON)
				                             .body(coursesWithPSSIdV2Payload.coursesWithPSSIdV2PayloadData())
				                       .when()
				                             .post(Routs.post_url_CoursesWithPSSIdV2);
				                       
	return response;
     }
	
	//@formatter:on
	  
}
