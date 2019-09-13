package scripts;

import generic.Excel;
import generic.Generic_Test;

import org.testng.annotations.Test;

import pom.Home_page;
import pom.Login_page;

public class VerifyActitimeVersion extends Generic_Test {

	@Test
	public void login()
	{
		String uname = Excel.getData("VerifyActitimeVersion", 1, 0);
		String pwd = Excel.getData("VerifyActitimeVersion", 1, 1);
		String lp_title = Excel.getData("VerifyActitimeVersion", 1, 2);
		String eversion = Excel.getData("VerifyActitimeVersion", 1, 3);
		Login_page lp=new Login_page(driver);
		
		lp.setUsername(uname);
		
		lp.setPassword(pwd);
		
		lp.clickLogin();
		
		Home_page hp=new Home_page(driver);
		
		hp.clickHelp();
		
		hp.clickAbt();
		
		hp.verifyVersion(eversion);
		
		hp.clickClose();
		
		hp.clickLogout();
		
		lp.verifyTitle(lp_title );
		
		System.out.println("hi");
	}
}
