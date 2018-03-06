package com.solartis.test.pom.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonInputMethods extends DriversHandling
{
	//public static WebDriver driver;
		
		public void ClickElement(WebElement element) 
		{
			//System.out.println("inside click option");
			element.click();
		}
		
		public void Dropdown(WebElement element, String value) 
		{
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(value);
		}
		
		public void EnterText(WebElement element, String value) 
		{
			//System.out.println("element in input method       "+element);
			//System.out.println("input methods        "+value);
			element.sendKeys(value);
		}
		
		public void WaitElementVisibility(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void WaitElementClickable(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public void ProcessingLoad()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('msgspan')")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('msgspan')")));
		}
		
		public void autoComplete(WebElement element, String value)
		{
			element.sendKeys(value);
		 	element.sendKeys(Keys.DOWN);
		 	element.sendKeys(Keys.ENTER);
		}
		
		
		public boolean assertText(WebElement element, String value)
		{
			boolean status = false;
			String actualText = element.getText();
		   	if(actualText.equals(value))
		   	{
			   status=true;
		   	}
		   	System.out.println(status);
		   	return status;	
		}
		
		
		public void takeScreenShot() throws IOException
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	FileUtils.copyFile(scrFile, new File("D:\\Exception\\screenshots\\"+".png"));	
		}
		
		public void JSradioButton(WebElement element)
		{
			JavascriptExecutor radio = (JavascriptExecutor) driver;
			radio.executeScript("arguments[0].click();", element);
			radio.executeScript("arguments[0].checked=true",element);
		
		}
		
		public void contSendkeysOperation(WebElement element, String value)
		{
			Actions builder = new Actions(driver);
		 	Actions seriesOfActions = builder.moveToElement(element).click().sendKeys(element, value);
		 	seriesOfActions.perform();
			
		}
		
		
		
		public void setTextWithoutEnter(WebElement element, String value)
		{
			element.clear();
		   	element.sendKeys(value);
		}
		
		
		public void setTextThenEnter(WebElement element, String value)
		{
			element.clear();
		   	element.sendKeys(value);
		   	element.sendKeys(Keys.ENTER);	
		}
		
		
		public void setTextThenTab(WebElement element, String value)
		{
			element.sendKeys(value);
		   	element.sendKeys(Keys.TAB);	
		}
		
		
		public int checkproductdisable(WebElement element, String value)
		{
			int tr=0;
		   	if(element.isEnabled())
		   	{
		   		tr=1;
		   	}
		   	else
		   	{
		   		tr=0;
		   	}
			return tr;
		}
		
		
		public String getValueByTextInput(WebElement element)
		{
			String label=element.getText();
		   	return label;
		}
		
		public String getValueByAttributeInput(WebElement element)
		{
			String label=element.getAttribute("value");
		 	return label;
		}
		
		public void mouseHover(WebElement element)
		{
			Actions mouse_hover = new Actions(driver);
		    mouse_hover.moveToElement(element).build().perform();
			
		}
		
		
		
		
		
	}

