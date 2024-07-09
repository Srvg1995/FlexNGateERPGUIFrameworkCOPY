package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author gagan
 * 
 * Contains Home page elements & business lib 
 *
 */  
public class ThirdPartiesPage extends WebDriverUtility{


	WebDriver driver;
	public ThirdPartiesPage(WebDriver driver)
	{            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="New Third Party")   
	private WebElement newThirdpartyLnk;
	
	@FindBy(linkText="New Prospect")   
	private WebElement newProspectLnk;
	
	@FindBy(xpath ="//a[@href='/dolibarr/societe/card.php?socid=441&save_lastsearch_values=1']")   
	private WebElement availbleCustmrLnk;

	
	
	public WebElement getNewProspectLnk() {
		return newProspectLnk;
	}

	public WebElement getNewThirdpartyLnk() {
		return newThirdpartyLnk;
	}

	public WebElement getAvailbleCustmrLnk() {
		return availbleCustmrLnk;
	}



}
