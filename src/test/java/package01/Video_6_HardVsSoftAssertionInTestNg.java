package package01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_6_HardVsSoftAssertionInTestNg {
	
	//Hard Assertion
	@Test(description="Hard Assertion")
	public void f1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Googl";
		Assert.assertEquals(actualTitle, expectedTitle,"Verify Title");
		System.out.println("Print the message after using the assertion");
	}
	
	//Soft Assertion
	@Test(description ="Soft Assertion")
	public void f2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Googl";
		SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expectedTitle,"Verify Title");
		System.out.println("Print the message after using the assertion");      //This message will be print even assertion data is mismatching
		softAssert.assertAll();
	}

}
