package package12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_24_HowToUseInvocationCount_InvocationTimeOut_ThreadPoolSize {

	//It will be execute the test scripts in given number of time (retry)
	@Test(invocationCount = 3, enabled=false)
	public void testMethod1() {
		System.out.println("TestClass>>TestMethod1>>"+Thread.currentThread().getId());
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
	}
	
	//invocationCount= if execution will not be complete in 10 seconds scripts will be fail
	@Test(invocationCount = 3, enabled=false, invocationTimeOut = 10000)
	public void testMethod2() {
		System.out.println("TestClass>>TestMethod1>>"+Thread.currentThread().getId());
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
	}
	
	//threadPoolSize= Execution will be start with 2 threads each time
		@Test(invocationCount = 4, enabled=true, threadPoolSize = 2)
		public void testMethod3() {
			System.out.println("TestClass>>TestMethod1>>"+Thread.currentThread().getId());
			
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://randomuser.me/");
		}
}
