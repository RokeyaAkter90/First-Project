package StepDefinitions;

import com.falgun.action.homepageActions;
import com.falgun.action.loginpageActions;
import com.falgun.action.profilepageActions;
import com.falgun.utility.base_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dropoff extends base_class{
	homepageActions HomepageActions = new homepageActions();
	loginpageActions LoginpageActions= new loginpageActions();
	profilepageActions ProfilepageActions = new profilepageActions ();
	
	@Given("^Launch \"([^\"]*)\" for FedEx$")
	public void launch_for_FedEx(String URL) throws Throwable {
	   getURL(URL);
	}

	@When("^Click on location$")
	public void click_on_location() throws Throwable {
		LoginpageActions.Locationbutton();
	}

	@When("^Click on drop-off$")
	public void click_on_drop_off() throws Throwable {
	    
	}

	@Then("^Verify FedEx drop-off is displayed in the Log In page$")
	public void verify_FedEx_drop_off_is_displayed_in_the_Log_In_page() throws Throwable {
	    
	}



}
