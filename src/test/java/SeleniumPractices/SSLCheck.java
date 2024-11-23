package SeleniumPractices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck { // how handle SSL certification with JAVA SELENIUM

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// above two line we are using to handle the "your connection is not private
		// error" and accept the
		// and basically this happens when are working on client specific web site

		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		// with this we can set a proxy of browser

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		// while downloading file we can set a specific location to download the file

		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		// THIS WILL HELP TO BLOCK DIALOG WINDOW POPUP E.G ON FLITE/FOOD BOOKING PAGE WHILE LANDING IT WILL ASK TO ENABLE LOCATION.

		System.setProperty("webdriver.chrome,driver",
				"/Users/arnu/Desktop/Eclipse/JavaAndSeleniumPractices/src/test/resources/chromedriver");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();

		driver.manage().deleteCookieNamed("abc");
		// after deleting cookies click on any link to navigate on homepage of
		// application.

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
