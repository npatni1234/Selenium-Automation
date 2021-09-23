package com.orangehrm.pages.timesheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.orangehrm.base.BasePage;

public class DateFormatTimesheetPage extends BasePage{
	WebDriver driver;
	public DateFormatTimesheetPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//Method for date format
	public void DateFormatTimesheet() throws Exception{
		findElement(By.linkText("My Timesheet")).click();
		findElement(By.id("btnAddTimesheet")).click();
		findElement(By.id("time_date")).click();
		findElement(By.id("time_date")).sendKeys("11-12-2020");
		Thread.sleep(2000);
		findElement(By.id("addTimesheetBtn")).click();		

		
	}
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);

		return elem;
	}
	
}
