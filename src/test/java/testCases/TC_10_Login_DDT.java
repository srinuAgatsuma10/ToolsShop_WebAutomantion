package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.MyAccountPage_POM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_10_Login_DDT extends BaseClass {

	@Test(groups = { "DataDriven" }, dataProvider = "LogInData", dataProviderClass = DataProviders.class)
	public void Login_DDT(String email, String pass, String res) throws Exception {
		try {
			HomePagePOM hp = new HomePagePOM(driver);
			hp.clikcSignIn();

			SignInPage_POM sp = new SignInPage_POM(driver);
			sp.enterEmailID(email);
			sp.enterPasswrd(pass);
			sp.clickLogin();

			sp.clearInputFields();
			
			MyAccountPage_POM map = new MyAccountPage_POM(driver);
			String text = map.captureText();

			// Conditions
			if (res.equalsIgnoreCase("Valid")) {

				if (text == "My account") {
					hp.clickAccountMenu();
					hp.clickSignOut();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (res.equalsIgnoreCase("Invalid")) {

				if (text == "My account") {
					hp.clickAccountMenu();
					hp.clickSignOut();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
