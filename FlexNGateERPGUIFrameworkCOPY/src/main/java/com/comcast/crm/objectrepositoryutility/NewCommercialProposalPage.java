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
public class NewCommercialProposalPage extends WebDriverUtility
{
	WebDriver driver;
	public NewCommercialProposalPage(WebDriver driver)
	{            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="select2-select_demand_reason_id-container")   
	private WebElement sourceDD;
	@FindBy(xpath = "//li[text()='Commercial contact']")   
	private WebElement sourceDDEdt;
	
	
	@FindBy(name = "save")
	private WebElement createDraftBtn;
	
	
	
	
	
	public WebElement getSourceDD() {
		return sourceDD;
	}
	public WebElement getSourceDDEdt() {
		return sourceDDEdt;
	}
	public WebElement getCreateDraftBtn() {
		return createDraftBtn;
	}
	
	
	
	
	public void createDraft(String source ) 
	{
	getSourceDD().click();
	getSourceDDEdt().click();
	getCreateDraftBtn().click();
	}
	

}


	


	
