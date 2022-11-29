package package08;

import org.testng.annotations.Test;

public class Video_19_HowToCreateDataproviderInSeperateClassInTestNg {
	
	@Test(dataProvider = "dp1",dataProviderClass = DataProviderClass.class)
	public void test1(String name) {
		System.out.println(name);
	}
	
	

}
