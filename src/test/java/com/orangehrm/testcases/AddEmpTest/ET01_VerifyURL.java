package com.orangehrm.testcases.AddEmpTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.employee.AddEmp;

public class ET01_VerifyURL extends BasePage{
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Test for verifying URL of Employee page
  @Test
  public void VerifyURL() throws Exception {
	  LoginPage L1=new LoginPage(driver);
		L1.login(username,password);
		AddEmp addEmpObj=new AddEmp(driver);
		
		addEmpObj.AddEmpElements();
		Thread.sleep(3000);
		
		String actualURLL = driver.getCurrentUrl();
		String expectedURL = "http://localhost/orangehrm/symfony/web/index.php/pim/addEmployee";
		Assert.assertEquals(actualURLL,expectedURL);
		System.out.println("AddEmp URL matched");
		
  }
}
