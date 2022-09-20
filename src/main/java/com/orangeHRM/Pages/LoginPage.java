package com.orangeHRM.Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.orangeHRM.BasePackage.BaseClass;

import cucumber.api.java.en.Then;

public class LoginPage extends BaseClass {

	public static void Valid_Credentials_username_and_password() throws Exception {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newedemo_table", "root", "root");
		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from newedemo_table.employee where emailid='Admin';");

		while (rs.next()) {
			WebElement username = driver.findElement(By.xpath(pro.getProperty("username")));
			username.sendKeys(rs.getString("emailid"));
			Thread.sleep(5000);
			WebElement password = driver.findElement(By.xpath(pro.getProperty("password")));
			// password.sendKeys("10QwjTXO@z");
			password.sendKeys(rs.getString("password"));
		}
	}

	public static void user_clicks_on_login_page() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		/*
		 * String
		 * Error=driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).
		 * getText(); System.out.println(Error);
		 */
	}

	public static void close_the_browser_login_() {
		driver.close();
	}

	public static boolean valid_user_name() throws Exception {

		WebElement nameMessage = driver.findElement(By.xpath(pro.getProperty("username")));
		nameMessage.sendKeys("Admin");

		return false;
	}

	public static boolean invalid_user_Password() throws Exception {

		WebElement pass = driver.findElement(By.xpath(pro.getProperty("password")));
		pass.sendKeys("10QwjTXO@z\\");
		return false;
	}

	public static void view_password_if_show_password_is_eanble() throws Exception {
		WebElement sp = driver.findElement(By.xpath(pro.getProperty("password")));
		sp.getText();
		System.out.println(sp);
		System.out.println("get Password");
		WebElement Hide = driver.findElement(By.id("frmLogin"));
		System.out.println(Hide.getText());

		System.out.println("Password Show");
	}

	public static void databaseConnection() {

	}



//=============================================================================================
	public void TC1_Title() {
	String ActualTitle	= driver.getTitle();
	String ExpectedTitle = "";
	
	Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	}

//===========================================================================================
	public void TC2_CurrentURL() {
		String ActualURL	= driver.getCurrentUrl();
		String ExpectedURL = "";
		
		Assert.assertEquals(ExpectedURL, ActualURL);
		
		
	}
//===========================================================================================

	public void TC3_validationPassword() {		
		String n = "Suraj@123";

		int count = 0;
//check lenght
		if (n.length() >= 8) {
			count++;
		}

//special character		
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '@' || n.charAt(i) == '/' || n.charAt(i) == '_' || n.charAt(i) == '#') {
				count++;
				break;
			}
		}
//Start with upper or low case
		if ((n.charAt(0) >= 'a' && n.charAt(0) <= 'z') || (n.charAt(0) >= 'A' && n.charAt(0) <= 'Z')) {
			count++;
		}

//if want smole case character upper character digit 		
		if ((n.charAt(n.length() - 1) >= 'a' && n.charAt(n.length() - 1) <= 'z')
				|| (n.charAt(n.length() - 1) >= 'A' && n.charAt(n.length() - 1) <= 'Z')
				|| (n.charAt(n.length() - 1) >= '0' && n.charAt(n.length() - 1) <= '9')) {
			count++;
		}
//digit availabale is 
		for (int i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i))) {
				count++;
				break;
			}
		}
//lower and upper character
		for (int i = 0; i < n.length(); i++) {
			if ((n.charAt(i) >= 'a' && n.charAt(i) <= 'z') || (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')) {
				count++;
				break;
			}
		}
//valid final outpute
		if (count == 6) {
			System.out.println("Valid Password");
			driver.findElement(By.xpath("")).sendKeys(n);

		} else {
			System.out.println("In-Valid Password");
		}

	}
//===========================================================================================

	public void TC4_ValidationEmailID() {
		String s = "Test@gmail.com";

		// String s = "test@gmail.com";
		String com = ".com";
		int count = 0;
		char c = '@';
		char c1 = '.';
		int avalue = 0;
		int aloc = 0;
		int dvalue = 0;
		int dloc = 0;

		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
				avalue++;
				aloc = i;
			}
		}
		// ----------------------------------------
		if (count == 1) {
			for (int i = 0; i < s.length(); i++) {
				if (c1 == s.charAt(i)) {
					count++;
					dvalue++;
					dloc = i;
				}
			}
		}
		// ------------------------------------------
		if (count == 2) {
			if (avalue == 1 && dvalue == 1) {
				count++;
			}
		}
		// --------------------------------------------------------
		if (count == 3) {
			int temp = (dloc - aloc) - 1;
			if (temp == 5) {
				count++;
			}
		}
		// ---------------------------------------------------------
		if (count == 4) {
			if (aloc >= 3) {
				count++;
			}
		}
		// ---------------------------------------------------------------
		if (count == 5) {
			if (s.endsWith(com)) {
				count++;
			}
		}
		// ---------------------------------------------------------------
		if (count == 6) {
			System.out.println("Valid mail");
			driver.findElement(By.xpath("")).sendKeys(s);
		} else {
			System.out.println("In-valid mail");
		}

	}

//=========================================================================================
	
	public void TC5_Validate_LoginBTN() {
		boolean btn =driver.findElement(By.xpath("")).isDisplayed();
		
		Assert.assertTrue(btn);
		
		System.out.println("LoginBTN is Display");
	}
	
//=========================================================================================	
	
	public void TC6_Validate_LoginBTN() {
		boolean btn =driver.findElement(By.xpath("")).isEnabled();
		
		Assert.assertTrue(btn);
		
		System.out.println("LoginBTN is Enabled");
	}
	
	//===========================================================================================
		public void TC7_Validlogin() {
			driver.findElement(By.xpath("")).sendKeys("surajraje096@gmail.com");
			driver.findElement(By.xpath("")).sendKeys("Suraj@123");
		}	
	
	
	
	
	
	
	
	
}
