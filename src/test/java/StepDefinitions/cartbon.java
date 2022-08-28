package StepDefinitions;

import com.falgun.action.homepageActions;
import com.falgun.utility.base_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class cartbon extends base_class {
	homepageActions HomepageActions = new homepageActions(); 
	@Given("^Launch \"([^\"]*)\" for demoblaze$")
	public void launch_for_demoblaze(String URL) throws Throwable {
	    getURL(URL);
	}

	@When("^Click on Carts Links$")
	public void click_on_Carts_Links() throws Throwable {
	    HomepageActions.clickonCart();
	}

	@Then("^Verify users can visit carts pages$")
	public void verify_users_can_visit_carts_pages() throws Throwable {
	   
	}



}
