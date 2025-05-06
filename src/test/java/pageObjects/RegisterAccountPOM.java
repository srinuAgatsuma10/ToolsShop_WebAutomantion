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
	@FindBy(xpath="")
	WebElement firstName;
	
	@FindBy(xpath="")
	WebElement lastName;
	
	@FindBy(xpath="")
	WebElement dateOfBirth;
	
	@FindBy(xpath="")
	WebElement Street;
	
	@FindBy(xpath="")
	WebElement pinCode;
	
	@FindBy(xpath="")
	WebElement City;
	
	@FindBy(xpath="")
	WebElement State;
	
	@FindBy(xpath="")
	WebElement Country;
	
	@FindBy(xpath="")
	WebElement Phone;
	
	@FindBy(xpath="")
	WebElement Email;
	
	@FindBy(xpath="")
	WebElement Password;
	
	
	
	// Action Methods
	public void enterFirstLastNames(String fname, String lname) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
	}
	
	public void enterDOB() {
		
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
}
