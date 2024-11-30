package com.nmims.api.comman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.util.Assert;
import com.nmims.api.endpoints.AuthenticateEndPointImpl;
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.StudentModel;
import com.nmims.api.response.mapper.AuthenticateMapper;

import io.restassured.response.Response;
import junit.framework.TestListener;

public class ResponseContainerComman {

	private Logger logger = LoggerFactory.getLogger(ResponseContainerComman.class);
	public StudentModel studentData = AuthenticateMapper.studentModel;
	public AuthenticationModel getDataFromResponse = AuthenticateMapper.authenticationModel;

	public AuthenticationModel programValidityEndDate() {
		getDataFromResponse.getValidityEndDate();
		Assert.notNull(getDataFromResponse, "Program validity End Date Empty.");
		return getDataFromResponse;

	}

	public String isProgramCleared() {
		String programCleared = studentData.getProgramCleared();
		logger.info("isProgramCleared: {}", programCleared);
		return programCleared;
	}

}
