package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabsTestNG {
	WebDriver driver;
	
	 @Test
	 public void a_pageLoad() {
	 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get("https://www.saucedemo.com/");
     driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void b_logIn() {
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     driver.findElement(By.name("password")).sendKeys("secret_sauce");
     driver.findElement(By.xpath("//input[@id='login-button']")).click();
	 }
	 
	 @Test
	 public void c_logOut() throws InterruptedException {
		 Thread.sleep(2000);
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
	 }

}
