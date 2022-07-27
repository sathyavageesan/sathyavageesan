package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartTestNG {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
	}
	
	@Test
	public void b_productPage() {
    driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi",Keys.TAB,Keys.ENTER);
	}
	
    
	@Test
	public void c_selectedProduct() throws InterruptedException {
    Thread.sleep(4000);
    WebElement Mobile=driver.findElement(By.xpath("(//div[contains(text(),'REDMI')])[2]"));	
    Actions act=new Actions(driver);
    act.moveToElement(Mobile).build().perform();
    act.click().build().perform();
	}
	
	@Test
	public void d_newTab() throws InterruptedException {
    Thread.sleep(1000);
    ArrayList <String> MobilesTab=new ArrayList <String> (driver.getWindowHandles());
    driver.switchTo().window(MobilesTab.get(1));
	}
	
	@Test
	public void e_printInfo() {
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
