package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle());
        String PageTitle=driver.getTitle();
        System.out.println(PageTitle);
        String PageUrl=driver.getCurrentUrl();
        System.out.println(PageUrl);
        String TagName1=driver.findElement(By.id("searchTerm")).getTagName();
        System.out.println(TagName1);
        String TagName2=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getTagName();
        System.out.println(TagName2);
        String Attribute=driver.findElement(By.id("searchTerm")).getAttribute("placeholder");
        System.out.println(Attribute);
        String FontSize=driver.findElement(By.id("searchTerm")).getCssValue("font-size");
        System.out.println(FontSize);
        String Text=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
        System.out.println(Text);
        String Paragraph=driver.findElement(By.xpath("(//p[starts-with(text(),'Use Zero')])[1]")).getText();
        System.out.println(Paragraph);

        
        
        }

}
