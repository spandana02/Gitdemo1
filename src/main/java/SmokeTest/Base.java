package SmokeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {

	public static WebDriver driver;

	public static WebDriver initialiseBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\spdasari\\GWCCAutomatePDF\\src\\main\\java\\SmokeTest\\config.properties");
		prop.load(fis);
		String Browsername = prop.getProperty("browser");
		String URL = prop.getProperty("url");

		if (Browsername.equals("chrome")) {

			/*
			 * String downloadFilepath =
			 * "C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\downloadtest"
			 * ; HashMap<String, Object> chromePrefs = new HashMap<String,
			 * Object>();
			 * chromePrefs.put("profile.default_content_settings.popups", 0);
			 * chromePrefs.put("download.default_directory", downloadFilepath);
			 * 
			 * ChromeOptions options = new ChromeOptions();
			 * options.setExperimentalOption("prefs", chromePrefs);
			 * options.addArguments("--test-type");
			 * options.addArguments("--disable-extensions"); //to disable
			 * browser extension popup
			 * options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 */

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium
			// folders\\chromedriver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",
				//	System.getProperty("user.dir")+"\\Browserdriver\\chromedriver.exe‪‪");
			
			DesiredCapabilities sit = DesiredCapabilities.chrome();
			sit.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdasari\\GWCCAutomatePDF\\Browserdriver\\chromedriver.exe");
			
			// driver = new ChromeDriver(options);

			driver = new ChromeDriver(sit);
			driver.get(URL);
			driver.manage().window().maximize();

		}

		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
