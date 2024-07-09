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
public class NewThirdPartiesPage extends WebDriverUtility
{
	WebDriver driver;
	public NewThirdPartiesPage(WebDriver driver)
	{            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="name")   
	private WebElement thirdpartyNameEdt;
	
	@FindBy(xpath ="//input[@name='save']")   
	private WebElement createThirdpartyBtn;
	
	@FindBy( xpath ="//span[@class='select2-selection select2-selection--single flat']")
	private WebElement prosOrCustDD;
	@FindBy( xpath ="//input[@aria-controls='select2-customerprospect-results']")
	private WebElement prosOrCustDDEdt;
	
	@FindBy(id ="name_alias_input")   
	private WebElement aliasNameEdt;
	
	@FindBy(id ="address")   
	private WebElement addressEdtBx;
	
	@FindBy(id ="zipcode")   
	private WebElement zipCodeEdt;
	
	@FindBy(id ="town")   
	private WebElement cityEdt;
	
	@FindBy(id ="select2-state_id-container")   
	private WebElement stateOrProvDD;
	
	@FindBy( xpath ="//input[@aria-controls='select2-state_id-results']")
	private WebElement stateOrProvDDEdt;
	
	@FindBy(id ="phone")   
	private WebElement phoneEdt;
	
	@FindBy(id ="fax")   
	private WebElement faxEdt;
	
	@FindBy(id ="email")   
	private WebElement emailEdt;
	
	@FindBy(id ="url")   
	private WebElement webEdt;
	
	@FindBy(id ="idprof1")   
	private WebElement proId1Edt;
	
	@FindBy(id ="idprof2")   
	private WebElement proId2Edt;
	
	@FindBy(id ="idprof3")   
	private WebElement proId3Edt;
	
	@FindBy(id ="idprof4")   
	private WebElement proId4Edt;
	
	@FindBy(id ="idprof5")   
	private WebElement proId5Edt;
	
	@FindBy(id ="intra_vat")   
	private WebElement vatIdEdt;
	
	@FindBy(id ="select2-typent_id-container")   
	private WebElement thirdPartyTypeDD;
	
	@FindBy( xpath ="//input[@aria-controls='select2-typent_id-results']")
	private WebElement thirdPartyTypeDDEdt;
	
	@FindBy(id ="select2-effectif_id-container")   
	private WebElement workforceDD;
	
	@FindBy( xpath ="//input[@aria-controls='select2-effectif_id-results']")
	private WebElement workforceDDEdt;
	
	@FindBy(id ="capital")   
	private WebElement capitalEdt;
	
	@FindBy(xpath ="//span[text()='Select a third party']")   
	private WebElement parentCompnyDD;
	
	@FindBy( xpath ="//input[@aria-controls='select2-parent_company_id-results']")
	private WebElement parentCompnyDDEdt;
	
	
	@FindBy( xpath ="//input[@class='select2-search__field']")   
	private WebElement AssignedSalesRepDD;
	
	
	@FindBy(id ="photoinput")   
	private WebElement chooseFileBtn;
	
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getAliasNameEdt() {
		return aliasNameEdt;
	}


	public WebElement getAddressEdtBx() {
		return addressEdtBx;
	}


	public WebElement getZipCodeEdt() {
		return zipCodeEdt;
	}


	public WebElement getCityEdt() {
		return cityEdt;
	}


	public WebElement getStateOrProvDD() {
		return stateOrProvDD;
	}


	public WebElement getStateOrProvDDEdt() {
		return stateOrProvDDEdt;
	}


	public WebElement getPhoneEdt() {
		return phoneEdt;
	}


	public WebElement getFaxEdt() {
		return faxEdt;
	}


	public WebElement getEmailEdt() {
		return emailEdt;
	}


	public WebElement getWebEdt() {
		return webEdt;
	}


	public WebElement getProId1Edt() {
		return proId1Edt;
	}


	public WebElement getProId2Edt() {
		return proId2Edt;
	}


	public WebElement getProId3Edt() {
		return proId3Edt;
	}


	public WebElement getProId4Edt() {
		return proId4Edt;
	}


	public WebElement getProId5Edt() {
		return proId5Edt;
	}


	public WebElement getVatIdEdt() {
		return vatIdEdt;
	}


	public WebElement getThirdPartyTypeDD() {
		return thirdPartyTypeDD;
	}


	public WebElement getThirdPartyTypeDDEdt() {
		return thirdPartyTypeDDEdt;
	}


	public WebElement getWorkforceDD() {
		return workforceDD;
	}


	public WebElement getWorkforceDDEdt() {
		return workforceDDEdt;
	}


	public WebElement getCapitalEdt() {
		return capitalEdt;
	}


	public WebElement getParentCompnyDD() {
		return parentCompnyDD;
	}


	public WebElement getParentCompnyDDEdt() {
		return parentCompnyDDEdt;
	}


