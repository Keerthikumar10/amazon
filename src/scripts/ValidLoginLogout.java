package scripts;

import generic.Excel;
import generic.Generic_Test;

import org.testng.annotations.Test;

import pom.Login_page;

public class ValidLoginLogout extends Generic_Test{
	
	@Test
	public void login()
	{
		String uname = Excel.getData("ValidLoginLogout", 1, 0);
		String pwd = Excel.getData("ValidLoginLogout", 1, 1);
		String hp_title = Excel.getData("ValidLoginLogout", 1, 2);
		Login_page lp=new Login_page(driver);
		
		lp.setUsername(uname);
		
		lp.setPassword(pwd);
		
		lp.clickLogin();
		
		lp.verifyTitle(hp_title);
		
		System.out.println("Keerthi Kumar");
		
	}

}
