package package05;

import org.testng.annotations.Test;

public class Video_13_HowToGroupYourTestsInTestNg {
	
	@Test(groups= {"smoke"})
	  public void test1() {
		  System.out.println("Test1");
	  }
	  @Test(groups= {"smoke","functional","sanity"})
	  public void test2() {
		  System.out.println("Test2");
	  }
	  @Test(groups= {"functional","regression"})
	  public void test3() {
		  System.out.println("Test3");
	  }

}
