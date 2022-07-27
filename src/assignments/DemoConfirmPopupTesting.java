package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoConfirmPopupTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[2]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
        Alert aler=driver.switchTo().alert();
        String ConfirmPopup=aler.getText();
        System.out.println(ConfirmPopup);
        aler.dismiss();


	}

}
