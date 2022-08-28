package com.falgun.action;


import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.falgun.locator.DemocartpageLocators;
import com.falgun.utility.base_class;
import com.falgun.utility.utilityy;

public class DemocartpageActions extends base_class {
	DemocartpageLocators democartpageLocators = new DemocartpageLocators();
		
 public void verifycartpagedisplay() throws Exception {
	boolean cartpage = democartpageLocators.getintouch.isDisplayed();
	Assert.assertTrue(cartpage);
	Thread.sleep(1000);
	utilityy.takescreenshot(driver, "Cart Page display");
 }
 public void verifyproductdescription() throws Exception {
	 boolean prodescription = democartpageLocators.productdescription.isDisplayed();
	 Assert.assertTrue(prodescription);
	 Thread.sleep(1000);
 }
 public void verifyaboutusgetintouch() throws Exception {
	 boolean aboutus = democartpageLocators.aboutus.isDisplayed();
	 Assert.assertTrue(aboutus);
	 boolean getintouch = democartpageLocators.getphone.isDisplayed();
	 Assert.assertTrue(getintouch);
	 Thread.sleep(1000);
 }
 public void verifyplaceorderbutton() {
	boolean placeorder = democartpageLocators.placeorder.isDisplayed();
	Assert.assertTrue(placeorder);
	utilityy.takescreenshot(driver, "Placeorderbutton Displayed");
 }
 
 public void clickaddtocart() throws Exception {
 democartpageLocators.addtocart.click();
Thread.sleep(1000);
Alert alt = driver.switchTo().alert();
alt.accept();
Thread.sleep(1000);
 }
  public void veifyitemadeedincart() throws Exception {
	democartpageLocators.cart.click();
	boolean product = democartpageLocators.cartproduct.isDisplayed();
	Assert.assertTrue(product);
	Thread.sleep(1000);
	utilityy.takescreenshot(driver, "Item adden in Cart");
  }
  public void clickplaceorderbutton() throws Exception {
democartpageLocators.placeorder.click();
 Thread.sleep(1000);
  }
  public void Filloutpurchasecredentialscorrecltyandclickpurchasebutton1() throws Exception {
	  democartpageLocators.purchsename.sendKeys("Bony");
	  democartpageLocators.purchsecountry.sendKeys("USA");
	  democartpageLocators.purchasecity.sendKeys("RSM");
	  democartpageLocators.purchasecard.sendKeys("123456789");
	  democartpageLocators.cardmonth.sendKeys("12");
	  democartpageLocators.cardyear.sendKeys("2026");
	  Thread.sleep(1000);
	  democartpageLocators.purchasebutton.click();
	  Thread.sleep(1000);
  }
  
  public void Filloutpurchasecredentialscorrecltyandclickpurchasebutton2(String na, String co, String ci, String ca, String mo, String ye  ) throws Exception {
	  democartpageLocators.purchsename.sendKeys(na);
	  democartpageLocators.purchsecountry.sendKeys(co);
	  democartpageLocators.purchasecity.sendKeys(ci);
	  democartpageLocators.purchasecard.sendKeys(ca);
	  democartpageLocators.cardmonth.sendKeys(mo);
	  democartpageLocators.cardyear.sendKeys(ye);
	  Thread.sleep(2000);
  }
  
 public void verifyitempurhcasedsucessfully() {
boolean verifypurchse =	 democartpageLocators.verifypurchase.isDisplayed(); 
Assert.assertTrue(verifypurchse);
utilityy.takescreenshot(driver, "Sucessfull Purchase");
democartpageLocators.okay.click();
  }
 public void Clickpurchasebutton() throws Exception {
	 democartpageLocators.purchasebutton.click();
	 Thread.sleep(1000);
 }
 public void verifyunsucessfullpurchase() throws Exception {
	Alert alt = driver.switchTo().alert();
	boolean verifynegativepurchase = alt.getText().contains("Please fill out Name and Creditcard.");
	Assert.assertTrue(verifynegativepurchase);
	 alt.accept();
	 Thread.sleep(1000);  
 }
 public void clickdeletelink() throws Exception {
	 democartpageLocators.delete.click();
	 democartpageLocators.delete.click();
	 Thread.sleep(1000);
 }
 public void verifiyitemremovedfromcart() throws Exception {
	boolean delete = democartpageLocators.verifyitemdeleted.isDisplayed();
	Assert.assertTrue(delete);
	Thread.sleep(1000);
	utilityy.takescreenshot(driver, "Item Removed");
 }
 public void verifiyPfromcart() throws Exception {
		boolean productT = democartpageLocators.verifycartpro.isDisplayed();
		Assert.assertTrue(productT);
		Thread.sleep(1000);
 
 
 }	
}
