package com.sgtesting.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflybutton();
		createuser();
		deleteUser();
		logout();
		closeApplication();

	}
	private static void launchbrowser()
	{
		try {
			oBrowser=new ChromeDriver();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost/login.do");	
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
	private static void minimizeflybutton()

	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);

			//*[@id="topnav"]/tbody/tr[1]/td[5]/a/div[2]
			//*[@id="createUserDiv"]/div



		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			Thread.sleep(2000);
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
