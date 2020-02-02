package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.FindFriends;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

public class FindFriendsTest extends TestBase{
	public LoginPage loginPage;
	public HomePage homePage;
	public FindFriends findFriend;
	
	
	
	public FindFriendsTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void findFriendPageLabelTest() {
		Assert.assertTrue(findFriend.verifyFindFriendsLabel(),"people you may know label is missing");
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
