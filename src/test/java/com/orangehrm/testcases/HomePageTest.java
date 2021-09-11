package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseClass;
import com.orangehrm.pages.HomePage;

public class HomePageTest extends BaseClass{
	HomePage homePage;
	
	@Test(priority = 2)
	public void adminTabTest() throws InterruptedException
	{
		homePage=loginPage.login("Admin","N!dhi@12#");
		homePage.clickOnAdminTab();
		Thread.sleep(2000);
        String expectedURL="http://localhost/orangehrm/symfony/web/index.php/admin/viewSystemUsers";
//		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
 
}
