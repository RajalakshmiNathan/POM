package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class MergeLead extends BaseHooks{
	
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "MergeLead";
		
	}
	

	@Test(dataProvider="sendData", groups= {"functional","regression"})
	public void runMergeLead(String Fname,String SfName) throws InterruptedException {

		
		
//		new LoginPage(driver)
//		.enterUserName(prop.getProperty("username"))
//		.enterPassword(prop.getProperty("password"))
//		.clickLoginButton()
//		.clickCRMSFA()
//		.clickLeadsLink()
//		.clickFindLeadLink()
//		.clickPhoneLink()
//		.enterPhoneNumber(phNo)
//		.clickFindLeadsButton()
//		.clickFirstLeadID()
//		.clickEditButton()
//		.updateCompanyName(CompName)
//		.clickUpdateButton()
//		.verifyCompanyName();
		
		
		new LoginPage(driver,prop)
		.enterUserName(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickMergeLead()
		.clickFromLead(Fname)
		.clickToLead(SfName)
		.clickMergeButton()
		.clickAcceptAlert()
		.clickFindLeadLink()
		.enterLeadID()
		.clickFindLeadsButton()
		.verifyNoRecords();
		
	}

}
