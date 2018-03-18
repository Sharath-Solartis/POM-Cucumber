package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.pages.input.LocationPage;

import cucumber.api.java.en.Then;

public class LocatioPageSD {
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");

	@Then("^enter the \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
	public void enter_the_Then_Then_in_location_page(String protection_class, String number_of_stories , String number_loss, String test_data) throws Throwable {
		LocationPage location = new LocationPage();
		location.Location(protection_class, number_of_stories, number_loss,test_data);
		scenariolog.info("Entering Location Details fro " + test_data);
	
	}

}
