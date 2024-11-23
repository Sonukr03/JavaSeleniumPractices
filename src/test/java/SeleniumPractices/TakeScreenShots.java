package SeleniumPractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {

	public static void main(String[] args) throws  Exception {
		
		System.setProperty("webdriver.chrome,driver",
				"/Users/arnu/Desktop/Eclipse/JavaAndSeleniumPractices/src/test/resources/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

	
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyToDirectory(src, new File("/Users/arnu/Desktop/Eclipse/JavaAndSeleniumPractices/target/Screenshot.PNG"));
	}
}
