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
public class ThirdPartiesDetailsPage extends WebDriverUtility
{
	WebDriver driver;
	public ThirdPartiesDetailsPage(WebDriver driver)
	{            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']")   
	private WebElement actThirdpartyName;
	
	@FindBy(xpath ="//span[text()='No record found']")   
	private WebElement actPlaceHolderName;
	
	@FindBy(xpath ="//a[@class='customer-back']")   
	private WebElement actNatureOfTP1;
	
	@FindBy(linkText ="List of Customers")   
	private WebElement listOfCustomersLnk;
	
	@FindBy(linkText ="Customer")   
	private WebElement customerLnk;
	
	
	
	
	public WebElement getActNatureOfTP1() {
		return actNatureOfTP1;
	}

	public WebElement getCustomerLnk() {
		return customerLnk;
	}

	public WebElement getActThirdpartyName() {
		return actThirdpartyName;
	}

	public WebElement getListOfCustomersLnk() {
		return listOfCustomersLnk;
	}

	public WebElement getActPlaceHolderName() {
		return actPlaceHolderName;
	}
	
	

	
}


	


	
