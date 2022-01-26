package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class ViewLeadPage extends BaseHooks {
	
	public ViewLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public ViewLeadPage verifyFirstName() {
		// TODO Auto-generated method stub
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		
		return new ViewLeadPage(driver,prop);

	}
	
	public MyLeadsPage clickDeleteButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver,prop);
	}

	
	public MyLeadsPage clickDuplicateButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new MyLeadsPage(driver,prop);
	}
	
	
	public EditLeadPage clickEditButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver,prop);
	}
	
	public ViewLeadPage verifyCompanyName() {
		// TODO Auto-generated method stub
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		
		return new ViewLeadPage(driver,prop);

	}
	
	public FindLeadsPage clickFindLeadLink() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver,prop);
	}
	
	


}
