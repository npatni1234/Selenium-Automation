package com.orangehrm.pages.nationality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.orangehrm.base.BasePage;



public class Delete_nationality extends BasePage{
	WebDriver driver;
	public void Delete_nationality(WebDriver driver) {
		this.driver=driver;
	}
	public void Del_Nationality() throws Exception{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		
		driver.findElement(By.id("ohrmList_chkSelectRecord_12")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);		
		return elem;
	}
}