package package14;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Video_26_CaptureScreenshotsOnlyForFailedTestCaseInTestNg extends BaseClass {
	
	@Test
	public void f1() {
		driver.get("https://www.gmail.com");
		Assert.assertTrue(false);
	}
	
	@Test
	public void f2() {
		driver.get("https://www.yahoo.com");
		Assert.assertTrue(false);
	}

}
