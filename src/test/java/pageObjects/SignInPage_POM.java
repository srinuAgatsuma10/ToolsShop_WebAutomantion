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
	@FindBy(xpath="//a[normalize-space()='Register your account']")
	WebElement registerAccount;
	
	
	// Action Methods
	public void clickRegister() {
		registerAccount.click();
	}

}
