package com.orangehrm.testcases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.orangehrm.base.BasePage;

public class DataDrivenTest extends BasePage {

 @Test(dataProvider = "Credentials1",priority=4)
 public void loginTest1(String username,String password) {
//	 extent.createTest("loginTest1");

  
  driver.findElement(By.id("txtUsername")).sendKeys(username);
  driver.findElement(By.id("txtPassword")).sendKeys(password);
  driver.findElement(By.id("btnLogin")).click();
  String actualURL=driver.getCurrentUrl();
  String expectedURL="http://localhost/orangehrm/symfony/web/index.php/dashboard";
  Assert.assertEquals(actualURL, expectedURL, "Both the url's did not match, so test failed");
  
 }
}