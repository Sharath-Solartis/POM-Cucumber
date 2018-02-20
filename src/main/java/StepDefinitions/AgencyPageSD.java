package StepDefinitions;

import Pages.AgencyPage;
import cucumber.api.java.en.Then;

public class AgencyPageSD {

	@Then("^enter the \"([^\"]*)\" in Agency Page$")
	public void enter_the_in_Agency_Page(String agency_code) throws Throwable {
		AgencyPage agencypage = new AgencyPage();
		agencypage.Agency(agency_code);
	}
}
