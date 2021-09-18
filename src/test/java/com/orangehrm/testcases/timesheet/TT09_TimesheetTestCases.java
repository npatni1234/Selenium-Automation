package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.Logout;
import com.orangehrm.pages.timesheet.AdminTimesheetPage;
import com.orangehrm.pages.timesheet.UserLoginPage;
import com.orangehrm.pages.timesheet.UserTimesheetPage;
import com.orangehrm.utility.NewExcelLibrary;


public class TT09_TimesheetTestCases extends BasePage {
	//NewExcelLibrary obj= new NewExcelLibrary("C:\\Users\\Gayatri\\Desktop\\TestData.xlsx");
	
	@Test
	public void Add_Timesheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		UserTimesheetPage T1=new UserTimesheetPage(driver);
		T1.AddTimesheet();
		Thread.sleep(2000);
		
		Logout H1=new Logout();
		H1.HomePage(driver);
		H1.Logout();
		Thread.sleep(2000);
		
		LoginPage L2=new LoginPage(driver);
		L2.LoginPage(driver);
		L2.login("Admin", "N!dhi@12#");
		Thread.sleep(2000);
		
		AdminTimesheetPage T2 = new AdminTimesheetPage(driver);
		T2.AdminTimesheetverify();
		Thread.sleep(2000);

	}
}
