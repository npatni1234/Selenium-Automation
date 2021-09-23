package com.orangehrm.pages.nationality;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;



public class Delete_nationality extends BasePage{
	WebDriver driver;
	public  Delete_nationality(WebDriver driver) {
		this.driver=driver;
	}
	
	@Test
	public void Del_Nationality() throws Exception{
		
		//Navigating to Admin page
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//NAvigating to Nationality page
		driver.findElement(By.id("menu_admin_nationality")).click();
		
		//Delete the nationality
		try{
			driver.findElement(By.id("ohrmList_chkSelectRecord_12")).click();
	
			Thread.sleep(2000);
			driver.findElement(By.id("btnDelete")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
		}
		catch(Exception E){
			System.out.println("Nationality does not exists");
		}
		
	
	}
		
		
		
		public WebElement findElement(By by) throws Exception
		{
		WebElement elem=driver.findElement(by);		
			return elem;
		}
}