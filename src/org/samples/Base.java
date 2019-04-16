package org.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
static WebDriver driver;
public  static WebDriver getDriver()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe");

driver = new ChromeDriver();
return driver;
}
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	public static void type(WebElement element , String name){
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element)
	{
		
		element.click();
	}
public static void quitBrowser(){
	
driver.quit();
}

}


