package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwagLabsTesting {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.name("password")).sendKeys("secret_sauce");
         WebElement Login=driver.findElement(By.xpath("//input[@id='login-button']")); 
         Actions act=new Actions(driver);
         act.moveToElement(Login).build().perform();
         act.click().build().perform();
         WebElement Addtocart1=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
         act.moveToElement(Addtocart1).build().perform();
         act.click().build().perform();
         WebElement Addtocart2=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
         act.moveToElement(Addtocart2).build().perform();
         act.click().build().perform();
         WebElement Addtocart3=driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
         act.moveToElement(Addtocart3).build().perform();
         act.click().build().perform();  
         Thread.sleep(2000);
         WebElement Removecart= driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
         act.moveToElement(Removecart).build().perform();
         act.click().build().perform();
         WebElement Cart=driver.findElement(By.id("shopping_cart_container"));        
         act.moveToElement(Cart).build().perform();
         act.click().build().perform();  
         Thread.sleep(1000);
         WebElement Chekout=driver.findElement(By.id("checkout"));
         act.moveToElement(Chekout).build().perform();
         act.click().build().perform();
         driver.findElement(By.id("first-name")).sendKeys("sathya");
         driver.findElement(By.id("last-name")).sendKeys("vagis");
         driver.findElement(By.id("postal-code")).sendKeys("600000");
         Thread.sleep(1000);
         WebElement Continuebutton=driver.findElement(By.id("continue"));
         act.moveToElement(Continuebutton).build().perform();
         act.click().build().perform();
         Thread.sleep(1000);
         WebElement Finish=driver.findElement(By.id("finish"));
         act.moveToElement(Finish).build().perform();
         act.click().build().perform();
         String PageTitle=driver.getTitle();
         System.out.println(PageTitle);
         String PageUrl=driver.getCurrentUrl();
         System.out.println(PageUrl);
         String Thankyou=driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText();
         System.out.println(Thankyou);
         String Tagname=driver.findElement(By.xpath("//button[@id='back-to-products']/preceding::img[1]")).getTagName();
         System.out.println(Tagname);
         String Maxwidth=driver.findElement(By.id("checkout_complete_container")).getCssValue("max-width");
         System.out.println(Maxwidth);
         String Attribute=driver.findElement(By.id("back-to-products")).getAttribute("data-test");
         System.out.println(Attribute);
         
         
         
	} 
	

}





