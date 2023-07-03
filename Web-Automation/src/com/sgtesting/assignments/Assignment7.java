package com.sgtesting.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCutomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();

	}
	public static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("managar");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createCutomer()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Rachana");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("This is a description area");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("House Construction");
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Construction Plan");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Planning");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"descriptionElement\"]/img")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("editDescriptionPopupText")).sendKeys("Task must be edited");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"scbutton\"]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"ext-gen144\"]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"ext-gen277\"]/td[2]/em")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"ext-gen326\"]/tbody/tr[7]/td/button[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"ext-gen292\"]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[5]/div/input")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(3000);
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
			Thread.sleep(3000);
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
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

