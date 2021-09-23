package com.orangehrm.pages.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.orangehrm.base.BasePage;

public class AddEmp extends BasePage{
	String csv_url = BasePage.getInstance().getCsvURL();
	String csv_urll = BasePage.getInstance().getCsvURLL();
	String ssPath = BasePage.getInstance().getSSPath();
	
	
	WebDriver driver;
	String excel_url = BasePage.getInstance().getExcelURL();
	
	@FindBy(xpath="//*[@id=\"branding\"]/a[1]/img")
	WebElement verlogo;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement verifyFName;
	

	public  AddEmp(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//Navigate to Add Employee Page
	public void AddEmpElements() throws Exception{
		findElement(By.id("menu_pim_viewPimModule")).click();
		findElement(By.id("menu_pim_addEmployee")).click();	
	}
	
	//Method to Search existing user
	public void SearchEmp() throws Exception
	{
		String empname = "Siddhi";
		findElement(By.id("menu_pim_viewPimModule")).click();
		findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
		Thread.sleep(3000);
		findElement(By.id("empsearch_employee_name_empName")).sendKeys(empname);
		Thread.sleep(3000);
		findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
	}
	
	//Add new employee using CSV
	@SuppressWarnings("resource")
	public void AddEmpDetails() throws Exception{
		
		String CSV_file =csv_url;
		
		
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

//Add new Employee using CSV without firstname field
public void AddEmpDetails1() throws Exception{
		
		String CSV_file =csv_urll;
		
		
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
				
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDateTime now = LocalDateTime.now();
				UUID uuid = UUID.randomUUID(); 
				String stamp = dtf.format(now);
				String IMGName = "IMG_" + stamp + "_" + uuid;
				FileUtils.copyFile(scrFile, new File(ssPath + IMGName + ".png"));
				//flag = true;
				
			    
				Thread.sleep(2000);
		}
}
	//verify logo
	public boolean verifyLogoAddEmp()
	{
		verlogo.isDisplayed();
		return true;
		
	}
	//verify name entered
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
