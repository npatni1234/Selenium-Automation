package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	WebElement adminTab;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SystemUsersPage clickOnAdminTab()
	{
		adminTab.click();
		return new SystemUsersPage();
	}

}
