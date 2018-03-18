package com.solartis.test.pom.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.pom.common.DriversHandling;


public class PomEventsMethodDefinition extends DriversHandling implements PomEvents
{
	
	//driver handling is extended here bcoz intansiating driver in each page shows error
	
	//public static WebDriver driver;
	protected WebDriverWait wait=null; 
	public static final String screenshotpath;
	    
    static 
	{
    	screenshotpath = "target//";
	}
    
	@Override
		public void ClickElement(WebElement element) throws POMEventException
		{
		try 
		{
			//System.out.println("inside click option");
			//System.out.println("inside common input methods click");
			element.click();
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR IN CLICK OPERATION : " + element, e);
		}
		}
	
	
	@Override
		public void Dropdown(WebElement element, String value) throws POMEventException
		{
		try 
		{
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(value);
		}
		catch (Exception e)
		{
			throw new POMEventException("ERROR IN DROPDOWN OPERATION : "+ element, e);
		}
		}
	
	
	@Override	
		public void EnterText(WebElement element, String value) throws POMEventException 
		{
		try 
		{
			//System.out.println("element in input method       "+element);
			//System.out.println("input methods        "+value);
			element.sendKeys(value);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE ENTERING TEXT OPERATION : "+ element, e);
		}
		}
	
	
	@Override	
		public void WaitElementVisibility(WebElement element) throws POMEventException
		{
		try 
		{
		
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ELEMENT VISIBILITY OPERATION : "+ element, e);
		}
		}
	
	
	@Override	
		public void WaitElementClickable(WebElement element) throws POMEventException
		{
		
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ELEMENT TO CLICK : "+ element, e);
		}
		}
	
	
	@Override	
		public void ProcessingLoad() throws POMEventException
		{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('msgspan')")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('msgspan')")));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR PROCESSING LOAD : ", e);
		}
		}
	
	
	@Override	
		public void autoComplete(WebElement element, String value) throws POMEventException
		{
		try 
		{
			element.sendKeys(value);
		 	element.sendKeys(Keys.DOWN);
		 	element.sendKeys(Keys.ENTER);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING AUTOCOMPLETE : ", e);
		}
		}
		
	
	@Override	
		public boolean assertText(WebElement element, String value) throws POMEventException
		{
		try 
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
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE COMPARING TEXTS USING ASSERT : ", e);
		}
		}
	
		
	@Override	
		public void takeScreenShot() throws IOException, POMEventException
		{
		try 
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	FileUtils.copyFile(scrFile, new File("D:\\Exception\\screenshots\\"+".png"));	
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE TAKING SCREENSHOTS : ", e);
		}
		}
	
	
	@Override
		public void JSradioButton(WebElement element) throws POMEventException
		{
		try 
		{
			JavascriptExecutor radio = (JavascriptExecutor) driver;
			radio.executeScript("arguments[0].click();", element);
			radio.executeScript("arguments[0].checked=true",element);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE CLICKING RADIO BUTTON : " + element, e);
		}
		}
	
	
	@Override
		public void contSendkeysOperation(WebElement element, String value) throws POMEventException
		{
		try 
		{
		
			Actions builder = new Actions(driver);
		 	Actions seriesOfActions = builder.moveToElement(element).click().sendKeys(element, value);
		 	seriesOfActions.perform();
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING CONTINUOUS SEND KEYS OPERATION : " + element, e);
		}
		}
	
		
	@Override
		
		public void setTextWithoutEnter(WebElement element, String value) throws POMEventException
		{
		try 
		{
		
			element.clear();
		   	element.sendKeys(value);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE SETING TEXT WITHOUT ENTER : " + element, e);
		}
		}
	
		
	@Override
		public void setTextThenEnter(WebElement element, String value) throws POMEventException
		{
		try 
		{
			element.clear();
		   	element.sendKeys(value);
		   	element.sendKeys(Keys.ENTER);	
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE SETING TEXT WITH ENTER : " + element, e);
		}
		}
	
		
	@Override
		public void setTextThenTab(WebElement element, String value) throws POMEventException
		{
		try 
		{
		
			element.sendKeys(value);
		   	element.sendKeys(Keys.TAB);	
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE SETING TEXT WITH TAB : " + element, e);
		}
		}
		
	
	@Override	
		public int checkProductDisable(WebElement element, String value) throws POMEventException
		{
		try 
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
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE CHECKING WHETHER PRODUCT IS ENABLE OR NOT : " + element, e);
		}
		}
		
	
	@Override
		public String getValueByTextInput(WebElement element) throws POMEventException
		{
		try 
		{
			String label=element.getText();
		   	return label;
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE GETTING VALUE BY TEXT INPUT : " + element, e);
		}
		}
	
	@Override	
		public String getValueByAttributeInput(WebElement element) throws POMEventException
		{
		try 
		{
			String label=element.getAttribute("value");
		 	return label;
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE GETTING VALUE BY ATTRIBUTE INPUT : " + element, e);
		}
		}
	
	@Override	
		public void mouseHover(WebElement element) throws POMEventException
		{
		try 
		{
			Actions mouse_hover = new Actions(driver);
		    mouse_hover.moveToElement(element).build().perform();
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING MOUSE HOVER : " + element, e);
		}	
		}	
	
	 @Override
	    public void takeScreenshot(String filename) throws POMEventException
		{
		    try
		    {
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String screenPath = screenshotpath.toString()+filename+".png";
	        FileUtils.copyFile(screenshot, new File(screenPath));
	        driver.quit();
		    }
		    catch (IOException e) 
		    {
		    	throw new POMEventException("ERROR WHILE TAKING SCREENSHOT.", e);
			}
	    }


	@Override
	public String getValueByTextOutput(WebElement element) throws POMEventException 
	{
		try
	    {
		String label=element.getText();
	   	return label;
	    }
	    catch (Exception e) 
	    {
	    	throw new POMEventException("ERROR WHILE GET VALUE BY TEXT OUTPUT.", e);
		}
	}


	
	public String getValueByAttributeOutput(WebElement element) throws POMEventException 
	{
		String label="";
		try
	    {
		label=element.getAttribute("value");
		System.out.println(label);
	 	
		}
	    catch (Exception e) 
	    {
	    	throw new POMEventException("ERROR WHILE GET VALUE BY ATTRIBUT OUTPUT.", e);
		}
		return label;
	}
		
	}

