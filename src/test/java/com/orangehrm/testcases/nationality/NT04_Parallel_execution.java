package com.orangehrm.testcases.nationality;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class NT04_Parallel_execution{
	WebDriver driver;
	
	
	
	@Test
	public void Login_test() throws Exception
	{
		//Set Driver
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver1.exe");
		driver= new ChromeDriver();
		
		//Maximize driver
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		//Open new tab
		((JavascriptExecutor)driver).executeScript("window.open()");
	
		//Store tabs in array
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		//Open tab (0) i.e. first tab
		driver.switchTo().window(tabs.get(0));
		
		//Login Admin
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("N!dhi@12#");
		driver.findElement(By.id("btnLogin")).click();
		
		//Navigate to nationality page
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		
		//Add nationality
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("nationality_name")).sendKeys("Indian12");
		driver.findElement(By.id("btnSave")).click();
	
		Thread.sleep(3000);
		System.out.println("Nationality already exists");
		
		//Open tab (1) i.e. second tab
		driver.switchTo().window(tabs.get(1));
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		//Login Admin
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("N!dhi@12#");
				driver.findElement(By.id("btnLogin")).click();
				
		//Navigate to nationality page
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		
		//Enter the nationality to be deleted
		try{
			driver.findElement(By.id("ohrmList_chkSelectRecord_12")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("btnDelete")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
			System.out.println("Nationality Deleted");
		}
		catch(Exception E){
			System.out.println("Nationality does not exists");
		}
		
		//Wait for 3 sec
		Thread.sleep(3000);
		
		//Close driver
		driver.quit();
	}
}
