package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginlogoutformodifyproject {
	public static WebDriver b=null;
    public static  ModifyProjectdemo opage=null;

	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Minimize();
		CreateCustomer();
		CreateProject();
		 ModifyProject();
		deleteproject();
		deletecustomer();
		 Logout();
		 Close();
		
	}
	private static void launch()
	{
		try {
			b=new ChromeDriver();
			opage=new ModifyProjectdemo(b);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			b.get("http://localhost:80/login.do");
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			opage.getuserName().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLoginButton().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Minimize()
	{
		try {
			opage.getFlyOutwindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void CreateCustomer()
	{
		try {
			opage.getTask().click();
			Thread.sleep(2000);
			opage.getAddNew().click();
			Thread.sleep(2000);
			opage.getNewcustomer().click();;
			Thread.sleep(2000);
			opage.getName().sendKeys("Bhuvi");
			Thread.sleep(2000);
			opage.getDescription().sendKeys("It is a Task");
			Thread.sleep(2000);
			opage.getCreatecustomer().click();;
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			 opage.getaddnew().click();
			 Thread.sleep(2000);
			 opage.getProject().click();
			 Thread.sleep(2000);
			 opage.getname().sendKeys("Bangarpet Project");
			 Thread.sleep(2000);
			 opage.getdesc().sendKeys("It helps to add new features");
			 Thread.sleep(2000);
			 opage.getproject().click();
			 Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ModifyProject()
	{
		try {
			opage.getModi().click();
			Thread.sleep(2000);
			opage.getdesc1().clear();
			Thread.sleep(2000);
			opage.getdesx().sendKeys("This is our new project");
			Thread.sleep(2000);
			opage.getclosebut().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try {
			opage.geted().click();
			Thread.sleep(2000);
			opage.getac().click();
			Thread.sleep(2000);
			opage.getdel().click();
			Thread.sleep(2000);
			opage.getcodel().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			opage.getedi().click();
			Thread.sleep(2000);
			opage.getAction().click();
			Thread.sleep(2000);
			opage.getDelete().click();;
			Thread.sleep(2000);
			opage.getConfirm().click();;
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			opage.getLogoutButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			b.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	}

