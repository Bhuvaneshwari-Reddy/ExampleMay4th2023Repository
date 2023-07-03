package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createuserdemo {

	public Createuserdemo(WebDriver o)
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
	
	//create WebElement for createuser
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement user;
	public WebElement getuser()
	{
		return user;
	}
	
	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	private WebElement firstName;
	public WebElement firstname()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement lastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement email()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement username()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement passwordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy;
	public WebElement getSavecopy()
	{
		return Savecopy;
	}
	//create WebElement for deleteuser
	@FindBy(xpath="//span[text()='user1, demo1']")
	private WebElement clickuser;
	public WebElement getclickonuser()
	{
		return clickuser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement delete()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//create WebElement for Logoutlink()
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
			return Close();
		}
		

	
	

}
