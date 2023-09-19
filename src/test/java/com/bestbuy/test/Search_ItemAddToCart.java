package com.bestbuy.test;

import org.testng.Assert;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_ItemAddToCart extends BaseUtils{
	
	static String searchNname = null;
	static String cartNname = null;
	
	@Given("User Enter the Product Name or Product Category Name {string}")
	public void user_enter_the_product_name_or_product_category_name(String name) {

		typeText(pom.getHomePage().getSearchField(), name);
	}
	
	@Given("User Select the First Listed Product on the Search List")
	public void user_select_the_first_listed_product_on_the_search_list() {

		clickElement(pom.getHomePage().getSelectFirstSearchResult());
		
	}
	
	@When("Scroll Down to First Listed Product")
	public void scroll_down_to_first_listed_product() {
	
		scrollToElement(pom.getSearchResult().getFirstItemText());
	}

	@When("Get the Name of the Product")
	public void get_the_name_of_the_product() {
	
		searchNname = getElementText(pom.getSearchResult().getFirstItemText());
	}
	
	@When("User Click AddToCart button")
	public void user_click_add_to_cart_button() {
		
		clickElement(pom.getSearchResult().getSelectFirstItemAddToCart());
		
		visibleOfElement(10, pom.getSearchResult().getGoToCart());
		
	}

	@When("Poup Displayed to use and click the GoToCart")
	public void poup_displayed_to_use_and_click_the_go_to_cart() {
	
		clickElement(pom.getSearchResult().getGoToCart());
		
		visibleOfElement(10, pom.getCart().getCartItemName());
	}

	@When("Get the Name of the Product Which is Present in Cart")
	public void get_the_name_of_the_product_which_is_present_in_cart() {
	
		cartNname = getElementText(pom.getCart().getCartItemName());
	}

	@Then("Validate the Both Names to verify Both are Same Product")
	public void validate_the_both_names_to_verify_both_are_same_product() {
	
		Assert.assertEquals(searchNname, cartNname);
	}
	
}
