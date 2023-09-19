package com.bestbuy.po_models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class CreateAnAccount {

	public WebDriver driver;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "show-hide-password-toggle")
	private WebElement showPasswordToggelBtn;
	
	@FindBy(xpath = "//input[@type = 'password' and @name = 'fld-p1']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type = 'password' and @name = 'reenterPassword']")
	private WebElement confirmPassword;
	
	@FindBy(id = "phone")
	private WebElement mobile;
	
	@FindBy(id = "is-recovery-phone")
	private WebElement accountRecoveryCheckBox;
	
	@FindBy(xpath = "//button[text() = 'Create an Account']")
	private WebElement createAccountBtn;
	
	@FindBy(xpath = "//strong//child::div//child::div//child::strong")
	private WebElement errorMessage;
	
	public CreateAnAccount(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
}
