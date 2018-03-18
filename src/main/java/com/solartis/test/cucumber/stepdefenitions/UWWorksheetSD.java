package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.pom.pages.input.UWWorksheetPage;

import cucumber.api.java.en.Then;

public class UWWorksheetSD
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	@Then("^checks if the base wind rate is \"([^\"]*)\" for \"([^\"]*)\"$")
	public void checks_if_the_base_wind_rate_is(String base_wind_rate,String test_data) throws Throwable 
	{
		UWWorksheetPage uwpage = new UWWorksheetPage();
		System.out.println("UWsheet compare");
		//assertEquals(base_wind_rate,uwpage.BaseRateCheck());
		uwpage.UWSheet(base_wind_rate,test_data);
		scenariolog.info("Reading Underwriter Worksheet Factors fro " + test_data);
    }
}