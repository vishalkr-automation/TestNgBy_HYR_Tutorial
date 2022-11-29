package package01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Video_7_TestNgAnnotationsAndFlowOfExecutions {
	
	@Test
	  public void testMethod1() {
		  System.out.println("This is First Test Method");
	  }
	  @Test
	  public void testMethod2() {
		  System.out.println("This is Second Test Method");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This is After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This is Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is After Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This is Before Suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This is After Suite");
	  }


}
