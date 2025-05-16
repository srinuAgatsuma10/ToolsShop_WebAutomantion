package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.MyAccountPage_POM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_02_SignInToApplication extends BaseClass {

	@Test(groups = {"Sanity","Functional","Master"})
	public void signIntoApplication() {
		logger.info("Starting TC_02_SignInToApplication");
		logger.info("Click on SigIn Button.");
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clikcSignIn();

		logger.info("Enter Valid credentials.");
		SignInPage_POM sp = new SignInPage_POM(driver);
		sp.enterEmailID(prop.getProperty("userName"));
		sp.enterPasswrd(prop.getProperty("password"));
		sp.clickLogin();

		MyAccountPage_POM map = new MyAccountPage_POM(driver);
		String text = map.captureText();

		Assert.assertEquals(text, "My account");
		logger.info("Finishing TC_02_SignInToApplication");
	}
}
