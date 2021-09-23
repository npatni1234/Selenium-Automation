package com.orangehrm.testcases.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.utility.NewExcelLibrary;

public class LT01_LoginPageTest extends BasePage{
	HomePage homePage; //reference variable for calling HomePage
	
	String username = BasePage.getInstance().getUsername();
	String password = BasePage.getInstance().getPassword();
	String excel_url = BasePage.getInstance().getExcelURL();
	NewExcelLibrary obj= new NewExcelLibrary(excel_url);

	
	//Test for verifying logo after loading the AUT
	@Test(priority = 1)
	public void verifyLogo()
	{
		boolean flag= loginPage.validateLogo();
		Assert.assertTrue(flag);	
	}

	//Test for verifying 
	@Test(priority = 2)
	public void loginURLTest()
	{
		homePage=loginPage.login(username,password);
		String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";

		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"Both the URL's did not match"); //prints message if assertion fails	
	}
	
	//Test for verifying login credentials using various username and password combinations
	 @Test(dataProvider = "Credentials1",priority=3)
	 public void loginTest(String username,String password) {

	  
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
	  Assert.assertEquals(actualURL, expectedURL, "Both the url's did not match, so test failed");
	  
	 }
	 
	 //method for reading excel data from file
	 @DataProvider(name ="Credentials1")
	 public Object[][] getExcelData() {
	  //Totals rows count
	  int rows=obj.getRowCount("Data");
	  //Total Columns
	  int column=obj.getColumnCount("Data");
	  int actRows=rows-1;
	  
	  Object[][] data= new Object[actRows][column];
	  
	  for(int i=1;i<actRows;i++) {
	   for(int j=0; j<column;j++) {
	    data[i][j]=obj.getCellData("Data", j, i+1);
	   }
	  }
	  return data;
}
	
	

}
