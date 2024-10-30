package com.api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.api.endpoints.AuthenticateEndPoint;
import com.api.jsonPath.AuthenticateJSONPath;
import com.api.pojoClass.GetVideosForHomePojo;

import io.restassured.response.Response;

public class GetVideosForHomePaload {

	public  static GetVideosForHomePojo getVideosForHomePaloadData() {

		Response authenticateResponse = AuthenticateEndPoint.authenticateResponse();

		GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();

		String month = getVideosForHomePojo.getCurrentAcadMonth();
		getVideosForHomePojo.getCurrentAcadYear();
		getVideosForHomePojo.getCurrentSemPSSId();
		
		
		
		return getVideosForHomePojo;

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
