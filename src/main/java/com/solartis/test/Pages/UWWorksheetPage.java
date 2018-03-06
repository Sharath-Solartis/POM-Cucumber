package com.solartis.test.Pages;


import java.sql.SQLException;
import com.solartis.test.Pages.DBop;
import com.solartis.test.common.exception.DatabaseException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.pom.common.CommonInputMethods;

public class UWWorksheetPage extends CommonInputMethods {
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Base Wind Rate')]/../td[2]")
	public WebElement base_w_rate;
	
	public UWWorksheetPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean BaseRateCheck(String base_wind_rate) throws InterruptedException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, DatabaseException
	{
		DBop DBobject = new DBop();
		boolean result;
		Thread.sleep(3000);
		System.out.println("WBasreate :" + base_w_rate.getText());
		if (base_w_rate.getText().equals(base_wind_rate)) 
		{
			DBobject.callDB("Base_Rate",base_w_rate.getText());
			result = true;
		}
		else 
		{
			result = false;
		}
		System.out.println("Result is :"+result);
		return result;
	}
}