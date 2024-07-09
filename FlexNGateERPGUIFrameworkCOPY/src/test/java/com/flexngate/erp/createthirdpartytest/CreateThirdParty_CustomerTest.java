package com.flexngate.erp.createthirdpartytest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.ListOfCustomersPage;
import com.comcast.crm.objectrepositoryutility.NewThirdPartiesPage;
import com.comcast.crm.objectrepositoryutility.ThirdPartiesDetailsPage;
import com.comcast.crm.objectrepositoryutility.ThirdPartiesPage;
public class CreateThirdParty_CustomerTest extends BaseClass 
{

	@Test(groups = {""})
	public void CreateNewThirdPartyAsCustomerTest() throws Throwable {	

		/* read test script data from Excel file */	
		String thirdpartyName = eLib.getDataFromExcel("Third-party", 7, 2)+ jLib.getRandomNumber();
		String prosOrCust = eLib.getDataFromExcel("Third-party", 7, 3);
		String natureOfTP1 = eLib.getDataFromExcel("Third-party", 7, 4);
		String tpStatus= eLib.getDataFromExcel("Third-party", 7, 5);
		String natureOfTP2 = eLib.getDataFromExcel("Third-party", 7, 6);

		/* navigate to third-parties module */
		HomePage hp = new HomePage(driver);
		hp.getThirdpartiesLnk().click();

		/* click on new third-party link */
		ThirdPartiesPage tp=new ThirdPartiesPage(driver);
		tp.getNewThirdpartyLnk().click();

		/* enter all the details & create third party */
		NewThirdPartiesPage ntp=new NewThirdPartiesPage(driver);
		ntp.createThirdParty(thirdpartyName, prosOrCust);

		/*verify ThirdParty name*/
		ThirdPartiesDetailsPage tpdp=new ThirdPartiesDetailsPage(driver);
		String actThirdpartyName=tpdp.getActThirdpartyName().getText();
		boolean status1=actThirdpartyName.contains(thirdpartyName);
		Assert.assertTrue(status1);
		System.out.println(thirdpartyName + " information is verified==PASS");

		/*navigate to List of Customers*/
		tpdp.getListOfCustomersLnk().click();

		/*Enter TP name,nature of TP,status & click on search button then click on thirdparty name link */
		ListOfCustomersPage lcp=new ListOfCustomersPage(driver);
		lcp.searchForTPName(thirdpartyName);
		lcp.searchForNatureOfTPDD(natureOfTP1);
		lcp.searchForStatusDD(tpStatus);
		lcp.clickOnSearchBtn();
		lcp.clickOnTPNameLnk(thirdpartyName);
		
		
		/*verify ThirdParty details*/
		Assert.assertTrue(driver.getTitle().contains(thirdpartyName));
		System.out.println(thirdpartyName +" has been created==PASS");
		
		/*navigate to List of Customers*/
		tpdp.getListOfCustomersLnk().click();
		
		/*Enter TP name,nature of TP,status & click on search button  */
		lcp.searchForTPName(thirdpartyName);
		lcp.searchForNatureOfTPDD(natureOfTP2);
		lcp.searchForStatusDD(tpStatus);
		lcp.clickOnSearchBtn();
		
		
		/*verify ThirdParty details*/
		String actPlaceHolderContains=tpdp.getActPlaceHolderName().getText();
		boolean status2=actPlaceHolderContains.contains(thirdpartyName);
		Assert.assertFalse(status2);
		System.out.println(thirdpartyName +" has not been created==PASS");


	}
}


