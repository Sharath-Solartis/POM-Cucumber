package com.solartis.test.StepDefinitions;

import org.apache.log4j.Logger;

import com.solartis.test.Pages.LoginPage;
import com.solartis.test.Pages.UWWorksheetPage;

import cucumber.api.java.en.Then;

public class UWWorksheetSD {
	public static Logger logger = Logger.getLogger(UWWorksheetSD.class);
	@Then("^checks if the base wind rate is \"([^\"]*)\"$")
	public void checks_if_the_base_wind_rate_is(String base_wind_rate) throws Throwable 
	{
		UWWorksheetPage uwpage = new UWWorksheetPage();
        LoginPage lp = new LoginPage();
        System.out.println("UWsheet compare");
        //assertEquals(base_wind_rate,uwpage.BaseRateCheck());
        uwpage.BaseRateCheck(base_wind_rate);
        lp.deinitialization();
        logger.info("Reading Underwriter Worksheet Factors");
    }
}