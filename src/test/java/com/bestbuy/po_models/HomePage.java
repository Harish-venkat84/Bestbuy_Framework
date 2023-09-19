package com.bestbuy.po_models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//button[text() = 'No, Thanks']")
	private WebElement poupNoThank;
	
	@FindBy(xpath = "//span[text() = 'Account']")
	private WebElement accountBtn;
	
	@FindBy(xpath = "//a[text() = 'Create Account']")
	private WebElement creatAccountBtn;
	
	@FindBy(xpath = "//a[text() = 'Sign In']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='c-overlay bottom preferred-store-notification']")
	private WebElement storeNotification;
	
	public List<WebElement> storeNotifications (){
		
		return driver.findElements(By.xpath("//div[@class='c-overlay bottom preferred-store-notification']"));
	}
	
	@FindBy(xpath = "//button[@class = 'c-button-unstyled hamburger-menu-button']")
	private WebElement menuButton;
	
	public List<WebElement> dealsList(){
		
		return driver.findElements(By.xpath("//div[@class = 'hamburger-menu-flyout-list-item-wrapper']//child::ul//child::li//child::a"));
	}
	
	public List<WebElement> applicationList(){
		
		return driver.findElements(By.xpath("//div[@class = 'hamburger-menu-flyout-list-wrapper toast-arrow-up']//child::ul//child::li//child::button[not(@class = 'c-button-unstyled hamburger-menu-back-button')]"));
		
	}
	
	public List<WebElement> application2(){
		
		return driver.findElements(By.xpath("//div[@class = 'hamburger-menu-flyout-list-wrapper toast-arrow-up']//child::ul//child::li//child::a"));
	}
	
	
	public List<WebElement> getMenusList(){
		
		return driver.findElements(By.xpath("//div[@class = 'hamburger-menu-flyout']//child::ul//child::li//child::button"));
	}
	
	public List<WebElement> getListLinks(){
		
		return driver.findElements(By.xpath("//div[@class = 'hamburger-menu-flyout']//child::ul//child::li//child::div//child::ul//child::li//child::a"));
	}
	
	@FindBy(xpath = "//span[text() = 'Back']//parent::button")
	private WebElement backButton;
	
	public List<WebElement> getBottomLinks(){
		
		return driver.findElements(By.xpath("//div[@class = 'main-navigation grid grid-cols-3 auto-flow-col']//child::div//child::ul//child::li//child::a"));
	}
	
	public List<WebElement> getBottomLinksFooter(){
		
		return driver.findElements(By.xpath("//div[@class = 'flex justify-content-start']//child::a"));
	}
	
	@FindBy(xpath = "//input[@placeholder='What can we help you find today?']")
	private WebElement searchField;
	
	@FindBy(xpath = "//div[@class = 'px-none flex']//child::div//child::ul//child::li//child::a")
	private WebElement selectFirstSearchResult;

	public WebElement selectMenuByText(String text) {
		
		return driver.findElement(By.xpath("//div[@class = 'hamburger-menu-flyout']//child::ul//child::li//child::button[text() = '"+text+"']"));
	}
	
	
	public WebElement selectDepartment(String departName) {
		
		return driver.findElement(By.xpath("//button[text() = '"+departName+"']"));
	}
	
	public WebElement selectDepartmentList(String departName) {
		
		return driver.findElement(By.xpath("//button[text() = '"+departName+"']"));
	}
	
	public WebElement selectOneName(String departName) {
		
		return driver.findElement(By.xpath("//a[text() = '"+departName+"']"));
	}
	
}
