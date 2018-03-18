package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.pages.input.UnderwritingPage;

import cucumber.api.java.en.Then;

public class UnderwritingSD {
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	@Then("^continue to csp page for \"([^\"]*)\"$")
	public void continue_to_csp_page(String test_data) throws Throwable 
	{
		UnderwritingPage uwpage = new UnderwritingPage();
		uwpage.uwpage1(test_data);
		scenariolog.info("Filling Underwriting Information  fro " + test_data);

	}

}
