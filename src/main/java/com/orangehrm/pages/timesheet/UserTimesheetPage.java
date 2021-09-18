package com.orangehrm.pages.timesheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.base.BasePage;




public class UserTimesheetPage extends BasePage{
	WebDriver driver;
	public UserTimesheetPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void AddTimesheet() throws Exception{
		findElement(By.linkText("My Timesheet")).click();
		findElement(By.id("btnAddTimesheet")).click();
		findElement(By.id("time_date")).click();
		findElement(By.id("time_date")).sendKeys("2018-03-11");
		Thread.sleep(2000);
		findElement(By.id("addTimesheetBtn")).click();		
		findElement(By.id("btnEdit")).click();
		findElement(By.id("initialRows_0_projectName")).click();
		findElement(By.id("initialRows_0_projectName")).sendKeys("G");
		findElement(By.className("ac_results")).click();
		findElement(By.id("initialRows_0_projectActivityName")).sendKeys("G");
		findElement(By.xpath("//*[@id=\"initialRows_0_projectActivityName\"]/option[2]")).click();
		findElement(By.id("initialRows_0_0")).sendKeys("9");
		findElement(By.id("initialRows_0_1")).sendKeys("9");
		findElement(By.id("submitSave")).click();
		findElement(By.className("button")).submit();}
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);

		return elem;
	}
	
}
