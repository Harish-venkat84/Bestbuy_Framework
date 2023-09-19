package com.bestbuy.po_manager;

import org.openqa.selenium.WebDriver;

import com.bestbuy.po_models.BrandsPage;
import com.bestbuy.po_models.CartPage;
import com.bestbuy.po_models.CheckoutPage;
import com.bestbuy.po_models.CreateAnAccount;
import com.bestbuy.po_models.HomePage;
import com.bestbuy.po_models.SearchResultPage;
import com.bestbuy.po_models.SelectCountryPage;
import com.bestbuy.po_models.Sign_In;

// this class is to return object of page object models package classes

public class PageObjectManager {

	public WebDriver driver;

	private SelectCountryPage selContry;

	private HomePage homepage;
	
	private CreateAnAccount createAccount;
	
	private Sign_In logIn;
	
	private CartPage cart;
	
	private SearchResultPage searchResult;
	
	private BrandsPage brandPage;
	
	private CheckoutPage checkout;

	public PageObjectManager(WebDriver driver2) {

		if (driver == null) {

			this.driver = driver2;
		}
	}

	public SelectCountryPage getSelectCountryPage() {

		if (selContry == null) {

			selContry = new SelectCountryPage(driver);
		}

		return selContry;
	}

	public HomePage getHomePage() {

		if (homepage == null) {

			homepage = new HomePage(driver);
		}
		
		return homepage;
	}
	
	public CreateAnAccount getCreateAccount() {
		
		if (createAccount == null) {

			createAccount = new CreateAnAccount(driver);
		}

		return createAccount;
	}
	
	public Sign_In getSignIn() {
		
		if (logIn == null) {
			
			logIn = new Sign_In(driver);
		}
		
		return logIn;
	}
	
	public CartPage getCart() {
		
		if (cart == null) {
			
			cart = new CartPage(driver);
		}
		
		return cart;
	}
	
	public SearchResultPage getSearchResult() {
		
		if (searchResult == null) {
			
			searchResult = new SearchResultPage(driver);
		}
		
		return searchResult;
	}
	
	public BrandsPage getBrandsPage() {
		
		if (brandPage == null) {
			
			brandPage = new BrandsPage(driver);
		}
		
		return brandPage;
	}
	
	public CheckoutPage getCheckout() {
		
		if (checkout == null) {
			
			checkout = new CheckoutPage(driver);
		}
		
		return checkout;
	}
}
