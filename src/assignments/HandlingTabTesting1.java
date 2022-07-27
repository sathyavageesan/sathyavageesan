package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabTesting1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/gmail/about/#");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]")).click();
        ArrayList <String> GmailTabs =new ArrayList <String>(driver.getWindowHandles());
        driver.switchTo().window(GmailTabs.get(1));
        driver.findElement(By.id("firstName")).sendKeys("Sathya");
        driver.findElement(By.id("lastName")).sendKeys("Vigas");
        driver.findElement(By.id("username")).sendKeys("svigas7");
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys("Pass@123");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Pass@123");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
      

	}

}
