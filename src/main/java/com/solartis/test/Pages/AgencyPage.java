package com.solartis.test.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.pom.common.CommonInputMethods;

public class AgencyPage extends CommonInputMethods {

		@FindBy(xpath="id('AgencyForm:AgencyTile:Object__Agency__BusinessName_input')")
		@CacheLookup
		public WebElement agency_lookup;                                     
		@FindBy(xpath="//*[contains(text(),'Continue To Insured')]")
		@CacheLookup
		public WebElement insured_cont;
		@FindBy(xpath = "id('msgspan')")
	    @CacheLookup
	    public WebElement processing_load;
		
		CommonInputMethods agency = new CommonInputMethods();
		
		public AgencyPage()
		{
	    	PageFactory.initElements(driver, this);
		}
		private void click_lookup()
		{
			agency.WaitElementClickable(agency_lookup);
		}
		private void pick_agency(String agency_code) throws InterruptedException
		{
			agency.EnterText(agency_lookup, agency_code);
			Thread.sleep(5000);
			agency_lookup.sendKeys(Keys.ENTER);
		}
		
		private void cont_insured()
		{
            agency.ClickElement(insured_cont);
		}
		
		public InsuredPage Agency(String agency_code) throws InterruptedException
		{
			click_lookup();
			pick_agency(agency_code);
			cont_insured();
			Thread.sleep(8000);
			return new InsuredPage();
			/*wait.until(ExpectedConditions.elementToBeClickable(agency_lookup));
			agency_lookup.sendKeys(agency_code);
			Thread.sleep(5000);
			agency_lookup.sendKeys(Keys.ENTER);
			insured_cont.click();
			Thread.sleep(8000);
			return new InsuredPage();*/
		}

}
