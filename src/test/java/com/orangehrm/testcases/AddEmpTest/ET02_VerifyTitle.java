package com.orangehrm.testcases.AddEmpTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.employee.AddEmp;

public class ET02_VerifyTitle extends BasePage {
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Test for verifying title
  @Test
  public void VerifyTitle() throws Exception {
	  LoginPage L1=new LoginPage(driver);
		L1.login(username,password);
		AddEmp addEmpObj=new AddEmp(driver);
		//addEmpObj.AddEmp(driver);
		addEmpObj.AddEmpElements();
		Thread.sleep(3000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(expectedTitle,actualTitle,"AddEmp Title matched");
		System.out.println("AddEmp Title matched");
  }
}
