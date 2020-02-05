package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase{
	
//	@FindBy(xpath = "//div[@class='_1mf _1mj']")
//	WebElement sharepost;
	
	
	@FindBy(xpath = "//a[@id='findFriendsNav']")
	WebElement findFriends;
	
	@FindBy(xpath = "//div[@id='leftCol']")
	WebElement messageIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Marketplace')]")
	WebElement marketIcon;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyTitleOfHomePage() {
		return driver.getTitle();
	}
	
	public FindFriends findFriends() {
		 findFriends.click();
		 return new FindFriends();
	}
	public MessagePage message() {
		messageIcon.click();
		return new MessagePage();
	}
	
	public MarketPlace homePageMarketPlace() {
		marketIcon.click();
		return new MarketPlace();
	}

}


















