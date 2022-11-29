package package09;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_21_ParralelExecutionWithDataProviderInTestNg2 {
	
	@Test(dataProvider = "loginTest")
	public void login(String userName, String password) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	//(Parallel = true) will start execution parallel using data provider
	@DataProvider(parallel = true)
	public Object[][] loginTest() {
		Object[][] data=new Object[4][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		data[3][0]="Admin";
		data[3][1]="admin123";
		
		return data;
	}

}
