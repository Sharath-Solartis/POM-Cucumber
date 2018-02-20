package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class QuoteSummaryPage extends TestBase
{
	@FindBy(xpath = "*//button/span[contains(text(),'UNDERWRITER WORKSHEET')]")
	public WebElement uw_worksheet_button;
	
	TestBase qs = new TestBase();
	
	public QuoteSummaryPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_uwworksheetbtn()
	{
		qs.ClickElement(uw_worksheet_button);
	}
	public UWWorksheetPage QuoteSummary()
	{
		click_uwworksheetbtn();
		return new UWWorksheetPage();
	}
}