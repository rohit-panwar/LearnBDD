package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStepDefinations {
	
	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
	    System.out.println("User is on Registration Page");
	}

	@When("User enter the user details without columns")
	public void user_enter_the_user_details(DataTable dataTable) {
		List<List<String>> userDataList= dataTable.asLists(String.class);
	    for(List<String> e: userDataList)
	    	System.out.println(e);
	}
	
	@When("User enter the user details with columns")
	public void user_enter_the_user_details_with_columns(DataTable dataTable) {
	    List<Map<String, String>> userDataMap= dataTable.asMaps(String.class, String.class);
	    System.out.println(userDataMap);
	    System.out.println(userDataMap.get(0).get("firstname") +" : "+ userDataMap.get(0).get("lastname"));
	    
	    for(Map<String, String> e : userDataMap) {
	    	System.out.println(e.get("firstname")); 
	    	System.out.println(e.get("lastname")); 
	    	System.out.println(e.get("contact")); 
	    	System.out.println(e.get("city")); 
	    	
	    }
	}


	@Then("User registration is successfull")
	public void user_registration_is_successfull() {
	    
	}

}
