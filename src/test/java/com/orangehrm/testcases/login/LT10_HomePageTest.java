package com.orangehrm.testcases.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.HomePage;


public class LT10_HomePageTest extends BasePage{
	HomePage homePage;
	
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Test for verifying the URL after navigating to Admin Tab
	@Test(priority = 4)
	public void adminTabTest() throws InterruptedException
	{

		homePage=loginPage.login(username,password);
		homePage.clickOnAdminTab();
		Thread.sleep(2000);
        String expectedURL="http://localhost/orangehrm/symfony/web/index.php/admin/viewSystemUsers";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
 
}
