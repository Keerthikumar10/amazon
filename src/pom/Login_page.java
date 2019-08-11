package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends Base_page {
	
	public Login_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errmsg;
	
	public void setUsername(String uname)
	{
		un.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}

		public void verifyErrmsg()
		{
			verifyElement(errmsg);
		}

}
