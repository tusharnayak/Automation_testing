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
	 LoginPage loginPage;
	 HomePage homePage;
	 FindFriends findFriend;
	
	
	
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
		Assert.assertTrue(findFriend.verifyFindFriendsLabel());
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
