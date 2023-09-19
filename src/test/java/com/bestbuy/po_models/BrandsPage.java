package com.bestbuy.po_models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class BrandsPage {

	public WebDriver driver;
	
	public BrandsPage(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	public List<WebElement> brandProduct(String text){
		
		return driver.findElements(By.xpath("//a[text() = '"+text+"']"));
	}
	
	public List<WebElement> selectProductName(String text){
		
		return driver.findElements(By.xpath("//a[text() = '"+text+"']"));
	}
	
	@FindBy(xpath = "//span[text() = 'One-time payment']//parent::button")
	private WebElement payToday;
	
	@FindBy(xpath = "//span[text() = 'Letʼs Get Started']//parent::button")
	private WebElement letGetStartedBtn;
	
	@FindBy(xpath = "//span[text() = 'No']//parent::span//parent::label")
	private WebElement selectNo;
	
	@FindBy(xpath = "//span[text() = 'Continue']//parent::button")
	private WebElement selectContinueBtn;
	
	@FindBy(xpath = "//span[text() = 'No, thanks']//parent::button")
	private WebElement selectNoThanksBtn;
	
	@FindBy(xpath = "//span[text() = 'Continue without Trade-in']//parent::button")
	private WebElement selectContinueWithOutTradeBtn;
	
	@FindBy(xpath = "//div[text() = 'Get a new number']//parent::div//parent::span//parent::button")
	private WebElement selectGetNewNumber;
	
	public List<WebElement> selectContinueBtn(){
		
		return driver.findElements(By.xpath("//span[text() = 'Continue']//parent::button"));
	}
	
	public List<WebElement> selectPlanBtn(){
		
		return driver.findElements(By.xpath("//span[text() = 'Select Plan']//parent::button"));
	}
	
	
	@FindBy(xpath = "//span[text() = 'Go to Cart']//parent::button")
	private WebElement goToCart;
	
}
