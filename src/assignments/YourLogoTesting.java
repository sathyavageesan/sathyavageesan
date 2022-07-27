package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLogoTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("may333@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Password@0");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
        

	}

}
