package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoTestNG {
	WebDriver driver;
        
	    @Test
	    public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();
	    }
	    
	    @Test
	    public void b_logIn() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("Admin123");
        driver.findElement(By.id("Pharmacy")).click();
        driver.findElement(By.id("loginButton")).click();
	    }
	    
	    @Test
	    public void c_personalInfo() {
        driver.findElement(By.xpath("//a[normalize-space()='Register a patient']")).click();
        driver.findElement(By.xpath("//h3[text()=\"What's the patient's name?\"]/following::input[1]")).sendKeys("sathya");
        driver.findElement(By.xpath("//h3[text()=\"What's the patient's name?\"]/following::input[3]")).sendKeys("t");
        driver.findElement(By.id("next-button")).click();
        Select gender=new Select(driver.findElement(By.id("gender-field")));
        gender.selectByVisibleText("Male");
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("birthdateDay-field")).sendKeys("15");
        Select months=new Select(driver.findElement(By.id("birthdateMonth-field")));
        months.selectByVisibleText("July");
        driver.findElement(By.id("birthdateYear-field")).sendKeys("1994");
        driver.findElement(By.id("next-button")).click();
	    }
	    
        @Test
        public void d_addressInfo() {
        driver.findElement(By.id("address1")).sendKeys("xxxx");
        driver.findElement(By.id("cityVillage")).sendKeys("yyyy");
        driver.findElement(By.id("stateProvince")).sendKeys("zzzz");
        driver.findElement(By.id("country")).sendKeys("xzxz");
        driver.findElement(By.id("postalCode")).sendKeys("600000");
        driver.findElement(By.id("next-button")).click();
        }
        
        @Test
        public void e_otherInfo() {
        driver.findElement(By.xpath("//label[contains(text(),\"What's the patient phone number?\")]/following::input[1]")).sendKeys("91");
        driver.findElement(By.id("next-button")).click();
        Select relations=new Select(driver.findElement(By.id("relationship_type")));
        relations.selectByVisibleText("Parent");
        driver.findElement(By.xpath("//select[@id='relationship_type']/following::input[1]")).sendKeys("zx");
        driver.findElement(By.id("next-button")).click();
        }
        
        @Test
        public void f_submitInfo() {
        driver.findElement(By.id("submit")).click();
        }


        

        

        


        

	

}
