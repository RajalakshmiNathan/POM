package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class DuplicateLeadPage extends BaseHooks {
	
	public DuplicateLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public DuplicateLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return this;

	}

}
