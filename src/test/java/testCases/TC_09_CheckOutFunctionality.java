package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.CheckOutPage_POM;
import pageObjects.HomePagePOM;
import pageObjects.ProductDisplayPage_POM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_09_CheckOutFunctionality extends BaseClass {

	@BeforeClass
	public void SignIn() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clikcSignIn();

		SignInPage_POM sp = new SignInPage_POM(driver);
		sp.enterEmailID(prop.getProperty("userName"));
		sp.enterPasswrd(prop.getProperty("password"));
		sp.clickLogin();

		hp.clickLogo();
	}

	@Test(groups = { "Functionality", "Master" })
	public void checkOutProduct() {

		HomePagePOM hp = new HomePagePOM(driver);
		hp.selectOneProduct();
		
		ProductDisplayPage_POM pdm = new ProductDisplayPage_POM(driver);
		pdm.clickAddCartBtn();
		pdm.clickCartIcon();
		
		CheckOutPage_POM cop = new CheckOutPage_POM(driver);
		cop.clickCoBtn1();
		cop.proceed();
		cop.clickCoBtn2();
		cop.clickCoBtn3();
		cop.selectPaymentMethod();
		cop.clickConfirmBtn1();
		if(cop.isPaymentSuccess()==true) {
			System.out.println(cop.paymentSuccessMsg());
			cop.clickConfirmBtn2();
			System.out.println(cop.getTavInvoiceNumber());
			
			hp.clickLogo();
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Payment Failed, You can't go further step.");
			Assert.assertTrue(false);
		}
	}

}
