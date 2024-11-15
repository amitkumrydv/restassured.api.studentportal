package com.api.endpoints;

import static io.restassured.RestAssured.given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.jsonPath.AuthenticateJSONPath;
import com.api.payload.GetVideosForHomePayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetVideosForHomeEndPoints {
	
	
	//@formatter:off
	private static Logger logger = LoggerFactory.getLogger(GetVideosForHomeEndPoints.class);

	public static Response getVideosForHomeHeaderPost() {
        logger.info("Sending POST request to get videos for home header");

        // Request body
        Response response = given()
                             .contentType(ContentType.JSON)
                             .accept(ContentType.JSON)
                             .body(GetVideosForHomePayload.getVideosForHomePaloadData())
                           .when()
                             .post(Routs.post_url_getVideosForHome);

        logger.info("Received response with status code: " + response.statusCode());


        return response;
    }

    public static Response getVideosForHomeHeaderGet() {
        logger.info("Sending GET request to get videos for home header");

        // Request body
        Response response = given()
                             .contentType(ContentType.JSON)
                             .accept(ContentType.JSON)
                             .body(AuthenticateJSONPath.authenticateJSONPath())
                           .when()
                             .get(Routs.post_url_getVideosForHome);

        logger.info("Received response with status code: " + response.statusCode());
        logger.debug("Response body: " + response.getBody().asString());

        return response;
    }

    public static Response getVideosForHomeHeaderDELETE() {
        logger.info("Sending DELETE request to get videos for home header");

        // Request body
        Response response = given()
                             .contentType(ContentType.JSON)
                             .accept(ContentType.JSON)
                             .body(AuthenticateJSONPath.authenticateJSONPath())
                           .when()
                             .delete(Routs.post_url_getVideosForHome);

        logger.info("Received response with status code: " + response.statusCode());
        logger.debug("Response body: " + response.getBody().asString());

        return response;
    }
}
	
	

	
