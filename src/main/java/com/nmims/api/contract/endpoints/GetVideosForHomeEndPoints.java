package com.nmims.api.contract.endpoints;

import io.restassured.response.Response;

public interface GetVideosForHomeEndPoints {

	Response getVideosForHomeHeaderPost();

	Response getVideosForHomeMissingFields();

	Response getVideosForHomeInvalidPayload();

	Response getVideosForHomeEmptyPayload();

	Response getVideosForHomeHeaderDELETE();

	Response getVideosForHomeHeaderGet();

}
