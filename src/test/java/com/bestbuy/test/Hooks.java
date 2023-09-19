package com.bestbuy.test;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseUtils{
	
	@BeforeAll
	public static void launchURL() {
		
		launchBrowser("Chrome", property.getURL(), "NoHeadLess", "NoCache");
	
	}
	
	@AfterStep
	public void takescreenshot(Scenario scenario) {
		
		String name = scenario.getName();
		
//		System.out.println("scenario Name :"+name);
		
		if (scenario.isFailed()) {
			
			System.out.println("Scenario Fail : "+name);
			
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
			scenario.attach(screenshot, "image/png", "imagepass");
		
			Status status = scenario.getStatus();
			System.out.println("scenario status :"+status);
		}
		
		
//		if (pom.getHomePage().getPoupNoThank().isDisplayed()) {
//			
//			clickElement(pom.getHomePage().getPoupNoThank());
//		}
		
		
	}
	
	
	@AfterAll
	public static void quit() {
		
		closeAllBrowsers();
		
	}

	
	

}
