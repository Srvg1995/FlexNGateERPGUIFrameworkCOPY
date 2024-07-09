package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
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
public class ListOfCustomersPage extends WebDriverUtility
{
	WebDriver driver;
	public ListOfCustomersPage(WebDriver driver)
	{            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name ="search_nom")   
	private WebElement tpNameSearchBx;

	@FindBy(id ="select2-search_type-container")   
	private WebElement natureOfTpDD;
	@FindBy(xpath ="//input[@aria-controls='select2-search_type-results']")   
	private WebElement natureOfTpDDEdt;

	@FindBy(id ="select2-search_status-container")   
	private WebElement statusDD;
	@FindBy(xpath ="//input[@aria-controls='select2-search_status-results']")   
	private WebElement statusDDEdt;

	@FindBy(xpath ="//span[@class='fas fa-search']")   
	private WebElement searchBtn;





	public WebElement getTpNameSearchBx() {
		return tpNameSearchBx;
	}
	public WebElement getNatureOfTpDD() {
		return natureOfTpDD;
	}
	public WebElement getNatureOfTpDDEdt() {
		return natureOfTpDDEdt;
	}
	public WebElement getStatusDD() {
		return statusDD;
	}
	public WebElement getStatusDDEdt() {
		return statusDDEdt;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}




	public void searchForTPName(String thirdpartyName)
	{
		getTpNameSearchBx().sendKeys(thirdpartyName);	
	}
	public void searchForNatureOfTPDD(String natureOfTP1 )
	{
		getNatureOfTpDD().click();
		getNatureOfTpDDEdt().sendKeys(natureOfTP1+Keys.ENTER);
	}
	public void searchForStatusDD(String tpStatus )
	{
		getStatusDD().click();
		getStatusDDEdt().sendKeys(tpStatus+Keys.ENTER);
	}

	public void clickOnSearchBtn()
	{
		getSearchBtn().click();
	}


	public void clickOnTPNameLnk(String thirdPartyName)
	{

		driver.findElement(By.xpath("//a[text()='"+thirdPartyName+"']")).click();//DYNAMIC XPATH
	}
	
}






