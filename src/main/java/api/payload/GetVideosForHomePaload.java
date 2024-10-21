package api.payload;

import api.pojoClass.GetVideosForHomePojo;

public class GetVideosForHomePaload {
	
	
	
	public GetVideosForHomePojo getVideosForHomePaloadData() {
		
		GetVideosForHomePojo getVideosForHomePojo = new GetVideosForHomePojo();
		
		int currentSemPSSIdArr[] = {2549, 2550, 2551, 2552, 2553, 2554};
		
		getVideosForHomePojo.setCurrentAcadMonth("Jul");
		getVideosForHomePojo.setCurrentAcadYear("2024");
		getVideosForHomePojo.setCurrentSemPSSId(currentSemPSSIdArr);
		
		System.out.println("getVideosForHomePojo --> "+getVideosForHomePojo);
		return getVideosForHomePojo;
		
		
		
	}

}
