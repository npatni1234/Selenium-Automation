package com.orangehrm.pages.timesheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.orangehrm.base.BasePage;



public class LargeHoursPages extends BasePage{
	WebDriver driver;
	public LargeHoursPages(WebDriver driver) {
		this.driver= driver;
	}
	
	public void LargeHoursTimesheet() throws Exception{
		findElement(By.linkText("My Timesheet")).click();
		findElement(By.id("btnAddTimesheet")).click();
		findElement(By.id("time_date")).click();
		findElement(By.id("time_date")).sendKeys("2018-09-01");
		Thread.sleep(2000);

		findElement(By.id("addTimesheetBtn")).click();		
		findElement(By.id("btnEdit")).click();
		findElement(By.id("initialRows_0_projectName")).click();
		findElement(By.id("initialRows_0_projectName")).sendKeys("rajeshwari - project tracking");
		findElement(By.id("initialRows_0_projectActivityName")).click();
		findElement(By.className("projectActivity")).click();
		findElement(By.className("projectActivity")).sendKeys("listing requirments");
		findElement(By.id("initialRows_0_0")).sendKeys("98");
		findElement(By.id("initialRows_0_1")).sendKeys("26");
		findElement(By.id("submitSave")).click();		
	
		}
	
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);

		return elem;
	}
	
}
