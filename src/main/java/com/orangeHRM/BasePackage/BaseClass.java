package com.orangeHRM.BasePackage;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static WebDriver driver;
	
	public static Properties pro;

	public BaseClass() {
		pro = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(
					"D:\\SpringBoot API Projects\\OrangeHRM\\src\\main\\java\\com\\orangeHRM\\Properties\\config.properties");
			pro.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	

	public static void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://edusol20-trials65101.orangehrmlive.com/auth/login");
		System.out.println("init method exicute");
		
		}
	
	
	public static void init2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("init method exicute");
		
		}
	
	public static void databaseConnection() throws Exception {
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/newedemo_table","root","root");
		Statement s=con.createStatement();
		
		ResultSet rs=s.executeQuery("select * from employ_table where employ_name='suraj';");
		
	}
	

}
