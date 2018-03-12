package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.LocationPage;

import cucumber.api.java.en.Then;

public class LocatioPageSD {
	public static Logger logger = Logger.getLogger(LocatioPageSD.class);

	@Then("^enter the \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page$")
	public void enter_the_Then_Then_in_location_page(String protection_class, String number_of_stories , String number_loss) throws Throwable {
		LocationPage location = new LocationPage();
		location.Location(protection_class, number_of_stories, number_loss);
		logger.info("Entering Location Details");
	
	}

}
