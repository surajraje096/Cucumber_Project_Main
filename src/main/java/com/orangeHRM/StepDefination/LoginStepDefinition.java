package com.orangeHRM.StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeHRM.BasePackage.BaseClass;

import com.orangeHRM.Pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition extends BaseClass{
	
	
	
	
	
	@Given("^user is already on Login PageS$")
	public void user_is_already_on_Login_PageS() throws Throwable {
		init2();
	}

	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("surajraje096@gmail.com");
	}

	@Then("^user enter password$")
	public void user_enter_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("suraj@123");
	}

	@Then("^user click loginButton$")
	public void user_click_loginButton() throws Throwable {
		driver.findElement(By.tagName("button")).click();
	}
	
	
	
	
	
	
	
	
	/*@Given("^user is already on Login PageS$")
	public void user_is_already_on_Login_PageS() {
		System.setProperty("webdriver.chrom.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("facebook.com");
	   
	}

	@Then("^user enter username$")
	public void user_enter_username() {
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("suraj@123");
	}

	@Then("^user enter password$")
	public void user_enter_password() {
	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("suraj@1234");
	}

	@Then("^user click loginButton$")
	public void user_click_loginButton() {
	  
	  driver.findElement(By.xpath("id=\"u_0_d_BV\"")).click();
	}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*	
	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
	  
	}

		
	


	
	
	
	
	
	

	
	
	
	@Given("^User login FACEBOOK$")
	public void user_login_FACEBOOK()  {
		init2();
		LoginPage sp = new LoginPage();
		}
	
	
	
	
	

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		BaseClass.init();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Exception {
		LoginPage.Valid_Credentials_username_and_password();
	}

	@Then("^user clicks on login page$")
	public void user_clicks_on_login_page() {
		LoginPage.user_clicks_on_login_page();
	}

	@Then("^close the browser$")
	public void close_the_browser_login_() {
		LoginPage.close_the_browser_login_();
	}
	
	@Then("^Verify user cant login with valid user name and invalid password$")
	public void verify_user_cant_login_with_valid_user_name_and_invalid_password() throws Exception {
		LoginPage.valid_user_name();
		LoginPage.invalid_user_Password();
	}
	@Then("^view password if show password is eanble$")
	public void view_password_if_show_password_is_eanble() throws Exception {
	  LoginPage.view_password_if_show_password_is_eanble();
	}

*/
}
