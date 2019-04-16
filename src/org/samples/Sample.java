package org.samples;

import org.openqa.selenium.WebDriver;

public class Sample extends Base {
	public static void main(String[] args) {
	
		WebDriver driver = getDriver();
		loadUrl ("https://www.facebook.com/");
		LoginPage page= new LoginPage();
		type(page.getTxtUserName(),"Hello");
		type(page.getTxtPassword(),"JAVA");
btnClick(page.getLstBtnLogin().get(0));
quitBrowser();
		
		
	}


}


