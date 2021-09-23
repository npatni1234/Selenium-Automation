package com.orangehrm.testcases.nationality;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.nationality.Delete_nationality;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.Logout;


public class NT02_Delete_Nationality extends BasePage{
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
		
		@Test
		public void Delete1_Nationality() throws Exception {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			LoginPage L1=new LoginPage(driver);
			
			L1.login(username,password);
			
			Delete_nationality nationality=new Delete_nationality(driver);
			
			nationality.Del_Nationality();
			
			
			Logout H1=new Logout();
			H1.HomePage(driver);
			H1.LogoutBtn();
		}
		
	}


