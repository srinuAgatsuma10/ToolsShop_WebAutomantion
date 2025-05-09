package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePOM extends BasePage {

	public HomePagePOM(WebDriver driver) {
		super(driver);
	}

	// Explicit Wait
	WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// WebElements
	// Click on Sign In
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement signIn;

	// Click website logo
	@FindBy(xpath = "//a[@title='Practice Software Testing - Toolshop']")
	WebElement logo;

	// Click User Account Menu
	@FindBy(xpath = "//a[@id='menu']")
	WebElement userAccountMenu;

	// Click SiginOut
	@FindBy(xpath = "//a[normalize-space()='Sign out']")
	WebElement signOut;

	// Search box
	@FindBy(xpath = "//input[@id='search-query']")
	WebElement searchBox;

	// Search box search button
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement searchButton;

	// Search Clear button
	@FindBy(xpath = "//button[normalize-space()='X']")
	WebElement searchClear;

	
	
	// Action Methods
	public void clikcSignIn() {
		signIn.click();
	}

	public void clickLogo() {
		logo.click();
	}

	public void clickAccountMenu() {
		WebElement menu = myWait.until(ExpectedConditions.elementToBeClickable(userAccountMenu));
		menu.click();
	}

	public void clickSignOut() {
		signOut.click();
	}

	public void enterProductName(String proName) {
		searchBox.sendKeys(proName);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void clearSearchButton() {
		searchClear.click();
	}
}
