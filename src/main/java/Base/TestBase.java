package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static RemoteWebDriver driver;
	//public static WebDriver driver;
	public static Properties prop;
	protected static EventListener event;
	
	public static final String chromedriverpath;
    public static final String firefoxdriverpath;
    public static final String iedriverpath;
    
    static 
    {
    	chromedriverpath = "src//main//resources//chromedriver.exe";
    	firefoxdriverpath = "src//main//resources//geckodriver.exe";
    	iedriverpath = "src//main//resources//IEDriverServer.exe";
    }
	
	public TestBase()
	{
		try
		{
			event=new EventListener();
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src\\main\\java\\Config\\Config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	
	public static void initialization() throws MalformedURLException
	{
		//String browserName = prop.getProperty("browser");//used to load from properties file
		
		DesiredCapabilities dc= DesiredCapabilities.chrome();
		//RemoteWebDriver driver;
		driver = new RemoteWebDriver (new URL("http://192.168.4.48:4444/wd/hub"),dc);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://plqa.uat.solartis.net/plweb/");
		
		//System.setProperty("webdriver.chrome.driver",chromedriverpath);
	  	//driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.manage().deleteAllCookies();
	  	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	  	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,  TimeUnit.SECONDS);
	  	driver.get(prop.getProperty("url"));
	}
	
	public void ClickElement(WebElement element) 
	{
		element.click();
	}
	
	public void Dropdown(WebElement element, String value) 
	{
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(value);
	}
	
	public void EnterText(WebElement element, String value) 
	{
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
	
}
