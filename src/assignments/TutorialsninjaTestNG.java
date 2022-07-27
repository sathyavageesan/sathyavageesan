package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TutorialsninjaTestNG {
	 WebDriver driver;
		
		@Test
		public void a_pageLoad()  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
		}

		@Test
		public void b_productPage() {
	    WebElement Desktop= driver.findElement(By.xpath("//a[text()='Desktops']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(Desktop).build().perform();
	    WebElement Mac=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	    act.moveToElement(Mac).build().perform();
	    act.click().build().perform();
		}
	    

		@Test
		public void c_addProduct() {
	    driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		}
	    

		@Test
		public void d_textPrint() throws InterruptedException {
		Thread.sleep(1000);
		String Text=driver.findElement(By.xpath("//a[text()='Desktops (13)']/preceding::div[1]")).getText();
		System.out.println(Text);
		}

		@Test
		public void e_removeProduct() throws InterruptedException {
	    Thread.sleep(1500);
	    driver.findElement(By.id("cart-total")).click();
	    driver.findElement(By.xpath("//span[@id='cart-total']/following::i[1]")).click();
	    
	    
		}

}
