package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.MyAccountPage_POM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_02_SignInToApplication extends BaseClass {

	@Test
	public void signIntoApplication() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clikcSignIn();

		SignInPage_POM sp = new SignInPage_POM(driver);
		sp.enterEmailID("alexanderflaming@gmail.com");
		sp.enterPasswrd("Alexander@035");
		sp.clickLogin();

		MyAccountPage_POM map = new MyAccountPage_POM(driver);
		String text = map.captureText();

		Assert.assertEquals(text, "My account");
	}
}
