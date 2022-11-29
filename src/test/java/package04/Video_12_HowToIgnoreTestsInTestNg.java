package package04;

import org.testng.annotations.Test;

public class Video_12_HowToIgnoreTestsInTestNg {
	
	@Test(enabled=true)
	  public void test1() {
		  System.out.println("Test1");
	  }
	  @Test(enabled=true)
	  public void test2() {
		  System.out.println("Test2");
	  }
	  @Test(enabled=true)
	  public void test3() {
		  System.out.println("Test3");
	  }
	  @Test(enabled=true)
	  public void test4() {
		  System.out.println("Test4");
	  }
	  @Test(enabled=true)
	  public void test5() {
		  System.out.println("Test5");
	  }

}
