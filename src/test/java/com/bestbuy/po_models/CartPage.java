package com.bestbuy.po_models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class CartPage {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//h2[@class = 'cart-item__title-heading']//child::a")
	private WebElement cartItemName;
	
	@FindBy(xpath = "//span[text() = 'No Thanks']//parent::button")
	private WebElement noThankBtn;
	
	@FindBy(xpath = "//button[text() = 'Checkout']")
	private WebElement checkout;
	
	@FindBy(xpath = "//button[text() = 'Select a store to see availability']")
	private WebElement selectStore;
	
	@FindBy(id = "sam-input")
	private WebElement inputCityCode;
	
	@FindBy(xpath = "//button[text() = 'Go!']")
	private WebElement goBtn;
	
	public List<WebElement> getPickHere(){
		
		return driver.findElements(By.xpath("//button[text() = 'Pick up here']"));
	}
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement updatesCheckBox;

}
