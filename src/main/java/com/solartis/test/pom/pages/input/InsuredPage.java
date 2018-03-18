package com.solartis.test.pom.pages.input;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class InsuredPage extends PomEventsMethodDefinition {
	
@FindBy(id="insuredTile:InsuredForm:Object__Customer__CustomerName")
public WebElement insuredname;
@FindBy(id= "insuredTile:InsuredForm:Object__Customer__BusinessAddress")
public WebElement insured_address;
@FindBy(xpath= "id('insuredTile:InsuredForm:Object__Customer__Phone')")
public WebElement phonenumber;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__LLC')/div[contains(.,'Yes')]/span")
public WebElement llc_qn_yes;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__LLC')/div[contains(.,'No')]/span")
public WebElement llc_qn_no;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__Principles')/div[contains(.,'Yes')]/span")
public WebElement principles_qn_yes;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__Principles')/div[contains(.,'No')]/span")
public WebElement principles_qn_no;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__PrinciplesDescriptionn')")
public WebElement principles_desc;
@FindBy(xpath = "//*[contains(text(),'Continue To Location')]")
public WebElement location_cont;
@FindBy(xpath = "id('msgspan')")
public WebElement processing_load;

FireEvent FireEventobject = new FireEvent();
	
public InsuredPage() 
{
	PageFactory.initElements(driver, this);
}

public void enter_insuredname(String insured_name) throws POMEventException 
{
		FireEventobject.EnterText(insuredname, insured_name);
}

public void enter_insuredaddr(String insured_mailing_address) throws  POMEventException
{
	
		FireEventobject.EnterText(insured_address, insured_mailing_address);
	
}

public void enter_phnumber(String phone_number) throws POMEventException
{
		FireEventobject.EnterText(phonenumber, phone_number);

}

public void llc_yes() throws  POMEventException
{
	
		FireEventobject.ClickElement(llc_qn_yes);
	
}

public void llc_no() throws  POMEventException
{

		FireEventobject.ClickElement(llc_qn_no);
	
}

public void customer_principles_yes() throws POMEventException  
{
	
		FireEventobject.ClickElement(principles_qn_yes);
	
}

public void customer_principles_no() throws POMEventException 
{
	
		FireEventobject.ClickElement(principles_qn_no);
	
}


public void click_cont_to_loc() throws POMEventException 
{
	
		FireEventobject.ClickElement(location_cont);
	
}
	
public LocationPage Insured(String insured_name, String insured_mailing_address, String phone_number, String test_data) throws POMPageException
	{
	try
	{
	    enter_insuredname(insured_name);
	    enter_insuredaddr(insured_mailing_address);
	    Thread.sleep(2000);
	    insured_address.sendKeys(Keys.ARROW_DOWN);
		insured_address.sendKeys(Keys.ENTER);
		FireEventobject.ProcessingLoad();
		Thread.sleep(25000);
	    enter_phnumber(phone_number);
	    click_cont_to_loc();
	}
	catch(Exception e)
	{
		try 
		{
			FireEventobject.takeScreenshot(test_data);
		} 
		catch (POMEventException e1) 
		{
			throw new POMPageException("Error in Taking ScreenShot in Insured Page", e);
		}
		throw new POMPageException("Error in Insured Page", e);
	}
		return new LocationPage();
	}
}