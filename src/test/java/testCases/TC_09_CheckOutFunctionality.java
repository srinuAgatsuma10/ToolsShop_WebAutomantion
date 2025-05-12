package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_09_CheckOutFunctionality extends BaseClass {

	@Test(groups = {"Functionality","Master"})
	public void checkOutProduct() {
		//a[@aria-label='cart']
		//div[@class='wizard-steps horizontal']//aw-wizard-step//app-cart//div//button[@type='button'][normalize-space()='Proceed to checkout']
		//p[contains(text(),'Hello asdvasv kjnjkbn, you are already logged in. ')]	(OR)
			//div[@class="col-md-6 offset-md-3 login-form-1"]//p
		//app-login//button[@type='button'][normalize-space()='Proceed to checkout']
		//app-address//button[@type='button'][normalize-space()='Proceed to checkout']
		//select[@id='payment-method']
		//button[normalize-space()='Confirm']
		//div[@class='help-block']
		//div[@class='alert alert-success']
		//button[normalize-space()='Confirm']
		//div[@id='order-confirmation']
		//span[normalize-space()='INV-2025000003']
	}
	
}
