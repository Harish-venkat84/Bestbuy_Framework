package com.bestbuy.test;

import org.testng.Assert;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MenuShopByDepartment extends BaseUtils{
	
	static String productName = null;
	static String cartName = null;
	
	@Given("User Click the Menu Drop Down")
	public void user_click_the_menu_drop_down() {

		clickElement(pom.getHomePage().getMenuButton());
	}
	@Given("User Select the Department Drop Down {string}")
	public void user_select_the_department_drop_down(String departmentName) {

		clickElement(pom.getHomePage().selectDepartment(departmentName));
	}
	@Given("User select the Products Drop Down {string} and select Product Name Or Select Products Name {string}")
	public void user_select_the_products_drop_down_and_select_product_name_or_select_products_name(
			String selectDepartmentList, String selectOneName) {

		if (getElementText(pom.getHomePage().selectDepartmentList(selectDepartmentList)).
				equals(selectDepartmentList)) {
			
			clickElement(pom.getHomePage().selectDepartmentList(selectDepartmentList));
			
			clickElement(pom.getHomePage().selectOneName(selectOneName));

		}else if(getElementText(pom.getHomePage().selectOneName(selectOneName))
				.equals(selectOneName)){
		
			clickElement(pom.getHomePage().selectOneName(selectOneName));
		}
	}
	@Given("Get First Listed Product Name")
	public void get_first_listed_product_name() {

		productName = getElementText(pom.getSearchResult().getFirstItemText());
	}
	@Given("Click the Add To Cart button")
	public void click_the_add_to_cart_button() {

		clickElement(pom.getSearchResult().getSelectFirstItemAddToCart());
	}
	@Given("Click Go To Cart button")
	public void click_go_to_cart_button() {

		clickElement(pom.getSearchResult().getGoToCart());
	}
	@Given("Scroll Down Until No Thank button visible to User")
	public void scroll_down_until_no_thank_button_visible_to_user() {

		actionScroll(pom.getCart().getNoThankBtn());
	}
	@Given("Click No Thank button")
	public void click_no_thank_button() {

		clickElement(pom.getCart().getNoThankBtn());
	}
	@Given("Get Product Name from the Cart")
	public void get_product_name_from_the_cart() {

		cartName = getElementText(pom.getCart().getCartItemName());
	}
	@Then("Verify Added Product and Listed Cart are same By there Name")
	public void verify_added_product_and_listed_cart_are_same_by_there_name() {
		
		Assert.assertEquals(productName, cartName);
	}
}
