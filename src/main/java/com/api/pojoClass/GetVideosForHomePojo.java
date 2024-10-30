package com.api.pojoClass;

import java.util.ArrayList;
import java.util.List;

public class GetVideosForHomePojo {
	
	
	private String currentAcadYear;
	private String currentAcadMonth;
	private ArrayList<Integer> currentSemPSSId;
	
	
	
	
	public String getCurrentAcadYear() {
		return currentAcadYear;
	}
	public void setCurrentAcadYear(String currentAcadYear) {
		this.currentAcadYear = currentAcadYear;
	}
	public String getCurrentAcadMonth() {
		return currentAcadMonth;
	}
	public void setCurrentAcadMonth(String currentAcadMonth) {
		this.currentAcadMonth = currentAcadMonth;
	}
	public ArrayList<Integer> getCurrentSemPSSId() {
		return currentSemPSSId;
	}
	public void setCurrentSemPSSId(ArrayList<Integer> currentSemPSSIdList) {
		this.currentSemPSSId = currentSemPSSIdList;
	}
	
	
	
}
