package package01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_8_ParametersInTestNg2 {
	
	
WebDriver driver;
	
	@Parameters({"browser","URL","Sleep"})
	@Test
	public void testMethod1(String browserName, String url, Long sleep) throws Exception {
		switch(browserName.toLowerCase()) {
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
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(sleep);
		
		
	}

}
