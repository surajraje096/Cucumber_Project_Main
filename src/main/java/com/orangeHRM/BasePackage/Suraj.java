package com.orangeHRM.BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suraj {
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Surajraje096@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]")).sendKeys("Suraj@123");
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		
		
		
		
	}

}
