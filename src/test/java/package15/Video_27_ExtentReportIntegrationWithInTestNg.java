package package15;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Video_27_ExtentReportIntegrationWithInTestNg extends BaseClass {
	@Test
	public void f1() {
		driver.get("https://www.gmail.com");
		extentTest.info("Open Gmail");
	}
	
	@Test
	public void f2() {
		driver.get("https://www.yahoo.com");
		extentTest.info("Open Yahoo");
		Assert.assertTrue(false);
	}

}
