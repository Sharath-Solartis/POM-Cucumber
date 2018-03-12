package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.AgencyPage;

import cucumber.api.java.en.Then;

public class AgencyPageSD {
	public static Logger logger = Logger.getLogger(AgencyPageSD.class);

	@Then("^enter the \"([^\"]*)\" in Agency Page$")
	public void enter_the_in_Agency_Page(String agency_code) throws Throwable {
		AgencyPage agencypage = new AgencyPage();
		agencypage.Agency(agency_code);
		logger.info("Agency code entered");
	}
}
