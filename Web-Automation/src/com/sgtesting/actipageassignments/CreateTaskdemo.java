package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTaskdemo {
	
	public  CreateTaskdemo(WebDriver o)
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
		//create Webelement for Createcustomer
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
		//Create Webelement for CreateProject
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
		//create webelement for Createtask()
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement task;
		public WebElement gettask()
		{
			return task;
		}
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement Addnew;
		public WebElement Addnew()
		{
			return Addnew;
		}
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement entername;
		public WebElement entername()
		{
			return entername;
		}
		
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
		private WebElement entername2;
		public WebElement getentername2()
		{
			return entername2;
		}
		@FindBy(xpath="//span[text()='Create Tasks']")
		private WebElement CreateTask;
		public WebElement getCreateTask()
		{
			return CreateTask;
		}
		//create webelement for deletetask()
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")
		private WebElement container;
		public WebElement getcontainer()
		{
			return container;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement act;
		public WebElement getact()
		{
			return act;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
		private WebElement de;
		public WebElement getde()
		{
			return de;
		}
		private WebElement taskPanel_deleteConfirm_submitTitle;
		public WebElement getde1()
		{
			return taskPanel_deleteConfirm_submitTitle;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
		private WebElement con;
		public WebElement getcon()
		{
			return con;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement act2;
		public WebElement getact2()
		{
			return act2;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
		private WebElement de2;
		public WebElement getde2()
		{
			return de2;
		}
		@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")
		private WebElement delet;
		public WebElement getdelet()
		{
			return delet;
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
