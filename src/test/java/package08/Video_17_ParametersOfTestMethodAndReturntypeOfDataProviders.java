package package08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Video_17_ParametersOfTestMethodAndReturntypeOfDataProviders {
	
	//Example of 1 dim array
	@Test(dataProvider = "dp1",enabled=false)
	public void login(String str) {
		System.out.println(str);
	}
	
	@DataProvider
	public String[] dp1() {
		String[] data=new String[] {
				"abc",
				"xyz"
		        };
		
		return data;
	}
	
	
	
	//Example of 2 dimensional Array
	
	@Test(dataProvider = "dp2",enabled=false)
	public void test2(String[] str) {
		System.out.println(str[0]+">>"+str[1]);
	}
	
	@Test(dataProvider = "dp2",enabled=false)
	public void test3(String str1, String str2) {
		System.out.println(str1+">>"+str2);
	}
	
	@DataProvider
	public Object[][] dp2() {
		Object[][] data=new Object[][] {
				{"abc","1"},
				{"pqr","2"},
				{"xyz","3"}
		        };
		
		return data;
	}
	
	
	//Example of multi dimensional Array/Jagged Array
	
		@Test(dataProvider = "dp3",enabled=true)
		public void test4(String[] str) {
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
		@DataProvider
		public Object[][] dp3() {
			Object[][] data=new Object[][] {
					{"abc","1","fgfg","hhhbj"},
					{"pqr","2"},
					{"xyz","3","fdfg"}
			        };
			
			return data;
		}

}
