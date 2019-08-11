package scripts;

import generic.Excel;
import generic.Generic_Test;

import org.testng.annotations.Test;

import pom.Login_page;

public class InvalidLogin extends Generic_Test {

	@Test
	public void login()
	{
		String uname = Excel.getData("InvalidLogin", 1, 0);
		String pwd = Excel.getData("InvalidLogin", 1, 1);
		String lp_title = Excel.getData("InvalidLogin", 1, 2);
		Login_page lp=new Login_page(driver);
		
		lp.setUsername(uname);
		
		lp.setPassword(pwd);
		
		lp.clickLogin();
		
		lp.verifyErrmsg();
		
		lp.verifyTitle(lp_title);
		
	}
}
