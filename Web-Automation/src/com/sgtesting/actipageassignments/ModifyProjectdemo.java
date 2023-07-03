package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyProjectdemo {
	
	public  ModifyProjectdemo(WebDriver o)
	{
		PageFactory.initElements(o, this);
    }
	//Create WebElement for UserName
		private  WebElement username;
		public WebElement getuserName()
		{
			return username;
		}
		//Create WebElement for password
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement OLogin;
		public WebElement getLoginButton()
		{
			return OLogin;
		}
		//create WebElement for Flyoutwindow
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutwindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		//create webelement for createcustomer()
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")
		private WebElement Task;
		public WebElement getTask()
		{
			return Task;
		}
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement AddNew;
		public WebElement getAddNew()
		{
			return  AddNew;
		}
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement Newcustomer;
		public WebElement getNewcustomer()
		{
			return Newcustomer;
		}
		private WebElement customerLightBox_nameField;
		public WebElement getName()
		{
			return customerLightBox_nameField;
		}
		private WebElement customerLightBox_descriptionField;
		public WebElement getDescription()
		{
			return customerLightBox_descriptionField;
		}
		@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
		private WebElement Createcustomer;
		public WebElement getCreatecustomer()
		{
			return Createcustomer;
		}
		//create webelement for createproject()
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement addnew;
		public WebElement getaddnew()
		{
			return addnew;
		}
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement NewProject;
		public WebElement getProject()
		{
			return NewProject;
		}
		@FindBy(xpath="//*[@id=\"projectPopup_projectNameField\"]")
		private WebElement name;
		public WebElement getname()
		{
			return name;
		}
		@FindBy(xpath="//*[@id=\"projectPopup_projectDescriptionField\"]")
		private WebElement description;
		public WebElement getdesc()
		{
			return description;
		}
		@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
		private WebElement CreateProject;
		public WebElement getproject()
		{
			return CreateProject;
		}
		//create webelement for modifyproject
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement Modify;
		public WebElement getModi()
		{
			return Modify;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement desc;
		public WebElement getdesc1()
		{
			return desc;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement desx;
		public WebElement getdesx()
		{
			return desx;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
		private WebElement Closebut;
		public WebElement getclosebut()
		{
			return Closebut;
		}
		//create webelement for deleteproject
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement ed;
		public WebElement geted()
		{
			return ed;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement ac;
		public WebElement getac()
		{
			return ac;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
		private WebElement del;
		public WebElement getdel()
		{
			return del;
		}
		private WebElement projectPanel_deleteConfirm_submitTitle;
		public WebElement getcodel()
		{
			return projectPanel_deleteConfirm_submitTitle;
		}
		//create webelement for deletecustomer
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement edi;
		public WebElement getedi()
		{
			return edi;
		}
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement Actionbutton;
		public WebElement getAction()
		{
			return Actionbutton;
		}
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement delete;
		public WebElement getDelete()
		{
			return delete;
		}
		
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getConfirm()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}
		//create webelement for logout
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogoutButton()
		{
			return oLogout;
		}
	    //create WebElement for Close()	
		private WebElement close;
		public WebElement Close()
		{
			return close;
		}
		

}
