package package03;

import org.testng.annotations.Test;

public class Video11_HowToPrioritizeYourTetsInTestNg3 {
  
//Follow ASCII rules
  @Test(priority = 0)
  public void signup() {
	  System.out.println("Signup");
  }
  @Test(priority = 1)
  public void login() {
	  System.out.println("Login");
  }
  @Test(priority = 2)
  public void searchFlight() {
	  System.out.println("Search Flight");
  }
  @Test(priority = 3)
  public void creatingBooking() {
	  System.out.println("Creating Booking");
  }
  @Test(priority = 4)
  public void saveTicekts() {
	  System.out.println("Save Tickets");
  }
}
