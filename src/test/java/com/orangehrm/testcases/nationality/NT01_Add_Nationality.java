package com.orangehrm.testcases.nationality;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.Logout;
import com.orangehrm.pages.nationality.Add_Nationality;


public class NT01_Add_Nationality extends BasePage {
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();

	
	@Test
	public void Add_N() throws Exception {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		LoginPage L1=new LoginPage(driver);
		
		L1.login(username,password);
		
		Add_Nationality nationality=new Add_Nationality();
		nationality.Nationality(driver);
		nationality.AddNationality();
		
		
		Logout H1=new Logout();
		H1.HomePage(driver);
		H1.LogoutBtn();
	}
	

}
