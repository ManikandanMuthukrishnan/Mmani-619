package recapSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDay3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");	
driver.manage().window().maximize();
WebElement FsttxtUser =driver.findElement(By.xpath("//input[@type='text']"));
FsttxtUser.sendKeys("java");
	
	WebElement lstName=driver.findElement(By.xpath("//input[@type='password']"));
	lstName.sendKeys("java");
	
WebElement Malebtn =driver.findElement(By.xpath("//input[@tvalue='male']"));	

Malebtn.click();
	WebElement ExpBtn =driver.findElement(By.xpath("//input[@tvalue='1']"));	

	ExpBtn.click();	
	
	
	
	WebElement ProfBTn =driver.findElement(By.xpath("//input[@tvalue='Automation Tester']"));	

	ProfBTn.click();	
	
	WebElement tooL =driver.findElement(By.xpath("//input[@tvalue='Selenium Webdriver']"));	

	tooL.click();		
	
	
	
	} 
	
	
	
	
	
	
}
