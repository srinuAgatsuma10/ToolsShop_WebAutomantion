package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage_POM extends BasePage {

	public CheckOutPage_POM(WebDriver driver) {
		super(driver);
	}

	// WebElements
	// Click on checkoutBtn (1)
	@FindBy(xpath = "//div[@class='ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")
	WebElement checkOutBtn1;

	// Click on checkoutBtn (2)
	@FindBy(xpath = "//div[@class='col-md-6 offset-md-3 login-form-1']//div[@class='float-end ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")
	WebElement checkOutBtn2;
	
	// Click on checkoutBtn (3)
	@FindBy(xpath = "//div[@class='float-end']//button[@type='button'][normalize-space()='Proceed to checkout']")
	WebElement checkOutBtn3;

	// Click on confirmBtn (1)
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	WebElement confirmBtn1;
	
	// Click on confirmBtn (2)
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	WebElement confirmBtn2;
	
	// Proceed checkout Text
	@FindBy(xpath = "//div[@class=\"col-md-6 offset-md-3 login-form-1\"]//p")
	WebElement getProceedText;
	
	// Payment DropDown
	@FindBy(xpath = "//select[@id='payment-method']")
	WebElement paymentDrpDown;
	
	// Payment success message and Success Box Element
	@FindBy(xpath = "//div[@class='help-block']")
	WebElement paymentSuccess;
	@FindBy(xpath = "//div[@class='alert alert-success ng-star-inserted']")
	WebElement paymentSucsBox;
	
	// Tax Invoice number
	@FindBy(xpath = "//div[@id='order-confirmation']")
	WebElement invoiceNum;
	

	// Action Methods
	public void clickCoBtn1() {
		checkOutBtn1.click();
	}
	
	public void clickCoBtn2() {
		checkOutBtn2.click();
	}
	
	public void clickCoBtn3() {
		checkOutBtn3.click();
	}
	
	public void clickConfirmBtn1() {
		confirmBtn1.click();
	}
	
	public void clickConfirmBtn2() {
		confirmBtn2.click();
	}
	
	public String proceed() {
		return getProceedText.getText();
	}
	
	public void selectPaymentMethod() {
		Select sl = new Select(paymentDrpDown);
		sl.selectByIndex(2);
	}
	
	public Boolean isPaymentSuccess() {
		if(paymentSucsBox.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public String paymentSuccessMsg() {
		return paymentSuccess.getText();
	}
	
	public String getTavInvoiceNumber() {
		return invoiceNum.getText();
	}
}
