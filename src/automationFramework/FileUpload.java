package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.guru99.com/test/upload/");
         driver.manage().window().maximize();
         WebElement File=driver.findElement(By.id("uploadfile_0"));
         File.sendKeys("C:\\Users\\sathy\\Pictures\\Nature.png");
         //driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\sathy\\Pictures\\Nature.png");
         WebElement Accept=driver.findElement(By.id("terms"));
         Accept.click();
         WebElement Submit=driver.findElement(By.id("submitbutton"));
         Submit.click();
         

	}

}
