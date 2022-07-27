package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("may333@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        //driver.findElement(By.id("id_gender2")).click();
        Thread.sleep(4000);
        WebElement gender=driver.findElement(By.id("id_gender2"));
        gender.click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Sathya");
        driver.findElement(By.id("customer_lastname")).sendKeys("Vagis");
        driver.findElement(By.id("passwd")).sendKeys("Password@0");
        Select date=new Select(driver.findElement(By.id("days")));
        date.selectByVisibleText("10  ");
        Select month=new Select(driver.findElement(By.id("months")));
        month.selectByVisibleText("June ");
        Select year=new Select(driver.findElement(By.id("years")));
        year.selectByVisibleText("2019  ");
        WebElement newsletter=driver.findElement(By.id("newsletter"));
        newsletter.click();
        driver.findElement(By.id("firstname")).sendKeys("sathya");
        driver.findElement(By.id("lastname")).sendKeys("Vagis");
        driver.findElement(By.id("address1")).sendKeys("13,bd,xxx");
        driver.findElement(By.id("city")).sendKeys("Chennai");
        Select state=new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Florida");
        driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.id("phone_mobile")).sendKeys("77894561230");
        driver.findElement(By.id("submitAccount")).click();
        

	}

}
