package com.orangehrm.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentTest;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.HomePage;



public class LoginPageTest extends BasePage{
	HomePage homePage; //reference variable for calling HomePage
	
	@Test(priority = 1)
	public void verifyLogo()
	{
//       ExtentTest test1=extent.createTest("verifyLogo");

		boolean flag= loginPage.validateLogo();
		Assert.assertTrue(flag);
		
		
	}

	@Test(priority = 2)
	public void loginTest()
	{
//		ExtentTest test2=extent.createTest("loginTest");

		homePage=loginPage.login("Admin", "N!dhi@12#");
		String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
//		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"Both the URL's did not match"); //prints message if assertion fails
		
		
	}
	
	

}
