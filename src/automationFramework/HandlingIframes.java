package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://nunzioweb.com/index.shtml");
        driver.manage().window().maximize();
        driver.switchTo().frame("oddcouple");
        String Para=driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();
        System.out.println(Para);

	}

}
