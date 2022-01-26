package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class CreateLead extends BaseHooks{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "CreateLead";
		
	}
	
	
	@Test(dataProvider="sendData", groups= {"functional","regression"})

	public void runCreateLead(String uName,String pWord,String company,String fName,String lName,String phNo) {
		//LoginPage lp = new LoginPage();
//		new LoginPage(driver).enterUserName(uName)
//		.enterPassword(pWord)
//		.clickLoginButton()
//		.clickCRMSFA()
//		.clickLeadsLink()
//		.clickCreateLeadLink()
//		.enterCompanyName(company)
//		.enterFirstName(fName)
//		.enterLastName(lName)
//		.enterPhoneNumber(phNo)
//		.clickCreateLeadButton()
//		.verifyFirstName();
		
		new LoginPage(driver,prop)
		.enterUserName(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhoneNumber(phNo)
		.clickCreateLeadButton()
		.verifyFirstName();
		
	}
	
	
}
