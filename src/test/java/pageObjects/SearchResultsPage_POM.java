package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage_POM extends BasePage {

	public SearchResultsPage_POM(WebDriver driver) {
		super(driver);
	}

	// Search result product names
	@FindBy(xpath = "//a//div//h5[@data-test=\"product-name\"]")
	List<WebElement> productNames;

	// Search By Category
	@FindBy(xpath = "//ul//fieldset//div//label")
	List<WebElement> categoryProducts;

	// Product results
	@FindBy(xpath = "//a//div")
	List<WebElement> products;
	
	// Brands
	@FindBy(xpath = "//fieldset//div[@class=\"checkbox\"]//label//input[@name=\"brand_id\"]")
	List<WebElement> brands;

	
	
	public String getProductNames() {
		for (WebElement pn : productNames) {
			String proName = pn.getText();
			return proName;
		}
		return null;
	}

	public List<WebElement> returnEachCategory() {
		return categoryProducts;
	}

	public Boolean checkEachCategoryProducts() {
		for (WebElement pr : products) {
			if (pr.isDisplayed()) {
				return true;
			}
		}
		return false;
	}

	public List<WebElement> returnEachBrand() {
		return brands;
	}
}
