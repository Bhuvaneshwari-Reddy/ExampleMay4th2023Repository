package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Modifyuserdemo {
	
	public Modifyuserdemo(WebDriver m)
	{
		
		PageFactory.initElements(m, this);
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
	//create webelement for modifyuser
	@FindBy(xpath="//span[text()='user1, demo1']")
    private WebElement Modifycopy;
    public WebElement getModify()
    {
		return Modifycopy;
    }
	
	private WebElement userDataLightBox_lastNameField;
	public WebElement getclearlastName()
	{
		return userDataLightBox_lastNameField;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	private WebElement lastName2;
	public WebElement getModifylastName()
	{
		return lastName2;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div")
	private WebElement Name;
	public WebElement getanotherlastname()
	{
		return Name;
	}
	//create webelement for deleteuser()
	@FindBy(xpath="//span[text()='mani, demo1']")
	private WebElement deletebutton;
	public WebElement getdelete()
	{
		return deletebutton;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdelete1()
	{
		return userDataLightBox_deleteBtn;
	}
	//create webelement for Logout()
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
	//create webelement for close
	private WebElement close;
	public WebElement Close()
	{
		return Close();
	}

}
