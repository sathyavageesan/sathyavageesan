package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
		 
		
		 
		 


	}

}
