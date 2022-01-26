package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MyLeadsPage extends BaseHooks {
	
	public MyLeadsPage(ChromeDriver driver, Properties prop) {
		this.driver =  driver;
		this.prop = prop;
		
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		// TODO Auto-generated method stub
		//driver.findElement(By.linkText("Create Lead")).click();
		
		//driver.findElement(By.linkText("MyLeadsPage.xpath.CreateLead")).click();
		driver.findElement(By.xpath(prop.getProperty("MyLeadsPage.xpath.CreateLead"))).click();
		return new CreateLeadPage(driver,prop);
	}
	
	public FindLeadsPage clickFindLeadLink() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver,prop);
	}
	
	
	public MergeLeadPage clickMergeLead() {
	driver.findElement(By.linkText("Merge Leads")).click();
	return new MergeLeadPage(driver,prop);
	
	}


}
