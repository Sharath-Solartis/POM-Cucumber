package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LocationPage extends TestBase {

	@FindBy(xpath = "id('locations:LocationListTile:Object__Risk__ResProperty__IsRiskAddressSameAsInsured_input')/div[contains(.,'Yes')]/span")
	public WebElement loc_addr_yes;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ProtectionClass")
	public WebElement prot_class;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__StoriesNum1")
	public WebElement no_of_stories;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__SquareFeet")
	public WebElement square_feet;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__DateBuilt")
	public WebElement year_built;
	@FindBy(id = "locations:LocationListTile:LossForm:NumberofLosses")
	public WebElement no_of_losses;
	@FindBy(xpath = "id('locations:LocationListTile:LocationSaveButton')")
	public WebElement location_save;
	@FindBy(xpath = "id('locations:PLMLContinueToUWButton')")
	public WebElement continue_uw;
	@FindBy(xpath = "id('msgspan')")
	public WebElement processing_load;
	@FindBy(xpath = "id('j_idt3824')")
	public WebElement processing_load1;
	
	TestBase location = new TestBase();

	public LocationPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loc_addr()
	{
		location.ClickElement(loc_addr_yes);
	}
	
	public void select_protclass(String protection_class)
	{
		location.Dropdown(prot_class, protection_class);
	}
	
	public void select_no_stories(String number_of_stories)
	{
		location.Dropdown(no_of_stories, number_of_stories);
	}
	
	/*public void enter_sqft(String )
	{
		location.EnterText(square_feet, value);
	}
	
	public void enter_yearbuilt(String )
	{
		location.EnterText(year_built, value);
	}*/
	
	public void select_no_losses(String number_loss)
	{
		location.Dropdown(no_of_losses, number_loss);
	}
	
	public void click_save()
	{
		location.ClickElement(location_save);
	}
	
	public void click_cont_uw()
	{
		location.ClickElement(continue_uw);
	}

	public UnderwritingPage Location(String protection_class, String number_of_stories, String number_loss)throws InterruptedException 
	{
		loc_addr();
		location.ProcessingLoad();
		select_protclass(protection_class);
		Thread.sleep(5000);
		select_no_stories(number_of_stories);
		square_feet.sendKeys("2300");
		year_built.sendKeys("2015");
		select_no_losses(number_loss);
		Thread.sleep(3000);
		click_save();
		Thread.sleep(10000);
		click_cont_uw();
		location.ProcessingLoad();
		return new UnderwritingPage();
		/*Thread.sleep(15000);
		Select dropdown = new Select(prot_class);
		Thread.sleep(7000);
		dropdown.selectByVisibleText(protection_class);
		Thread.sleep(7000);
		Select dropdown1 = new Select(no_of_stories);
		dropdown1.selectByVisibleText(number_of_stories);
		square_feet.sendKeys("2300");
		year_built.sendKeys("2015");
		Select dropdown2 = new Select(no_of_losses);
		Thread.sleep(5000);
		dropdown2.selectByVisibleText(number_loss);
		Thread.sleep(5000);
		location_save.click();
		Thread.sleep(10000);
		continue_uw.click();
		return new UnderwritingPage();*/
	}
}
