package com.falgun.action;

import org.testng.Assert;

import com.falgun.locator.aboutuspageLocators;
import com.falgun.utility.base_class;

public class aboutuspageActions extends base_class{
	aboutuspageLocators AboutuspageLocators= new aboutuspageLocators();
	
	public void clickaboutuslink() throws Exception {
		AboutuspageLocators.aboutuslink.click();
		Thread.sleep(1000);
	}
	public void verifyaboutustextdisplay() {
	
	boolean aboutstext = AboutuspageLocators.aboutustext.isDisplayed();
	Assert.assertTrue(aboutstext);
	}
	public void verifyaboutusvdodisplay() {
	boolean aboutsvideo = AboutuspageLocators.aboutusvdo.isDisplayed();
	Assert.assertTrue(aboutsvideo);
	}
	
	public void playaboutusvideo() throws Exception {
	AboutuspageLocators.playbutton.click();
	Thread.sleep(1000);
	}
	public void verifyplayaboutusvideo() throws Exception {
	boolean vdo = AboutuspageLocators.vdoplaying.isDisplayed();
	Assert.assertTrue(vdo);
	Thread.sleep(1000);
	}
	
	public void closeaboutusvideo() throws Exception {
	AboutuspageLocators.closebutton.click();
	Thread.sleep(1000);
	}
	
	public void verifyclosevdo() {
	boolean aboutsvideo = AboutuspageLocators.aboutusvdo.isDisplayed();
	Assert.assertFalse(aboutsvideo);
	}
	public void xaboutusvideo() throws Exception {
	AboutuspageLocators.xbutton.click();
	Thread.sleep(1000);
		}
	
	public void maximizevideo() throws Exception {
	AboutuspageLocators.maximize.click();
	Thread.sleep(1000);
	}
	public void verifyfullscreenbuttonaction() throws Exception {
	boolean mini = AboutuspageLocators.minimize.isDisplayed();
	Assert.assertTrue(mini);
	Thread.sleep(1000);
	}
	public void picinpicvideo() throws Exception {
	AboutuspageLocators.picinpicbutton.click();
	Thread.sleep(1000);
	}
	public void verifypicinbuttonaction() throws Exception {
	boolean picinpic = AboutuspageLocators.exitpicinpicbutton.isDisplayed();
	Assert.assertTrue(picinpic);
	Thread.sleep(1000);	
	}
	public void mutevideo() throws Exception {
	AboutuspageLocators.mute.click();
	Thread.sleep(1000);
	}
	public void verifymutebuttonactoins() throws Exception {
	boolean unmute = AboutuspageLocators.unmute.isDisplayed();
	Assert.assertTrue(unmute);
	Thread.sleep(1000);	
	}
}

