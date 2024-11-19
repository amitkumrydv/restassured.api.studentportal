package com.api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.endpoints.AuthenticateEndPoint;
import com.api.pojoClass.AuthenticationPojo;




public class GetVideosForHomePayload {
	
	private static Logger logger = LoggerFactory.getLogger(GetVideosForHomePayload.class);
	public static AuthenticationPojo payloadData = AuthenticateEndPoint.authenticationPojo;

	public  static AuthenticationPojo getVideosForHomePaloadData() {

	//	PayloadPojoComman payloadPojoComman = new PayloadPojoComman();
       try {
    	   payloadData.getCurrentAcadMonth();
    	   payloadData.getCurrentAcadYear();
    	   payloadData.getCurrentSemPSSId();

       }catch(Exception e) {
    	   logger.error("An error occurred while fetching payload data", e);
    	   
       }
       
	return payloadData;

}
	
	
	// Missing field payload
	public  static AuthenticationPojo authenticateResponseForMissingFieldsPayload() {

		//	PayloadPojoComman payloadPojoComman = new PayloadPojoComman();
	       try {
	    	   payloadData.getCurrentAcadMonth();
	       }catch(Exception e) {
	    	   logger.error("An error occurred while fetching payload data", e);
	    	   
	       }
	       
		return payloadData;

	}

	public String getVideosForHomePaloadJSON() throws FileNotFoundException {

		File file = new File(".\\JSON-Payload\\getVideoForHomepayload.json");

		FileReader fileReader = new FileReader(file);

		JSONTokener jSONTokener = new JSONTokener(fileReader);

		JSONObject JSONObject = new JSONObject(jSONTokener);

		String JSONObjectToString = JSONObject.toString();

		return JSONObjectToString;

	}

}
