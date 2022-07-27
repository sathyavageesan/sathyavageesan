package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommands {
WebDriver driver;
	
    @Test
    public void a_pageLoad( ) {
    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
    }
    
    @Test
    public void b_radio() {
    	WebElement radio=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
    	radio.click();
    	System.out.println(radio.isEnabled());
    }

}
