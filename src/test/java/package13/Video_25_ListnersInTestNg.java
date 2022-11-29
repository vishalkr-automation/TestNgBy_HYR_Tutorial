package package13;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ITestListnerClass.class})
public class Video_25_ListnersInTestNg {
	
	@Test
	public void test1() {
		System.out.println("Test Method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test Method 2");
		Assert.assertTrue(false);
	}
	
	@Test(timeOut = 1000)
	public void test3() throws Exception {
		Thread.sleep(2000);
		System.out.println("Test Method 3");
	}
	
	@Test(dependsOnMethods = "test3")
	public void test4() {
		System.out.println("Test Method 4");
	}

}
