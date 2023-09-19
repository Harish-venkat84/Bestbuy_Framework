package com.bestbuy.test;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuShopByBrand extends BaseUtils {

	@Given("User Select Menu Drop Down")
	public void user_select_menu_drop_down() {

		clickElement(pom.getHomePage().getMenuButton());
	}

	@Given("From the Menu Drop Down Select the Brands Drop Down")
	public void from_the_menu_drop_down_select_the_brands_drop_down() {

		clickElement(pom.getHomePage().selectMenuByText("Brands"));
	}

	@Given("User click Brand Name {string}")
	public void user_click_brand_name(String brandName) {

		clickElement(pom.getHomePage().selectOneName(brandName));
	}

	@Given("Click the given Category Name {string}")
	public void click_the_given_category_name(String brandProductName) {

		List<WebElement> brandProduct = pom.getBrandsPage().brandProduct(brandProductName);

		actionScroll(brandProduct.get(brandProduct.size() - 1));

		clickElement(brandProduct.get(brandProduct.size() - 1));
	}

	@When("Click the Product Name {string}")
	public void click_the_product_name(String string) {

		List<WebElement> selectProductName = pom.getBrandsPage().selectProductName(string);

		clickElement(selectProductName.get(selectProductName.size() - 1));
	}

	@When("Scroll Down to Visible of Active Today Field")
	public void scroll_down_to_visible_of_active_today_field() {

		actionScroll(pom.getBrandsPage().getPayToday());
	}

	@When("User select Active Today")
	public void user_select_active_today() {

		clickElement(pom.getBrandsPage().getPayToday());
	}

	@When("Scroll Down to Visible of Add To Cart")
	public void scroll_down_to_visible_of_add_to_cart() {

		actionScroll(pom.getSearchResult().getSelectFirstItemAddToCart());
	}

	@When("User Click the Add To Cat button")
	public void user_click_the_add_to_cat_button() {

		clickElement(pom.getSearchResult().getSelectFirstItemAddToCart());
	}

	@When("click the Lests Get Started button")
	public void click_the_lests_get_started_button() {

		clickElement(pom.getBrandsPage().getLetGetStartedBtn());
	}

	@When("User Select the No")
	public void user_select_the_no() {

		clickElement(pom.getBrandsPage().getSelectNo());
	}

	@When("Click the Continue button")
	public void click_the_continue_button() {

		clickElement(pom.getBrandsPage().getSelectContinueBtn());
	}

	@When("User Select the No Thank")
	public void user_select_the_no_thank() {

		clickElement(pom.getBrandsPage().getSelectNoThanksBtn());
	}
	
	
	@When("User Select Continue with out Trade")
	public void user_select_continue_with_out_trade() {

		clickElement(pom.getBrandsPage().getSelectContinueWithOutTradeBtn());
	}

	@When("Select the Get a new number")
	public void select_the_get_a_new_number() {

		clickElement(pom.getBrandsPage().getSelectGetNewNumber());
	}

	@When("User click the Continue button")
	public void user_click_the_continue_button() {

		clickElement(pom.getBrandsPage().selectContinueBtn().get(pom.getBrandsPage().selectContinueBtn().size() - 1));

		waitForPresenceOfAllElements(30, "//span[text() = 'Select Plan']//parent::button");
	}

	@When("User select Pan")
	public void user_select_pan() {

		clickElement(pom.getBrandsPage().selectPlanBtn().get(0));
	}

	@When("User should Click the continue button")
	public void user_should_click_the_continue_button() {

		try {
			clickElement(pom.getBrandsPage().getSelectContinueBtn());

			waitForPresenceOfAllElements(20, "//span[text() = 'Continue']//parent::button");

			waitForElementClickable(20, pom.getBrandsPage().getSelectContinueBtn());

			visibleOfElement(20, pom.getBrandsPage().getSelectContinueBtn());

			Thread.sleep(4000);

			clickElement(pom.getBrandsPage().getSelectContinueBtn());

			waitForPresenceOfAllElements(20, "//span[text() = 'Continue']//parent::button");

			waitForElementClickable(20, pom.getBrandsPage().getSelectContinueBtn());

			Thread.sleep(5000);

			visibleOfElement(20, pom.getBrandsPage().getSelectContinueBtn());

			actionScroll(pom.getBrandsPage().getSelectContinueBtn());

			clickElement(pom.getBrandsPage().getSelectContinueBtn());

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Then("User Clicked the Go To Cart button")
	public void user_clicked_the_go_to_cart_button() {

		clickElement(pom.getBrandsPage().getGoToCart());
	}

}
