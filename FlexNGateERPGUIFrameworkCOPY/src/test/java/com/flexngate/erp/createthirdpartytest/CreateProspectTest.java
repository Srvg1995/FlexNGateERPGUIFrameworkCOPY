package com.flexngate.erp.createthirdpartytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.NewThirdPartiesPage;
import com.comcast.crm.objectrepositoryutility.ThirdPartiesDetailsPage;
import com.comcast.crm.objectrepositoryutility.ThirdPartiesPage;
public class CreateProspectTest extends BaseClass 
{

	@Test(groups = {""})
	public void createNewProspectTest() throws Throwable {	

		/* read test script data from Excel file */	
		String thirdpartyName = eLib.getDataFromExcel("Third-party", 4, 2)+ jLib.getRandomNumber();
		String aliasName = eLib.getDataFromExcel("Third-party", 4, 3);
		String prosOrCust = eLib.getDataFromExcel("Third-party", 4, 4);
		String thirdPartyAddress = eLib.getDataFromExcel("Third-party", 4, 5);
		String zipCode = eLib.getDataFromExcel("Third-party", 4, 6);
		String cityName = eLib.getDataFromExcel("Third-party", 4, 7);
		String stateOrProvince = eLib.getDataFromExcel("Third-party", 4, 8);
		String phoneNum = eLib.getDataFromExcel("Third-party", 4, 9);
		String faxNum = eLib.getDataFromExcel("Third-party", 4, 10);
		String emailAdd = eLib.getDataFromExcel("Third-party", 4, 11);
		String webAdd = eLib.getDataFromExcel("Third-party", 4, 12);
		String profId1 = eLib.getDataFromExcel("Third-party", 4, 13);
		String profId2 = eLib.getDataFromExcel("Third-party", 4, 14);
		String profId3 = eLib.getDataFromExcel("Third-party", 4, 15);
		String profId4 = eLib.getDataFromExcel("Third-party", 4, 16);
		String profId5 = eLib.getDataFromExcel("Third-party", 4, 17);
		String vatID = eLib.getDataFromExcel("Third-party", 4, 18);
		String thirdPartyType = eLib.getDataFromExcel("Third-party", 4, 19);
		String workforce = eLib.getDataFromExcel("Third-party", 4, 20);
		String capital = eLib.getDataFromExcel("Third-party", 4, 21);
		String parentCompny = eLib.getDataFromExcel("Third-party", 4, 22);
		String AsignedSalesRep = eLib.getDataFromExcel("Third-party", 4, 23);


		/* navigate to third-parties module */
		HomePage hp = new HomePage(driver);
		hp.getThirdpartiesLnk().click();

		/* click on new third-party link */
		ThirdPartiesPage tp=new ThirdPartiesPage(driver);
		tp.getNewProspectLnk().click();


		/* enter all the details & create third party */
		NewThirdPartiesPage ntp=new NewThirdPartiesPage(driver);

		ntp.createTPWithThirdpartyName(thirdpartyName);
		ntp.createTPWithAliasName(aliasName);
		ntp.createTPWithProsOrCustDD(prosOrCust);
		ntp.createTPWithAddress(thirdPartyAddress);
		ntp.createTPWithZipCode(zipCode);
		ntp.createTPWithCity(cityName);
		ntp.createTPWithStateOrProvDD(stateOrProvince);
		ntp.createTPWithPhoneNum(phoneNum);
		ntp.createTPWithFaxNum(faxNum);
		ntp.createTPWithEmail(emailAdd);
		ntp.createTPWithWeb(webAdd);
		ntp.createTPWithProId1(profId1);
		ntp.createTPWithProId2(profId2);
		ntp.createTPWithProId3(profId3);
		ntp.createTPWithProId4(profId4);
		ntp.createTPWithProId5(profId5);
		ntp.createTPWithVatId(vatID);
		ntp.createTPWithThirdPartyTypeDD(thirdPartyType);
		ntp.createTPWithWorkforceDD(workforce);
		ntp.createTPWithCapital(capital);
		ntp.createTPWithParentCompnyDD(parentCompny);
		ntp.createTPWithAssignedSalesRepDD(AsignedSalesRep);
		ntp.createTPWithchooseFile();
		ntp.createTPWithThirdpartyBtn();


		/*verify ThirdParty name*/
		ThirdPartiesDetailsPage tpdp=new ThirdPartiesDetailsPage(driver);
		String actThirdpartyName=tpdp.getActThirdpartyName().getText();
		boolean status=actThirdpartyName.contains(thirdpartyName);
		Assert.assertTrue(status);
		System.out.println(thirdpartyName + " information is verified==PASS");

	}
}


