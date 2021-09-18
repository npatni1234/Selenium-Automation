package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.LargeHoursPages;
import com.orangehrm.pages.timesheet.UserLoginPage;

public class TT04_LargeHoursTest extends BasePage {
	
	@Test
	public void LargeHours() throws Exception {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		LargeHoursPages T1=new LargeHoursPages(driver);
		T1.LargeHoursTimesheet();
		Thread.sleep(2000);
		
	

	}
}

	
	
