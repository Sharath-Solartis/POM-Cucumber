package com.solartis.test.StepDefinitions;

import com.solartis.test.Pages.InsuredPage;
import cucumber.api.java.en.Then;

public class InsuredPageSD {

	@Then("^enter the \"([^\"]*)\" Then \"([^\"]*)\" And \"([^\"]*)\" in insured information$")
	public void enter_the_and_and_in_insured_information(String insured_name, String insured_mailing_address,
			String phone_number) throws Throwable {
		InsuredPage insuredpage = new InsuredPage();
		insuredpage.Insured(insured_name, insured_mailing_address, phone_number);
	}

	/*@Then("^enter the \"([^\"]*)\"$")
	public void enter_the(String arg1) throws Throwable {

	}

	@And("^enter the \"([^\"]*)\" in insured tile$")
	public void in_insured_information(String arg1) throws Throwable {

	}*/

}