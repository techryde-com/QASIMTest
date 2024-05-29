package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	WebDriver driver;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//li[text()='ASAP (Ready in 5 - 10 Min)']")
	private WebElement asSoonAsPossibleButton;

	@FindBy(xpath = "//div[@onclick=\"javascript:CheckDelivery('product_modal-301','$11.00')\"]")
	private WebElement itemMenu;

	@FindBy(xpath = "//input[@id='301-189-0-1-1-Cheese Selection']")
	private WebElement modifiersCheckbox;

	@FindBy(id = "instr_301-1")
	private WebElement extraInstructionsTextArea;

	@FindBy(id = "btn-301")
	private WebElement addToCartButton;

	@FindBy(id = "btn_checkout")
	private WebElement checkoutButton;

	@FindBy(xpath = "//a[@href='javascript:guestcheckout()']")
	private WebElement continueAsGuestButton;

	public void clickAsSoonAsPossible() {
		asSoonAsPossibleButton.click();
	}

	public void selectItem() {
		itemMenu.click();
	}

	public void addModifiers() {
		modifiersCheckbox.click();
	}

	public void enterExtraInstructions(String extraInstructionText) {
		extraInstructionsTextArea.sendKeys(extraInstructionText);
	}

	public void clickAddToCart() {
		addToCartButton.click();
	}

	public void clickCheckout() {
		checkoutButton.click();
	}

	public void clickContinueAsGuest() {
		continueAsGuestButton.click();
	}

}
