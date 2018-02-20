package StepDefinitions;

import Pages.UnderwritingPage;
import cucumber.api.java.en.Then;

public class UnderwritingSD {
	@Then("^continue to csp page$")
	public void continue_to_csp_page() throws Throwable {
		UnderwritingPage uwpage = new UnderwritingPage();
		uwpage.uwpage1();

	}

}
