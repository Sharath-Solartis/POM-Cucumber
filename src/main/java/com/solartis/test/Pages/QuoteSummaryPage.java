package com.solartis.test.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.pom.common.CommonInputMethods;

public class QuoteSummaryPage extends CommonInputMethods
{
	@FindBy(xpath = "*//button/span[contains(text(),'UNDERWRITER WORKSHEET')]")
	public WebElement uw_worksheet_button;
	
	CommonInputMethods qs = new CommonInputMethods();
	
	public QuoteSummaryPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_uwworksheetbtn()
	{
		qs.ClickElement(uw_worksheet_button);
	}
	public UWWorksheetPage QuoteSummary()
	{
		click_uwworksheetbtn();
		return new UWWorksheetPage();
	}
}