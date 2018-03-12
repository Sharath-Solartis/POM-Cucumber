package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.HomePage;

import cucumber.api.java.en.Then;

public class HomePageSD {
	public static Logger logger = Logger.getLogger(HomePageSD.class);
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {

	}

	@Then("^click on Homeowner / Dwelling / Condo Quote button$")
	public void click_on_Homeowner_Dwelling_Condo_Quote_button() throws Throwable {
		HomePage homepage = new HomePage();
		homepage.Home();
		logger.info("Clicking Homeowner / Dwelling / Condo Quote button");
	}

}
