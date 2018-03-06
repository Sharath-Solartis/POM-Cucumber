package com.solartis.test.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.pom.common.CommonInputMethods;


public class LoginPage extends CommonInputMethods {

	@FindBy(id="loginForm:login_username")
	public WebElement txtusername;
	
	@FindBy(id="loginForm:login_password")
	public WebElement txtpassword;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	public WebElement btnlogin;
	
	CommonInputMethods login = new CommonInputMethods();
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getbrowsertitle()
	{
		String burl=driver.getCurrentUrl();
		return burl;
	}
	
	public void enter_uname(String uname) 
	{
		login.EnterText(txtusername, uname);
	}
	
	public void enter_pwd(String pwd)
	{
		login.EnterText(txtpassword, pwd);
	}
	
	public void click_loginbtn()
	{
		login.ClickElement(btnlogin);
	}
	
	public HomePage Login(String uname,String pwd) throws InterruptedException
	{
		/*wait.until(ExpectedConditions.visibilityOf(txtusername));
		txtusername.sendKeys(uname);
		txtpassword.sendKeys(pwd);
		btnlogin.click();*/
		enter_uname(uname);
		enter_pwd(pwd);
		click_loginbtn();
		Thread.sleep(10000);
		return new HomePage();
	}
	
}
