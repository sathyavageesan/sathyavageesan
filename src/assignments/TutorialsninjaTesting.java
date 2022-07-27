package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsninjaTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-firstname")).sendKeys("Sathya");
        driver.findElement(By.id("input-lastname")).sendKeys("Vagis");
        driver.findElement(By.id("input-email")).sendKeys("sathya155@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
        driver.findElement(By.id("input-password")).sendKeys("Pass@123");
        driver.findElement(By.id("input-confirm")).sendKeys("Pass@123");
        WebElement subscribe=driver.findElement(By.name("newsletter"));
        subscribe.click();
        WebElement privacy=driver.findElement(By.name("agree"));
        privacy.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='input-confirm']/following::input[4]")).click();


        




        

        

        

	}

}
