package package06;

import org.testng.annotations.Test;

public class Video_14_HowToCreateTheTestDependantsInTestNg4 {
	String trackingId;
	
	@Test(priority=1)
	public void createShipment() {
		
		System.out.println(5/0);
		trackingId="ABC1234";
		System.out.println("Shipment is created");
	}
	
	//User alwaysRun=true for run the dependant method even after fail the first test case
	
	@Test(priority = 2,dependsOnMethods = {"createShipment"},alwaysRun =true)
	public void trackingShipment() throws Exception{
		if(trackingId!=null) {
			System.out.println("Tracking shipment");
		}
		else {
			throw new Exception("Invalid tracking Id");
		}
	}
	
	@Test(priority = 3,dependsOnMethods = {"createShipment"})
	public void deletingShipment() throws Exception{
		if(trackingId!=null) {
			System.out.println("Deleting shipment");
		}
		else {
			throw new Exception("Invalid tracking Id");
		}
	}

	
}
