package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStepDefinationsTags {
	
	@Given("User want to select {string} car")
	public void user_want_to_select_car(String car) {
	   System.out.println("Booked: "+car);
	}

	@When("User Select Pickup {string} and Drop {string}")
	public void user_select_pickup_and_drop(String src, String dest) {
		System.out.println("Booked from: "+src+ " to "+dest);
	}

	@Then("Cab is booking for {int} INR")
	public void cab_is_booking_for_inr(Integer fare) {
		System.out.println("Total fare: "+fare);
	}

}
