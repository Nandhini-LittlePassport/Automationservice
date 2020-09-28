package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.Homepage_page;
import pages.LoginPage;
import util.CaptureScreenshot;
import util.fileReader;
import util.propertyReader;



public class Login {
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;

	@BeforeSuite
	public void getwebdriver() {
		report = new ExtentReports(propertyReader.readData("ExtentReport")+"\\"+"ExtentReportResults.html");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void openurl() {
		driver.get(propertyReader.readData("website"));
	}

	@Test(groups = { "smoke"},priority=2)
	public void automationpractice004() {
		try {
		test = report.startTest("Verify whether  Proper Error is displayed when login with Invalid User Credentials\r\n" );
		
	        test.log(LogStatus.PASS, "URL Launched Successfully"+test.addScreenCapture(CaptureScreenshot.captureScreenshot(driver, "launchwebsite")));
	        String emailid=fileReader.getTestdata(1, 1);
	        String password=fileReader.getTestdata(1, 2);
	        Homepage_page.SignIn_Btn(driver).click();
	        LoginPage.getEmailid_Txtfield(driver).sendKeys(emailid);
	        LoginPage.getPassword_Txtfield(driver).sendKeys(password);
	        LoginPage.getSubmit_Btn(driver);
	        if(LoginPage.getError_Msg(driver).getText().equals("Authentication failed.")) {
	        	test.log(LogStatus.PASS, "'Authentication failed.' Error Message is displayed Properly"+test.addScreenCapture(CaptureScreenshot.captureScreenshot(driver, "Login")));
	        }
	        else {
	        	test.log(LogStatus.PASS, "'Authentication failed.' Error Message is NOT displayed Properly"+test.addScreenCapture(CaptureScreenshot.captureScreenshot(driver, "Login")));
	        }
		report.endTest(test);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	


	@AfterTest
	public void testcasedone() {
		
		System.out.println("testcase completed !!!");
	}

	@AfterClass
	public void closeBrowser() {
		report.flush();
		driver.quit();
	}
}
