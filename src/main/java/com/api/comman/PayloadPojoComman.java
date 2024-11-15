package com.api.comman;

import java.util.ArrayList;

public class PayloadPojoComman {
	
	// using for paylod
	private String sapId;
	private String currentAcadYear;
	private String currentAcadMonth;
	private ArrayList<Integer> currentSemPSSId;
	
	
	public String getSapId() {
		return sapId;
	}
	public void setSapId(String sapId) {
		this.sapId = sapId;
	}
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
	public void setCurrentSemPSSId(ArrayList<Integer> currentSemPSSId) {
		this.currentSemPSSId = currentSemPSSId;
	}
	
	
	
	

}
