package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Home_page extends Base_page {
	
	public Home_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement abtActitime;
	
	@FindBy(xpath="//span[contains(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement close;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public void clickLogout()
	{
		logout.click();
	}
	
	public void clickAbt()
	{
		abtActitime.click();
	}
	
	public void clickClose()
	{
		close.click();
	}
	
	public void clickHelp()
	{
		help.click();
	}
	
	public void verifyVersion(String eversion)
	{
		String aversion = version.getText();
		try
		{
		Assert.assertEquals(aversion, eversion);
		Reporter.log("version  matching",true);
		}
		catch(Exception e)
		{
		Reporter.log("version not matching",true);
		}
	}
	

}
