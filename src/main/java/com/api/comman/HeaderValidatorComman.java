package com.api.comman;

import org.hamcrest.Matchers;

import com.api.response.validation.HeaderResponceValidation;

import io.restassured.response.Response;

public class HeaderValidatorComman implements HeaderResponceValidation {

	//@formatter:off
	@Override
	public void commonHeadersValidation(Response response) {
	  response.then()
		        .header(HeaderConstants.CONTENT_TYPE, "application/json")
				.header(HeaderConstants.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
				.header(HeaderConstants.CONNECTION, Matchers.equalTo("keep-alive"))
                .header(HeaderConstants.X_CONTENT_TYPE_OPTIONS, Matchers.equalTo("nosniff"))
                .header(HeaderConstants.STRICT_TRANSPORT_SECURITY, Matchers.equalTo("max-age=31536000 ; includeSubDomains"))
                .header(HeaderConstants.X_XSS_PROTECTION, Matchers.equalTo("1 ; mode=block"))
                .header(HeaderConstants.REFERRER_POLICY, Matchers.equalTo("origin"));
	}

	@Override
	public void authenticateHeadersValidation(Response response) {
      response.then()
		        .header(HeaderConstants.CONTENT_TYPE, "application/json;charset=UTF-8")
				.header(HeaderConstants.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
				.header(HeaderConstants.CONNECTION, Matchers.equalTo("keep-alive"))
		        .header(HeaderConstants.X_CONTENT_TYPE_OPTIONS, Matchers.equalTo("nosniff"))
		        .header(HeaderConstants.STRICT_TRANSPORT_SECURITY, Matchers.equalTo("max-age=31536000 ; includeSubDomains"))
		        .header(HeaderConstants.X_XSS_PROTECTION, Matchers.equalTo("1 ; mode=block"))
		        .header(HeaderConstants.REFERRER_POLICY, Matchers.equalTo("origin"));
		
		
	}

	@Override
	public void getVideosForHomeHeadersValidation(Response response) {

    response.then()
               .header(HeaderConstants.CONTENT_TYPE, "application/json")
		       .header(HeaderConstants.CACHE_CONTROL, Matchers.equalTo("no-cache, no-store, max-age=0, must-revalidate"))
		       .header(HeaderConstants.CONNECTION, Matchers.equalTo("keep-alive"))
               .header(HeaderConstants.X_CONTENT_TYPE_OPTIONS, Matchers.equalTo("nosniff"))
               .header(HeaderConstants.STRICT_TRANSPORT_SECURITY, Matchers.equalTo("max-age=31536000 ; includeSubDomains"))
               .header(HeaderConstants.X_XSS_PROTECTION, Matchers.equalTo("1 ; mode=block"))
               .header(HeaderConstants.REFERRER_POLICY, Matchers.equalTo("origin"));

	}

	
	//@formatter:on
}
