package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffmailRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[1]")).sendKeys("Sathya");
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[2]")).sendKeys("Sathya.2021");
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[3]")).click();
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[4]")).sendKeys("Selenium@0");
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[5]")).sendKeys("Selenium@0");
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[6]")).sendKeys("Sathyaa@gmail.com");
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[7]")).click();
        driver.findElement(By.xpath("//td[contains(text(),' Security ')]/following::option[2]")).click();
        driver.findElement(By.xpath("//td[contains(text(),' Answer')]/following::input[1]")).sendKeys("xxx");
        driver.findElement(By.xpath("//td[contains(text(),' Answer')]/following::input[2]")).sendKeys("Thenu");
        driver.findElement(By.id("mobno")).sendKeys("5000000000");
        driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::option[05]")).click();
        driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::option[39]")).click();
        driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::option[47]")).click();
        driver.findElement(By.xpath("//td[contains(text(),' Name')]/following::input[14]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Country')]/following::option[42]")).click();
        Thread.sleep(15000);
       // driver.findElement(By.xpath("//td[contains(text(),'shown ')]/preceding::img[1]")).sendKeys("xxx");
        //driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[17]")).sendKeys("xxx");
        driver.findElement(By.id("Register")).click();
        
        
        

	}

}
