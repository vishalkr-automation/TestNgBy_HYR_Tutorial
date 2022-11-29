package package15;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.base64.Base64;

public class BaseClass {
	public static WebDriver driver;
	public static String screenshotSubFolderName;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(ITestContext context, @Optional("chrome")String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 break;
		default:
			System.out.println("Invalid browser");
		}
		 extentTest=extentReports.createTest(context.getName());
		 extentTest.pass("Browser Launch successfully");
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@BeforeSuite
	public void beforeSuite() {
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(".\\ExtentReportFolder\\AllReports.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
	}
	
	@AfterSuite
	public void afterSuite() {
		extentReports.flush();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		String path=captureScreenShot(result.getMethod().getMethodName());
		if(result.getStatus()==ITestResult.FAILURE) {
			//extentTest.addScreenCaptureFromPath(path);
			extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			extentTest.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.pass(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
	}
	
	public String captureScreenShot(String fileName) {
		if (screenshotSubFolderName == null) {
			LocalDateTime loaDateTime = LocalDateTime.now();
			System.out.println("Before Formatting: " + loaDateTime);
			DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotSubFolderName = loaDateTime.format(format);
		}
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+".\\Screenshot\\"+screenshotSubFolderName+"\\"+fileName+".png";
		File destFile = new File(path);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		return path;
	}

}
