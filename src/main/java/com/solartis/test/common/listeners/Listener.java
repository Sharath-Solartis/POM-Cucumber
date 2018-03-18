package com.solartis.test.common.listeners;

import org.openqa.selenium.WebElement;

public interface Listener 
{
	 public void beforeClickElement(WebElement element);
	 public void afterClickElement();
	 public void beforeDropdown();
	 public void afterDropdown();
	 public void beforeEnterText();
	 public void afterEnterText();
	 public void beforeWaitElementVisibility();
	 public void afterWaitElementVisibility();
	 public void beforeWaitElementClickable();
	 public void afterWaitElementClickable();
	 public void beforeProcessingLoad();
	 public void afterProcessingLoad();
	 public void beforeAutoComplete();
	 public void afterAutoComplete();
	 public void beforeAssertText();
	 public void afterAssertText();
	 public void beforeTakeScreenShot();
	 public void afterTakeScreenShot();
	 public void beforeJSradioButton();
	 public void afterJSradioButton();
	 public void beforeContSendkeysOperation();
	 public void afterContSendkeysOperation();
	 public void beforeSetTextWithoutEnter();
	 public void afterSetTextWithoutEnter();
	 public void beforeSetTextThenEnter();
	 public void afterSetTextThenEnter();
	 public void beforeSetTextThenTab();
	 public void afterSetTextThenTab();
	 public void beforeCheckProductDisable();
	 public void afterCheckProductDisable();
	 public void beforeGetValueByTextInput();
	 public void afterGetValueByTextInput();
	 public void beforeGetValueByAttributeInput();
	 public void afterGetValueByAttributeInput();
	 public void beforeMouseHover();
	 public void afterMouseHover();
	 public void beforeScreenShot();
	 public void afterScreenShot();
	 public void beforeGetValueByTextOutput();
	 public void afterGetValueByTextOutput();
	 public void beforeGetValueByAttributeOutput();
	 public void afterGetValueByAttributeOutput();
	 public void onError(Exception e);
	 public void onException(Throwable throwable);
}
