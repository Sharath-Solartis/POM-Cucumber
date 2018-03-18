package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class UnderwritingPage extends PomEventsMethodDefinition
{
	
	@FindBy(xpath ="//*[contains(text(),'Continue To Carrier Selection')]\r\n" + "")
	public WebElement continue_to_csp;
	
	FireEvent FireEventobject = new FireEvent();
	
	public UnderwritingPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_cont_csp() throws POMEventException
	{
		
			FireEventobject.ClickElement(continue_to_csp);
		
	}
	public CarrierSelectionPage uwpage1(String test_data) throws  POMPageException
	{
		try
		{
		click_cont_csp();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e);
			}
			throw new POMPageException("Error in Underwriting Page", e);
		}
		return new CarrierSelectionPage();
	}
}