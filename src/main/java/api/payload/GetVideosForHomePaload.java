package api.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import api.pojoClass.GetVideosForHomePojo;

public class GetVideosForHomePaload {

	public GetVideosForHomePojo getVideosForHomePaloadData() {

		GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();

		int currentSemPSSIdArr[] = { 2549, 2550, 2551, 2552, 2553, 2554 };

		getVideosForHomePojo.setCurrentAcadMonth("Jul");
		getVideosForHomePojo.setCurrentAcadYear("2024");
		getVideosForHomePojo.setCurrentSemPSSId(currentSemPSSIdArr);

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
