package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourLogoTesting3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement Dresses=driver.findElement(By.xpath("//div[@id='homepage-slider']/preceding::a[5]"));
        WebElement SummerDress=driver.findElement(By.xpath("//div[@id='homepage-slider']/preceding::a[2]"));
        Actions act=new Actions(driver);
        act.moveToElement(Dresses).build().perform();
        act.moveToElement(SummerDress).build().perform();
        act.click().build().perform();
        String PageTitle=driver.getTitle();
        System.out.println(PageTitle);
        String CurrentUrl=driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        Select Sort=new Select(driver.findElement(By.id("selectProductSort")));
        Sort.selectByVisibleText("In stock");


	}

}
