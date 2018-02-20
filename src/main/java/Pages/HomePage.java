package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//table//button/span[contains(text(),'Homeowners / Dwelling / Condo Quote')]")
	protected WebElement btnPLQuote;
	WebDriverWait wait = new WebDriverWait(driver, 30);
	TestBase home = new TestBase();
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_hodpbtn()
	{
	  home.ClickElement(btnPLQuote);
	}
	
	public AgencyPage Home() throws InterruptedException
	{
		click_hodpbtn();
		return new AgencyPage();
	}
}
