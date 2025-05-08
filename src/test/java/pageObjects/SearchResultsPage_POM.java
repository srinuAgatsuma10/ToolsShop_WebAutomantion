package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage_POM extends BasePage{

	public SearchResultsPage_POM(WebDriver driver) {
		super(driver);
	}

	// Search result product names
	@FindBy(xpath = "//a//div//h5")
	List<WebElement> productNames;
	
	public String getProductNames() {
		for(WebElement pn : productNames) {
			String proName = pn.getText();
			return proName;
		}
		return null;
	}
}
