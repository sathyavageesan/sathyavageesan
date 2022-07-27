package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormyProjectTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        driver.findElement(By.id("first-name")).sendKeys("Sathya");
        driver.findElement(By.id("last-name")).sendKeys("Vagis");
        driver.findElement(By.id("job-title")).sendKeys("Automation Engineer");
        WebElement education=driver.findElement(By.id("radio-button-2"));
        education.click();
        WebElement gender=driver.findElement(By.id("checkbox-1"));
        gender.click();
        Select experience=new Select(driver.findElement(By.id("select-menu")));
        experience.selectByVisibleText("0-1");
        Thread.sleep(1500);
        driver.findElement(By.id("datepicker")).sendKeys("06/01/2021");
        driver.findElement(By.xpath("//a[contains (text(),'Submit')]")).click();
		

	}

}
