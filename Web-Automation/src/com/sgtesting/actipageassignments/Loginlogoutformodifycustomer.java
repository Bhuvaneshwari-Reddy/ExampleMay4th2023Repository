package com.sgtesting.actipageassignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlogoutformodifycustomer {
	public static WebDriver k=null;
    public static ModifyCustomerdemo opage=null;

	public static void main(String[] args) {
		
	    launch();
		Navigate();
		login();
		minimize();
		creatcustomer();
		Modifycustomer();
		deleteModifyCustomer();
		Logout();
		 Close();
		 
	}
private static void launch()
{
	try {
		k=new ChromeDriver();
		opage=new ModifyCustomerdemo(k);


	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void Navigate()
{
	try {
		k.get("http://localhost:80/login.do");
		Thread.sleep(3000);

	} catch (Exception e) {

	}
}
private static void login()
{
	try {
		opage.getuserName().sendKeys("admin");
		Thread.sleep(2000);
		opage.getPassword().sendKeys("manager");
		Thread.sleep(2000);
	    opage.getLoginButton().click();
		Thread.sleep(2000);

	} catch (Exception e) {

	}
}
private static void minimize()
{
	try {
		opage.getFlyOutwindow().click();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void creatcustomer()
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
private static void Modifycustomer()
{
	try {
		opage.getedit().click();
		Thread.sleep(2000);
		opage.getdescripction().clear();
		Thread.sleep(2000);
		opage.getDescription1().sendKeys("It is a new customer");
		Thread.sleep(2000);
		opage.getCLose().click();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void deleteModifyCustomer()
{
	try {
		opage.getedit1().click();
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
		k.close();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}

}



}
