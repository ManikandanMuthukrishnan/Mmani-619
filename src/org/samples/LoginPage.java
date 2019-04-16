package org.samples;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement txtUserName;
	
	@FindBy(id = "pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log In']")
	private List<WebElement> lstBtnLogin;
	
	
	public WebElement getTxtUserName(){
		return txtUserName;
		
	}
		public WebElement getTxtPassword()
		{
			return txtPassword;
		}
public List<WebElement> getLstBtnLogin()
{
	return lstBtnLogin;
}
	
	
	
	}
	
	
	
	
	

