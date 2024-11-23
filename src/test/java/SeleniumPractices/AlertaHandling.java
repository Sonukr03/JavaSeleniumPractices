package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertaHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String text="Sonu";

	//	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys(text);

		///Thread.sleep(5000);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
        

	//	Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}

}
