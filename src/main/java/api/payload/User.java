package api.payload;

import java.util.List;

public class User {
	
	
	private String currentAcadYear;
	private String currentAcadMonth;
	private List<String> currentSemPSSId;
	
	
	
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
	public List<String> getCurrentSemPSSId() {
		return currentSemPSSId;
	}
	public void setCurrentSemPSSId(List<String> currentSemPSSId) {
		this.currentSemPSSId = currentSemPSSId;
	}

}
