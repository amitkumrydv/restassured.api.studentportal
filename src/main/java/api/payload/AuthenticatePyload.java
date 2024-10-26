package api.payload;

import api.pojoClass.AuthenticationPojo;
import api.utilities.ReadConfig;

public class AuthenticatePyload {
	
	AuthenticationPojo  authenticationPojo;
	
	
	public AuthenticationPojo authenticatePyloadData() {
		ReadConfig readConfig = new ReadConfig();
		AuthenticationPojo  authenticationPojo = new AuthenticationPojo();
		
		authenticationPojo.setUserId("77221782653");
		authenticationPojo.setPassword("admin@ngasce20");
		
		return authenticationPojo;
		
	}

}
