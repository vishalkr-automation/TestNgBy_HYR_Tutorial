package package10;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_22_HowToUseTimeOutsAndExpectedExceptionsInTestNg {
	
	@Test(priority=1, timeOut = 10000, enabled=false)
	public void timeOuts() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	//using this feature for negative testing scenarios - it will intentionally to fail the scenario. 
	@Test(priority=2, enabled=false,expectedExceptions = {NoSuchElementException.class})
	public void expectedExceptions() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	//using this feature for negative testing scenarios - it will verify NoSuchElement on the page and will pass the scenario. 
		@Test(priority=2, enabled=true,expectedExceptions = {NoSuchElementException.class})
		public void expectedExceptions2() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.id("dhhgdhd")).isDisplayed();
		}

}
