package com.nmims.api.contract.endpoints;

import io.restassured.response.Response;

public interface GetVideosForHomeEndPoints {

	public Response getVideosForHomeHeaderPost();

	public Response getVideosForHomeMissingFields();

	public Response getVideosForHomeInvalidPayload();

	public Response getVideosForHomeEmptyPayload();

	public Response getVideosForHomeHeaderDELETE();

	public Response getVideosForHomeHeaderGet();

}
