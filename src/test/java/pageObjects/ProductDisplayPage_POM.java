package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDisplayPage_POM extends BasePage {

	public ProductDisplayPage_POM(WebDriver driver) {
		super(driver);
	}

	// Add to Favorites
	@FindBy(xpath = "//button[@id='btn-add-to-favorites']")
	WebElement atfBtn;

	@FindBy(xpath = "//div[@aria-label='Unauthorized, can not add product to your favorite list.']")
	WebElement successMsg;

	@FindBy(xpath = "//button[@id='btn-add-to-cart']")
	WebElement addToCart;

	@FindBy(xpath = "//div[@aria-label='Product added to shopping cart.']")
	WebElement cartMessage;
	//a[@aria-label='cart']
	@FindBy(xpath = "//li[@class=\"nav-item\"]//a[@aria-label='cart']")
	WebElement cartIcon;
	
	
	public void clickATFbtn() {
		atfBtn.click();
	}

	public Boolean successMessage() {
		if (successMsg.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void clickAddCartBtn() {
		addToCart.click();
	}

	public Boolean cartSuccessMessage() {
		if (cartMessage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public void clickCartIcon() {
		cartIcon.click();
	}
}
