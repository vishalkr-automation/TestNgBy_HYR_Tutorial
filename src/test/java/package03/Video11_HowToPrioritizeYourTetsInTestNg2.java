package package03;

import org.testng.annotations.Test;

public class Video11_HowToPrioritizeYourTetsInTestNg2 {
  
//Follow ASCII rules
//https://www.techonthenet.com/ascii/chart.php
  @Test(priority = 'A')
  public void signup() {
	  System.out.println("Signup");
  }
  @Test(priority = 'B')
  public void login() {
	  System.out.println("Login");
  }
  @Test(priority = 'C')
  public void searchFlight() {
	  System.out.println("Search Flight");
  }
  @Test(priority = 'D')
  public void creatingBooking() {
	  System.out.println("Creating Booking");
  }
  @Test(priority = 'E')
  public void saveTicekts() {
	  System.out.println("Save Tickets");
  }
}
