package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;


public class LoginPage extends PomEventsMethodDefinition 
{

	@FindBy(id="loginForm:login_username")
	public WebElement txtusername;
	
	@FindBy(id="loginForm:login_password")
	public WebElement txtpassword;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	public WebElement btnlogin;
	
	FireEvent FireEventobject = new FireEvent();
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getbrowsertitle()
	{
		String burl=driver.getCurrentUrl();
		return burl;
	}
	
	public void enter_uname(String uname) throws POMEventException
	{
		
			FireEventobject.EnterText(txtusername, uname);

	}
	
	public void enter_pwd(String pwd) throws POMEventException 
	{
		
			FireEventobject.EnterText(txtpassword, pwd);
		
	}
	
	public void click_loginbtn() throws POMEventException 
	{
		
			FireEventobject.ClickElement(btnlogin);
	
	}
	
	public HomePage Login(String uname,String pwd, String test_data) throws POMPageException
	{

		try
		{
		enter_uname(uname);
		enter_pwd(pwd);
		click_loginbtn();
		Thread.sleep(10000);
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Login Page", e);
			}
			throw new POMPageException("Error in Login Page", e);
		}
		return new HomePage();
	}
	
}
