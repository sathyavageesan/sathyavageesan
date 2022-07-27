package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PetstoreTestNG {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    driver.manage().window().maximize();
	}
	
	@Test
	public void b_userInfo()  { 
    driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[1]")).sendKeys("Sathya");
    driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[2]")).sendKeys("Pass@123");
    driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[3]")).sendKeys("Pass@123");
	}
    
	@Test
	public void c_accountInfo()  { 
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[1]")).sendKeys("Sathya");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[2]")).sendKeys("Vagis");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[3]")).sendKeys("sathya95@gmail.com");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[4]")).sendKeys("9874563210");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[5]")).sendKeys("16,xxx");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[6]")).sendKeys("yyy,zzz");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[7]")).sendKeys("Chennai");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[8]")).sendKeys("Tamilnadu");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[9]")).sendKeys("600000");
    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[10]")).sendKeys("India");
	}
	
	@Test
	public void d_profileInfo() throws InterruptedException { 
    Thread.sleep(1000);
    Select language=new Select(driver.findElement(By.name("account.languagePreference")));
    language.selectByVisibleText("japanese");
    Select favourite=new Select(driver.findElement(By.name("account.favouriteCategoryId")));
    favourite.selectByVisibleText("DOGS");
    driver.findElement(By.xpath("//td[contains(text(),'Country:')]/following::input[2]")).click();
    driver.findElement(By.xpath("//td[contains(text(),'Country:')]/following::input[3]")).click();
    driver.findElement(By.xpath("//td[contains(text(),'Country:')]/following::input[4]")).click();
	}
    

}
