package com.solartis.test.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.solartis.test.pom.common.CommonInputMethods;

public class HomePage extends CommonInputMethods {
	
	@FindBy(xpath="//table//button/span[contains(text(),'Homeowners / Dwelling / Condo Quote')]")
	protected WebElement btnPLQuote;
	WebDriverWait wait = new WebDriverWait(driver, 30);
	CommonInputMethods home = new CommonInputMethods();
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_hodpbtn()
	{
	  home.ClickElement(btnPLQuote);
	}
	
	public AgencyPage Home() throws InterruptedException
	{
		click_hodpbtn();
		return new AgencyPage();
	}
}
