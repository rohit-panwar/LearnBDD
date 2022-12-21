package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundStepDefinations {
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    System.out.println("Background: Given ");
	}

	@When("User Enter UserName and Password")
	public void user_enter_user_name_and_password() {
		System.out.println("Background: When-1");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Background: When-2");
	}

	@Then("User navigated to Order page")
	public void user_navigated_to_order_page() {
		System.out.println("Background: Order");
	}

	@When("User click on Open Order link")
	public void user_click_on_open_order_link() {
		System.out.println("Open order link");
	}

	@Then("user will be able to see all open orders")
	public void user_will_be_able_to_see_all_open_orders() {
		System.out.println("Open order displayed");
	}

	@When("User click on Completed Order link")
	public void user_click_on_completed_order_link() {
		System.out.println("Completed order link");
	}
	@Then("user will be able to see all Completed orders")
	public void user_will_be_able_to_see_all_completed_orders() {
		System.out.println("Completed order displayed");
	}

	@When("User click on Pending Order link")
	public void user_click_on_pending_order_link() {
		System.out.println("Pending order link");
	}

	@Then("user will be able to see all Pending  orders")
	public void user_will_be_able_to_see_all_pending_orders() {
		System.out.println("Pending order displayed");
	}
}
