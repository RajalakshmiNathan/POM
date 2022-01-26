package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class DeleteLead extends BaseHooks {
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "DeleteLead";
		
	}

	
	@Test(dataProvider="sendData", groups= {"functional","regression"})
	public void runDeleteLead(String phNo) throws InterruptedException {
//		new LoginPage(driver)
//		.enterUserName()
//		.enterPassword()
//		.clickLoginButton()
//		.clickCRMSFA()
//		.clickLeadsLink()
//		.clickFindLeadLink()
//		.clickPhoneLink()
//		.enterPhoneNumber()
//		.clickFindLeadsButton()
//		.clickFirstLeadID()
//		.clickDeleteButton()
//		.clickFindLeadLink()
//		.enterLeadID()
//		.clickFindLeadsButton()
//		.verifyNoRecords();
		
		new LoginPage(driver,prop)
		.enterUserName(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeadLink()
		.clickPhoneLink()
		.enterPhoneNumber(phNo)
		.clickFindLeadsButton()
		.clickFirstLeadID()
		.clickDeleteButton()
		.clickFindLeadLink()
		.enterLeadID()
		.clickFindLeadsButton()
		.verifyNoRecords();
		
	}
}
