package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.SearchResultsPage_POM;
import testBase.BaseClass;

public class TC_05_FilteringProducts extends BaseClass {

	@Test(priority = 1)
	public void searchByCategory() throws Exception {
		SearchResultsPage_POM spm = new SearchResultsPage_POM(driver);
		Boolean resultStatus = spm.checkEachCategoryProducts();
		List<WebElement> categoryProducts = spm.returnEachCategory();
		for (WebElement cp : categoryProducts) {
			cp.click();
			Thread.sleep(3000);
			if (resultStatus == true) {
				System.out.println(spm.getProductNames());
			} else {
				System.out.println("No Products Found");
			}
			cp.click();
		}
	}

	@Test(priority = 2)
	public void searchByBrand() throws Exception {
		SearchResultsPage_POM spm = new SearchResultsPage_POM(driver);
		Boolean resultStatus = spm.checkEachCategoryProducts();
		List<WebElement> brands = spm.returnEachBrand();
		for (WebElement cp : brands) {
			cp.click();
			Thread.sleep(3000);
			if (resultStatus == true) {
				System.out.println(spm.getProductNames());
			} else {
				System.out.println("No Products Found");
			}
			cp.click();
		}
	}

}
