package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;

public class viewTimeTrackPage extends BasePage 
{
	
	@FindBy(xpath = "//td[contains(text(),'Export to PDF')]")
	private WebElement exportToPDFButton;
	
	@FindBy(xpath = "//span[text()='Download PDF']")
	private WebElement downloadPDFButton;

	public viewTimeTrackPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}
	
	
	public void clickOnExportToPDF()
	{
		webActionUtil.clickOnElement(exportToPDFButton);
	}
	
	public void clickOnDownloadPDF()
	{
		webActionUtil.clickOnElement(downloadPDFButton);
	}

}
