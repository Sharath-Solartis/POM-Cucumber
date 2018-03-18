package com.solartis.test.common.listeners;

import java.io.IOException;
import java.util.LinkedList;
import org.openqa.selenium.WebElement;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.common.PomEvents;


	public class FireEvent implements PomEvents
	{
	 protected static PomEvents pomevents = null;
	 protected static Listener listener = null; 
	 protected LinkedList<Listener> listeners1 = new LinkedList<Listener>();
	 
	public FireEvent()
	{
		pomevents = new PomEventsMethodDefinition();
		listener = new LogListener();
		listeners1.add((Listener) listener);
	}

	//protected LinkedList<Listener> listeners1 = new LinkedList<Listener>();
	
	public void addListener(Listener listener)
	{
    listeners1.add((Listener) listener);
	}
	
	public boolean removeListener(Listener listener)
	{
	    return listeners1.remove(listener);
	}
	
	@Override
	public void ClickElement(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		//System.out.println("inside fire event click");
		for (Listener listen : listeners1)
            listen.beforeClickElement(element);
		try
		{
        pomevents.ClickElement(element);
		}
		catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
		
        for (Listener listen : listeners1)
            listen.afterClickElement();
	}

	@Override
	public void Dropdown(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeDropdown();
        try
        {
        	pomevents.Dropdown(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterDropdown();
	}

	@Override
	public void EnterText(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeEnterText();
        try
        {
        	pomevents.EnterText(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterEnterText();
	}

	@Override
	public void WaitElementVisibility(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeWaitElementVisibility();
        try
        {
        	pomevents.WaitElementVisibility(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterWaitElementVisibility();
	}

	@Override
	public void WaitElementClickable(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeWaitElementClickable();
        try
        {
        	pomevents.WaitElementClickable(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterWaitElementClickable();
	}

	@Override
	public void ProcessingLoad() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeProcessingLoad();
        try
        {
        	pomevents.ProcessingLoad();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterProcessingLoad();
	}

	@Override
	public void autoComplete(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeAutoComplete();
        try
        {
        	pomevents.autoComplete(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterAutoComplete();
	}

	@Override
	public boolean assertText(WebElement element, String value) throws POMEventException 
	{
		boolean output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeAssertText();
        try
        {
        	output = pomevents.assertText(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterAssertText();
		return output;
	}

	@Override
	public void takeScreenShot() throws IOException, POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeTakeScreenShot();
        try
        {
        	pomevents.takeScreenShot();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterTakeScreenShot();
	}

	@Override
	public void JSradioButton(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeJSradioButton();
        try
        {
        	pomevents.JSradioButton(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterJSradioButton();
	}

	@Override
	public void contSendkeysOperation(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeContSendkeysOperation();
        try
        {
        	pomevents.contSendkeysOperation(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterContSendkeysOperation();
	}

	@Override
	public void setTextWithoutEnter(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeSetTextWithoutEnter();
        try
        {
        	pomevents.setTextWithoutEnter(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSetTextWithoutEnter();
	}

	@Override
	public void setTextThenEnter(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeSetTextThenEnter();
        try
        {
        	pomevents.setTextThenEnter(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSetTextThenEnter();
	}

	@Override
	public void setTextThenTab(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeSetTextThenTab();
        try
        {
        	pomevents.setTextThenTab(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSetTextThenTab();
	}

	@Override
	public int checkProductDisable(WebElement element, String value) throws POMEventException 
	{
		int output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeCheckProductDisable();
        try
        {
        	output = pomevents.checkProductDisable(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterCheckProductDisable();
		return output;
	}

	@Override
	public String getValueByTextInput(WebElement element) throws POMEventException 
	{
		String output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByTextInput();
        try
        {
        	output = pomevents.getValueByTextInput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByTextInput();
		return output;
	}

	@Override
	public String getValueByAttributeInput(WebElement element) throws POMEventException 
	{
		String output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByAttributeInput();
        try
        {
        	output = pomevents.getValueByAttributeInput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByAttributeInput();
		return output;
	}

	@Override
	public void mouseHover(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeMouseHover();
        try
        {
        	pomevents.mouseHover(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterMouseHover();
	}
	
	@Override
	public void takeScreenshot(String filename) throws POMEventException 
	{
		for (Listener listen : listeners1)
            listen.beforeScreenShot();
        try
        {
        	pomevents.takeScreenshot(filename);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterScreenShot();
		
	}
	
	@Override
	public String getValueByTextOutput(WebElement element) throws POMEventException
	{
		String output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByTextOutput();
        try
        {
        	output = pomevents.getValueByTextOutput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByTextOutput();
		return output;
	}

	@Override
	public String getValueByAttributeOutput(WebElement element) throws POMEventException
	{
		String output="";
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByAttributeOutput();
        try
        {
        	output=pomevents.getValueByAttributeOutput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByAttributeOutput();
		return output;
	}
	

}
