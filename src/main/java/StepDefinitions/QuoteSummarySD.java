package StepDefinitions;
import Pages.QuoteSummaryPage;
import cucumber.api.java.en.Then;

public class QuoteSummarySD {
	@Then("^click on Underwriter Worksheet button$")
	public void click_on_Underwriter_Worksheet_button() throws Throwable {
		QuoteSummaryPage qs = new QuoteSummaryPage();
		qs.QuoteSummary();
	}
}