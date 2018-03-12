package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.LoginPage;
import com.solartis.test.Pages.QuoteSummaryPage;

import cucumber.api.java.en.Then;

public class QuoteSummarySD {
	public static Logger logger = Logger.getLogger(QuoteSummarySD.class);
	@Then("^click on Underwriter Worksheet button$")
	public void click_on_Underwriter_Worksheet_button() throws Throwable {
		QuoteSummaryPage qs = new QuoteSummaryPage();
		qs.QuoteSummary();
		LoginPage lp = new LoginPage();
		logger.info("Quote Summary Page");
		lp.deinitialization();
	}
}