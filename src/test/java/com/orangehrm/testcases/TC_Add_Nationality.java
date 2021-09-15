package com.orangehrm.testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.Logout;
import com.orangehrm.pages.Nationality;


public class TC_Add_Nationality extends BasePage {

	
	@Test
	public void Add_N() throws Exception {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		LoginPage L1=new LoginPage(driver);
		L1.LoginPage(driver);
		L1.login("Admin", "N!dhi@12#");
		
		Nationality nationality=new Nationality();
		nationality.Nationality(driver);
		nationality.AddNationality();
		
		
		Logout H1=new Logout();
		H1.HomePage(driver);
		H1.Logout();
	}
	

}
