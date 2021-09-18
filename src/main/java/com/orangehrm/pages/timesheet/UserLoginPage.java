package com.orangehrm.pages.timesheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.HomePage;



public class UserLoginPage extends BasePage{
	
	
	 WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	

	@FindBy(xpath="//*[@id=\"btnLogin\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement logo;
	
	
	public void UserLogin(WebDriver driver)
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
