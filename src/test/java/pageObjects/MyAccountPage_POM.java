package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage_POM extends BasePage {

	public MyAccountPage_POM(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()='My account']")
	WebElement myAccountText;
	
	
	public String  captureText() {
		String text = myAccountText.getText();
		return text;
	}
}
