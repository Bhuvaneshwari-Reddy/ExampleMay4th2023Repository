package com.sgtesting.actipageassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutforCustomer {
	public static WebDriver v=null;
    public static Createcustomerdemo opage=null;

	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Minimize();
		CreateCustomer();
		deletecustomer();
		Logout();
		Close();
	}
	private static void launch()
	{
		try {
			v=new ChromeDriver();
			opage=new Createcustomerdemo(v);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			v.get("http://localhost:80/login.do");
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
	private static void deletecustomer()
	{
		try {
			opage.getedit().click();
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
			v.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}