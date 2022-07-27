package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.name("password")).sendKeys("secret_sauce");
         driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

}
