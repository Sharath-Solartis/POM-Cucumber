package com.solartis.test.pom.common;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.POMEventException;

public interface PomEvents 
{
	public void ClickElement(WebElement element) throws POMEventException;
	public void Dropdown(WebElement element, String value) throws POMEventException;
	public void EnterText(WebElement element, String value) throws POMEventException;
	public void WaitElementVisibility(WebElement element) throws POMEventException;
	public void WaitElementClickable(WebElement element) throws POMEventException;
	public void ProcessingLoad() throws POMEventException;
	public void autoComplete(WebElement element, String value) throws POMEventException;
	public boolean assertText(WebElement element, String value) throws POMEventException;
	public void takeScreenShot() throws IOException, POMEventException;
	public void JSradioButton(WebElement element) throws POMEventException;
	public void contSendkeysOperation(WebElement element, String value) throws POMEventException;
	public void setTextWithoutEnter(WebElement element, String value) throws POMEventException;
	public void setTextThenEnter(WebElement element, String value) throws POMEventException;
	public void setTextThenTab(WebElement element, String value) throws POMEventException;
	public int checkProductDisable(WebElement element, String value) throws POMEventException;
	public String getValueByTextInput(WebElement element) throws POMEventException;
	public String getValueByAttributeInput(WebElement element) throws POMEventException;
	public void mouseHover(WebElement element) throws POMEventException;
	public void takeScreenshot(String filename) throws POMEventException;
	public String getValueByTextOutput(WebElement element) throws POMEventException;
	public String getValueByAttributeOutput(WebElement element) throws POMEventException;
		
}
