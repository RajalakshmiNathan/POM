package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class HomePage extends BaseHooks {
	
	public HomePage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public HomePage verifyCRMSFAIsDisplayed() {
		// TODO Auto-generated method stub
		try {
			boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			Assert.assertTrue(displayed);
			reportStep("Link text displayed","Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Link text not displayed","Fail");
			e.printStackTrace();
		}
		return this;

	}
	
	public MyHomePage clickCRMSFA() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,prop);

	}

}
