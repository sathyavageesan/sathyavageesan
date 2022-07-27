package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingTabsTesting2 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
	        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	        driver.findElement(By.xpath("//input[@name='q']/following::button")).click();  
	        Thread.sleep(2000);
	        WebElement Mobile=driver.findElement(By.xpath("(//div[contains(text(),'POCO M3')])[1]"));	
	        Actions act=new Actions(driver);
	        act.moveToElement(Mobile).build().perform();
	        act.click().build().perform();
	        Thread.sleep(1000);
	        ArrayList <String> MobilesTab=new ArrayList <String> (driver.getWindowHandles());
	        driver.switchTo().window(MobilesTab.get(1));
	        String PageTile=driver.getTitle();
	        System.out.println(PageTile);
	        String CurrentUrl=driver.getCurrentUrl();
	        System.out.println(CurrentUrl);
	        String ProductName=driver.findElement(By.xpath("//span[contains(text(),'POCO M3')]")).getText();
	        System.out.println(ProductName);
	        String ProductPrice=driver.findElement(By.xpath("(//div[contains(text(),'10')])[1]")).getText();
	        System.out.println(ProductPrice);
	        driver.findElement(By.id("pincodeInputId")).sendKeys("605005",Keys.ENTER);
	     

        
        
        
        
        
        
        
        
		

	}

}
