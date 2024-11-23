package SeleniumPractices;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack {
	
	public static void main(String[] args) throws Exception {
		
		
		MutableCapabilities capabilities = new MutableCapabilities();

        // BrowserStack-specific settings
        MutableCapabilities browserstackOptions = new MutableCapabilities();
        browserstackOptions.setCapability("os", "Windows");
        browserstackOptions.setCapability("osVersion", "11");
        browserstackOptions.setCapability("resolution", "1920x1080");
        browserstackOptions.setCapability("browserVersion", "latest");
        browserstackOptions.setCapability("projectName", "BrowserStack Integration");
        browserstackOptions.setCapability("buildName", "Build-1");
        browserstackOptions.setCapability("sessionName", "Sample Test");

        // Add browserstackOptions to main capabilities
        capabilities.setCapability("bstack:options", browserstackOptions);
        capabilities.setCapability("browserName", "Chrome");

		
		
		
	        // Replace USERNAME and ACCESS_KEY with your BrowserStack credentials
	        String username = "sonukumar_fumScC";
	        String accessKey = "Hqx7bCuZf9krCQabWJhq";
	        
	    String URll =    "https://sonukumar_fumScC:Hqx7bCuZf9krCQabWJhq@hub-cloud.browserstack.com/wd/hub";

	//        URL browserStackUrl = new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub");

	      WebDriver  driver = new RemoteWebDriver(new URL(URll), capabilities);
	      driver.get("https://www.google.com");
		
	}

}
