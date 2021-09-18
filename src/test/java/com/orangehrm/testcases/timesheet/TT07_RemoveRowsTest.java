package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.RemoveRowsPage;
import com.orangehrm.pages.timesheet.UserLoginPage;


public class TT07_RemoveRowsTest extends BasePage {

	
	@Test
	public void RemoveRowsTimesheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		RemoveRowsPage T1=new RemoveRowsPage(driver);
		T1.RemoveRowsTimesheet();
		Thread.sleep(2000);

	}

}
