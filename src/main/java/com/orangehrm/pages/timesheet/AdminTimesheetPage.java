package com.orangehrm.pages.timesheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.base.BasePage;



public class AdminTimesheetPage extends BasePage{
	WebDriver driver;
	public AdminTimesheetPage(WebDriver driver) {
		this.driver=driver;
	}
	public void AdminTimesheetverify() throws Exception{
		findElement(By.linkText("Timesheets")).click();
		findElement(By.id("employee")).click();
		findElement(By.id("employee")).sendKeys("siddhi kataria");
		//findElement(By.xpath("//*[@id=\"viewSubmitted\"]")).click();
		findElement(By.id("btnView")).click();
		findElement(By.id("btnApprove")).click();	}
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);
		return elem;
	}
	
}
