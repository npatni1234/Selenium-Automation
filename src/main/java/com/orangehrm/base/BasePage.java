
package com.orangehrm.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utility.NewExcelLibrary;


public class BasePage {
	
	public WebDriver driver;
	public LoginPage loginPage;
	NewExcelLibrary obj= new NewExcelLibrary("C:\\Users\\Nidhi\\Desktop\\persistent\\orangehrm-selenium-automation\\TestData\\User.xlsx");
	

	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		loginPage=new LoginPage(driver); //obj of LoginPage
	}
	
	@AfterMethod
	public void tearDown()  //This class describes the result of a test.
     {
	
		driver.close();
	}
//	 

	
	@DataProvider(name ="Credentials1")
	 public Object[][] getExcelData() {
	  //Totals rows count
	  int rows=obj.getRowCount("Data");
	  //Total Columns
	  int column=obj.getColumnCount("Data");
	  int actRows=rows-1;
	  
	  Object[][] data= new Object[actRows][column];
	  
	  for(int i=0;i<actRows;i++) {
	   for(int j=0; j<column;j++) {
	    data[i][j]=obj.getCellData("Data", j, i+1);
	   }
	  }
	  return data;
}
}


