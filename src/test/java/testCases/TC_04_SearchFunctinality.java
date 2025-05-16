package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.SearchResultsPage_POM;
import testBase.BaseClass;

public class TC_04_SearchFunctinality extends BaseClass {

	@Test(groups = {"Sanity","Functional","Master"})
	public void searchProduct() {
		logger.info("Starting TC_04_SearchFunctinality");
		HomePagePOM hp = new HomePagePOM(driver);
		logger.info("Search Any existing product in the search Bar and click on Search button.");
		hp.enterProductName(prop.getProperty("productName1"));
		hp.clearSearchButton();

		logger.info("Get Names of the search results.");
		SearchResultsPage_POM srp = new SearchResultsPage_POM(driver);
		String proName = srp.getProductNames();

		Assert.assertTrue(proName.contains(prop.getProperty("productName1")));
		logger.info("Finishing TC_04_SearchFunctinality");
	}

}
