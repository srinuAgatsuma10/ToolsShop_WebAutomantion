package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM extends BasePage {

	public HomePagePOM(WebDriver driver) {
		super(driver);
	}

	// WebElements
	
	// Click on Sign In
	@FindBy(xpath="")
	WebElement signIn;
	
	
	// Action Methods
	public void clikcSignIn() {
		signIn.click();
	}
}
