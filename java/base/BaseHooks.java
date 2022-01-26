package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseHooks {

	//public static ChromeDriver driver;
	public ChromeDriver driver;
	
	public static String leadID;
	
	public String excelFileName;
	
	//public static Properties prop;
	public Properties prop;
	public String testName,testDescription,testCategory,testAuthor;
	public static ExtentReports extent;
	public static ExtentTest test,node;
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		//ExtentReports extent = new ExtentReports();
		extent = new ExtentReports();
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
	}
	
	public void reportStep(String msg,String Status) {
		if(Status.equalsIgnoreCase("Pass")) {
			test.pass(msg);
		}
		if(Status.equalsIgnoreCase("Fail")) {
			//test.fail(msg);
			//throw new RuntimeException("Look into report for more details");
		}
	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	@BeforeClass
	public void testcaseDetails() {
		//ExtentTest test = extent.createTest("CreateLead", "CreateLead with mandatory information");
		ExtentTest test = extent.createTest(testName, testDescription);
		test.assignCategory("smoke");
		test.assignAuthor("Hari");
	}
	
	@DataProvider(indices =0)
	public String[][] sendData() throws IOException{
		
		utils.ReadExcel re= new utils.ReadExcel();
		String[][] readData = re.readData(excelFileName);
		
		
		
		return readData;
		
		
		
		}
	
	//to execute before each scenario
	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String lang) throws IOException {
		if(lang.equals("english")) {
		//FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
			FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
		prop = new Properties();
		prop.load(fis);
		} else if(lang.equals("french")) {
			FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
			prop = new Properties();
			prop.load(fis);
			
		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/");
			}
//To execute after each scenario
	@AfterMethod
	public void postCondition() {
		//driver.close();
	}
}
