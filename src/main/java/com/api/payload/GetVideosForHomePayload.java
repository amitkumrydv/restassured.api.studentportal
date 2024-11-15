package com.api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.comman.PayloadPojoComman;




public class GetVideosForHomePayload {
	
	private static Logger logger = LoggerFactory.getLogger(GetVideosForHomePayload.class);

	public  static PayloadPojoComman getVideosForHomePaloadData() {

		PayloadPojoComman payloadPojoComman = new PayloadPojoComman();
       try {
		payloadPojoComman.getCurrentAcadMonth();
		payloadPojoComman.getCurrentAcadYear();
		payloadPojoComman.getCurrentSemPSSId();

       }catch(Exception e) {
    	   logger.error("An error occurred while fetching payload data", e);
    	   
       }
       
	return payloadPojoComman;

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
