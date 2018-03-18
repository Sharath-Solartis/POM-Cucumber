package com.solartis.test.pom.pages.input;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class AgencyPage extends PomEventsMethodDefinition 
{

		@FindBy(xpath="id('AgencyForm:AgencyTile:Object__Agency__BusinessName_input')")
		@CacheLookup
		public WebElement agency_lookup;                                     
		@FindBy(xpath="//*[contains(text(),'Continue To Insured')]")
		@CacheLookup
		public WebElement insured_cont;
		@FindBy(xpath = "id('msgspan')")
	    @CacheLookup
	    public WebElement processing_load;
		
		FireEvent FireEventobject = new FireEvent();
						
		public AgencyPage()
		{
	    	PageFactory.initElements(driver, this);
		}
		private void click_lookup() throws POMEventException
		{
			FireEventobject.WaitElementClickable(agency_lookup);
		}
		private void pick_agency(String agency_code) throws POMEventException, InterruptedException
		{
			    FireEventobject.EnterText(agency_lookup, agency_code);
				Thread.sleep(5000);
				agency_lookup.sendKeys(Keys.ENTER);
		}
		
		private void cont_insured() throws POMEventException 
		{
            
            	FireEventobject.ClickElement(insured_cont);
			
		}
		
		public InsuredPage Agency(String agency_code, String test_data) throws POMPageException 
		{
			try 
			{
				click_lookup(); 
				pick_agency(agency_code);
				cont_insured();
				Thread.sleep(8000);
			}
			catch (POMEventException | InterruptedException e) 
			{
				try 
				{
					FireEventobject.takeScreenshot(test_data);
				} 
				catch (POMEventException e1) 
				{
					throw new POMPageException("Error in Taking ScreenShot in  Agency Page", e);
				}
				throw new POMPageException("Error in Agency Page", e);
			}
			return new InsuredPage();
		}

}
