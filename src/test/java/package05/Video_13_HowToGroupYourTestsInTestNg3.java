package package05;

import org.testng.annotations.Test;

@Test(groups = {"all"})
public class Video_13_HowToGroupYourTestsInTestNg3 {
	
	@Test(groups= {"smoke","sanity"})
	  public void test4() {
		  System.out.println("Test4");
	  }
	  @Test(groups= {"regression","sanity"})
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
