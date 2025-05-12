package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop; // to access config.properties file data

	@BeforeClass(groups = { "Sanity", "Functional", "Master", "Data Driven" })
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

	@AfterClass(groups = { "Sanity", "Functional", "Master", "Data Driven" })
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

	// Capturing Screen Shot
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\ScreenShots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath;

	}
}
