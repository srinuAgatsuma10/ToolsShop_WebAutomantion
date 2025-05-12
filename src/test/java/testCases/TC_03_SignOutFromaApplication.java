package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_03_SignOutFromaApplication extends BaseClass {

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

	@Test(groups = {"Sanity","Functional","Master"})
	public void signOutFromApplication() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickAccountMenu();
		hp.clickSignOut();
	}
}
