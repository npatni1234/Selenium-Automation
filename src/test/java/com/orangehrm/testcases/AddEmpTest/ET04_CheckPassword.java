package com.orangehrm.testcases.AddEmpTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.employee.AddEmp;

public class ET04_CheckPassword extends BasePage {
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Test to check if Username & Password are entered
  @Test
  public void checkPassword() throws Exception 
  {
	    LoginPage L1=new LoginPage(driver);
		L1.login(username,password);
		AddEmp addEmpObj=new AddEmp(driver);
		//addEmpObj.AddEmp(driver);
		addEmpObj.AddEmpElements();
		addEmpObj.AddEmpDetails();
		Thread.sleep(3000);
		
		if((driver.findElement(By.id("user_name")).getAttribute("value"))!=null &&
				(driver.findElement(By.id("user_password")).getAttribute("value"))!=null &&
				(driver.findElement(By.id("re_password")).getAttribute("value"))!=null)
		{
			System.out.println("Password and Confirm Password Entered");
		}
		
		
  }
}
