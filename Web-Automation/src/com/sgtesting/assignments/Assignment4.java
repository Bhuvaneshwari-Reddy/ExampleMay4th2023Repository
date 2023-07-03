package com.sgtesting.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static WebDriver l=null;
	public static void main(String[] args) {
		Launch();
		navigate();
		login();
		minimize();
		Createcustomer();
		ModifyCustomer();
		Deleteuser();
		Logout();
		Close();
		
	}
	private static void Launch()
	{
		try {
			l=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			l.get("http://localhost/login.do");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			l.findElement(By.id("username")).sendKeys("admin");
			l.findElement(By.name("pwd")).sendKeys("manager");
			l.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			l.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try {
			l.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			l.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			l.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			l.findElement(By.id("customerLightBox_nameField")).sendKeys("sampath");
			Thread.sleep(2000);
			l.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("kshdfbcbjhfegugbh");
			Thread.sleep(2000);
			l.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ModifyCustomer()
	{
		try {
			
			  l.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			  Thread.sleep(2000);
			  l.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			  Thread.sleep(2000);
			  l.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("nhgytrgfa");
			  Thread.sleep(2000);
			  l.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
			  Thread.sleep(2000);

			  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser()
	{
		try {
			l.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			  Thread.sleep(2000);
			l.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			l.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			l.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
	}
	private static void Logout()
	{
		try {
			l.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			l.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	}


