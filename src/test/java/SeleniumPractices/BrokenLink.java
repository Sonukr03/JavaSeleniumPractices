package SeleniumPractices;


import java.net.HttpURLConnection;

import java.net.URL;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;





public class BrokenLink {

	public static void main(String[] args) throws Exception {

		//System.setProperty("webdriver.chrome,driver",
		//		"/Users/arnu/Desktop/Eclipse/JavaAndSeleniumPractices/src/test/resources/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		SoftAssert a = new SoftAssert();
		
	
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a")); //  a[href*='Soapui'] // this css will check Soapui contains as we have uses astric
		
		for(WebElement link: links) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			
			 conn.setRequestMethod("HEAD");
			 conn.connect();
			 int responseCode = conn.getResponseCode();
			 System.out.println(responseCode);
			 
			 a.assertTrue(responseCode<400, "The link with text "+link.getText()+ " is browken with code "+ responseCode);
			 
		}
		driver.close();
		a.assertAll(); // this will invoke and failed your script if assertTrue has run at once or more.
		// if there any error caught by a.assertTrue function then assertAll function will execute and failed your script else will skip. 
		
		
		// broken link
		// Step1 - is to get the all the Url's tied up to the links using Selenium
		// JAVA methods will call url's and gets you the status code
		// if status code > 400 then that url is not working -> link which tied to url
		// is broken

		

		/*
		 * 
		 * So this method is actually present in URL class.So that's why you are creating object and calling that method with object.method. And when you call this method, this method return type is HttpURLConnection.
		 * So you are simply calling that method and whatever return type you got, you are using here HttpURLConnection and you are casting it.
		 
		 */
		
		 
		
	}
	

}
