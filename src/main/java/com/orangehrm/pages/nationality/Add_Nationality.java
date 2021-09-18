package com.orangehrm.pages.nationality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.orangehrm.base.BasePage;



public class Add_Nationality extends BasePage{
	WebDriver driver;
	public void Nationality(WebDriver driver) {
		this.driver=driver;
	}
	public void AddNationality() throws Exception{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Indian1");
		findElement(By.id("btnSave")).click();
	}
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);		
		return elem;
	}
}
