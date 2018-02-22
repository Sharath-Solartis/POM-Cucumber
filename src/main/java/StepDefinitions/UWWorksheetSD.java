package StepDefinitions;

import Pages.UWWorksheetPage;
import cucumber.api.java.en.Then;

public class UWWorksheetSD {
	@Then("^checks if the base wind rate is \"([^\"]*)\"$")
	public void checks_if_the_base_wind_rate_is(String base_wind_rate) throws Throwable 
	{
		UWWorksheetPage uwpage = new UWWorksheetPage();
		System.out.println("UWsheet compare");
		//assertEquals(base_wind_rate,uwpage.BaseRateCheck());
		uwpage.BaseRateCheck(base_wind_rate);
    }
}