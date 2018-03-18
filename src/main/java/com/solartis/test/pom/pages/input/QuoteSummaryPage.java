package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class QuoteSummaryPage extends PomEventsMethodDefinition
{
	@FindBy(xpath = "*//button/span[contains(text(),'UNDERWRITER WORKSHEET')]")
	public WebElement uw_worksheet_button;
	
	FireEvent FireEventobject = new FireEvent();
	
	public QuoteSummaryPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_uwworksheetbtn() throws POMEventException
	{
			FireEventobject.ClickElement(uw_worksheet_button);
	}
	public UWWorksheetPage QuoteSummary(String test_data) throws  POMPageException
	{
		try
		{
		click_uwworksheetbtn();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in QuoteSummary Page", e);
			}
			throw new POMPageException("Error in QuoteSummary Page", e);
		}
		return new UWWorksheetPage();
	}
}