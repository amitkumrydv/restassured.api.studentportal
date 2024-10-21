package api.pojoClass;

import java.util.List;

public class GetVideosForHomePojo {
	
	
	private String currentAcadYear;
	private String currentAcadMonth;
	private int[] currentSemPSSId;
	
	
	
	
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
	public int[] getCurrentSemPSSId() {
		return currentSemPSSId;
	}
	public void setCurrentSemPSSId(int[] currentSemPSSIdArr) {
		this.currentSemPSSId = currentSemPSSIdArr;
	}
	
	
	
}
