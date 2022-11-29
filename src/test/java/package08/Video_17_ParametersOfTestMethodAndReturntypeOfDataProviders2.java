package package08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Video_17_ParametersOfTestMethodAndReturntypeOfDataProviders2 {
	
	//Example of Iterator<Object> return type
	@Test(dataProvider = "dp1",enabled=false)
	public void login(String str) {
		System.out.println(str);
	}
	
	@DataProvider
	public Iterator<String> dp1() {
		List<String> data=new ArrayList<>();
		data.add("Yadagiri");
		data.add("Reddy");
		
		return data.iterator();
	}
	
	//Example of Iterator<Object[]> return type
		@Test(dataProvider = "dp2",enabled=false)
		public void login2(String[] str) {
			System.out.println(str[0]+">>"+str[1]);
		}
		
		@DataProvider
		public Iterator<String[]> dp2() {
			List<String[]> data=new ArrayList<>();
			data.add(new String[]{"Yadagiri","mohan"});
			data.add(new String[]{"Reddy","Gopi"});
			
			return data.iterator();
		}
		
		//Example of Iterator<Object[]> return type
				@Test(dataProvider = "dp3",enabled=true)
				public void login3(Object[] str) {
					System.out.println(str[0]+">>"+str[1]);
				}
				
				@DataProvider
				public Iterator<Object[]> dp3() {
					List<Object[]> data=new ArrayList<>();
					data.add(new Object[]{"Yadagiri",1});
					data.add(new Object[]{"Reddy",2});
					
					return data.iterator();
				}
	

}
