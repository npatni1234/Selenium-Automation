package com.orangehrm.pages.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencsv.CSVReader;
import com.orangehrm.base.BasePage;

public class AddEmp extends BasePage{
	
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"branding\"]/a[1]/img")
	WebElement verlogo;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement verifyFName;
	
	
	
	
	
	public void AddEmp(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void AddEmpElements() throws Exception{
		findElement(By.id("menu_pim_viewPimModule")).click();
		findElement(By.id("menu_pim_addEmployee")).click();	
	}
	
	public void SearchEmp() throws Exception
	{
		String empname = "Lisa";
		findElement(By.id("menu_pim_viewPimModule")).click();
		findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
		findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys(empname);
		Thread.sleep(9000);
		findElement(By.xpath("//*[@id=\"searchBtn\"]")).submit();
		Thread.sleep(9000);
	}
	
	@SuppressWarnings("resource")
	public void AddEmpDetails() throws Exception{
		
		String CSV_file ="C:\\Users\\Nidhi\\Desktop\\persistent\\orangehrm-selenium-automation\\TestData\\ddt2.csv";
		
		
		File file = new File(CSV_file);
		//object of csv reader 
		
		 BufferedReader bufRdr;
		 bufRdr = new BufferedReader(new FileReader(file));
		
		
		 String line;
		while((line = bufRdr.readLine()) != null){
		        System.out.println(line);       
		        String[] cell= line.split(",");
		        String fn = cell[1];
				String mn = cell[2];
				String ln = cell[3];
				String photopath = cell[4];
				String un = cell[5];
				String pass = cell[6];
				String cpass = cell[7];
				
				
				
				driver.findElement(By.className("formInputText")).sendKeys(fn);
				
				driver.findElement(By.id("middleName")).sendKeys(mn);
				driver.findElement(By.id("lastName")).sendKeys(ln);
				driver.findElement(By.id("photofile")).sendKeys(photopath);
				
				driver.findElement(By.id("chkLogin")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys(un);
				driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys(pass);
				driver.findElement(By.xpath("//*[@id=\"re_password\"]")).sendKeys(cpass);
				driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).submit();
				Thread.sleep(2000);

				
			
		}
		 
				
	}
	
public void AddEmpDetails1() throws Exception{
		
		String CSV_file ="C:\\Users\\Nidhi\\Desktop\\persistent\\orangehrm-selenium-automation\\TestData\\ddt3.csv";
		
		
		File file = new File(CSV_file);
		//object of csv reader 
		
		 BufferedReader bufRdr;
		 bufRdr = new BufferedReader(new FileReader(file));
		//CSVReader reader = new CSVReader(new FileReader(CSV_file));
		//String[] cell;
		
		 String line;
		while((line = bufRdr.readLine()) != null){
		        System.out.println(line);       
		        String[] cell= line.split(",");
		        String fn = cell[1];
				String mn = cell[2];
				String ln = cell[3];
				String photopath = cell[4];
				String un = cell[5];
				String pass = cell[6];
				String cpass = cell[7];
				
				driver.findElement(By.className("formInputText")).sendKeys(fn);
				driver.findElement(By.id("middleName")).sendKeys(mn);
				driver.findElement(By.id("lastName")).sendKeys(ln);
				driver.findElement(By.id("photofile")).sendKeys(photopath);
				
				driver.findElement(By.id("chkLogin")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys(un);
				driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys(pass);
				driver.findElement(By.xpath("//*[@id=\"re_password\"]")).sendKeys(cpass);
				driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).submit();
				Thread.sleep(2000);
		}
}
	
	public boolean verifyLogoAddEmp()
	{
		verlogo.isDisplayed();
		return true;
		
	}
	
	public String verifyNameEntered()
	{
		String str;
		str = verifyFName.getText();
		return str;
	}
	
	
	
	public WebElement findElement(By by) throws Exception
	{
		WebElement elem=driver.findElement(by);
		return elem;
	}
	

	

	 
	
}
