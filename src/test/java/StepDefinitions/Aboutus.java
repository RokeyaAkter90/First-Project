package StepDefinitions;


import com.falgun.action.aboutuspageActions;

import com.falgun.utility.base_class;
import com.falgun.utility.utilityy;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Aboutus extends  base_class{
	aboutuspageActions AboutuspageActions = new aboutuspageActions();
	
	@When("^Click About us link$")
	public void click_About_us_link() throws Throwable {
	AboutuspageActions.clickaboutuslink(); 
	
	}

	@Then("^Verify About us text is displayed in About us page$")
	public void verify_About_us_text_is_displayed_in_About_us_page() throws Throwable {
	AboutuspageActions.verifyaboutustextdisplay();    
	}

	@Then("^Verify About us video is displayed in About us page$")
	public void verify_About_us_video_is_displayed_in_About_us_page() throws Throwable {
	AboutuspageActions.verifyaboutusvdodisplay();
	}

	@When("^Click play video button$")
	public void click_play_video_button() throws Throwable {
	AboutuspageActions.playaboutusvideo();
	}

	@Then("^Verify User is able to watch  About us  video$")
	public void verify_User_is_able_to_watch_About_us_video() throws Throwable {
	AboutuspageActions.verifyplayaboutusvideo();
	utilityy.takescreenshot(driver, "Play Video");
	}

	@When("^User click on close button$")
	public void user_click_on_close_button() throws Throwable {
	AboutuspageActions.closeaboutusvideo();   
	}

	@Then("^Verify user is able to close  About us  video$")
	public void verify_user_is_able_to_close_About_us_video() throws Throwable {
	AboutuspageActions.verifyclosevdo();
	utilityy.takescreenshot(driver, "Closed Video");
	}

	@When("^User click on x button$")
	public void user_click_on_x_button() throws Throwable {
	AboutuspageActions.xaboutusvideo(); 
	}
	@When("^User click on Fullscreen button$")
	public void user_click_on_Fullscreen_button() throws Throwable {
	AboutuspageActions.maximizevideo();  
	}

	@Then("^User is able to watch maximized screen video$")
	public void user_is_able_to_watch_maximized_screen_video() throws Throwable {
	AboutuspageActions.verifyfullscreenbuttonaction();
	utilityy.takescreenshot(driver, "Fullscreen View");
	}
	@When("^User click on PictureinPicture button$")
	public void user_click_on_PictureinPicture_button() throws Throwable {
	AboutuspageActions.picinpicvideo();
	    
	}

	@Then("^User is able to watch picture slide in separate window$")
	public void user_is_able_to_watch_picture_slide_in_separate_window() throws Throwable {
	AboutuspageActions.verifypicinbuttonaction();
	utilityy.takescreenshot(driver, "Picture-in-Picture View");
	}

	@When("^User click on mute button$")
	public void user_click_on_mute_button() throws Throwable {
	AboutuspageActions.mutevideo();
	}

	@Then("^User is able to mute audio$")
	public void user_is_able_to_mute_audio() throws Throwable {
	AboutuspageActions.verifymutebuttonactoins();
	utilityy.takescreenshot(driver, "Mute Audio");
	}

	
}
