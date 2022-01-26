package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class EditLeadPage extends BaseHooks {
	
	public EditLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public EditLeadPage updateCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		return this;
		
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver,prop);
		
	}

}
