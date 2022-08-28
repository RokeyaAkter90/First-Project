package StepDefinitions;



import com.falgun.action.homepageActions;
import com.falgun.action.loginpageActions;
import com.falgun.action.profilepageActions;
import com.falgun.utility.base_class;
import com.falgun.utility.utilityy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logins extends base_class{
	
	homepageActions HomepageActions = new homepageActions();
	loginpageActions LoginpageActions = new loginpageActions();
	profilepageActions ProfilepageActions = new profilepageActions();
	
	@Given("^Launch \"([^\"]*)\" for demo$")
	public void launch_for_demo(String URL) throws Throwable {
		getURL(URL);
   
	}

	@When("^Click on loginlink")
	public void click_on_loginlink() throws Throwable {
		HomepageActions.clickloginlinkfordemo();
		
	}

	
	@When("^Enter valid username and valid password$")
	public void enter_valid_username_and_valid_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		LoginpageActions.clickloginbutton();
	}

	@Then("^Verify user login sucessfully profile page$")
	public void verify_user_login_sucessfully_profile_page() throws Throwable {
		ProfilepageActions.Verifyuserloginsucessfullyprofilepage();
		utilityy.takescreenshot(driver, "Profile Page");
	   
	}

	@Then("^Enter valid username and invalid password$")
	public void enter_valid_username_and_invalid_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty("USERNAME"), prop.getProperty("INVALIDPASSWORD")); 
	}

	@Then("^Verify user cannot login sucessfully with valid username and invalid password$")
	public void verify_user_cannot_login_sucessfully_with_valid_username_and_invalid_password() throws Throwable {
	    
	}

}
