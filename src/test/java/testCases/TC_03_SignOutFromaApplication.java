package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_03_SignOutFromaApplication extends BaseClass {

	@BeforeClass
	public void SignIn() {
		logger.info("Starting TC_03_SignOutFromaApplication");
		logger.info("Click on SigIn Button.");
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clikcSignIn();

		logger.info("Enter Valid credentials.");
		SignInPage_POM sp = new SignInPage_POM(driver);
		sp.enterEmailID(prop.getProperty("userName"));
		sp.enterPasswrd(prop.getProperty("password"));
		sp.clickLogin();

		logger.info("Return to Home page.");
		hp.clickLogo();
	}

	@Test(groups = {"Sanity","Functional","Master"})
	public void signOutFromApplication() {
		HomePagePOM hp = new HomePagePOM(driver);
		logger.info("Click on MyAccount DopDown and Click on SignOut.");
		hp.clickAccountMenu();
		hp.clickSignOut();
		
		logger.info("Finishing TC_03_SignOutFromaApplication");
	}
}
