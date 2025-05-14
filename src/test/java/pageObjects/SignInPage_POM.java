package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage_POM extends BasePage {

	public SignInPage_POM(WebDriver driver) {
		super(driver);
	}

	// WebElements
	// Click Register Account
	@FindBy(xpath = "//a[normalize-space()='Register your account']")
	WebElement registerAccount;

	@FindBy(xpath = "//input[@id='email']")
	WebElement enterEmail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement enaterPassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement logInButton;

	@FindBy(xpath = "//a[normalize-space()='Forgot your Password?']")
	WebElement forgotPassword;

	// Action Methods
	public void clickRegister() {
		registerAccount.click();
	}

	public void enterEmailID(String email) {
		enterEmail.sendKeys(email);
	}

	public void enterPasswrd(String password) {
		enaterPassword.sendKeys(password);
	}

	public void clickLogin() {
		logInButton.click();
	}

	public void clearInputFields() {
		enterEmail.clear();
		enaterPassword.clear();
	}
}
