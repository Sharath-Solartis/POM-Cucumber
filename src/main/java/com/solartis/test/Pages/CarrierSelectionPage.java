package com.solartis.test.Pages;

import java.util.List;
import com.solartis.test.output.pages.CarrierSelectionPageOutput;
import org.openqa.selenium.By;
import com.solartis.test.Pages.DBop;
import com.solartis.test.common.exception.DatabaseException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.pom.common.CommonInputMethods;

public class CarrierSelectionPage extends CommonInputMethods
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
	
	
	CommonInputMethods cs = new CommonInputMethods();
	CarrierSelectionPageOutput CSoP = new CarrierSelectionPageOutput();
	
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
	
	public QuoteSummaryPage CarrierSelection(String policy_form, String carrier_name) throws InterruptedException, DatabaseException
	{
		
		cs.ProcessingLoad();
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
		CSoP.CarrierSelectionOutput(carrier_name);
		
		
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
		return new QuoteSummaryPage();
	}
}
