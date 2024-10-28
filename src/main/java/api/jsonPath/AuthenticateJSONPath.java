package api.jsonPath;

import api.endpoints.AuthenticateEndPoint;
import api.pojoClass.GetVideosForHomePojo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthenticateJSONPath {
	
	
	public static void authenticateJSONPath() {
		
		Response authenticateResponse = AuthenticateEndPoint.authenticateResponse();
		GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();
		
		int currentSemPSSIdArr[] = authenticateResponse.path(".currentSemPSSId");
		
		String currentStudentAcadMonth = authenticateResponse.path(".currentAcadMonth");
		
		String currentStudentAcadYear = authenticateResponse.path(".currentAcadYear");
		
		getVideosForHomePojo.setCurrentAcadMonth(currentStudentAcadMonth);
		getVideosForHomePojo.setCurrentAcadYear(currentStudentAcadYear);
		getVideosForHomePojo.setCurrentSemPSSId(currentSemPSSIdArr);
		
	}
	
	
	
	

}
