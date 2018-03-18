package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.pages.input.AgencyPage;

import cucumber.api.java.en.Then;

public class AgencyPageSD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");

	@Then("^enter the \"([^\"]*)\"  in Agency Page for \"([^\"]*)\"$")
	public void enter_the_in_Agency_Page(String agency_code,String test_data) throws Throwable 
	{
		AgencyPage agencypage = new AgencyPage();
		agencypage.Agency(agency_code,test_data);
		scenariolog.info("Agency code entered");
	}
}
