package com.solartis.test.output.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.solartis.test.Pages.DBop;
import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.pom.common.CommonOutputMethods;

public class CarrierSelectionPageOutput extends CommonOutputMethods
{
	static int tablerow = 0;
	@FindBy(xpath = "id('topgrid')/tbody/tr[1]/td//a")
	public List<WebElement> carriers;
	
	DBop DBobject = new DBop();
	CommonOutputMethods CS_Output = new CommonOutputMethods();
	
	public void CarrierSelectionOutput(String carrier_name) throws InterruptedException, DatabaseException
	{
		//String TBP = null;
		for( int i=0; i<carriers.size(); i++)
		{
			
			if((((WebElement) carriers.get(i)).getText()).equals(carrier_name))
	    	{
				System.out.println("Carrier Names :"+carriers.get(i).getText());
				tablerow =i;
				System.out.println("tableRow   " + tablerow);
				Thread.sleep(20000);
				//TBP = driver.findElement(By.xpath(".//*[@id='CarrierSelectionFormPage:carrierTile4:ApplicablePanel"+ tablerow +"']/input")).getAttribute("value");
				String TBP = getValueByAttributeOutput(driver.findElement(By.xpath(".//*[@id='CarrierSelectionFormPage:carrierTile4:ApplicablePanel"+ tablerow +"']/input")));
				System.out.println("TbasePremium" + TBP);
				DBobject.callDB("TbasePremium",TBP);
			}
		}
		//return TBP;
		
	}
}
