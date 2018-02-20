package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class UWWorksheetPage extends TestBase {
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Base Wind Rate')]/../td[2]")
	public WebElement base_w_rate;
	
	public UWWorksheetPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean BaseRateCheck(String base_wind_rate) {
		boolean result;
		System.out.println("WBasreate :" + base_w_rate.getText());
		if (base_w_rate.getText().equals(base_wind_rate)) {
			result = true;
		} else {
			result = false;
		}
		System.out.println("Result is :"+result);
		return result;
	}
}