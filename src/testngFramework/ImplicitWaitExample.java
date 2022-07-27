package testngFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitExample {
	WebDriver driver;

	
	
	 @Test
	    public void a_pageLoad( ) {
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	    }
	 

	 @Test
	    public void b_search( ) throws InterruptedException {
		 driver.findElement(By.id("q")).sendKeys("Sachin Tendulkar",Keys.ENTER);
		 //Thread.sleep(10000);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")).click();
	 }
	 

}
