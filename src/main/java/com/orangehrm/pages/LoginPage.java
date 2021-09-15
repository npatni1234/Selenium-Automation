package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.BasePage;




//page class extends base class
public class LoginPage extends BasePage {
	 WebDriver driver;
	 public void LoginPage(WebDriver driver) {
			this.driver=driver;
	}
	
	//locating web elements using @FindBy annotation
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	

	@FindBy(xpath="//*[@id=\"btnLogin\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement logo;
	
	
	
	//using constructor to initialise the web elements initElements method
	//constructor has same name as class name
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


public boolean validateLogo()
{
	logo.isDisplayed();
	return true;
}

public HomePage login(String uname, String pswd)
{
	userName.sendKeys(uname);
	password.sendKeys(pswd);
	loginBtn.click();
	return new HomePage(driver);
}
}
