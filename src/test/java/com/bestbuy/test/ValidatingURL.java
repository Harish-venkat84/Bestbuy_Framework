package com.bestbuy.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.bestbuy.utils.BaseUtils;

import io.cucumber.java.en.Given;

public class ValidatingURL extends BaseUtils {

	@Given("Verifying that the Base URL is not broken")
	public void verifying_that_the_base_url_is_not_broken() {

		Assert.assertEquals(currentURL(), property.getURL());

		verifyingURL(property.getURL(), property.getURL(), "Problem on base url");

	}

	@Given("Verifying the Bottom Links are working fine")
	public void verifying_the_bottom_links_are_working_fine() {

		List<WebElement> bottomLinks = pom.getHomePage().getBottomLinks();

		for (WebElement link : bottomLinks) {

			scrollToElement(link);

			String href = getAttributeValue(link, "href");

			if (href == null || href.equals("")) {

				System.out.println(getElementText(link) + " ==> Hyperlink Not Present");

			} else {

				System.out.println(getElementText(link) + " ==> Hyperlink present");

				verifyingURL(href, getElementText(link), "Problem on bottom links");

			}
		}

		List<WebElement> bottomLinksFooter = pom.getHomePage().getBottomLinksFooter();

		for (WebElement link : bottomLinksFooter) {

			scrollToElement(link);

			String href = getAttributeValue(link, "href");

			if (href == null || href.equals("")) {

				System.out.println(getElementText(link) + " ==> Hyperlink Not Present");

			} else {

				System.out.println(getElementText(link) + " ==> Hyperlink present");

				verifyingURL(href, getElementText(link), "Problem on bottom links");

			}
		}
	}

	public void verifyingURL(String url, String text, String exceptionMessage) {

		try {

			URL link = new URL(url);

			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();

			httpURLConnection.setConnectTimeout(3000);

			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {

				System.out.println(text + " - " + httpURLConnection.getResponseMessage());

			} else {

				System.out.println(httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}

		} catch (Exception ex) {

			System.out.println(text + "  " + exceptionMessage);

			ex.printStackTrace();
		}

	}

}