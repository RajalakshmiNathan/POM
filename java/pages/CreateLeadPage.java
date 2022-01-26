package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class CreateLeadPage extends BaseHooks {
	
	public CreateLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public CreateLeadPage enterCompanyName(String company) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	public CreateLeadPage enterLastName(String lName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;

	}
	public CreateLeadPage enterPhoneNumber(String phNumber) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNumber);
		return this;

	}
	
	public ViewLeadPage clickCreateLeadButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLeadPage(driver,prop);

	}

}
