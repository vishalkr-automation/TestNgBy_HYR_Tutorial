package package11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_23_ExecuteYourTestsInParallelUsingTestNg {

	@Test
	public void testMethod1() {
		System.out.println("TestClass>>TestMethod1>>"+Thread.currentThread().getId());
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestClass>>TestMethod2>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	
	@Test
	public void testMethod13() {
		System.out.println("TestClass>>TestMethod3>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	

}