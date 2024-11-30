package com.nmims.api.Listener;

import com.nmims.api.ListenerImpl.CommanListnerImpl;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class CommanListner  implements CommanListnerImpl{
	
	  @Step("Logging skip reason: {reason}")
	  @Override
	    public void logSkipReason(String reason) {
	        Allure.addAttachment("Skip Reason", reason);
	    }


}
