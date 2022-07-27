package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
        driver.manage().window().maximize();
        int LinksCount=driver.findElements(By.tagName("a")).size();
        System.out.println(LinksCount);
        int Image=driver.findElements(By.tagName("img")).size();
        System.out.println(Image);
        

	}

}
