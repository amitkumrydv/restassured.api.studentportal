package com.nmims.api.comman;

import org.hamcrest.Matchers;

import com.nmims.api.contract.validations.HeaderResponceValidation;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class HeaderValidationCommanImpl implements HeaderResponceValidation {

	//@formatter:off
	@Step("Validate Headers")
	@Override
	public void commonHeadersValidation(Response response) {
	  response.then()
		        .header(HeaderConstantsComman.CONTENT_TYPE, "application/json")
				.header(HeaderConstantsComman.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
				.header(HeaderConstantsComman.CONNECTION, Matchers.equalTo("keep-alive"))
                .header(HeaderConstantsComman.X_CONTENT_TYPE_OPTIONS, Matchers.equalTo("nosniff"))
                .header(HeaderConstantsComman.STRICT_TRANSPORT_SECURITY, Matchers.equalTo("max-age=31536000 ; includeSubDomains"))
                .header(HeaderConstantsComman.X_XSS_PROTECTION, Matchers.equalTo("1 ; mode=block"))
                .header(HeaderConstantsComman.REFERRER_POLICY, Matchers.equalTo("origin"));
	}

	@Step("Validate Headers")
	@Override
	public void authenticateHeadersValidation(Response response) {
      response.then()
		        .header(HeaderConstantsComman.CONTENT_TYPE, "application/json;charset=UTF-8")
				.header(HeaderConstantsComman.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
				.header(HeaderConstantsComman.CONNECTION, Matchers.equalTo("keep-alive"))
		        .header(HeaderConstantsComman.X_CONTENT_TYPE_OPTIONS, Matchers.equalTo("nosniff"))
		        .header(HeaderConstantsComman.STRICT_TRANSPORT_SECURITY, Matchers.equalTo("max-age=31536000 ; includeSubDomains"))
		        .header(HeaderConstantsComman.X_XSS_PROTECTION, Matchers.equalTo("1 ; mode=block"))
		        .header(HeaderConstantsComman.REFERRER_POLICY, Matchers.equalTo("origin"));
		
		
	}

	@Step("Validate Headers")
	@Override
	public void getVideosForHomeHeadersValidation(Response response) {

    response.then()
               .header(HeaderConstantsComman.CONTENT_TYPE, "application/json")
		       .header(HeaderConstantsComman.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
		       .header(HeaderConstantsComman.CONNECTION, Matchers.equalTo("keep-alive"))
               .header(HeaderConstantsComman.X_CONTENT_TYPE_OPTIONS, Matchers.equalTo("nosniff"))
               .header(HeaderConstantsComman.STRICT_TRANSPORT_SECURITY, Matchers.equalTo("max-age=31536000 ; includeSubDomains"))
               .header(HeaderConstantsComman.X_XSS_PROTECTION, Matchers.equalTo("1 ; mode=block"))
               .header(HeaderConstantsComman.REFERRER_POLICY, Matchers.equalTo("origin"));

	}

	
	//@formatter:on
}
