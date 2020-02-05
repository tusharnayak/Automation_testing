package com.fb.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.MessagePage;

public class MessagePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	MessagePage messagePageTest;

	public MessagePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		messagePageTest=new MessagePage();
	}

	@Test(priority = 2)
	public void messengerTest() {
		messengerClickTest();
		String messageTitle = messagePageTest.verifyMessengerTitle();
		Assert.assertEquals(messageTitle, "Messenger");
	}
	@Test(priority = 1)
	public void messengerClickTest() {
		homePage.message();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
