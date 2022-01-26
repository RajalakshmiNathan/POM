package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class EditLead extends BaseHooks {
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "EditLead";
		
	}
	
	@Test(dataProvider="sendData", groups= {"functional","regression"})
	public void runEditLead(String phNo,String CompName) throws InterruptedException {
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
//		.clickFirstLeadID();
		
		
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
		.clickEditButton()
		.updateCompanyName(CompName)
		.clickUpdateButton()
		.verifyCompanyName();
	}

}
