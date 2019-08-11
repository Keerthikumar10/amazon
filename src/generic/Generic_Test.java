package generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_Test implements Auto_const{
	public WebDriver driver;
	static
	{
		System.setProperty(gecko_key, gecko_value);
		System.setProperty(chrome_key, chrome_value);
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void openAppn(String browser)
	{
		if(browser.equals("firefox"))
		{
	driver=new FirefoxDriver();
	driver.get("http://localhost/login.do;jsessionid=gh2dk6od0s818");
		}
	else
	{
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do;jsessionid=gh2dk6od0s818");
	}
		
	}
	
	@AfterMethod
	public void closeAppn(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			ScreenShot.getPhoto();
		}
		driver.quit();
	}

}
