package testcases;

import org.testng.annotations.Test;
import pages.homePage;
import pages.viewTimeTrackPage;

public class TC004 extends BaseTest
{
	@Test
	public void selectuser()
	{
		homePage homePage=new homePage(driver, webActionUtil);
		viewTimeTrackPage viewTT=homePage.clickOnViewTimeTrackPage();
		
		viewTT.clickOnExportToPDF();
		viewTT.clickOnDownloadPDF();
    }
  }
		
