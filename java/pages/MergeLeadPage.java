package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MergeLeadPage extends BaseHooks{
	
	public MergeLeadPage(ChromeDriver driver,Properties prop) {
		
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public MergeLeadPage clickFromLead(String fname) throws InterruptedException {
	
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles.get(0));
	return this;	
	}
	
	
	public MergeLeadPage clickToLead(String sfName) throws InterruptedException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(sfName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return this;	
		
	}
	
	public MergeLeadPage clickMergeButton() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	return this;
	}
	
	public ViewLeadPage clickAcceptAlert() {
		driver.switchTo().alert().accept();
	return new ViewLeadPage(driver,prop);
	}

}
