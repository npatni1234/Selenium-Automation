package com.orangehrm.testcases.AddEmpTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.employee.AddEmp;

public class ET06_EmpImageStatus extends BasePage {
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Test to verify if profile image is uploaded
  @Test
  public void validateImgFormat () throws Exception
  {
	    //Create object of login page
	    LoginPage L1=new LoginPage(driver);
	    //pass credentials for login
		L1.login(username,password);
		//Create object of AddEmp.java
		AddEmp addEmpObj=new AddEmp(driver);
		//Instantiation of driver object to launch browser
		
		//Calling AddEmpElements from AddEmp.java
		addEmpObj.AddEmpElements();
		addEmpObj.AddEmpDetails();
		Thread.sleep(3000);
		
		if(driver.findElement(By.id("empPic")).isDisplayed())
		{
			assertTrue(true);
			System.out.println("Profile picture is Uploaded");
		}
		else 
		{
			assertTrue(false);
			System.out.println("Profile picture is not Uploaded");
		}
		
  }
}
