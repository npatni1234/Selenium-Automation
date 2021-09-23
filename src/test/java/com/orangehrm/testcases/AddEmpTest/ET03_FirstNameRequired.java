package com.orangehrm.testcases.AddEmpTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.employee.AddEmp;

public class ET03_FirstNameRequired extends BasePage {
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Test for adding employee without Firstname
  @Test
  public void firstNameReq() throws Exception 
  {
	    LoginPage L1=new LoginPage(driver);
		L1.login(username,password);
		AddEmp addEmpObj=new AddEmp(driver);
		//addEmpObj.AddEmp(driver);
		addEmpObj.AddEmpElements();
		addEmpObj.AddEmpDetails1();
		Thread.sleep(2000);
		if((driver.findElement(By.id("firstName")).getAttribute("value"))!=null)
		{
			System.out.println("First Name Cannot be null");
		} 
  }
}
