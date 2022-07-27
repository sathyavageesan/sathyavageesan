package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsTesting {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input")).sendKeys("0");        
        for (int i=0; i<=8; i++){
        Thread.sleep(500);
        driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input")).sendKeys(Keys.ARROW_UP);}
        for (int i=0; i<=8; i++){
        Thread.sleep(500);
        driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input")).sendKeys(Keys.ARROW_DOWN);}
            		 
            
	}

}
