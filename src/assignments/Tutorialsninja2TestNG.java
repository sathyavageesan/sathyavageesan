package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Tutorialsninja2TestNG {
	WebDriver driver;
	
	
	@Test
	public void a_pageLoad() {	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
    driver.manage().window().maximize();
	}
	
	@Test
	public void b_personalInfo() {	
    driver.findElement(By.id("input-firstname")).sendKeys("Sathya");
    driver.findElement(By.id("input-lastname")).sendKeys("Vagis");
    driver.findElement(By.id("input-email")).sendKeys("sathya255@gmail.com");
    driver.findElement(By.id("input-telephone")).sendKeys("9876545210");
	}
	
	@Test
	public void c_passwordField() {	
    driver.findElement(By.id("input-password")).sendKeys("Pass@123");
    driver.findElement(By.id("input-confirm")).sendKeys("Pass@123");
	}
	
	@Test
	public void d_radioButtons() throws InterruptedException {	
    WebElement subscribe=driver.findElement(By.name("newsletter"));
    subscribe.click();
    WebElement privacy=driver.findElement(By.name("agree"));
    privacy.click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='input-confirm']/following::input[4]")).click();
	}



}
