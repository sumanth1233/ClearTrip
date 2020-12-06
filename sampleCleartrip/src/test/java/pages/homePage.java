package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;

public class homePage extends BasePage 
{
	
	@FindBy(linkText = "View Time-Track")
	private WebElement viewTimeTrackPageLink;
	
	@FindBy(id="loginButton")
	private WebElement logoutLink;
	
	@FindBy(id = "addTaskButtonId")
	private WebElement createNewTaskLink;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropdown;
	
	@FindBy(xpath = "//div[text()='- New Customer -']")
	private WebElement selectNewCustomer;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Customer Name\"]")
	private WebElement CustomerNameTextField;
	
	@FindBy(xpath="//span[text()='Add Recent Task']")
	private WebElement AddTaskFromRecentLink;
	
	@FindBy(xpath="//span[text()='Meetings']")
	private WebElement selectTask;
	
	public homePage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	
	public void clickOnAddRecentTask()
	{
		webActionUtil.clickOnElement(AddTaskFromRecentLink);
	}
	
	public void clickOnTask()
	{
		webActionUtil.clickOnElement(selectTask);
	}
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}
	
	public viewTimeTrackPage clickOnViewTimeTrackPage()
	{
		webActionUtil.clickOnElement(viewTimeTrackPageLink);
		return null;
	}

}
