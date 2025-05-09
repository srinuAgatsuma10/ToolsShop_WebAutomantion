package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.HomePagePOM;
import pageObjects.RegisterAccountPOM;
import pageObjects.SignInPage_POM;
import testBase.BaseClass;

public class TC_01_RegisterAccount extends BaseClass {

	@Test
	public void createNewAccount() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clikcSignIn();

		SignInPage_POM sp = new SignInPage_POM(driver);
		sp.clickRegister();

		Faker faker = new Faker();
		String fname = faker.name().firstName();
		String lname = faker.name().lastName();
		String street = faker.address().streetName();
		String pin = faker.address().zipCode();
		String city = faker.address().cityName();
		String state = faker.address().state();
		String email = faker.internet().emailAddress();

		RegisterAccountPOM rap = new RegisterAccountPOM(driver);
		rap.enterFirstLastNames(fname, lname);
		rap.enterDOB("12-02-2000");
		rap.enterAddressDetails(street, pin, city, state);
		rap.selectCountry();
		rap.enterContactDetails(numberGenerator(), email);
		rap.enterPassword(passwordGenerator());
		rap.clickRegisterButton();

		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("url") + "auth/login");
	}
}
