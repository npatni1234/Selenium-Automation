package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.RepeatedDateTimesheetPage;
import com.orangehrm.pages.timesheet.UserLoginPage;

public class TT08_RepeatedDateTimesheetTest extends BasePage {
	
	@Test
	public void RepeatedDate_Timesheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		RepeatedDateTimesheetPage T1=new RepeatedDateTimesheetPage(driver);
		T1.RepeatDateTimesheet();
		Thread.sleep(2000);
		
		
		driver.close();
		
	}

}
