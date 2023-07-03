package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutForProject {
	
	public static WebDriver j=null;
    public static CreateProjectdemo opage=null;

	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Minimize();
		CreateCustomer();
		CreateProject();
		deleteproject();
		deletecustomer();
		 Logout();
		 Close();
		
	}
	private static void launch()
	{
		try {
			j=new ChromeDriver();
			opage=new CreateProjectdemo(j);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			j.get("http://localhost:80/login.do");
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
			opage.getName().sendKeys("Mani");
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
			 opage.getname().sendKeys("Chikkabalapura Project");
			 Thread.sleep(2000);
			 opage.getdesc().sendKeys("It helps to add new features");
			 Thread.sleep(2000);
			 opage.getproject().click();
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
			j.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	}

