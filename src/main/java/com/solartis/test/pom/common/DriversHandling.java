package com.solartis.test.pom.common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.common.operations.EventListener;

public class DriversHandling
{
	
	protected static int PAGE_LOAD_TIMEOUT =50;
	protected static int IMPLICIT_WAIT =30;
	
	protected static RemoteWebDriver driver;
	protected static EventListener event;
	
	//For Running in Local Machine
	public static final String chromedriverpath;
    public static final String firefoxdriverpath;
    public static final String iedriverpath;
    
    static 
    {
    	chromedriverpath = "src//main//resources//chromedriver.exe";
    	firefoxdriverpath = "src//main//resources//geckodriver.exe";
    	iedriverpath = "src//main//resources//IEDriverServer.exe";
    }
    
    public static void initialization(String browser) throws POMEventException
	{ 	
    	try
    	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			 DesiredCapabilities dc = DesiredCapabilities.firefox();
			 driver = new RemoteWebDriver (new URL("http://192.168.4.48:4444/wd/hub"),dc);
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			 DesiredCapabilities dc = DesiredCapabilities.chrome();
			 driver = new RemoteWebDriver (new URL("http://192.168.4.48:4444/wd/hub"),dc);
		}
    	
		//For Running in Local Machine
    	/*System.setProperty("webdriver.chrome.driver",chromedriverpath);
        driver = new ChromeDriver();*/
		
	  	driver.manage().window().maximize();
	  	driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	  	driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,  TimeUnit.SECONDS);
	  	driver.get("https://pluat.solartis.net/");
    	}
    	catch (MalformedURLException e) 
    	{
    		throw new POMEventException("ERROR IN OPENING BROWSER", e);
		}
		
    }
    	
    public void DBinitialization() throws DatabaseException
    {
    	
    	DatabaseOperation DB = new DatabaseOperation();
		LinkedHashMap<String, String> ColValuesHashMap =null;
		DB.ConnectionSetup("com.mysql.jdbc.Driver", "jdbc:mysql://192.168.84.225:3700/TestDB_Allrisk", "root", "redhat");
		LinkedHashMap LHM = DB.GetDataObjects("SELECT * FROM test_pomtable");
		
    }
    
	public static void deinitialization()
	{
    	driver.quit();
	}

		
}
