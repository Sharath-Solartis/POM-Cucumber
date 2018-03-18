package com.solartis.test.pom.pages.input;


import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class UWWorksheetPage extends PomEventsMethodDefinition 
{
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Base Wind Rate')]/../td[2]")
	public WebElement base_w_rate;
	@FindBy(xpath = "*//div/span[contains(text(),'UNDERWRITER WORKSHEET')]/../a")
	public WebElement UW_Sheet_Close;
	
	public UWWorksheetPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	FireEvent FireEventobject = new FireEvent();
	
	public boolean BaseRateCheck(String base_wind_rate) throws InterruptedException
	{
		//DBop DBobject = new DBop();
		boolean result;
		Thread.sleep(3000);
		System.out.println("WBasreate :" + base_w_rate.getText());
		if (base_w_rate.getText().equals(base_wind_rate)) 
		{
			//DBobject.callDB("Base_Rate",base_w_rate.getText());
			result = true;
		}
		else 
		{
			result = false;
		}
		System.out.println("Result is :"+result);
		return result;
	}
	
	public void UWsheetClose() throws POMEventException 
	{

			FireEventobject.ClickElement(UW_Sheet_Close);
		
	}
	
	public QuoteProposal UWSheet(String base_wind_rate, String test_data) throws POMPageException
	{
		try
		{
			BaseRateCheck(base_wind_rate);
			UWsheetClose();
		} 
		catch (POMEventException | InterruptedException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Underwriter Worksheet Page", e);
			}
			throw new POMPageException("Error in Underwriter Worksheet Page", e);
		}
		return new QuoteProposal();
	}
}