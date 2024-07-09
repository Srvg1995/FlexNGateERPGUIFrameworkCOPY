package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author gagan
 * 
 * Contains Home page elements & business lib 
 *
 */  
public class CustomerDetailsPage extends WebDriverUtility
{
	WebDriver driver;
	public CustomerDetailsPage(WebDriver driver)
	{            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(className ="butAction")   
	private WebElement createProposalBtn;
	
	
	public WebElement getCreateProposalBtn() {
		return createProposalBtn;
	}
	
	
	
	
	

}


	


	
