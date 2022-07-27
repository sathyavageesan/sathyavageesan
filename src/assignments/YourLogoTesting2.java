package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoTesting2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
        Thread.sleep(1000);
        Select Subject=new Select(driver.findElement(By.id("id_contact")));
        Subject.selectByVisibleText("Customer service");
        driver.findElement(By.id("email")).sendKeys("xjlx333@yahoo.com");
        driver.findElement(By.id("id_order")).sendKeys("id3214546");
        Thread.sleep(1000);
        WebElement File=driver.findElement(By.id("fileUpload"));
        File.sendKeys("C:\\Users\\sathy\\Pictures\\Nature.png");
        driver.findElement(By.id("message")).sendKeys("My Order has not arrived yet.");
        Thread.sleep(1000);
        driver.findElement(By.id("submitMessage")).click();
	}

}
