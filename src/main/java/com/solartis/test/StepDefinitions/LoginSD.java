package com.solartis.test.StepDefinitions;

import static org.junit.Assert.assertEquals;
import com.solartis.test.pom.common.DriversHandling;
import com.solartis.test.Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import com.solartis.test.CommonClasses.DatabaseOperation;

public class LoginSD extends DriversHandling {
	
	

	@Given("^user opens browser \"([^\"]*)\"$")
	public void user_opens_browser(String arg1) throws Throwable {
		DriversHandling.initialization(arg1);

	}

		
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	public void user_enter_username_and_password(String username,String password) throws Throwable {
		LoginPage loginpage= new LoginPage();
		loginpage.Login(username, password);

	}
	
	@Then("^validate broswer title$")
    public void validate_browser_title() throws Throwable { 
		LoginPage loginpage= new LoginPage();
		loginpage.getbrowsertitle();
		assertEquals("https://plqa.uat.solartis.net/plweb/",loginpage.getbrowsertitle());
	}

	

}

