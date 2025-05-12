package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePagePOM;
import testBase.BaseClass;

public class TC_08_WorkingWithPagination extends BaseClass {

	@Test(groups = { "Functional", "Master" })
	public void paginationOfProducts() throws Exception {
		HomePagePOM hp = new HomePagePOM(driver);
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println(hp.getProductNames());
			} else {
				Thread.sleep(3000);
				hp.clickNextBtn();
				System.out.println(hp.getProductNames());
			}
		}
	}
}
