package com.orangehrm.testcases.mailConfiguration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.mailConfiguration.Mail_Configuration;


public class MT01_MatchURL extends BasePage{
	//from base page
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Match the URL for confirming if we are on right configuration page
  @Test
  public void MatchConfigModuleURL() {
	  
	    loginPage.login(username,password);  //from properties file
	    
	  //Navigate to configuration Details Tab
	    Mail_Configuration mail_configuration_start=new Mail_Configuration(driver);
		mail_configuration_start.clickConfigDetails();
		
		//object for calling click on edit button
		Mail_Configuration mail_configuration_editloop=new Mail_Configuration(driver);
 		mail_configuration_editloop.clickConfigDetails();
 		
        
		String expectedURL="http://localhost/orangehrm/symfony/web/index.php/admin/listMailConfiguration";
		
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"Both the URL's did not match"); //prints message if assertion fails
  }
}
