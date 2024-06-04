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
	//commit
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement CookieHandler;

	@FindBy(linkText = "TAKEOUT")
	private WebElement orderTypeButton;
	
	@FindBy(id = "pills-delivery-tab")
	private WebElement DeliveryTypeButton;
	
	@FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div[1]/div[1]/div[3]/h6/a")
	private WebElement SigninButton;
	
	@FindBy(id="btnupdateAddress")
	private WebElement DeliveryInstructions;

	public void handleCookies() {
		CookieHandler.click();
	}

	public void selectOrderTypeTakeout() {
		orderTypeButton.click();
	}
	
	public void selectOrderTypeDelivery() {
		DeliveryTypeButton.click();
	}
	
	public void SignIn() {
		SigninButton.click();
	}
}
