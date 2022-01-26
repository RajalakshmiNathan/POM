package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MyHomePage extends BaseHooks {
	
	public MyHomePage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public MyLeadsPage clickLeadsLink() {
		// TODO Auto-generated method stub
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.linkText.Leads"))).click();
		
		return new MyLeadsPage(driver,prop);

	}
	

}
