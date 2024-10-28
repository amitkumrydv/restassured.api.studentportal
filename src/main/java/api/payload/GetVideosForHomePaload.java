package api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import api.endpoints.AuthenticateEndPoint;
import api.jsonPath.AuthenticateJSONPath;
import api.pojoClass.GetVideosForHomePojo;
import io.restassured.response.Response;

public class GetVideosForHomePaload {

	public GetVideosForHomePojo getVideosForHomePaloadData() {
		
		Response authenticateResponse = AuthenticateEndPoint.authenticateResponse();

		GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();

		

		getVideosForHomePojo.getCurrentAcadMonth();
		getVideosForHomePojo.getCurrentAcadYear();
		getVideosForHomePojo.getCurrentSemPSSId();

		System.out.println("getVideosForHomePojo --> " + getVideosForHomePojo);
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
