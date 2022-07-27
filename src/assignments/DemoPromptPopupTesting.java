package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPromptPopupTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Textbox ')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();
        Thread.sleep(1000);
        Alert aler=driver.switchTo().alert();
        String PromptPopup=aler.getText();
        System.out.println(PromptPopup);
        aler.sendKeys("sathya");
        aler.accept();
        String Verify=driver.findElement(By.id("demo1")).getText();
        System.out.println(Verify);
        

	}

}
