package package14;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	public static WebDriver driver;
	public static String screenshotSubFolderName;
	
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			captureScreenShot(result.getMethod().getMethodName());
		}
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	public void captureScreenShot(String fileName) {
		if (screenshotSubFolderName == null) {
			LocalDateTime loaDateTime = LocalDateTime.now();
			System.out.println("Before Formatting: " + loaDateTime);
			DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotSubFolderName = loaDateTime.format(format);
		}
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/"+screenshotSubFolderName+"/"+fileName+".jpg");
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}

}
