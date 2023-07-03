package com.sgtesting.actipageassignments;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	

public class LoginLogoutforcreateuser {
	public static WebDriver u=null;
	  public static Createuserdemo opage=null;

	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Minimize();
		CreateUser();
		deleteuser();
		Logout();
		Close();
	}
	private static void launch()
	{
		try {
			u=new ChromeDriver();
			opage=new Createuserdemo(u);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			u.get("http://localhost:80/login.do");
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
	private static void CreateUser()
	{
		try {
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.firstname().sendKeys("demo1");
			Thread.sleep(2000);
			opage.lastname().sendKeys("user1");
			Thread.sleep(2000);
			opage.email().sendKeys("Bhuvi@gmail.com");
			Thread.sleep(2000);
			opage.username().sendKeys("Bhivi");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("1234");
			Thread.sleep(2000);
			opage.passwordCopy().sendKeys("1234");
			Thread.sleep(2000);
		    opage.getSavecopy().click();
		    Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			opage.getclickonuser().click();
			opage.delete().click();
			Thread.sleep(2000);
			u.switchTo().alert().accept();
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
			u.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}

}
