package com.orangehrm.testcases.mailConfiguration;

import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.mailConfiguration.Mail_Configuration;

public class MT05_Reset_Config_Settings extends BasePage{
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
  @Test
  public void ResetConfigSettings() throws InterruptedException {
	  
	  
	    loginPage.login(username,password);
	    
	  //Navigate to configuration Details Tab 
	    Mail_Configuration mail_configuration_start=new Mail_Configuration(driver);
		mail_configuration_start.clickConfigDetails();
		
		Mail_Configuration mail_configuration_editloop=new Mail_Configuration(driver);
		mail_configuration_editloop.clickConfigDetailsLoop();
		Thread.sleep(3000);
		mail_configuration_editloop.enterMailID("rajeshwarikathar12@gmail.com");
		
		//object for calling the method for clicking on edit button
		Mail_Configuration mail_configuration_reset=new Mail_Configuration(driver);
		mail_configuration_reset.clickResetBtn();
		
  }
}