	public WebElement getAssignedSalesRepDD() {
		return AssignedSalesRepDD;
	}


	public WebElement getChooseFileBtn() {
		return chooseFileBtn;
	}


	public WebElement getThirdpartyNameEdt() {
		return thirdpartyNameEdt;
	}


	public WebElement getCreateThirdpartyBtn() {
		return createThirdpartyBtn;
	}

	
	public WebElement getProsOrCustDD() {
		return prosOrCustDD;
	}


	public WebElement getProsOrCustDDEdt() {
		return prosOrCustDDEdt;
	}
	
	
	
	


	public void createThirdParty(String thirdpartyName,String prosOrCust) throws InterruptedException {
		thirdpartyNameEdt.sendKeys(thirdpartyName);
		Thread.sleep(2500);
		prosOrCustDD.click();
		driver.findElement(By.xpath("//li[text()='"+prosOrCust+"']")).click();
		Thread.sleep(2500);
		createThirdpartyBtn.click();
	}
	
	public void createThirdParty2(String thirdpartyName,String prosOrCust) {
		thirdpartyNameEdt.sendKeys(thirdpartyName);
		prosOrCustDD.click();
		driver.findElement(By.xpath("//li[text()='"+prosOrCust+"']")).click();
		createThirdpartyBtn.click();
	}

	public void createTPWithThirdpartyName(String thirdpartyName)   
	{
		getThirdpartyNameEdt().sendKeys(thirdpartyName);
	}
	public void createTPWithAliasName(String aliasName)
	{
		getAliasNameEdt().sendKeys(aliasName);
	}
	public void createTPWithProsOrCustDD(String prosOrCust)
	{
		getProsOrCustDD().click();
		driver.findElement(By.xpath("//li[text()='"+prosOrCust+"']")).click();
	}
	public void createTPWithAddress(String thirdPartyAddress)
	{
		getAddressEdtBx().sendKeys(thirdPartyAddress);
	}
	public void createTPWithZipCode(String zipCode)
	{
		getZipCodeEdt().sendKeys(zipCode);
	}
	public void createTPWithCity(String cityName)
	{
		getCityEdt().sendKeys(cityName);
	}
	public void createTPWithStateOrProvDD(String stateOrProvince)
	{
		getStateOrProvDD().click();
		getStateOrProvDDEdt().sendKeys(stateOrProvince+Keys.ENTER);
	}
	public void createTPWithPhoneNum(String phoneNum)
	{
		getPhoneEdt().sendKeys(phoneNum);
	}
	public void createTPWithFaxNum(String faxNum)
	{
		getFaxEdt().sendKeys(faxNum);
	}
	
	public void createTPWithEmail(String emailAdd)
	{
		getEmailEdt().sendKeys(emailAdd);
	}
	
	public void createTPWithWeb(String webAdd)
	{
		getWebEdt().sendKeys(webAdd);
	}
	public void createTPWithProId1(String profId1)
	{
		getProId1Edt().sendKeys(profId1);
	}
	public void createTPWithProId2(String profId2)
	{
		getProId2Edt().sendKeys(profId2);
	}
	public void createTPWithProId3(String profId3)
	{	
		getProId3Edt().sendKeys(profId3);
	}
	public void createTPWithProId4(String profId4)
	{
		getProId4Edt().sendKeys(profId4);
	}
	public void createTPWithProId5(String profId5)
	{
		getProId5Edt().sendKeys(profId5);
	}
	public void createTPWithVatId(String vatID)
	{
		getVatIdEdt().sendKeys(vatID);
	}
	public void createTPWithThirdPartyTypeDD(String thirdPartyType)
	{
		getThirdPartyTypeDD().click();
		getThirdPartyTypeDDEdt().sendKeys(thirdPartyType+Keys.ENTER);
	}
	
	public void createTPWithWorkforceDD(String workforce)
	{
		getWorkforceDD().click();
		getWorkforceDDEdt().sendKeys(workforce+Keys.ENTER);
	}
	public void createTPWithCapital(String capital)
	{
		getCapitalEdt().sendKeys(capital);
	}
	
	public void createTPWithParentCompnyDD(String parentCompny)
	{
		getParentCompnyDD().click();
		getParentCompnyDDEdt().sendKeys(parentCompny+Keys.ENTER);
	}
	
	public void createTPWithAssignedSalesRepDD(String AsignedSalesRep)
	{
	
		getAssignedSalesRepDD().sendKeys(AsignedSalesRep+Keys.ENTER);
	}
	
	public void createTPWithchooseFile()
	{
		waitForPageToLoad(driver);
		handlingFileUploadPopup(chooseFileBtn, "./resourse/Tek Pyramid Logo.JPG");
	}
	
	public void createTPWithThirdpartyBtn()
	{
		
		getCreateThirdpartyBtn().click();
		
	}


}


	


	
