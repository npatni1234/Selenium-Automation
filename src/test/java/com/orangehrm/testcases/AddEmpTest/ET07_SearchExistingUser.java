package com.orangehrm.testcases.AddEmpTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import com.orangehrm.base.BasePage;
import com.orangehrm.pages.employee.AddEmp;
import com.orangehrm.pages.LoginPage;

//Test for searching existing user
public class ET07_SearchExistingUser extends BasePage{
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	
	//Search existing employee
  @Test
  public void searchExistingUser() throws Exception  {
	  LoginPage L1=new LoginPage(driver);
		L1.login(username,password);
		AddEmp addEmpObj=new AddEmp(driver);
		addEmpObj.SearchEmp();	
		
		try{
		if((driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")).getAttribute("value"))==null)
		{
		
			System.out.println("found");
		}}
		catch(Exception e)
		{
			System.out.println("not found");
		}
  }
}
 