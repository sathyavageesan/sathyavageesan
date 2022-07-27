package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TutorialsninjaTestNG2 {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://www.tutorialsninja.com/demo/");
    driver.manage().window().maximize();
	}
	
	@Test
	public void b_searchProduct() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.name("search")).sendKeys("laptop",Keys.ENTER);
	}
	
	@Test
	public void c_printInfo() {
    String PageTitle=driver.getTitle();
    System.out.println(PageTitle);
    String PageUrl=driver.getCurrentUrl();
    System.out.println(PageUrl);
    String Text=driver.findElement(By.xpath("//h1[text()='Search - laptop']")).getText();
    System.out.println(Text);
	String Tagname=driver.findElement(By.xpath("//h1[text()='Search - laptop']")).getTagName();
	System.out.println(Tagname);
	String Attribute=driver.findElement(By.xpath("//h1[text()='Search - laptop']/following::select[1]")).getAttribute("class");
	System.out.println(Attribute);
	String Cssvalue=driver.findElement(By.xpath("//h1[text()='Search - laptop']/following::select[1]")).getCssValue("font-size");
	System.out.println(Cssvalue);
	}

}
