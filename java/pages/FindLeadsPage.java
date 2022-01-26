package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class FindLeadsPage extends BaseHooks {
	
	//public String leadID;
	public FindLeadsPage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	
	public FindLeadsPage clickPhoneLink() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;

	}
	
	public FindLeadsPage enterPhoneNumber(String phno) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;

	}
	
	public FindLeadsPage enterLeadID() throws InterruptedException {
		// TODO Auto-generated method stub
		//this.leadID = leadID;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;

	}
	
	public FindLeadsPage verifyNoRecords() {
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	return this;
	}
	
	public ViewLeadPage clickFirstLeadID() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver,prop);

	}
	
	
	
	
	
	
	
	

}
