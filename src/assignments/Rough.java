package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rough {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi",Keys.TAB,Keys.ENTER);
        

        Thread.sleep(3000);
        WebElement Mobile=driver.findElement(By.xpath("(//div[contains(text(),'REDMI')])[2]"));	
        Actions act=new Actions(driver);
        act.moveToElement(Mobile).build().perform();
        act.click().build().perform();
        //Mobile.click();
        Thread.sleep(1000);
        ArrayList <String> MobilesTab=new ArrayList <String> (driver.getWindowHandles());
        driver.switchTo().window(MobilesTab.get(1));
        
        String PageTitle=driver.getTitle();
        System.out.println(PageTitle);
        String PageUrl=driver.getCurrentUrl();
        System.out.println(PageUrl);
        String Text=driver.findElement(By.xpath("//span[contains(text(),'REDMI')]")).getText();
        System.out.println(Text);
        String Price=driver.findElement(By.xpath("//span[contains(text(),'REDMI')]/following::div[9]")).getText();
        System.out.println(Price);
        
	    
	    

	}

}
