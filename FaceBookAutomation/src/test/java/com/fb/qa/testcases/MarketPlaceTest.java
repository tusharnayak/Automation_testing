package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.MarketPlace;

public class MarketPlaceTest extends TestBase{
	 LoginPage loginPage;
	 HomePage homePage;
	 MarketPlace marketPlace;
	 
	 
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		marketPlace=new MarketPlace();


		
	}
	
	@Test(priority = 2)
	public void marketPlaceTitleCheck() {
		marketPlaceClick();
		String marketVerify=marketPlace.marketPlaceTitleVerify();
		Assert.assertEquals(marketVerify, "Facebook Marketplace");
	}
	
	@Test(priority = 1)
	public void marketPlaceClick() {
		marketPlace=homePage.homePageMarketPlace();
		
	}
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
}
