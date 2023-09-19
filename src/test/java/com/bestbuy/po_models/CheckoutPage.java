package com.bestbuy.po_models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class CheckoutPage {

	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//button[text() = 'Continue as Guest']")
	private WebElement ContinueGuest;
	
	@FindBy(id = "user.emailAddress")
	private WebElement emailID;
	
	@FindBy(id = "user.phone")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//span[text()= 'Continue to Mobile Setup']//parent::button")
	private WebElement continueMobile;
	
	@FindBy(xpath = "//span[text()= 'Sorry, there was a problem. Please try that again.']")
	private WebElement errorMeassage;
	
	
}
