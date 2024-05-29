package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement CookieHandler;

	@FindBy(linkText = "TAKEOUT")
	private WebElement orderTypeButton;

	public void handleCookies() {
		CookieHandler.click();
	}

	public void selectOrderType() {
		orderTypeButton.click();
	}

}
