package com.bestbuy.test;

import org.testng.Assert;

import com.bestbuy.property.PropertyKey;
import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;

public class ChooseCountry extends BaseUtils {

	
	@Given("User Should Click the given Country")
	public void user_should_click_the_given_country() {

	clickElement(pom.getSelectCountryPage().getContryUS());
		
		String pageTitel = getPageTitel();
		
		try {
			
			Assert.assertEquals(pageTitel, property.getValue(PropertyKey.HomePageTitle.name()));
			
		} catch (Exception e) {
		
			System.out.println("problem on Asser Equal Title on SeleContry method");
			
			e.printStackTrace();
		}

	}

	
}
