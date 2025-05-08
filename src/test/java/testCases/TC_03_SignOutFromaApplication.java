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
		sp.enterEmailID("alexanderflaming@gmail.com");
		sp.enterPasswrd("Alexander@035");
		sp.clickLogin();

		hp.clickLogo();
	}

	@Test
	public void signOutFromApplication() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickAccountMenu();
		hp.clickSignOut();
	}
}
