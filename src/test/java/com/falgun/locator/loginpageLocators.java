package com.falgun.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.utility.base_class;

public class loginpageLocators extends base_class{

	public loginpageLocators() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="loginusername")
	public WebElement UserName;
	@FindBy(how=How.ID, using="loginpassword")
	public WebElement Password;
	@FindBy(how=How.XPATH, using="//button[text()='Log in']")
	public WebElement LoginButton;
	
	@FindBy(how=How.ID, using="logInModalLabel")
	public WebElement loginText;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[3]/button[1]")
	public WebElement CloseButton;
	
	@FindBy(how=How.ID, using="trackingnumber")
	public WebElement Tracking;
	
	@FindBy(how=How.ID, using="btnSingleTrack")
	public WebElement trackingButton;
	
}
