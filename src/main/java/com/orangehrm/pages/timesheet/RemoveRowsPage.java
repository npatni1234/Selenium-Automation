package com.orangehrm.pages.timesheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.orangehrm.base.BasePage;



public class RemoveRowsPage extends BasePage{
	WebDriver driver;
	public RemoveRowsPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void RemoveRowsTimesheet() throws Exception{
		findElement(By.linkText("My Timesheet")).click();
		findElement(By.id("btnAddTimesheet")).click();
		findElement(By.id("time_date")).click();
		findElement(By.id("time_date")).sendKeys("2019-02-01");
		Thread.sleep(2000);
		findElement(By.id("addTimesheetBtn")).click();		
		findElement(By.id("btnEdit")).click();
		findElement(By.id("initialRows_0_projectName")).click();
		findElement(By.id("initialRows_0_projectName")).sendKeys("rajeshwari - project tracking");
		findElement(By.id("initialRows_0_projectActivityName")).click();
		findElement(By.id("initialRows_0_projectActivityName")).sendKeys("listing requirments");
		findElement(By.id("initialRows_0_0")).sendKeys("9");
		findElement(By.id("initialRows_0_1")).sendKeys("9");		
		findElement(By.id("btnAddRow")).click();		
		findElement(By.id("initialRows_1_projectName")).click();
		findElement(By.id("initialRows_1_projectName")).sendKeys("nidhi - HR management system");
		Thread.sleep(2000);
		findElement(By.id("initialRows_1_projectActivityName")).click();
		findElement(By.id("initialRows_1_projectActivityName")).sendKeys("recruitment tracker");
		findElement(By.id("initialRows_1_0")).sendKeys("8");
		findElement(By.id("initialRows_1_1")).sendKeys("8");
		findElement(By.id("submitRemoveRows")).click();
		}
	
	
	public WebElement findElement(By by) throws Exception
{
	WebElement elem=driver.findElement(by);

		return elem;
	}
	
}
