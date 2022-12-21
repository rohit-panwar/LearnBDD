package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IRCTCStepDefinationsHooks {
	
	@Given("User is on {string} application")
	public void user_is_on_train_booking_application(String s) {
		System.out.println("\t\t\t Given :"+s);
	}

	@When("User search for {string}")
	public void user_search_for_train(String s) {
		System.out.println("\t\t\t When : Search "+s);
	}

	@When("complete payment")
	public void complete_payment() {
		System.out.println("\t\t\t When : Payment");
	}

	@Then("{string} ticket is booked")
	public void ticket_is_booked(String s) {
		System.out.println("\t\t\t Then : "+s+" ticket booked");
	}

}
