package com.orangehrm.testcases.mailConfiguration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.mailConfiguration.Mail_Configuration;


public class MT01_MatchURL extends BasePage{
  @Test
  public void MatchConfigModuleURL() {
	  
	    //HomePage homePage; //reference variable for calling HomePage
	  
	    loginPage.login("Admin", "N!dhi@12#");
	    
	    Mail_Configuration mail_configuration_start=new Mail_Configuration(driver);
		mail_configuration_start.clickConfigDetails();
		
		Mail_Configuration mail_configuration_editloop=new Mail_Configuration(driver);
 		mail_configuration_editloop.clickConfigDetails();
 		
        
		String expectedURL="http://localhost/orangehrm/symfony/web/index.php/admin/listMailConfiguration";
		
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"Both the URL's did not match"); //prints message if assertion fails
  }
}
