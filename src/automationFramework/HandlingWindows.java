package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        ArrayList <String> NaukriWindows = new ArrayList <String> (driver.getWindowHandles());
       // for(String Output:NaukriWindows) {
        //	System.out.println(Output);
        //}
        String MainWindowTitle = driver.getTitle();
        System.out.println(MainWindowTitle);
        driver.switchTo().window(NaukriWindows.get(1));
        String ChildWindowTitle= driver.getTitle();
        System.out.println(ChildWindowTitle);
        driver.close();
        
	}

}
