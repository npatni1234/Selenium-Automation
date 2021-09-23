package com.orangehrm.pages.timesheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.base.BasePage;




public class RepeatedDateTimesheetPage extends BasePage{
	WebDriver driver;
	public RepeatedDateTimesheetPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//Method for repeated date records
	public void RepeatDateTimesheet() throws Exception{
		findElement(By.linkText("My Timesheet")).click();
		findElement(By.id("btnAddTimesheet")).click();
		findElement(By.id("time_date")).click();
		findElement(By.id("time_date")).sendKeys("2018-12-11");
		Thread.sleep(2000);
		findElement(By.id("addTimesheetBtn")).click();	
		
		
	}
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);

		return elem;
	}
	
}
