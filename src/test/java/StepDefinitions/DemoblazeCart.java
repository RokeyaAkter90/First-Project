package StepDefinitions;

import org.openqa.selenium.TakesScreenshot;

import com.falgun.action.DemocartpageActions;
import com.falgun.action.homepageActions;
import com.falgun.utility.base_class;
import com.falgun.utility.utilityy;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoblazeCart extends base_class {
	homepageActions HomepageActions = new homepageActions();
	DemocartpageActions democartpageActions = new DemocartpageActions();
	
	
	@When("^Click on Cart Link$")
	public void click_on_Cart_Link() throws Throwable {
	HomepageActions.cartlink();    
	}

	@Then("^Verify user can visit cart page$")
	public void verify_user_can_visit_cart_page() throws Throwable {
		democartpageActions.verifycartpagedisplay();
		
	}

	@Then("^Verify Products description Pic, Title, Price sections are added in  Cart page$")
	public void verify_Products_description_Pic_Title_Price_sections_are_added_in_Cart_page() throws Throwable {
	democartpageActions.verifyproductdescription(); 
	}

	@Then("^Verify About us & Get in Touch detail are added in Cart page$")
	public void verify_About_us_Get_in_Touch_detail_are_added_in_Cart_page() throws Throwable {
	democartpageActions.verifyaboutusgetintouch();
	}
	@When("^Click on Product and addtocartbutton$")
	public void click_on_Product_and_addtocartbutton() throws Throwable {
	HomepageActions.clickonproducts();
	democartpageActions.clickaddtocart();    
	}

	@Then("^Verify item is added in cart page$")
	public void verify_item_is_added_in_cart_page() throws Throwable {
	democartpageActions.veifyitemadeedincart();
	
	}

	@Then("^Verify Place Order button is present in cart page$")
	public void verify_Place_Order_button_is_present_in_cart_page() throws Throwable {
	democartpageActions.verifyplaceorderbutton();
	utilityy.takescreenshot(driver, "Placeorderbutton Displayed");
	}

	@When("^Click on Placeorderbutton$")
	public void click_on_Placeorderbutton() throws Throwable {
	democartpageActions.clickplaceorderbutton(); 
	}

	@When("^Fillout purchase credentials correclty$")
	public void fillout_purchase_credentials_correclty_and_click_purchase_button() throws Throwable {
	democartpageActions.Filloutpurchasecredentialscorrecltyandclickpurchasebutton1();
	democartpageActions.Filloutpurchasecredentialscorrecltyandclickpurchasebutton2(prop.getProperty("Name"), prop.getProperty("Country"), prop.getProperty("City"), prop.getProperty("card"), prop.getProperty("Month"), prop.getProperty("Year"));
	}

	@Then("^Verify user can purchase item sucessfully$")
	public void verify_user_can_purchase_item_sucessfully() throws Throwable {
	democartpageActions.verifyitempurhcasedsucessfully();
	
	}
	@When("^Click purchase button$")
	public void click_purchase_button() throws Throwable {
	democartpageActions.Clickpurchasebutton();  
	}

	@Then("^User purchase is not sucessfull$")
	public void user_purchase_is_not_sucessfull() throws Throwable {
	democartpageActions.verifyunsucessfullpurchase();
	utilityy.takescreenshot(driver, "Unsucessfull Purchase");
	}
	@When("^Click on Delete link$")
	public void click_on_Delete_link() throws Throwable {
	democartpageActions.clickdeletelink();
	democartpageActions.clickdeletelink();
	}

	@Then("^Verify item removed from cart$")
	public void verify_item_removed_from_cart() throws Throwable {
	democartpageActions.verifiyitemremovedfromcart();
	
	
	}



}
