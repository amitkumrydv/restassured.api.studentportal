package api.responce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class GetVideosForHomeResponse {
	
	
	public static String getVideosForHomeResponse() throws FileNotFoundException {

		File file = new File(".\\DataFile\\GetVideosForHomeResponse.json");



		FileReader fileReader = new FileReader(file);

		JSONTokener jSONTokener = new JSONTokener(fileReader);

		JSONObject JSONObject = new JSONObject(fileReader);

		String JSONObjectToString = JSONObject.toString();

		return JSONObjectToString;

	}

}
