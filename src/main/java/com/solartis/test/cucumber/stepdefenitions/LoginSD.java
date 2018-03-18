package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.common.DriversHandling;
import com.solartis.test.pom.pages.input.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSD
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	
	@After()
	public void closeBrowser()
	{
		DriversHandling.deinitialization();
	}
	
	@Given("^user opens browser \"([^\"]*)\"$")
	public void user_opens_browser(String arg1) throws Throwable
	{
		DriversHandling.initialization(arg1);
		scenariolog.info("Browser Launched");
	}

		
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and click on login button for \"([^\"]*)\"$")
	public void user_enter_username_and_password(String username,String password,String test_data) throws Throwable
	{
		LoginPage loginpage= new LoginPage();
		loginpage.Login(username, password,test_data);
		scenariolog.info("Login Action");

	}
	
	/*@Then("^validate broswer title for \"([^\"]*)\"$")
    public void validate_browser_title() throws Throwable
	{ 
		LoginPage loginpage= new LoginPage();
		loginpage.getbrowsertitle();
		assertEquals("https://plqa.uat.solartis.net/plweb/",loginpage.getbrowsertitle());
	}*/

	

}

