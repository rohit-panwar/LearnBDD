package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesStepDefinations {

	@Given("User is on Facebook Login Page")
	public void user_is_on_facebook_login_page() {
		System.out.println("Login Page");
	}

	@When("User enter {string} and {string}")
	public void user_enter_incorrect_user_name_and_in_correct_password(String uname, String pwd) {
		System.out.println(uname + " >> " + pwd);
	}

	@When("User enter {int} in token")
	public void user_enter_in_token(int token) {
		System.out.println("  || " + token + " ||");
	}

	@Then("Unsuccessful login message displayed")
	public void unsuccessful_login_message_displayed() {
		System.out.println(" Error: Unsuccessful !!! ");
	}

	/*
	 * @When("User enter incorrectUserName and CorrectPassword") public void
	 * user_enter_incorrect_user_name_and_correct_password() {
	 * 
	 * }
	 * 
	 * @When("User enter CorrectUserName and inCorrectPassword") public void
	 * user_enter_correct_user_name_and_in_correct_password() {
	 * 
	 * }
	 */

}
