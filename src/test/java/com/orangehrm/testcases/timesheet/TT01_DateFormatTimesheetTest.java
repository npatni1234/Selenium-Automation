package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.DateFormatTimesheetPage;
import com.orangehrm.pages.timesheet.UserLoginPage;




public class TT01_DateFormatTimesheetTest extends BasePage {

	@Test
	public void DateFormat_Timesheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		DateFormatTimesheetPage T1=new DateFormatTimesheetPage(driver);
		T1.DateFormatTimesheet();
		Thread.sleep(2000);
		

	}

}
