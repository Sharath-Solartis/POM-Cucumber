package com.solartis.test.common.operations;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListener implements WebDriverEventListener 
{

	static Logger logError = Logger.getLogger("ERRORlog");
	static Logger logInfo = Logger.getLogger("INFOlog");
	
	//DriverScript info = new DriverScript();
	
		
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
	
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		//logInfo.info(by);
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		//logInfo.info(by);
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		//logInfo.info(element);
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		//logInfo.info(element);
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub	
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		//logInfo.info(element);
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		throwable.getStackTrace();
		//logError.error(throwable);
	}

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}
}