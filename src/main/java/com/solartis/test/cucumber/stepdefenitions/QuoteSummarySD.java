package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.pages.input.QuoteSummaryPage;

import cucumber.api.java.en.Then;

public class QuoteSummarySD {
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	@Then("^click on Underwriter Worksheet button for \"([^\"]*)\"$")
	public void click_on_Underwriter_Worksheet_button(String test_data) throws Throwable {
		QuoteSummaryPage qs = new QuoteSummaryPage();
		qs.QuoteSummary(test_data);
		scenariolog.info("Quote Summary Page fro " + test_data);
	}
}