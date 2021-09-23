package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.timesheet.FutureDateTimesheetPage;

public class TT02_FutureDate_TimesheetTest extends BasePage {

	//Test for checking future date availability
	@Test
	public void FutureDate_Timesheet() throws Exception {
		//LoginPage loginPage;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		LoginPage L1=new LoginPage(driver);
		//L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		FutureDateTimesheetPage T1=new FutureDateTimesheetPage(driver);
		T1.FutureDateTimesheet();
		Thread.sleep(2000);
		
		

	}

}
