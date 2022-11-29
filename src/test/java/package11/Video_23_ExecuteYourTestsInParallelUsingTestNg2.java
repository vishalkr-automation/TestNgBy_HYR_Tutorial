package package11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_23_ExecuteYourTestsInParallelUsingTestNg2 {

	@Test
	public void testMethod5() {
		System.out.println("TestClass>>TestMethod5>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
	}
	
	@Test
	public void testMethod6() {
		System.out.println("TestClass>>TestMethod6>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/");
	}
	
	@Test
	public void testMethod7() {
		System.out.println("TestClass>>TestMethod7>>"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	

}