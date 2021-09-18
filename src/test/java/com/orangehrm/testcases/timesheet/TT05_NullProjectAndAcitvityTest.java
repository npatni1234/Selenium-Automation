package com.orangehrm.testcases.timesheet;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.timesheet.NullProjectAndActivityPage;
import com.orangehrm.pages.timesheet.UserLoginPage;


public class TT05_NullProjectAndAcitvityTest extends BasePage {
	
	@Test
	public void NullProjectAndActivity() throws Exception {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		UserLoginPage L1=new UserLoginPage();
		L1.UserLogin(driver);
		L1.login("siddhi", "Siddhi@1234");
		Thread.sleep(2000);
		
		NullProjectAndActivityPage T1=new NullProjectAndActivityPage(driver);
		T1.NullActivityAndProject();
		Thread.sleep(2000);
		
		driver.close();
	}
}
