package com.orangehrm.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.orangehrm.base.BasePage;



public class Logout extends BasePage {
	WebDriver driver;
	public void HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void LogoutBtn() throws Exception{
		findElement(By.id("welcome")).click();
		findElement(By.linkText("Logout")).click();
	}
	
	public WebElement findElement(By by) throws Exception
	{
		WebElement elem=driver.findElement(by);
		return elem;
	}
}
