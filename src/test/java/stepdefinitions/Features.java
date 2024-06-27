package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LandingPage;
import factory.DriverFactory;
import io.cucumber.java.en.*;

public class Features {
	
	private WebDriver driver;
	private LandingPage landingPage;
	private WebDriverWait wait;
	private ChromeOptions options;
	
	
	@Given("I am on the restaurant's website Landing Page")
	public void i_am_on_the_restaurant_s_website_landing_page() {
		driver = DriverFactory.getDriver();
		landingPage = new LandingPage(driver);
		landingPage.handleCookies();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}

	@Then("Validate that Takeout ordertype button is working")
	public void validate_that_takeout_ordertype_button_is_working() {
	    Assert.assertTrue("Takeout order type button should be clickable", landingPage.isTakeoutButtonClickable());
	}


	@Then("Delivery ordertype button is working")
	public void delivery_ordertype_button_is_working() {
	Assert.assertTrue("Delivery order type button should be clickable", landingPage.isDeliveryButtonClickable());
	}
	
	@Then("Validate that sign in button is working")
	public void signin_button_is_working(){
		Assert.assertTrue("signin button should be clickable", landingPage.isSigninButtonClickable());
		
	}
}

