package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.FindFriends;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.MessagePage;

@Listeners(CustomListner.class)
public class HomePageTest extends TestBase {
	public HomePage homePage;
	public LoginPage loginPage;
	public MessagePage message;
	public FindFriends findFriends=new FindFriends();

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority = 1)
	public void homePageTitleTest() {
		String homeTitle=homePage.verifyTitleOfHomePage();
		Assert.assertEquals(homeTitle, "Facebook" ,"home page title not matched");
	}
	@Test(priority = 2)
	public void findFriendsTest() {
		findFriends=homePage.findFriends();
	}
	@Test(priority = 3)
	public void messagePageTest() {
		message=homePage.message();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
