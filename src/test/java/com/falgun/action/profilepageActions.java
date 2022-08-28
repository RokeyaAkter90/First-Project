package com.falgun.action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.falgun.locator.profilepageLocators;
import com.falgun.utility.base_class;
import com.falgun.utility.utilityy;

public class profilepageActions extends base_class{
	profilepageLocators ProfilepageLocators = new profilepageLocators();
	
	public void Verifyuserloginsucessfullyprofilepage() {
	boolean profile = ProfilepageLocators.UserProfile.isDisplayed();
	Assert.assertTrue(profile);
	utilityy.takescreenshot(driver, "Login In Displayed");
	}
	
	public void ClicklogOut() {
		ProfilepageLocators.logOut.click();
		
		
		}
	
}
