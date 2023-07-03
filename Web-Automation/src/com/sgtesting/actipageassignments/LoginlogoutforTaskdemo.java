package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginlogoutforTaskdemo {
	
	public static WebDriver m=null;
    public static  CreateTaskdemo  opage=null;

	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Minimize();
		CreateCustomer();
		CreateProject();
		CreateTask();
		deleteTask();
		deleteproject();
		deletecustomer();
		 Logout();
		 Close();
		
	}
	private static void launch()
	{
		try {
			m=new ChromeDriver();
			opage=new  CreateTaskdemo(m);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			m.get("http://localhost:80/login.do");
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
			 opage.getname().sendKeys("Bangalore Project");
			 Thread.sleep(2000);
			 opage.getdesc().sendKeys("It helps to add new features");
			 Thread.sleep(2000);
			 opage.getproject().click();
			 Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void CreateTask()
    {
    	try {
    		opage.gettask().click();
    		Thread.sleep(2000);
    		opage.Addnew().click();
    		Thread.sleep(2000);
    		opage.entername().sendKeys("SG Institute");
    		Thread.sleep(2000);
    		opage.getentername2().sendKeys("Institute");
    		Thread.sleep(2000);
    		opage.getCreateTask().click();
    		Thread.sleep(2000);
    		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void deleteTask()
    {
    	try {
    		 opage.getcontainer().click();
    		 Thread.sleep(2000);
    		 opage.getact().click();
    		 Thread.sleep(2000);
    		 opage.getde().click();
    		 Thread.sleep(2000);
    		 opage.getde1().click();
    		 Thread.sleep(2000);
    		 opage.getcon().click();
    		 Thread.sleep(2000);
    		 opage.getact2().click();
    		 Thread.sleep(2000);
    		 opage.getde2().click();
    		 Thread.sleep(2000);
    		 opage.getdelet().click();
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
			m.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	}
