package package08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Video_18_HowToProvideDataproviderPartiallyInTestNg {
	
	@Test(dataProvider = "Testdata")
	public void test1(String name) {
		System.out.println(name);
	}
	
	//Here we are using indices concept to read the data based on index number
	@DataProvider(name="Testdata", indices = {0,2})
	public String[] loginData(){
		String[] data=new String[] {
				"Yadagiri",
				"John",
				"Rebecca",
				"Smith"
		};
		return data;
	}

}
