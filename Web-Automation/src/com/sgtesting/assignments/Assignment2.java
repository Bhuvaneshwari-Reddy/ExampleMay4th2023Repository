package com.sgtesting.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	 public static WebDriver k=null;

	public static void main(String[] args) {
		Launch();
		navigate();
		login();
		minimize();
		Createcustomer();
		Deletecustomer();
		Logout();
		Close();
	}
	private static void Launch()
	{
		try {
			k=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			   k.get("http://localhost/login.do");
			   
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void login()
	{
		try {
			   k.findElement(By.name("username")).sendKeys("admin");
			   k.findElement(By.name("pwd")).sendKeys("manager");
			   k.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			   Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try {
			k.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try {
			k.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			k.findElement(By.xpath("//div[text()='Add New']")).click();
			k.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			k.findElement(By.id("customerLightBox_nameField")).sendKeys("sampath");
			k.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("kshdfbcbjhfegugbh");
			Thread.sleep(1000);
			k.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			k.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			k.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			k.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			k.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			k.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			k.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	}


