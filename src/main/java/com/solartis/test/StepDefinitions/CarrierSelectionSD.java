package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.CarrierSelectionPage;

import cucumber.api.java.en.Then;

public class CarrierSelectionSD {
	public static Logger logger = Logger.getLogger(CarrierSelectionSD.class);

	@Then("^enter the \"([^\"]*)\" Then create quote for the specified carrier \"([^\"]*)\"$")
	public void enter_the_Then_create_quote_for_the_specified_carrier(String policy_form, String carrier_name)
			throws Throwable {
		CarrierSelectionPage cspage = new CarrierSelectionPage();
		cspage.CarrierSelection(policy_form, carrier_name);
		logger.info("Creating Quote");
	}
}