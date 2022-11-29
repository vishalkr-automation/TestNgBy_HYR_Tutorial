package package05;

import org.testng.annotations.Test;


public class Video_13_HowToGroupYourTestsInTestNg4 {
	
	@Test(groups= {"windows.smoke","sanity"})
	  public void test4() {
		  System.out.println("Test4");
	  }
	  @Test(groups= {"windows.regression","sanity"})
	  public void test5() {
		  System.out.println("Test5");
	  }
	  @Test(groups= {"functional"})
	  public void test6() {
		  System.out.println("Test6");
	  }
	  @Test()
	  public void test7() {
		  System.out.println("Test7");
	  }

}
