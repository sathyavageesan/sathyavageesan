package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabTesting {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.name("password")).sendKeys("secret_sauce");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@id='login-button']")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("shopping_cart_container")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("remove-sauce-labs-bike-light")).click();

         

         

	}

}
