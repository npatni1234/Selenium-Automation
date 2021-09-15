package com.orangehrm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.orangehrm.base.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.Logout;
import com.orangehrm.pages.Nationality;
import com.orangehrm.pages.Nationality_base;

public class Add_Nationality_Test extends Nationality_base{
	 LoginPage L1=new LoginPage(driver);
	 

 @Test(dataProvider = "Credentials2",priority=5)
 public void loginTest( String Nationality) throws Exception {
	 
	 
//	 if(Browser.equalsIgnoreCase("Chrome" ))
//	 {
//		 System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//		 driver=new ChromeDriver();
//		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	 }
//	 
//	 if(Browser.equalsIgnoreCase("Firefox" ))
//	 {
//		 System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
//		 driver=new FirefoxDriver();
//		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	 }
//	 
	
		
		Nationality_base nationality=new Nationality_base();
		nationality.Nationality_base(driver);
		
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  driver.findElement(By.id("menu_admin_nationality")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("nationality_name")).sendKeys(Nationality);
	  driver.findElement(By.id("btnSave")).click();
	  
//	  
//	  Logout H1=new Logout();
//		H1.HomePage(driver);
//		H1.Logout();
//	  
//	  
	  
	 
	  
	  
	 
	 		
	 		
//	 extent.createTest("loginTest1");

  
//  driver.findElement(By.id("txtUsername")).sendKeys(username);
//  driver.findElement(By.id("txtPassword")).sendKeys(password);
//  driver.findElement(By.id("btnLogin")).click();
//  String actualURL=driver.getCurrentUrl();
//  String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
//  Assert.assertEquals(actualURL, expectedURL, "Both the url's did not match, so test failed");
  
 }
}