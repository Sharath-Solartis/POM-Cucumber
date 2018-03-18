package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.pages.input.HomePage;

import cucumber.api.java.en.Then;

public class HomePageSD {
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {

	}

	@Then("^click on Homeowner / Dwelling / Condo Quote button for \"([^\"]*)\"$")
	public void click_on_Homeowner_Dwelling_Condo_Quote_button(String test_data) throws Throwable {
		HomePage homepage = new HomePage();
		homepage.Home(test_data);
		scenariolog.info("Clicking Homeowner / Dwelling / Condo Quote button fro " + test_data);
	}

}
