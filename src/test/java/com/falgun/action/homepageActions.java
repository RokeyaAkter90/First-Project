package com.falgun.action;

import org.testng.Assert;

import com.falgun.locator.homepageLocators;
import com.falgun.utility.base_class;

public class homepageActions extends base_class {

	homepageLocators HomepageLocators = new homepageLocators();
	
	public void clickloginlinkfordemo() throws Exception {
		HomepageLocators.loginlink.click();
		Thread.sleep(3000);

	}
	
	public void clickonlaptoplink () throws Exception {
	HomepageLocators.laptop.click();
		
	}
	public void verifylaptopsdisplay () throws Exception {
	boolean laptopss = HomepageLocators.sonyvaioi5.isDisplayed();
	Assert.assertTrue(laptopss);
		
	}
	public void cartlink() throws Exception {
	HomepageLocators.cart.click();
	Thread.sleep(2000);
	}
	
	public void clickonproducts() throws Exception {
	HomepageLocators.sonyvaioi5.click();
	Thread.sleep(2000);
	}
	public void clickonCart() throws Exception {
		HomepageLocators.cartlink.click();
		Thread.sleep(2000);
		}
}
