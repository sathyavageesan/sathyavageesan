package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartKeyboardTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
        Thread.sleep(1000);
        WebElement Search=driver.findElement(By.xpath("//input[@name='q']/following::button"));
        Search.click();

	}

}
