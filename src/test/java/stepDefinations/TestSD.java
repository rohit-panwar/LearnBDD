package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSD {

	@Given("I am on search page")
	public void i_am_on_search_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given");

	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String s, Integer i) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When");
	}

	@When("^I search another product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_another_product_with_name_and_price(String string, Integer int1) {
		System.out.println("When-2");
	}

	@Then("Product with name {string} should displayed")
	public void product_with_name_should_displayed(String pdname) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
	}

	@Then("Search is completed")
	public void search_is_completed() {
		System.out.println("AND");
	}

}
