package com.api.jsonPath;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.endpoints.AuthenticateEndPoint;
import com.api.pojoClass.AuthenticationPojo;

import io.restassured.response.Response;

public class AuthenticateJSONPath {
	

	private static final Logger logger = LoggerFactory.getLogger(AuthenticateJSONPath.class);

    /*
     * 1. This method is used to read the response of the 
     *    authenticateResponse().
     * 2. Read the response fields using JSONPath and log values.
     */
    public static AuthenticationPojo authenticateJSONPath() {

        logger.info("Starting authentication JSON path process.");

        // Call authenticate endpoint
        Response authenticateResponse = AuthenticateEndPoint.authenticateResponseForPOST();
        
        if (authenticateResponse == null) {
            logger.error("Received null response from authenticate endpoint.");
            return null;
        }
        
        logger.debug("Authenticate response received: {}", authenticateResponse.asString());

        // Initialize GetVideosForHomePojo object
        AuthenticationPojo getVideosForHomePojo = new AuthenticationPojo();

        // Extract and log current academic month
        String currentStudentAcadMonth = authenticateResponse.path("currentAcadMonth");
        logger.info("Current Academic Month retrieved: {}", currentStudentAcadMonth);
        
        // Extract and log current academic year
        String currentStudentAcadYear = authenticateResponse.path("currentAcadYear");
        logger.info("Current Academic Year retrieved: {}", currentStudentAcadYear);
        
        // Set values in the GetVideosForHomePojo object
        getVideosForHomePojo.setCurrentAcadMonth(currentStudentAcadMonth);
        getVideosForHomePojo.setCurrentAcadYear(currentStudentAcadYear);

        // Extract current semester PSS IDs list
        ArrayList<Integer> currentSemPSSIdList = authenticateResponse.path("currentSemPSSId");
        
        if (currentSemPSSIdList != null && !currentSemPSSIdList.isEmpty()) {
            logger.info("Current Semester PSS ID list retrieved: {}", currentSemPSSIdList);
        } else {
            logger.warn("Current Semester PSS ID list is null or empty.");
        }

        // Set PSS ID list in GetVideosForHomePojo object
        getVideosForHomePojo.setCurrentSemPSSId(currentSemPSSIdList);

        logger.info("Authentication JSON path process completed successfully.");
        
        return getVideosForHomePojo;
    }
}
	
