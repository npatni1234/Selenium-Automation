package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.DuplicateRecordsPage;
import com.orangehrm.pages.timesheet.UserLoginPage;



public class TT02_DuplicateRecordsTest extends BasePage {

	
	@Test
	public void DuplicateRecordTimesheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		DuplicateRecordsPage T1=new DuplicateRecordsPage(driver);
		T1.DuplicateRecordsTimesheet();
		Thread.sleep(2000);

	}

}
