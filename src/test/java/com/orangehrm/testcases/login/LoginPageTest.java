package com.orangehrm.testcases.login;



import org.openqa.selenium.By;
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


		homePage=loginPage.login("Admin", "N!dhi@12#");
		String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";

		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"Both the URL's did not match"); //prints message if assertion fails
		
		
	}
	
	 @Test(dataProvider = "Credentials1",priority=3)
	 public void loginTest1(String username,String password) {

	  
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
	  Assert.assertEquals(actualURL, expectedURL, "Both the url's did not match, so test failed");
	  
	 }
	
	

}