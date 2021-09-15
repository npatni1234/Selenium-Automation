package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.orangehrm.base.BasePage;
//import com.orangehrm.base.BasePage;
import com.orangehrm.utility.NewExcelLibrary;

public class Nationality_base extends BasePage  {
	NewExcelLibrary excel= new NewExcelLibrary("C:\\Users\\Nidhi\\Desktop\\persistent\\orangehrm-selenium-automation\\TestData\\User.xlsx");
	@DataProvider(name ="Credentials2")
	 public Object[][] getExcelData() {
	  //Totals rows count
	  int rows=excel.getRowCount("Add_Nationality");
	  //Total Columns
	  int column=excel.getColumnCount("Add_Nationality");
	  int actRows=rows-1;
	  
	  Object[][] data= new Object[actRows][column];
	  
	  for(int i=0;i<actRows;i++) {
	   for(int j=0; j<column;j++) {
	    data[i][j]=excel.getCellData("Add_Nationality", j, i);
	   }
	  }
	  return data;
}
	public void Nationality_base(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver=driver;
	}
	
	

}
