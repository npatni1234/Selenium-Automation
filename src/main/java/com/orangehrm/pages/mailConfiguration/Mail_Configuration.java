package com.orangehrm.pages.mailConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.BasePage;



public class Mail_Configuration extends BasePage{
	
	
	
	
	//TRY NEW CODE
	
	//Initializing the Objects

    public Mail_Configuration(WebDriver driver)

    {

                PageFactory.initElements(driver, this);

    }
	
	  @FindBy (id="menu_admin_viewAdminModule")
       private WebElement viewAdminModule;
	  
	  @FindBy (id="menu_admin_Configuration")
      private WebElement adminConfig;
	  
	  @FindBy (id="menu_admin_listMailConfiguration")
      private WebElement adminListMailConfiguration;
	  
	  @FindBy (id="editBtn")
      private WebElement editBtn;
	  
	  @FindBy (id="emailConfigurationForm_chkSendTestEmail")
      private WebElement chkSendTestEmail;
	  
	  @FindBy (id="emailConfigurationForm_txtTestEmail")
	  public WebElement txtTestEmail;
	  
	  @FindBy (id="emailConfigurationForm_txtMailAddress")
	  public WebElement txtsentmail;
	  
	  @FindBy (id="editBtn")
      private WebElement saveBtn;
	  
	  @FindBy (id="resetBtn")
      public WebElement ResetBtn;
	  
	  //clicking on buttons to go onto Configuration Details
	  public void clickConfigDetails()

      {

		  viewAdminModule.click();
		  adminConfig.click();
		  adminListMailConfiguration.click();
		  

      }
	  
	  //for looping data from sheet
	  public void clickConfigDetailsLoop()

      {

	  editBtn.click();
	  chkSendTestEmail.click();
	  
      }
	  
	//Specifying email field

      public void enterMailID (String mailId)

      {

    	  txtTestEmail.sendKeys(mailId);

      }
      
      //Clicking on Save button to send mail

      public void clickSaveBtn()

      {

    	  saveBtn.click();

      }
      
      //clicking on Rest Button
      public void clickResetBtn(){
    	  ResetBtn.click();
      }


}
