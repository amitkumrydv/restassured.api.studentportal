package com.nmims.api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nmims.api.endpoints.AuthenticateEndPointImpl;
import com.nmims.api.model.AuthenticationModel;




public class GetVideosForHomePayload {
	
	private static Logger logger = LoggerFactory.getLogger(GetVideosForHomePayload.class);
	public static AuthenticationModel payloadData = AuthenticateEndPointImpl.authenticationModel;

	public  static AuthenticationModel getVideosForHomePaloadData() {

	//	PayloadPojoComman payloadPojoComman = new PayloadPojoComman();
       try {
    	   payloadData.getCurrentAcadMonth();
    	   payloadData.getCurrentAcadYear();
    	   payloadData.getCurrentSemPSSId();
    	   
    	   String getmonth = payloadData.getCurrentAcadMonth();
    	   String getyesr = payloadData.getCurrentAcadYear();
    	  List< Integer> getpss = payloadData.getCurrentSemPSSId();
    	   System.out.println(" get video payload ---------> "+getmonth +" "+ getyesr+" "+getpss);

       }catch(Exception e) {
    	   logger.error("An error occurred while fetching payload data", e);
    	   
       }
       
	return payloadData;

}
	
	
	// Missing field payload
	public  static AuthenticationModel authenticateResponseForMissingFieldsPayload() {

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
