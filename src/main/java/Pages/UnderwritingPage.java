package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;


public class UnderwritingPage extends TestBase
{
	
	@FindBy(xpath ="//*[contains(text(),'Continue To Carrier Selection')]\r\n" + "")
	public WebElement continue_to_csp;
	
	TestBase uw = new TestBase();
	
	public UnderwritingPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_cont_csp()
	{
		uw.ClickElement(continue_to_csp);
	}
	public CarrierSelectionPage uwpage1()
	{
		click_cont_csp();
		return new CarrierSelectionPage();
	}
}
