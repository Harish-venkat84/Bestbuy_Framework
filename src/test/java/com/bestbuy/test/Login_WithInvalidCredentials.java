package com.bestbuy.test;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_WithInvalidCredentials extends BaseUtils{

	@Given("User click the account field on the Home Page")
	public void user_click_the_account_field_on_the_home_page() {
		
		elementNotVisible(pom.getHomePage().getStoreNotification());
		
		clickElement(pom.getHomePage().getAccountBtn());
	}
	
	@Given("Click SigIn button to navigate sigIn page")
	public void click_sig_in_button_to_navigate_sig_in_page() {
		
		clickElement(pom.getHomePage().getLoginBtn());
	}
	
	@When("User Enter the Invalid Mail Id {string} in the Input Field")
	public void user_enter_the_invalid_mail_id_in_the_input_field(String mailID) {
		
		typeText(pom.getSignIn().getEmail(), mailID);
	}
	
	@When("Enter the Invalid Password {string} in the Password Field")
	public void enter_the_invalid_password_in_the_password_field(String password) {
		
		typeText(pom.getSignIn().getPassword(), password);
	}
	
	@When("Click the SigIn button")
	public void click_the_sig_in_button() {
		
		clickElement(pom.getSignIn().getSignIn());
	}
	
	@Then("Validate the Error Message	is shown to user")
	public void validate_the_error_message_is_shown_to_user() {
		
		String message = null;
		
		if (pom.getSignIn().getErrorMessage().isDisplayed()) {
			
			message = getElementText(pom.getSignIn().getErrorMessage());
		}

		if (message.equals("Sorry, something went wrong. Please try again.") || 
				message.equals("Oops! The email or password did not match our records. Please try again.")) {
			
			System.out.println(message);
			
		}
		
	}
	
}
