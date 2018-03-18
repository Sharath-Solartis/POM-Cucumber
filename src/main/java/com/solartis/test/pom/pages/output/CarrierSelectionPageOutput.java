package com.solartis.test.pom.pages.output;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class CarrierSelectionPageOutput extends PomEventsMethodDefinition
{
	public static FireEvent FireEventobject =new FireEvent();
	static int tablerow = 0;
	
	
	public void CarrierSelectionOutput(String carrier_name, List<WebElement> carriers, String test_data) throws POMPageException
	{
		try
		{
			System.out.println("carrier size   " + carriers.size());
			DatabaseOperation DB = new DatabaseOperation();
	
			DB.ConnectionSetup("com.mysql.jdbc.Driver", "jdbc:mysql://192.168.84.225:3700/TestDB_Allrisk", "root", "redhat");
			
			for( int i=0; i<carriers.size(); i++)
			{
				
				if((((WebElement) carriers.get(i)).getText()).equals(carrier_name))
		    	{
					System.out.println("Carrier Names :"+carriers.get(i).getText());
					tablerow =i;
					System.out.println("tableRow   " + tablerow);
					Thread.sleep(2000);
				
					String PolicyFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:Object__Plan__DefaultPolicyFee"+ tablerow +"')")));
					System.out.println("Tesdata + " + test_data + "PolicyFee " + PolicyFee);
					DB.InserValueWithRowNumber("Vicky", "PolicyFee", PolicyFee, Integer.parseInt(test_data));
					
					String TBP = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath(".//*[@id='CarrierSelectionFormPage:carrierTile4:ApplicablePanel"+ tablerow +"']/input")));
					System.out.println("Tesdata + " + test_data + "TbasePremium " + TBP);
					DB.InserValueWithRowNumber("Vicky", "TbasePremium", TBP, Integer.parseInt(test_data));
				
				}
			}
		}
		catch(InterruptedException | POMEventException | DatabaseException e)
		{
			throw new POMPageException("Error in Carrier Selection output Page", e);
		}
	}
		
}
