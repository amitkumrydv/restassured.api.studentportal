package com.api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.api.endpoints.AuthenticateEndPoint;
import com.api.jsonPath.AuthenticateJSONPath;
import com.api.pojoClass.AuthenticationPojo;
import com.api.pojoClass.CommanPojo;
import com.api.pojoClass.GetVideosForHomePojo;

import io.restassured.response.Response;

public class GetVideosForHomePaload {

	public  static AuthenticationPojo getVideosForHomePaloadData() {

		AuthenticationPojo AuthenticationPojo = CommanPojo.getAuthenticationPojo();

	//	GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();

		String month = AuthenticationPojo.getCurrentAcadMonth();
		System.out.println("month ---------------------"+month);
		AuthenticationPojo.getCurrentAcadYear();
		AuthenticationPojo.getCurrentSemPSSId();
		
		
		
		return AuthenticationPojo;

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
