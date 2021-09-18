package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.FutureDateTimesheetPage;
import com.orangehrm.pages.timesheet.UserLoginPage;

public class TT03_FutureDate_TimesheetTest extends BasePage {

	@Test
	public void FutureDate_Timesheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		FutureDateTimesheetPage T1=new FutureDateTimesheetPage(driver);
		T1.FutureDateTimesheet();
		Thread.sleep(2000);
		
		

	}

}
