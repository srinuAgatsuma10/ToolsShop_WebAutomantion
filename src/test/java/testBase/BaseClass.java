package testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop; // to access config.properties file data

	@BeforeClass
	public void setUp() throws Exception {

		// Access URL from Properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		prop = new Properties();
		prop.load(file);

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	// Generate Random password
	public String passwordGenerator() {
		String alphabaticsUpper = RandomStringUtils.randomAlphabetic(2);
		String alphabaticsLower = RandomStringUtils.randomAlphabetic(4);
		String numbers = RandomStringUtils.randomNumeric(3);

		String totalPass = (alphabaticsUpper.toUpperCase() + alphabaticsLower.toLowerCase() + numbers + "@");
		return totalPass;
	}

	// Generate Random Number
	public String numberGenerator() {
		String numbers = RandomStringUtils.randomNumeric(3);
		return numbers;
	}
}
