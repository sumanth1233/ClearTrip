package testcases;

import org.testng.annotations.Test;

import pages.homePage;

public class TC002 extends BaseTest 
{
	
	@Test
	public void addTaskfromRecentTasks()
	{
		homePage home=new homePage(driver, webActionUtil);
		home.clickOnAddRecentTask();
		home.clickOnTask();
	}
}
