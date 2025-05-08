package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import pageObjects.SearchResultsPage_POM;
import testBase.BaseClass;

public class TC_04_SearchFunctinality extends BaseClass {

	@Test
	public void searchProduct() {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.enterProductName("Hammer");
		hp.clearSearchButton();
		
		SearchResultsPage_POM srp = new SearchResultsPage_POM(driver);
		String proName = srp.getProductNames();
		
		Assert.assertTrue(proName.contains("Hammer"));
	}
	
}
