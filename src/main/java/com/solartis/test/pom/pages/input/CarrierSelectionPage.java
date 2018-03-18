package com.solartis.test.pom.pages.input;

import java.util.List;

import org.openqa.selenium.By;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.output.CarrierSelectionPageOutput;

public class CarrierSelectionPage extends PomEventsMethodDefinition
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
	
	
	FireEvent FireEventobject = new FireEvent();
	CarrierSelectionPageOutput CSoP = new CarrierSelectionPageOutput();
	
	public CarrierSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void select_HO3_BRDP1_VDP1_HO6() throws POMEventException
	{
		
			FireEventobject.ClickElement(HO3_BRDP1_VDP1_HO6_radiobtn);
	}
	
	public void select_HO5_BRDP3_VDP3() throws POMEventException
	{
		
			FireEventobject.ClickElement(HO5_BRDP3_VDP3_radiobtn);
	}
	
	public void select_HO8() throws POMEventException
	{

			FireEventobject.ClickElement(HO8_radiobtn);
		
	}
	
	public void select_DP1() throws POMEventException
	{
		
			FireEventobject.ClickElement(DP1_radiobtn);
		
	}
	
	public void select_DP3() throws POMEventException
	{
		FireEventobject.ClickElement(DP3_radiobtn);
		
	}
	
	public void click_getRates() throws POMEventException 
	{
		
			FireEventobject.WaitElementClickable(Get_Rates);
			FireEventobject.ClickElement(Get_Rates);
		
	}
	
	public QuoteSummaryPage CarrierSelection(String policy_form, String carrier_name, String test_data) throws POMPageException
	{
		try
		{
				try {
					FireEventobject.ProcessingLoad();
				} catch (POMEventException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    Thread.sleep(40000);
				if(policy_form.equals("HO3"))
				{
					select_HO3_BRDP1_VDP1_HO6();
				}
				else if(policy_form.equals("DP3"))
				{
					select_DP3();	
				}
			
			click_getRates();
			Thread.sleep(40000);
			
			CSoP.CarrierSelectionOutput(carrier_name,carriers,test_data);
			
			System.out.println("carrier size   " + carriers.size());
			for( int i=0; i<carriers.size(); i++)
			{
				
				if((((WebElement) carriers.get(i)).getText()).equals(carrier_name))
		    	{
					System.out.println("Carrier Names :"+carriers.get(i).getText());
					tablerow =i+1;
					System.out.println("tableRow   " + tablerow);
					Thread.sleep(20000);
					driver.findElement(By.xpath("id('topgrid')/tbody/tr[5]/td["+tablerow+"]//span//span/button")).click();
		    	}
			}
		}
 		catch(POMEventException | InterruptedException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection input Page", e);
			}
			throw new POMPageException("Error in Carrier Selection input Page", e);
		}
		return new QuoteSummaryPage();
	}
}
