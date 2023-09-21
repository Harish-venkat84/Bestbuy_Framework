package com.bestbuy.po_models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class LoginPage {

	public WebDriver driver; 
	
	@FindBy(xpath = "//input[@type = 'email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement signIn;
	
	@FindBy(xpath = "//strong//child::div")
	private WebElement errorMessage;
	
	public LoginPage(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
}
