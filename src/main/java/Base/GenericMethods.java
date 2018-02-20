package Base;

import org.openqa.selenium.WebElement;

public interface GenericMethods 
{
	void ClickElement(WebElement element);
	void Dropdown(WebElement element, String value);
	void EnterText(WebElement element, String value);
	void WaitElementVisibility(WebElement element);
	void WaitElementClickable(WebElement element);
	void ProcessingLoad();
}