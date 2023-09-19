package com.bestbuy.test;

import org.testng.Assert;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckoutValidation extends BaseUtils{
	
	@Given("User Click the Select a store to see availability Radio button")
	public void user_click_the_select_a_store_to_see_availability_radio_button() {
		
		try {
			
			clickElement(pom.getCart().getSelectStore());
			
			waitForPresenceOfAllElements(10, "//button[text() = 'Go!']");
			
			waitForElementClickable(10, pom.getCart().getGoBtn());
			
			Thread.sleep(3000);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	@Given("User Enter PinCode in the Input Field {string}")
	public void user_enter_pin_code_in_the_input_field(String cityCode) {
		
		typeText(pom.getCart().getInputCityCode(), cityCode);
		
	}
	
	@Given("Click the Go button")
	public void click_the_go_button() {
		
		clickElement(pom.getCart().getGoBtn());
		
		visibleOfElement(10, pom.getCart().getPickHere().get(0));
	}
	
	@Given("User Select First Listed City, Pick Up here button")
	public void user_select_first_listed_city_pick_up_here_button() {
		
		try {
			
			clickElement(pom.getCart().getPickHere().get(0));
			
			waitForElementClickable(10, pom.getCart().getCheckout());
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	@Given("Click the Checkout button")
	public void click_the_checkout_button() {
		
		clickElement(pom.getCart().getCheckout());
		
	}
	
	@Given("User Click the Continue as Guest button")
	public void user_click_the_continue_as_guest_button() {
		
		clickElement(pom.getCheckout().getContinueGuest());
		
	}
	
	@Given("Scroll Down to visible of Email Address Input Field")
	public void scroll_down_to_visible_of_email_address_input_field() {
		
		actionScroll(pom.getCheckout().getEmailID());
	}
	
	@Given("User Enter the Email Address")
	public void user_enter_the_email_address() {
		
		typeText(pom.getCheckout().getEmailID(), property.getValue("mailID"));
	}
	
	@Given("Enter the Mobile Number")
	public void enter_the_mobile_number() {
		
		typeText(pom.getCheckout().getPhoneNumber(), property.getValue("mobileNumber"));
	}
	
	@Given("Click the Want to Want to receive text updates? Check box")
	public void click_the_want_to_want_to_receive_text_updates_check_box() {
		
		clickElement(pom.getCart().getUpdatesCheckBox());
	}
	
	static String Url = null;
	
	@Given("User Click the Continue to Mobile Setup")
	public void user_click_the_continue_to_mobile_setup() {
		
		Url = currentURL();
		
		clickElement(pom.getCheckout().getContinueMobile());
	}
	
	@Then("Verify the Payment URL")
	public void verify_the_payment_url() {
		
		Assert.assertNotEquals(Url, currentURL());
		
		String error = getElementText(pom.getCheckout().getErrorMeassage());
		
		Assert.assertNotEquals(error, "Sorry, there was a problem. Please try that again.");
	}

}
