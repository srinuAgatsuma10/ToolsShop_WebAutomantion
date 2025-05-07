package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterAccountPOM extends BasePage {
	
	public RegisterAccountPOM(WebDriver driver) {
		super(driver);
	}
	
	// WebElements
	// Form Elements
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//input[@id='street']")
	WebElement Street;
	
	@FindBy(xpath="//input[@id='postal_code']")
	WebElement pinCode;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement State;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement Country;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement Phone;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement registerButton;
	
	
	// Action Methods
	public void enterFirstLastNames(String fname, String lname) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
	}
	
	public void enterDOB(String dob) {
		dateOfBirth.sendKeys(dob);
	}
	
	public void enterAddressDetails(String street, String pin, String city, String state) {
		Street.sendKeys(street);
		pinCode.sendKeys(pin);
		City.sendKeys(city);
		State.sendKeys(state);
	}
	
	public void selectCountry() {
		Select sl = new Select(Country);
		sl.selectByVisibleText("India");
	}
	
	public void enterContactDetails(String phone, String email) {
		Phone.sendKeys(phone);
		Email.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
}
