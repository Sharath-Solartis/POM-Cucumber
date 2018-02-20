package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class InsuredPage extends TestBase {
	
@FindBy(id="insuredTile:InsuredForm:Object__Customer__CustomerName")
public WebElement insuredname;
@FindBy(id= "insuredTile:InsuredForm:Object__Customer__BusinessAddress")
public WebElement insured_address;
@FindBy(xpath= "id('insuredTile:InsuredForm:Object__Customer__Phone')")
public WebElement phonenumber;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__LLC')/div[contains(.,'Yes')]/span")
public WebElement llc_qn_yes;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__LLC')/div[contains(.,'No')]/span")
public WebElement llc_qn_no;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__Principles')/div[contains(.,'Yes')]/span")
public WebElement principles_qn_yes;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__Principles')/div[contains(.,'No')]/span")
public WebElement principles_qn_no;
@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__PrinciplesDescriptionn')")
public WebElement principles_desc;
@FindBy(xpath = "//*[contains(text(),'Continue To Location')]")
public WebElement location_cont;
@FindBy(xpath = "id('msgspan')")
public WebElement processing_load;

TestBase insured = new TestBase();
	
public InsuredPage() 
{
	PageFactory.initElements(driver, this);
}

public void enter_insuredname(String insured_name)
{
	insured.EnterText(insuredname, insured_name);
}

public void enter_insuredaddr(String insured_mailing_address)
{
	insured.EnterText(insured_address, insured_mailing_address);
}

public void enter_phnumber(String phone_number)
{
	insured.EnterText(phonenumber, phone_number);
}

public void llc_yes()
{
	insured.ClickElement(llc_qn_yes);
}

public void llc_no()
{
	insured.ClickElement(llc_qn_no);
}

public void customer_principles_yes()
{
	insured.ClickElement(principles_qn_yes);
}

public void customer_principles_no()
{
	insured.ClickElement(principles_qn_no);
}

/*public void customer_principles_desc()
{
	insured.EnterText(principles_desc, value);
}*/

public void click_cont_to_loc()
{
	insured.ClickElement(location_cont);
}
	
public LocationPage Insured(String insured_name, String insured_mailing_address, String phone_number) throws InterruptedException
	{
	   /* wait.until(ExpectedConditions.visibilityOf(insuredname));
		insuredname.sendKeys(insured_name);
		insured_address.sendKeys(insured_mailing_address);
		Thread.sleep(5000);
		insured_address.sendKeys(Keys.ARROW_DOWN);
		insured_address.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(processing_load));
		Thread.sleep(5000);
		phonenumber.sendKeys(phone_number);
		location_cont.click();*/
	    enter_insuredname(insured_name);
	    enter_insuredaddr(insured_mailing_address);
	    Thread.sleep(2000);
	    insured_address.sendKeys(Keys.ARROW_DOWN);
		insured_address.sendKeys(Keys.ENTER);
		insured.ProcessingLoad();
		Thread.sleep(2000);
	    enter_phnumber(phone_number);
	    click_cont_to_loc();
		return new LocationPage();
	}
}