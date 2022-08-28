package com.falgun.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.utility.base_class;

public class profilepageLocators extends base_class{

	public profilepageLocators() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="nameofuser")
	public WebElement UserProfile;
	
	
	@FindBy(how=How.ID, using="logout2")
	public WebElement logOut;
	

}