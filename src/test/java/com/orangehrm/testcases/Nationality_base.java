package com.orangehrm.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangehrm.pages.Base_Nationality;
import com.orangehrm.pages.HomePage;

public class Nationality_base extends Base_Nationality{
	HomePage homePage; //reference variable for calling HomePage

	
	 @Test(dataProvider = "Credentials1",priority=3)
	 public void NationalityTest(String username,String password, String Nationality) {
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
	  Assert.assertEquals(actualURL, expectedURL, "Both the url's did not match, so test failed");
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  driver.findElement(By.id("menu_admin_nationality")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("nationality_name")).sendKeys(Nationality);
	  driver.findElement(By.id("btnSave")).click();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
	 }


	public void Nationality_base(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver=driver;
		
	}
	
	

}
