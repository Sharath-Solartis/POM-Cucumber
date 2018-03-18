package com.solartis.test.pom.pages.input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class QuoteProposal extends PomEventsMethodDefinition
{
	
	@FindBy(id=".//*[@id='CreateQuoteProposaldialog']/div[2]/form/div/button[1]")
	public WebElement Create_quote_proposal;
	
	@FindBy(xpath ="*//div[contains(text(),'BUSINESS RULES')]")
	public WebElement businessrules;
	
	@FindBy(xpath ="id('PLQuoteListinfo:quoteListTile:quoteListTile_panel')//table//tr[2]/td[3]/label")
	public WebElement QuoteStatus;
	
	FireEvent FireEventobject = new FireEvent();
	
	
	public void ruleoverride() throws POMEventException
	{
		   int Rule_exist=0;
		   Rule_exist = productdisable(businessrules);
		  // if(QuoteStatus)
		   if(Rule_exist == 1)
		   {
			   String Rule_exist_showing = formdisable("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[contains(text(),'Showing')]");
			   System.out.println(Rule_exist_showing);
			   /*//Check if page exist
			   if(Rule_exist_showing.equals("Eligible"))
			   {
				 //Check if pagination does not exist
				   int rule_count = gettablerowlist("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_data')/tr");
				   System.out.println("Rule Count"+rule_count);
					 for(int i=0;i<rule_count;i++)
					   {
						   System.out.println(i);
						   waitWithClickable("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:"+i+":Object__BusinessRules__Quote__RuleStatus')");
						   FireEventobject.Dropdown(driver.findElements(By.xpath("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:"+i+":Object__BusinessRules__Quote__RuleStatus')")),"Override");
					   }
			   }*/
		   }
	}
	
		
	private int productdisable(WebElement element) throws POMEventException 
	 {
		
		    int tr=0;
		  	if(element.isEnabled())
		   	{
		   		tr=1;
		   	}
		   	else
		   	{
		   		tr=0;
		   	}
		  	return tr;
		
	 }  
	
	
	private String formdisable(String p) 
	 {
		    String noformlabel;
		    System.out.println("inside func");
		    try
		    {
		    	driver.findElement(By.xpath(p));
		    	noformlabel="Label Displayed";
		    }
		   	catch(org.openqa.selenium.NoSuchElementException e)
		    {
		   		noformlabel="No Label";
		    }
		    return noformlabel;
	 }
	

	private int gettablerowlist(String p)
	{
		
		int list=0;
		List<WebElement> TableElement =driver.findElements(By.xpath(p));
	    System.out.println("NUMBER OF ROWS IN THIS TABLE = "+TableElement.size());
	    list=TableElement.size();
	    return list;	
	    
	}
	
	
	private void waitWithClickable(String p) throws POMEventException 
	 {
		
		 	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(p)));
		 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(p)));
		 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p)));
	 }
	
}
