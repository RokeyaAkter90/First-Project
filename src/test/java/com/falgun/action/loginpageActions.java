package com.falgun.action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.falgun.locator.loginpageLocators;
import com.falgun.utility.base_class;
import com.falgun.utility.utilityy;


public class loginpageActions extends base_class {
	loginpageLocators LoginpageLocators = new loginpageLocators();
	
	public void UserCredentials (String u, String p) throws Exception {
		LoginpageLocators.UserName.sendKeys(u);
		LoginpageLocators.Password.sendKeys(p);
		Thread.sleep(5000);
		
	}
	public void clickloginbutton() throws Exception {
		LoginpageLocators.LoginButton.click();
		Thread.sleep(5000);	
	}
	public void loginTextDisplayed() throws Exception {
		boolean Text= LoginpageLocators.loginText.isDisplayed();
				Assert.assertTrue(Text);
				utilityy.takescreenshot(driver, "Login Text Displayed");
		Thread.sleep(1000);	
}
	public void VerifyLoginNotFound() throws Exception {
	driver.switchTo().alert().accept();
	LoginpageLocators.CloseButton.click();
	 boolean log = LoginpageLocators.LoginButton.isDisplayed();
			 Assert.assertTrue(log);
			 utilityy.takescreenshot(driver, "Login Not Found Displayed");
	Thread.sleep(5000);
	}
	public void Locationbutton() throws Exception {
		//Actions mouse = new Actions (driver);
       // mouse.moveToElement(LoginpageLocators.Location).build().perform();
		LoginpageLocators.Tracking.sendKeys("123456789");
		LoginpageLocators.trackingButton.click();
		
    	Thread.sleep(5000);	
	
	}
}
