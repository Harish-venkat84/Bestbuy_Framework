package com.bestbuy.po_models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class SelectCountryPage {
	
	public WebDriver driver;

	@FindBy(xpath  = "//h1[text() = 'Choose a country.']//parent::div[@lang = 'en']//child::div[@class = 'country-selection']//child::a[@class = 'us-link']")
	private WebElement contryUS;
	
	@FindBy(xpath = "//h1[text() = 'Choose a country.']//parent::div[@lang = 'en']//child::div[@class = 'country-selection']//child::a[@class = 'canada-link']")
	private WebElement contryCanada;
	
	public SelectCountryPage (WebDriver driver2) {
		
		if (driver == null) {
			
			this.driver = driver2;
			
			PageFactory.initElements(driver, this);
		}
		
	}
	
}
