package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.orangehrm.base.BasePage;
import com.orangehrm.pages.HomePage;


public class HomePageTest extends BasePage{
	HomePage homePage;
	
	@Test(priority = 4)
	public void adminTabTest() throws InterruptedException
	{
//		extent.createTest("adminTabTest");
		homePage=loginPage.login("Admin","N!dhi@12#");
		homePage.clickOnAdminTab();
		Thread.sleep(2000);
        String expectedURL="http://localhost/orangehrm/symfony/web/index.php/admin/viewSystemUsers";
//		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
 
}
