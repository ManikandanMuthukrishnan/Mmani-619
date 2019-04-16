package recapSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologies.in/selenium-training.php");	
	driver.manage().window().maximize();
	WebElement txtUser =driver.findElement(By.xpath("//*[text()[contains(.,'CTS Interview Question')]]"));
//	txtUser.sendKeys("http://www.greenstechnologies.in/selenium-training.php");
		
	//	WebElement pasWd=driver.findElement(By.id("pass"));
		//pasWd.sendKeys("socialnetwork");
		
//	WebElement btn =driver.findElement(By.xpath("//input[@type='submit']"));

	txtUser.click();
	}

}
