package recapSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclick {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");	
	driver.manage().window().maximize();
//	WebElement txtUser =driver.findElement(By.xpath("//input[@type='email']"));
	//txtUser.sendKeys("Java@gmail");
		
		WebElement pasWd=driver.findElement(By.id("pass"));
		pasWd.sendKeys("java");
		
		WebElement btn =driver.findElement(By.xpath("//input[@value='2']"));
	
		btn.click();
	}
}
	
	
	
	
	

