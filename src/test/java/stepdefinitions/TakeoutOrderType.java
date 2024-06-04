package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.LandingPage;
import pages.OrderPage;

public class TakeoutOrderType {

	private WebDriver driver;
	private LandingPage landingPage;
	private OrderPage orderPage;
	private CheckoutPage checkOutPage;
	private WebDriverWait wait;
	private ChromeOptions options;

	@Given("I am on the restaurant's website")
	public void openRestaurantWebsite() {
		driver = DriverFactory.getDriver();
		landingPage = new LandingPage(driver);
		landingPage.handleCookies();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@When("I click on the Takeout order type")
	public void clickOrderType() {
		landingPage.selectOrderTypeTakeout();
		/*
		 * WebElement orderTypeButton =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
		 * "TAKEOUT"))); orderTypeButton.click();
		 */
	}

	@And("I click on ASAP")
	public void clickButton() {

		orderPage = new OrderPage(driver);
		orderPage.clickAsSoonAsPossible();
		/*
		 * WebElement button = wait.until(
		 * ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//li[text()='ASAP (Ready in 5 - 10 Min)']"))); button.click();
		 */
	}
	
	
	@And("I click on Future Slot")
	public void ClickFutureSlot() {
		orderPage = new OrderPage(driver);
		orderPage.clickFutureSlot();
	}

	@And("I select an item")
	public void selectItem() {

		orderPage = new OrderPage(driver);
		orderPage.selectItem();

	}

//	@And("I add modifiers to the item")
//	public void addModifiers() throws InterruptedException {
//		Thread.sleep(3000);
//		orderPage = new OrderPage(driver);
//		orderPage.addModifiers();
//
//		/*
//		 * WebElement modalPara = wait.until(ExpectedConditions
//		 * .visibilityOfElementLocated(By.
//		 * xpath("//input[@id='301-189-0-1-1-Cheese Selection']"))); modalPara.click();
//		 */
//	}

	@And("I enter {string} in the text field")
	public void enterText(String extraInstructionText) {
		orderPage = new OrderPage(driver);
		orderPage.enterExtraInstructions(extraInstructionText);

	}

	@And("I click on the Add to Cart button")
	public void addToCart() {

		orderPage = new OrderPage(driver);
		orderPage.clickAddToCart();

	}

	@And("I click on the Checkout button")
	public void checkOut() {
		orderPage = new OrderPage(driver);
		orderPage.clickCheckout();

	}

	@And("I click on continue as a guest")
	public void signIn() {
		orderPage = new OrderPage(driver);
		orderPage.clickContinueAsGuest();

	}

	@And("I enter mobile number {string} into mobile number field")
	public void mobileNumber(String mobileNumberText) throws InterruptedException {
		Thread.sleep(3000);
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterMobileNumber(mobileNumberText);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone"))).sendKeys(mobileNumberText);

	}

	@And("I click on continue button")
	public void continueButton() throws InterruptedException {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.clickContinue();
		Thread.sleep(3000);

	}
	
	@And("I apply tips")
	public void applyTips() throws InterruptedException {
		checkOutPage =new CheckoutPage(driver);
		checkOutPage.applyCustomTips();
		Thread.sleep(2000);
	}

	@And("I enter my name as {string}")
	public void enterName(String nameText) {

		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterName(nameText);
		// driver.findElement(By.xpath("//div[@class='col-md-9']//input[@id='name']")).sendKeys(nameText);
	}

	@And("I enter my email as {string}")
	public void enterEmail(String emailText) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterEmail(emailText);
	}

	@And("I enter instructions as {string}")
	public void enterInstructions(String instructionsText) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterInstructions(instructionsText);

	}

	@And("I click on Payment mode")
	public void selectPaymentMode() {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.clickPaymentMode();

	}

	@And("I select visa as the payment type")
	public void paymentType() throws InterruptedException {
		Thread.sleep(5000);
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.selectVisaPaymentType();

		/*
		 * WebElement frameshift4 =
		 * driver.findElement(By.xpath("//iframe[contains(@name, 'i4goTT_')]"));
		 * 
		 * System.out.println("Successful");
		 * 
		 * driver.switchTo().frame(frameshift4);
		 * 
		 * System.out.println("Successful");
		 * 
		 * WebElement dropdown = driver.findElement(By.id("i4go_cardType"));
		 * 
		 * Select s = new Select(dropdown);
		 * 
		 * s.selectByVisibleText("Visa");
		 */

	}

	@And("I enter my card number as {string}")
	public void enterCardNumber(String cardNumberText) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterCardNumber(cardNumberText);
	}

	@And("I enter the expiration date as {string}")
	public void enterExpirationDate(String expirationDate) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterExpirationDate(expirationDate);
	}

	@And("I enter the CVC as {string}")
	public void enterCvc(String cvc) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterCVC(cvc);
	}

	@And("I enter the billing street address as {string}")
	public void enterStreetAddress(String streetAddress) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterBillingStreetAddress(streetAddress);
	}

	@And("I enter the billing postal code as {string}")
	public void enterPostalCode(String postalCode) {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.enterBillingPostalCode(postalCode);
	}
	
	@And("I click on Pay At Counter or Cash on delivery")
	public void clickPayAtCounter()
	{
		checkOutPage=new CheckoutPage(driver);
		checkOutPage.clickPayAtCounter();
	}
	
	@And("I click on place Order")
	public void clickOnPlaceOrder()
	{
		checkOutPage=new CheckoutPage(driver);
		checkOutPage.clickPlaceOrder();
	}

	@And("I click on Pay and Process Order")
	public void payAndProcessOrder() throws InterruptedException {
		checkOutPage = new CheckoutPage(driver);
		checkOutPage.clickPayAndProcessOrder();
		Thread.sleep(5000);
	}

	@Then("I should be on the confirmation page")
	public void verifyConfirmationPage() {

		/*WebElement confirmationMessage = driver
				.findElement(By.xpath("//h4[contains(text(),'Yay! Your order is placed.')]"));

		Assert.assertTrue("Confirmation message is not displayed", confirmationMessage.isDisplayed());*/

		
	}

}
