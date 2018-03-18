package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.pom.pages.input.CarrierSelectionPage;

import cucumber.api.java.en.Then;

public class CarrierSelectionSD {
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");;

	@Then("^enter the \"([^\"]*)\" Then create quote for the specified carrier \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enter_the_Then_create_quote_for_the_specified_carrier(String policy_form, String carrier_name,String test_data) throws POMPageException  
	{
		CarrierSelectionPage cspage = new CarrierSelectionPage();
		cspage.CarrierSelection(policy_form, carrier_name,test_data);
		scenariolog.info("Creating Quote fro " + test_data);
	}
}