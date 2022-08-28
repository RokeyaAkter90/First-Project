package com.falgun.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.utility.base_class;

public class DemocartpageLocators extends base_class {

public DemocartpageLocators() {
PageFactory.initElements(driver, this);		
}
@FindBy(how=How.XPATH, using="//b[text()='Get in Touch']")
public WebElement getintouch;

@FindBy(how=How.XPATH, using="//div[@class='table-responsive']")
public WebElement productdescription;

@FindBy(how=How.XPATH, using="//b[text()='About Us']")
public WebElement aboutus;

@FindBy(how=How.XPATH, using="//p[text()='Phone: +440 123456']")
public WebElement getphone;



@FindBy(how=How.LINK_TEXT, using="Cart")
public WebElement cart;

@FindBy(how=How.LINK_TEXT, using="Add to cart")
public WebElement addtocart;
@FindBy(how=How.XPATH, using="//td[text()='Sony vaio i5']")
public WebElement cartproduct;


@FindBy(how=How.XPATH, using="//button[text()='Place Order']")
public WebElement placeorder;

// purchaseordercredentials Locators
@FindBy(how=How.ID, using="name")
public WebElement purchsename;
@FindBy(how=How.ID, using="country")
public WebElement purchsecountry;
@FindBy(how=How.ID, using="city")
public WebElement purchasecity;
@FindBy(how=How.ID, using="card")
public WebElement purchasecard;
@FindBy(how=How.ID, using="month")
public WebElement cardmonth;
@FindBy(how=How.ID, using="year")
public WebElement cardyear;

@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[3]/button[1]")
public WebElement purchaseclosebutton;
@FindBy(how=How.XPATH, using="//button[text()='Purchase']")
public WebElement purchasebutton;
@FindBy(how=How.XPATH, using="//h2[text()='Thank you for your purchase!']")
public WebElement verifypurchase;

@FindBy(how=How.XPATH, using="//button[text()='OK']")
public WebElement okay;


@FindBy(how=How.LINK_TEXT, using="Delete")
public WebElement delete;
@FindBy(how=How.XPATH, using="//h2[text()='Total']")
public WebElement verifyitemdeleted;

@FindBy(how=How.XPATH, using="//h2[text()='Products']")
public WebElement verifycartpro;

}
