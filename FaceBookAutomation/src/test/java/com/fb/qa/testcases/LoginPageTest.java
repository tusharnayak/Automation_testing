package com.fb.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	public LoginPage login;
	public HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
	}
	@Test(priority = 1)
	public void titleTest() {
		String title=login.loginPageTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	@Test(priority = 2)
	public void loginTest() {
		homePage=login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
