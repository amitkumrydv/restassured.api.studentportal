package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;

import api.payload.GetVideosForHomePaload;
import api.pojoClass.GetVideosForHomePojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	
	 
	
	

	public static Response createUser() {
		
		GetVideosForHomePaload getVideosForHomePaload = new GetVideosForHomePaload();
		
		// Using String formate
		/*
		String payload = "{\n" +
			    "  \"currentAcadMonth\": \"Jul\",\n" +
			    "  \"currentAcadYear\": \"2024\",\n" +
			    "  \"currentSemPSSId\": [2549, 2550, 2551, 2552, 2553, 2554]\n" +
			    "}";
		
		*/
		
		
		//Payload using map
	/*	
		int currentSemPSSIdArr[] = {2549, 2550, 2551, 2552, 2553, 2554};
		HashMap payloadData = new HashMap<>();
		
		payloadData.put("currentAcadMonth", "Jul");
		payloadData.put("currentAcadYear", "2024");
        payloadData.put("currentSemPSSId", currentSemPSSIdArr);
        */
        
		
        //Payload using JSONOBJECT (org.json library )
	/*	
		int currentSemPSSIdArr[] = {2549, 2550, 2551, 2552, 2553, 2554};
        JSONObject jsonPayloadData = new JSONObject();
        
        jsonPayloadData.put("currentAcadMonth", "Jul");
        jsonPayloadData.put("currentAcadYear", "2024");
        jsonPayloadData.put("currentSemPSSId", currentSemPSSIdArr);
        
		*/
		
		
         
		
		
		
 
        //Request body
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(getVideosForHomePaload.getVideosForHomePaloadData())

			.when().post(Routs.post_url);

		return response;
	}
	
	
// Validate JSON
	
	
	

	
}
