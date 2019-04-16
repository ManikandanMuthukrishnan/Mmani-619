package recapSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	driver.switchTo().frame("a077aa5e");
//	WebElement FBtn = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	
//	FBtn.click();
	
// To find the hew no. of frames in webpage
	List<WebElement> s=driver.findElements(By.tagName("iframe"));
System.out.println(s.size());

driver.switchTo().defaultContent();
WebElement Txtbtn=driver.findElement(By.xpath("//input[@type='text']"));

Txtbtn.sendKeys("Jack");

}
}