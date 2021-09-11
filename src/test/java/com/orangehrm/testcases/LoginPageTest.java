package com.orangehrm.testcases;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseClass;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class LoginPageTest extends BaseClass{
//	WebDriver driver=new ChromeDriver();
	
	
	LoginPage loginPage = new LoginPage(driver); //reference variable for calling LoginPage
	HomePage homePage; //reference variable for calling HomePage
//	
//	@Test(priority = 1)
//	public void verifyLogo()
//	{
//		boolean flag= loginPage.validateLogo();
//		Assert.assertTrue(flag);
//	}
//	
	@Test(priority = 1)
	public void loginTest()
	{
		homePage=loginPage.login("Admin", "N!dhi@12#");
		String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
//		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
	

}
