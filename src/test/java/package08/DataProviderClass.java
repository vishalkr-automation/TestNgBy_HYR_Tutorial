package package08;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	//Here we are using indices concept to read the data based on index number
		@DataProvider()
		public String[] dp1(){
			String[] data=new String[] {
					"Yadagiri",
					"John",
					"Rebecca",
					"Smith"
			};
			return data;
		}
		
		@DataProvider()
		public String[] dp2(){
			String[] data=new String[] {
					"Mamta",
					"Johny",
					"Robin",
					"Ray"
			};
			return data;
		}

}
