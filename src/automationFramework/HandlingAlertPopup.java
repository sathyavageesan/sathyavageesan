package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
         Thread.sleep(2000);
         Alert aler=driver.switchTo().alert();
         //String AlertText=aler.getText();
         //System.out.println(AlertText);
         System.out.println(aler.getText());
         aler.accept();
         

	}

}
