package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;

	
	
	 @Test
	    public void a_pageLoad( ) {
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	    }
	 
	 @Test
	 public void b_assertEquals() {
		 String element=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		 System.out.println(element);
		 Assert.assertEquals(element, "ONLINE BANKING");
		 System.out.println("AssertEquals Pass");
		 
		 
	 }
	 
	 @Test
	 public void c_assertNotEquals() {
		 String element=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		 Assert.assertNotEquals(element, "Online Banking");
		 System.out.println("AssertNotEquals Pass");

		 
	 }
	 
	 @Test
	 public void d_assertTrue() {
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("AssertTrue Pass");
	 }
	 
	 @Test
	 public void e_assertFalse() {
		 String element=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		 Assert.assertFalse("Online Banking".equals(element));
		 System.out.println("AssertFalse Pass");
	 }
	 
	 @Test
	 public void f_assertNotNull() {
		 Object obj=driver.getTitle();
		 Assert.assertNotNull(obj);
		 System.out.println("AssertNotNull Pass");
	 }
	 
	 @Test
	 public void g_assertNull() {
		 Object Obj=null;
		 Assert.assertNull(Obj);
		 System.out.println("AssertNull Pass");
	 }
	 
	 

}
