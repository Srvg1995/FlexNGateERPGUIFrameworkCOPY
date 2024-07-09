package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
public class HomePage extends WebDriverUtility
{                             
                           
	WebDriver driver;
	 public HomePage(WebDriver driver)
	 {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 

	 @FindBy(id="mainmenutd_companies")   
		private WebElement thirdpartiesLnk;
	 
	 @FindBy(id="topmenu-login-dropdown")
		private WebElement userImgDD;
		
	
	 @FindBy(xpath ="//span[text()='Logout']")
		private WebElement logoutBtn;
	
	
	 
	 public WebElement getThirdpartiesLnk() {
		return thirdpartiesLnk;
	}

	public WebElement getUserLink() {
		return userImgDD;
	}

	public WebElement getLogoutLnk() {
		return logoutBtn;
	}

	
	public void logout() throws InterruptedException
		{
			userImgDD.click();
			mousemoveOnElement(driver, logoutBtn);
			logoutBtn.click();
			Thread.sleep(5000);
		}
	
	
	}

	



	
	

