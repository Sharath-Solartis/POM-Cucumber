package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class HomePage extends PomEventsMethodDefinition {
	
	@FindBy(xpath="//table//button/span[contains(text(),'Homeowners / Dwelling / Condo Quote')]")
	protected WebElement btnPLQuote;
	WebDriverWait wait = new WebDriverWait(driver, 30);

	FireEvent FireEventobject = new FireEvent();
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_hodpbtn() throws POMEventException 
	{
	  
		  FireEventobject.ClickElement(btnPLQuote);
	  
	}
	
	public AgencyPage Home(String test_data) throws  POMPageException
	{
		try
		{
		click_hodpbtn();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Home Page", e);
			}
			throw new POMPageException(" Error in Home Page ", e);
		}
		return new AgencyPage();
	}
}
