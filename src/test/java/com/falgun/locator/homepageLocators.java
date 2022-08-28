package com.falgun.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.utility.base_class;

public class homepageLocators extends base_class{

	public homepageLocators() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="login2")
	public WebElement loginlink;
	
	@FindBy(how=How.LINK_TEXT, using="Laptops")
	public WebElement laptop;
	
	@FindBy(how=How.LINK_TEXT, using="Sony vaio i5")
	public WebElement sonyvaioi5;
	
	@FindBy(how=How.LINK_TEXT, using="Cart")
	public WebElement cart;
	
	@FindBy(how=How.ID, using="cartur")
	public WebElement cartlink;
	
	
}
