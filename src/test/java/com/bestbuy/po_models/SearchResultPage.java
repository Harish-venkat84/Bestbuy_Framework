package com.bestbuy.po_models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class SearchResultPage {

	public WebDriver driver;
	
	public SearchResultPage(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//h4[@class = 'sku-title']//child::a")
	private WebElement firstItemText;
	
	@FindBy(xpath = "//button[text() = 'Add to Cart']")
	private WebElement selectFirstItemAddToCart;
	
	@FindBy(xpath = "//a[text() = 'Go to Cart']")
	private WebElement goToCart;
	
	
	
}
