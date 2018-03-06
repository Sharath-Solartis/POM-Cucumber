package com.solartis.test.pom.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommonOutputMethods
{
	
	public static RemoteWebDriver driver;
	
	public String getValueByTextOutput(WebElement element)
	{
		String label=element.getText();
	   	return label;
	}
	
	public String getValueByAttributeOutput(WebElement element)
	{
		String label=element.getAttribute("value");
	 	return label;
	}
	
	
}
