package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class CarrierSelectionPage extends TestBase
{
	static int tablerow = 0;
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:PFormsRepeat:0:Object__Policy__PolicyForm__Repeat:0')")
	public WebElement HO3_BRDP1_VDP1_HO6_radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:1:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement HO5_BRDP3_VDP3_radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:2:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement HO8_radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:3:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement DP1_radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:4:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement DP3_radiobtn;
	@FindBy(id ="ProductSelectionFormPage:carrierTile:GetratesButton")
	public WebElement Get_Rates;
	@FindBy(xpath ="id('topgrid')/tbody/tr[1]/td//a")
	public List<WebElement> carriers;
	
	TestBase cs = new TestBase();
	
	public CarrierSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void select_HO3_BRDP1_VDP1_HO6()
	{
		cs.ClickElement(HO3_BRDP1_VDP1_HO6_radiobtn);
	}
	
	public void select_HO5_BRDP3_VDP3()
	{
		cs.ClickElement(HO5_BRDP3_VDP3_radiobtn);
	}
	
	public void select_HO8()
	{
		cs.ClickElement(HO8_radiobtn);
	}
	
	public void select_DP1()
	{
		cs.ClickElement(DP1_radiobtn);
	}
	
	public void select_DP3()
	{
		cs.ClickElement(DP3_radiobtn);
	}
	
	public void click_getRates()
	{
		cs.WaitElementClickable(Get_Rates);
		cs.ClickElement(Get_Rates);
	}
	
	public QuoteSummaryPage CarrierSelection(String policy_form, String carrier_name) throws InterruptedException
	{
		cs.ProcessingLoad();
		Thread.sleep(30000);
		if(policy_form.equals("HO3"))
		{
			select_HO3_BRDP1_VDP1_HO6();
		}
		else if(policy_form.equals("DP3"))
		{
			select_DP3();	
		}
		
		click_getRates();
		System.out.println("Carrier Names :"+carriers.get(0).getText());
		for( int i=0; i<carriers.size(); i++)
		{
			if((((WebElement) carriers.get(i)).getText()).equals(carrier_name))
	    	{
				tablerow =i+1;
				Thread.sleep(20000);
				driver.findElement(By.xpath("id('topgrid')/tbody/tr[5]/td["+tablerow+"]//span//span/button")).click();
	    	}
		}
		return new QuoteSummaryPage();
	}
}
