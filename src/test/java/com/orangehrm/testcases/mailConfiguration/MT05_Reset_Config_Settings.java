package com.orangehrm.testcases.mailConfiguration;

import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.mailConfiguration.Mail_Configuration;

public class MT05_Reset_Config_Settings extends BasePage{
  @Test
  public void ResetConfigSettings() throws InterruptedException {
	  
	  
	    loginPage.login("Admin", "N!dhi@12#");
	    
	    Mail_Configuration mail_configuration_start=new Mail_Configuration(driver);
		mail_configuration_start.clickConfigDetails();
		
		Mail_Configuration mail_configuration_editloop=new Mail_Configuration(driver);
		mail_configuration_editloop.clickConfigDetailsLoop();
		Thread.sleep(3000);
		mail_configuration_editloop.enterMailID("rajeshwarikathar12@gmail.com");
		
		
		Mail_Configuration mail_configuration_reset=new Mail_Configuration(driver);
		mail_configuration_reset.clickResetBtn();
		
  }
}
