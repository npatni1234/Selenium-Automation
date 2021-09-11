/**
 * 
 */
package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pages.LoginPage;


public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPage;
	
	//method to launch browser
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
//		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		loginPage=new LoginPage(driver); //obj of LoginPage
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
