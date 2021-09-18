package com.orangehrm.pages.timesheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.orangehrm.base.BasePage;



public class NullProjectAndActivityPage extends BasePage{
	WebDriver driver;
	public NullProjectAndActivityPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void NullActivityAndProject() throws Exception{
		findElement(By.linkText("My Timesheet")).click();
		findElement(By.id("btnAddTimesheet")).click();
		findElement(By.id("time_date")).click();
		findElement(By.id("time_date")).sendKeys("2018-02-10");
		Thread.sleep(2000);
		findElement(By.id("addTimesheetBtn")).click();		
		findElement(By.id("btnEdit")).click();
		findElement(By.id("initialRows_0_0")).sendKeys("9");
		findElement(By.id("initialRows_0_1")).sendKeys("9");
		findElement(By.id("submitSave")).submit();
		
		}
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);

		return elem;
	}
	
}
