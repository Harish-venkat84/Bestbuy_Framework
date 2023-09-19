package com.bestbuy.test;


import org.testng.Assert;

import com.bestbuy.property.PropertyKey;
import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn extends BaseUtils{
	
	
	@Given("User click the account field")
	public void user_click_the_account_field() {
		
		elementNotVisible(pom.getHomePage().getStoreNotification());
		
		clickElement(pom.getHomePage().getAccountBtn());
	}
	
	@Given("Click SigIn button and navigate to sigIn page")
	public void click_sig_in_button_and_navigate_to_sig_in_page() {
		
		clickElement(pom.getHomePage().getLoginBtn());
	}
	
	@When("User Enter the Mail Id in the Input Field")
	public void user_enter_the_mail_id_in_the_input_field() {
		
		typeText(pom.getSignIn().getEmail(), property.getValue(PropertyKey.mailID.name()));

	}
	
	@When("Enter the Password in the Password Field")
	public void enter_the_password_in_the_password_field() {
	
		typeText(pom.getSignIn().getPassword(), property.getValue(PropertyKey.password.name()));

	}
	
	@Then("SigIn button clicked successfully")
	public void sig_in_button_clicked_successfully() {
		
		clickElement(pom.getSignIn().getSignIn());
		
		String message = null;
		
		if (pom.getSignIn().getErrorMessage().isDisplayed()) {
			
			message = getElementText(pom.getSignIn().getErrorMessage());
		}

		if (message.equals("Sorry, something went wrong. Please try again.") || 
				message.equals("Oops! The email or password did not match our records. Please try again.")) {
			
			System.out.println(message);
			
			try { Assert.assertEquals(message, null); } catch(Exception e) {e.printStackTrace();}
			
			
		}
	}

}
