package com.bestbuy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =  "Features", 
			
			glue = "com.bestbuy.test", 
			
			monochrome = true, 
			
			dryRun = true, 
	
			plugin = {"json:target/reports/Bestbuy.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
	
//			tags = "@ChooseCountry or @menuCategories")
			tags = "@checkout")

public class TestRunner extends AbstractTestNGCucumberTests {

	/*
	 *  Reports are stored in the target folder
	 */
}
