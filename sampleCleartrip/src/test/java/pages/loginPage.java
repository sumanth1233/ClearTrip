package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;

public class loginPage extends BasePage 
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	public loginPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	
	public void login(String usn,String pwd)
	{
		webActionUtil.enterKeys(username, usn);
		webActionUtil.enterKeys(password, pwd);
		webActionUtil.clickOnElement(loginButton);
		
	}

}
