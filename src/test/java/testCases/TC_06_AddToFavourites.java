package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.ProductDisplayPage_POM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_06_AddToFavourites extends BaseClass {

	/* In This testCase Login operation is optional.
	 * (Note: The newly created account is active only for 30minutes)*/	
	//@BeforeClass
	public void logIn() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clikcSignIn();

		SignInPage_POM sp = new SignInPage_POM(driver);
		sp.enterEmailID(prop.getProperty("userName"));
		sp.enterPasswrd(prop.getProperty("password"));
		sp.clickLogin();

		hp.clickLogo();
	}

	@Test(groups = {"Functional","Master"})
	public void addToFavourites() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.selectOneProduct();

		ProductDisplayPage_POM pdp = new ProductDisplayPage_POM(driver);
		pdp.clickATFbtn();
		Assert.assertTrue(pdp.successMessage());
	}
}
