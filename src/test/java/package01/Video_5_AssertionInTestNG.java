package package01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_5_AssertionInTestNG {
	
	@Test
	public void f1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		Assert.assertEquals(actualTitle, expectedTitle,"Verify Title");
	}
	
	@Test
	public void f2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Googl";
		Assert.assertEquals(actualTitle, expectedTitle,"Verify Title");
	}

}
