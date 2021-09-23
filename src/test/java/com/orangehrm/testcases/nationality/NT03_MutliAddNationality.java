package com.orangehrm.testcases.nationality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.utility.NewExcelLibrary;
import com.orangehrm.base.BasePage;
import com.orangehrm.pages.HomePage;


public class NT03_MutliAddNationality extends BasePage{
	HomePage homePage; //reference variable for calling HomePage
	String excel_url = BasePage.getInstance().getExcelURL();
	NewExcelLibrary obj= new NewExcelLibrary(excel_url);
	String url = BasePage.getInstance().getURL();
	

	
	 @Test(dataProvider = "Nationalitydata",priority=3)
	 public void NationalityTest(String username,String password, String Nationality) throws InterruptedException {
		 
	  //Login details from Excel
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
	  Assert.assertEquals(actualURL, expectedURL, "Both the url's did not match, so test failed");
	  
	  //Navigate to Admin page
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  
	  //Navigate to Nationality page
	  driver.findElement(By.id("menu_admin_nationality")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("nationality_name")).sendKeys(Nationality);
	  Thread.sleep(3000);
	  
	 }


	public void Nationality_base(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver=driver;
		
	}
	@DataProvider(name ="Nationalitydata")
	 public Object[][] getExcelData1() {
	  //Totals rows count
	  int rows=obj.getRowCount("Add_Nationality");
	  //Total Columns
	  int column=obj.getColumnCount("Add_Nationality");
	  int actRows=rows-1;
	  
	  Object[][] data= new Object[actRows][column];
	  
	  for(int i=1;i<actRows;i++) {
	   for(int j=0; j<column;j++) {
	    data[i][j]=obj.getCellData("Add_Nationality", j, i+1);
	   }
	  }
	  return data;
	}

}
