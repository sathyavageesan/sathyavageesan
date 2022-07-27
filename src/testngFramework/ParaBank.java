package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParaBank {
	WebDriver driver;

    @Test
    public void a_pageLoad( ) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://parabank.parasoft.com/parabank/register.htm");
    driver.manage().window().maximize();
    }
    
    @Test
    public void b_formfilling( ) {
    driver.findElement(By.id("customer.firstName")).sendKeys("Sathya");
    driver.findElement(By.id("customer.lastName")).sendKeys("Vagis");
    driver.findElement(By.id("customer.address.street")).sendKeys("10,xyz,xxx");
    driver.findElement(By.id("customer.address.city")).sendKeys("Chennai");
    driver.findElement(By.id("customer.address.state")).sendKeys("Tamilnadu");
    driver.findElement(By.id("customer.address.zipCode")).sendKeys("600000");
    driver.findElement(By.id("customer.phoneNumber")).sendKeys("70000000000");
    driver.findElement(By.id("customer.ssn")).sendKeys("02555");
    driver.findElement(By.id("customer.username")).sendKeys("Sathyaa");
    driver.findElement(By.id("customer.password")).sendKeys("Password@1");
    driver.findElement(By.id("repeatedPassword")).sendKeys("Password@1");
    driver.findElement(By.xpath(("//input[@id='repeatedPassword']/following::input[1]"))).click();
    
    }

}
