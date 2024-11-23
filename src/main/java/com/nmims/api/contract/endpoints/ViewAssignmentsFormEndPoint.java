package com.nmims.api.contract.endpoints;

import io.restassured.response.Response;

public interface ViewAssignmentsFormEndPoint {

	public Response viewAssignmentsFormEndPointHeaderPost();

	public Response viewAssignmentsFormEndPointHeaderGET();

	public Response viewAssignmentsFormEndPointHeaderDELETE();

	public Response viewAssignmentsFormEmptyPayload();

	public Response viewAssignmentsFormInvalidPayload();

}
