package com.bestbuy.test;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// harish.venkatesan12023@gmail.com    427474@Harishrup

public class SingUp extends BaseUtils {
	
	static String currentURL = null;
	
	@Given("User Should click account field on the HomePage")
	public void user_should_click_account_field_on_the_home_page() {
		
		List<WebElement> storeNotifications = pom.getHomePage().storeNotifications();
		
		if (storeNotifications.size() != 0) {
			
			elementNotVisible(pom.getHomePage().getStoreNotification());
		}
		
		currentURL = currentURL();
		
		clickElement(pom.getHomePage().getAccountBtn());

	}
	@Given("Click Create Account button")
	public void click_create_account_button() {

		clickElement(pom.getHomePage().getCreatAccountBtn());
	}
	
	@When("Validate the Create Account URL")
	public void validate_the_create_account_url() {

		Assert.assertNotEquals(currentURL, currentURL());
	}
	
	@When("User Enter the First name {string} in the Input Field")
	public void user_enter_the_first_name_in_the_input_field(String firstName) {
		
		typeText(pom.getCreateAccount().getFirstName(), firstName);
	}
	
	@When("Enter the Last Name {string} in the Input Field")
	public void enter_the_last_name_in_the_input_field(String lastName) {

		typeText(pom.getCreateAccount().getLastName(), lastName);
	}
	
	@When("Enter the Mail ID {string} in the Input Field")
	public void enter_the_mail_id_in_the_input_field(String mailID) {

		typeText(pom.getCreateAccount().getEmail(), mailID);
	}
	
	@When("User Must enter the passwor {string}")
	public void user_must_enter_the_passwor(String password) {

		typeText(pom.getCreateAccount().getPassword(), password);
	}
	
	@When("User Must Re_Enter the Conformation Password {string}")
	public void user_must_re_enter_the_conformation_password(String password) {

		typeText(pom.getCreateAccount().getConfirmPassword(), password);
	}
	
	@When("Enter the Mobile Number {string}")
	public void enter_the_mobile_number(String mobileNumber) {
	
		typeText(pom.getCreateAccount().getMobile(), mobileNumber);
	}
	
	@When("Click the Use for Account Recovery check box")
	public void click_the_use_for_account_recovery_check_box() {

		clickElement(pom.getCreateAccount().getAccountRecoveryCheckBox());
	}
	
	@When("Click the Create Account clicked")
	public void click_the_create_account_clicked() {

		scrollToElement(pom.getCreateAccount().getCreateAccountBtn());
		clickElement(pom.getCreateAccount().getCreateAccountBtn());
	}
	
	@Then("Validate the Account Profile URL")
	public void validate_the_account_profile_url() {
		
		currentURL = currentURL();
		Assert.assertNotEquals(currentURL, currentURL());
	}

}


