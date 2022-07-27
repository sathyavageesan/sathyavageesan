package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseActionsScroll {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
	}
	
	@Test
	public void b_productPage() throws InterruptedException {
    driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi",Keys.TAB,Keys.ENTER);
    Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    //js.executeScript("window.scrollBy(0,1000)");
    js.executeScript("window.scrollBy(0,document,body.scrollHeight)");
	}

}
