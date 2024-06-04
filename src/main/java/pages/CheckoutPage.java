package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "phone")
	private WebElement mobileNumberInputField;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='col-md-9']//input[@id='name']")
	private WebElement nameInputField;

	@FindBy(id = "email")
	private WebElement emailInputField;

	@FindBy(id = "spInstr")
	private WebElement instructionsInputField;
	
	@FindBy(id="Token-Cash")
	private WebElement payAtCounter;
	
	@FindBy(id="placeOrder")
	private WebElement placeOrder;

	@FindBy(xpath = "//button[@class='payment_btn add_card_btn shift4card_add']")
	private WebElement paymentModeButton;

	@FindBy(id = "visaPaymentType")
	private WebElement visaPaymentType;

	@FindBy(xpath = "//iframe[contains(@name, 'i4goTT_')]")
	private WebElement iframe;

	@FindBy(id = "i4go_cardType")
	private WebElement cardTypeDropdown;

	@FindBy(id = "cardNumber")
	private WebElement cardNumberInputField;

	@FindBy(id = "i4go_expiration")
	private WebElement expirationDateInputField;

	@FindBy(id = "cvv2Code")
	private WebElement cvcInputField;

	@FindBy(id = "i4go_streetAddress")
	private WebElement billingStreetAddressInputField;

	@FindBy(id = "i4go_postalCode")
	private WebElement billingPostalCodeInputField;

	@FindBy(id = "i4go_submit")
	private WebElement payAndProcessOrderButton;

	public void enterMobileNumber(String mobileNumber) {
		mobileNumberInputField.sendKeys(mobileNumber);
	}

	public void clickContinue() {
		continueButton.click();
	}

	public void enterName(String name) {
		nameInputField.clear();
		nameInputField.sendKeys(name);
	}

	public void enterEmail(String emailText) {
		emailInputField.clear();
		emailInputField.sendKeys(emailText);

	}

	public void enterInstructions(String instructions) {
		instructionsInputField.clear();
		instructionsInputField.sendKeys(instructions);
	}

	public void clickPaymentMode() {
		paymentModeButton.click();
	}

	public void selectVisaPaymentType() throws InterruptedException {
		driver.switchTo().frame(iframe);

		Select dropdown = new Select(cardTypeDropdown);
		dropdown.selectByVisibleText("Visa");

		// driver.switchTo().defaultContent();
	}

	public void enterCardNumber(String cardNumber) {
		cardNumberInputField.clear();
		cardNumberInputField.sendKeys(cardNumber);
	}

	public void enterExpirationDate(String expirationDate) {
		expirationDateInputField.clear();
		expirationDateInputField.sendKeys(expirationDate);
	}

	public void enterCVC(String cvc) {
		cvcInputField.clear();
		cvcInputField.sendKeys(cvc);
	}

	public void enterBillingStreetAddress(String address) {
		billingStreetAddressInputField.clear();
		billingStreetAddressInputField.sendKeys(address);
	}

	public void enterBillingPostalCode(String postalCode) {
		billingPostalCodeInputField.clear();
		billingPostalCodeInputField.sendKeys(postalCode);
	}

	public void clickPayAndProcessOrder() {
		payAndProcessOrderButton.click();
		driver.switchTo().defaultContent();
	}
	
	public void clickPayAtCounter() {
		payAtCounter.click();
	}
	
	public void clickPlaceOrder()
	{
		placeOrder.click();
	}
}
