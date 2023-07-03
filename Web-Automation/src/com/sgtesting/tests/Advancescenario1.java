package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancescenario1 {
	public static WebDriver o=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		Adminlogin();
		minimizeFlyOutWindow();
		createusers();
		logoutasadmin();
		loginasuser1();
		logoutasUser1();
		loginasuser2();
		logoutasUser2();
		loginasuser3();
		logoutasUser3();
		Adminlogin();
		modifypassword();
		logoutasadmin();
		LoginAsUser1modified();
		LogoutAsUser1modified();
		LoginAsUser2modified();
		LogoutAsUser2modified();
		LoginAsUser3modified();
		LogoutAsUser3modified();
		Adminlogin();
		deleteusers();
		logoutasadmin();
		closeapplication();

	}
	private static void launchbrowser()
	{
		try
		{
			o=new ChromeDriver();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			o.get("http://localhost/login.do");
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogin()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div ")).click();
			Thread.sleep(5000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createusers()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("User1");
			o.findElement(By.name("lastName")).sendKeys("Demo1");
			o.findElement(By.name("email")).sendKeys("user1@242");
			o.findElement(By.name("username")).sendKeys("User11");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("User2");
			o.findElement(By.name("lastName")).sendKeys("Demo1");
			o.findElement(By.name("email")).sendKeys("User2@242");
			o.findElement(By.name("username")).sendKeys("User12");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("User3");
			o.findElement(By.name("lastName")).sendKeys("Demo1");
			o.findElement(By.name("email")).sendKeys("User3@242");
			o.findElement(By.name("username")).sendKeys("User13");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasadmin()
	{
		try
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try 
		{
			o.findElement(By.id("username")).sendKeys("User11");
			o.findElement(By.name("pwd")).sendKeys("1234");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div ")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasUser1()
	{
		try 
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void loginasuser2()
	{
		try 
		{
			o.findElement(By.id("username")).sendKeys("User12");
			o.findElement(By.name("pwd")).sendKeys("1234");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div ")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasUser2()
	{
		try 
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void loginasuser3()
	{
		try 
		{
			o.findElement(By.id("username")).sendKeys("User13");
			o.findElement(By.name("pwd")).sendKeys("1234");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div ")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasUser3()
	{
		try 
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void modifypassword()
	{
		try
		{
			//modify password for user1
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).clear();
			o.findElement(By.name("password")).sendKeys("4321");
			o.findElement(By.name("passwordCopy")).clear();
			o.findElement(By.name("passwordCopy")).sendKeys("4321");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
			
			//modify password for user2
			
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Demo1, User2']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).clear();
			o.findElement(By.name("password")).sendKeys("4321");
			o.findElement(By.name("passwordCopy")).clear();
			o.findElement(By.name("passwordCopy")).sendKeys("4321");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
            //modify password for user3
			
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Demo1, User3']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).clear();
			o.findElement(By.name("password")).sendKeys("4321");
			o.findElement(By.name("passwordCopy")).clear();
			o.findElement(By.name("passwordCopy")).sendKeys("4321");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser1modified()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("User11");
			o.findElement(By.name("pwd")).sendKeys("4321");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsUser1modified()
	{
		try
		{

			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser2modified()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("User12");
			o.findElement(By.name("pwd")).sendKeys("4321");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsUser2modified()
	{
		try
		{

			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser3modified()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("User13");
			o.findElement(By.name("pwd")).sendKeys("4321");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsUser3modified()
	{
		try
		{

			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteusers()
	{
		try 
		{
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			//delete user1
			o.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			o.findElement(By.id("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Alert oAlert=o.switchTo().alert();
			String content=oAlert.getText();
			Thread.sleep(3000);
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			//delete user2
			o.findElement(By.xpath("//span[text()='Demo1, User2']")).click();
			o.findElement(By.id("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Alert oAlert1=o.switchTo().alert();
			String content1=oAlert1.getText();
			Thread.sleep(3000);
			System.out.println(content1);
			oAlert.accept();
			Thread.sleep(2000);
			
			//delete user2
			o.findElement(By.xpath("//span[text()='Demo1, User3']")).click();
			o.findElement(By.id("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();  
			Alert oAlert2=o.switchTo().alert();
			String content2=oAlert2.getText();
			Thread.sleep(3000);
			System.out.println(content2);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			o.close();
			Thread.sleep(5000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
