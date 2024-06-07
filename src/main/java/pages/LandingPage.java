package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// commit

	// nandankabra
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement CookieHandler;

	@FindBy(linkText = "TAKEOUT")
	private WebElement orderTypeButton;

	@FindBy(id = "pills-delivery-tab")
	private WebElement DeliveryTypeButton;
	
	@FindBy(id = "btn_IRDdelivery")
	private WebElement IRDeliveryButton;

	@FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div[1]/div[1]/div[3]/h6/a")
	private WebElement SigninButton;

	@FindBy(id = "btnupdateAddress")
	private WebElement DeliveryInstructions;
	
	@FindBy(id="btn_eatin")
	private WebElement DineInTypeButton;

	@FindBy(id = "address")
	private WebElement EnterAddress;

	public void enterFullAddress() throws InterruptedException {
		EnterAddress.click();
		EnterAddress.sendKeys("101 Howard Street, San Francisco, CA,");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).perform();

	}
	
	public void selectOrderTypeDineIn() {
		DineInTypeButton.click();
	}
	
	public void selectIRDelivery() {
		IRDeliveryButton.click();
	}
	
	public void enterDeliveryInstructions() {
		DeliveryInstructions.click();
	}

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

