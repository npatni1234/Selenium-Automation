package com.orangehrm.testcases.AddEmpTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.employee.AddEmp;

public class ET05_AddEmployee extends BasePage {
  @Test
  public void Verify_Add_Emp() throws Exception 
  {
	    LoginPage L1=new LoginPage(driver);
		L1.login("Admin", "N!dhi@12#");
		AddEmp addEmpObj=new AddEmp();
		addEmpObj.AddEmp(driver);
		addEmpObj.AddEmpElements();
		addEmpObj.AddEmpDetails();
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//*[@id=\"pdMainContainer\"]/div[1]/h1")).getText()!=null)
		{
			System.out.println("Emp Added");
		}
		else 
		{
			System.out.println("Emp not Added");
		}
  }
}
