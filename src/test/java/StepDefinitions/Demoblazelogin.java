package StepDefinitions;



import com.falgun.action.DemocartpageActions;
import com.falgun.action.homepageActions;
import com.falgun.action.loginpageActions;
import com.falgun.action.profilepageActions;
import com.falgun.utility.base_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demoblazelogin extends base_class{
	homepageActions HomepageActions = new homepageActions();
	loginpageActions LoginpageActions= new loginpageActions();
	profilepageActions ProfilepageActions = new profilepageActions ();

	@Given("^Launch the \"([^\"]*)\"$")
	public void launch_the(String URL) throws Throwable {
	   getURL(URL); 
	}

	@When("^Click on login link$")
	public void click_on_login_link() throws Throwable {
		HomepageActions.clickloginlinkfordemo();
	}

	@Then("^Verify log in text is displayed in the Log In page$")
	public void verify_log_in_text_is_displayed_in_the_Log_In_page() throws Throwable {
		LoginpageActions.loginTextDisplayed();
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}

	@When("^Click on login button in login page$")
	public void click_on_login_button_in_login_page() throws Throwable {
	   LoginpageActions.clickloginbutton();
	}

	@Then("^Verify user can login using valid credentials$")
	public void verify_user_can_login_using_valid_credentials() throws Throwable {
		ProfilepageActions.Verifyuserloginsucessfullyprofilepage();
		ProfilepageActions.ClicklogOut();
		
	}

	@When("^Enter username and invalid password$")
	public void enter_username_and_invalid_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty("USERNAME"), prop.getProperty("INVALIDPASSWORD"));
	}

	@Then("^Verify user cannot login using invalid credentials$")
	public void verify_user_cannot_login_using_invalid_credentials() throws Throwable {
		LoginpageActions.VerifyLoginNotFound();
	}
	
	@When("^Enter empty username and empty password$")
	public void enter_empty_username_and_empty_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty(""), prop.getProperty(""));
		
	}
	

	@When("^Enter invalid username and valid password$")
	public void enter_invalid_username_and_valid_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty("INVALIDUSERNAME"), prop.getProperty("PASSWORD"));
	}

	@When("^Enter invalid username and invalid password$")
	public void enter_invalid_username_and_invalid_password() throws Throwable {
		LoginpageActions.UserCredentials(prop.getProperty("INVALIDUSERNAME"), prop.getProperty("INVALIDPASSWORD"));
	}

}
