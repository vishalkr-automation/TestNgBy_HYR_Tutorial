package package06;

import org.testng.annotations.Test;

public class Video_14_HowToCreateTheTestDependantsInTestNg3 {
	String trackingId;
	
	@Test(priority=1,enabled=false)
	public void createShipment() {
		
		//System.out.println(5/0);
		trackingId="ABC1234";
		System.out.println("Shipment is created");
	}
	
	//It will throw the error 
	@Test(priority = 2,dependsOnMethods = {"createShipment"})
	public void trackingShipment() throws Exception{
		if(trackingId!=null) {
			System.out.println("Tracking shipment");
		}
		else {
			throw new Exception("Invalid tracking Id");
		}
	}
	
	@Test(priority = 3,dependsOnMethods = {"createShipment","trackingShipment"})
	public void deletingShipment() throws Exception{
		if(trackingId!=null) {
			System.out.println("Deleting shipment");
		}
		else {
			throw new Exception("Invalid tracking Id");
		}
	}

}
