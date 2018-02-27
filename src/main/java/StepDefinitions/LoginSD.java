package StepDefinitions;

import Base.TestBase;
import Pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;

public class LoginSD extends TestBase {
	
	@After
	public void close_browser()
	{
		TestBase.deinitialization();
	}

	@Given("^user opens browser \"([^\"]*)\"$")
	public void user_opens_browser(String arg1) throws Throwable {
		TestBase.initialization(arg1);

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
