package package11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_23_ExecuteYourTestsInParallelUsingTestNg3 {

	@Test
	public void testMethod9() {
		System.out.println("TestClass>>TestMethod4>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
	}
	@Test
	public void testMethod10() {
		System.out.println("TestClass>>TestMethod8>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
}
	
	@Test
	public void testMethod11() {
		System.out.println("TestClass>>TestMethod11>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flygofirst.com/");
	}
	
}