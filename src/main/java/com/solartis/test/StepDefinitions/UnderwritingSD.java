package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.LoginPage;
import com.solartis.test.Pages.UnderwritingPage;

import cucumber.api.java.en.Then;

public class UnderwritingSD {
	public static Logger logger = Logger.getLogger(UnderwritingSD.class);
	@Then("^continue to csp page$")
	public void continue_to_csp_page() throws Throwable {
		UnderwritingPage uwpage = new UnderwritingPage();
		LoginPage lp = new LoginPage();
		uwpage.uwpage1();
		logger.info("Filling Underwriting Information");

	}

}
