package com.nmims.api.contract.endpoints;

import io.restassured.response.Response;

public interface ViewAssignmentsFormEndPoint {

	Response viewAssignmentsFormEndPointHeaderPost();

	Response viewAssignmentsFormEndPointHeaderGET();

	Response viewAssignmentsFormEndPointHeaderDELETE();

	Response viewAssignmentsFormEmptyPayload();

	Response viewAssignmentsFormInvalidPayload();

}
