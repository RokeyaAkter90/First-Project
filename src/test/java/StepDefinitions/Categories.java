package StepDefinitions;

import com.falgun.action.homepageActions;
import com.falgun.utility.base_class;

import cucumber.api.java.en.Then;

public class Categories extends base_class {
	homepageActions HomepageActions = new homepageActions();

	
	@Then("^user click on laptoplink$")
	public void user_click_on_laptoplink() throws Throwable {
		HomepageActions.clickonlaptoplink();
	}

	@Then("^user verify laptops display$")
	public void user_verify_laptops_display() throws Throwable {
		HomepageActions.verifylaptopsdisplay();  
	}
}
