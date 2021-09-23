
package com.orangehrm.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.orangehrm.pages.LoginPage;

public class BasePage {
	
	public WebDriver driver;
	public LoginPage loginPage;
	private static BasePage instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+
            "\\Configurations\\config.properties";
    private static String url;
    private static String username;
    private static String password;
    private static String excel_url;
    private static String csv_url;
    private static String csv_urll;
    private static String ssPath;
    //Create a Singleton instance. We need only one instance of Property Manager.
    public static BasePage getInstance () {
        if (instance == null) {
            synchronized (lock) {
                instance = new BasePage();
                instance.loadData();
            }
        }
        return instance;
    }
    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();
        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }
        //Get properties from configuration.properties
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        password = prop.getProperty("password");
        excel_url=prop.getProperty("excel_url");
        csv_url=prop.getProperty("csv_url");
        csv_urll=prop.getProperty("csv_urll");
        ssPath=prop.getProperty("ssPath");
    }
    public String getURL () {
      return url;
    }
    public String getUsername () {
        return username;
    }
    public String getPassword () {
        return password;
    }
    public String getExcelURL () {
        return excel_url;
    }

      public String getCsvURLL () {
  return csv_urll;
}
      public String getCsvURL () {
    	  return csv_url;
    	}
      public String getSSPath () {
    	  return ssPath;
    	}
      
    



    //For initialising the Browser
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver1.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		loginPage=new LoginPage(driver); //obj of LoginPage
	}
	
	//For closing the browser
	@AfterMethod
	public void tearDown() 
     {
	
		driver.close();
	}
	
	
}



