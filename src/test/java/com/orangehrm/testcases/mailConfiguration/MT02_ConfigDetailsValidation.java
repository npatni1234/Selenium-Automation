package com.orangehrm.testcases.mailConfiguration;


import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.mailConfiguration.Mail_Configuration;

import com.orangehrm.pages.mailConfiguration.Mail_Configuration_Base;


public class MT02_ConfigDetailsValidation extends BasePage {
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	String excel_url = BasePage.getInstance().getExcelURL();

	@Test(dataProvider="testdata")
	public void Add_Configurations(String mailID) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage L1=new LoginPage(driver);
		
		L1.login(username,password);
	
	
		//Starting object of navigating to configuration details
	Mail_Configuration mail_configuration_start=new Mail_Configuration(driver);
	mail_configuration_start.clickConfigDetails();
	
	//Again clicking on edit to continue the loop
    Mail_Configuration mail_configuration_editloop=new Mail_Configuration(driver);
	mail_configuration_editloop.clickConfigDetailsLoop();
	
	//email id as parameter
    Mail_Configuration mail_configuration_insert=new Mail_Configuration(driver);
    mail_configuration_insert.enterMailID(mailID);
    Thread.sleep(3000);
    
  //Submitting the data by clicking on login button                   
    Mail_Configuration mail_configuration_save=new Mail_Configuration(driver);
    mail_configuration_save.clickSaveBtn();
    Thread.sleep(3000);
    
	
    Assert.assertEquals(false, mail_configuration_insert.ResetBtn.isEnabled(),"Required is required in given format "); //Verifies that the element is enabled
    
	}
	
	
	@DataProvider(name="testdata")
	public Object[] testDataExample(){
	// Reading the data from excel file by the specified path
    String xl = excel_url;

    String Sheet = "Mail_Configuration";

    int rowCount =3;
	
	Object[] emailID = new Object[rowCount];

	for(int i=0;i<rowCount;i++)
	{
	emailID[i] = Mail_Configuration_Base.getCellValue(xl, Sheet, i,0);
	
	}
	return emailID;
	}
}
