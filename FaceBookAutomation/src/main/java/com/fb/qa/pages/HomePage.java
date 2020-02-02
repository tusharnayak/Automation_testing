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
	
	@FindBy(xpath = "//div[contains(text(),'Messenger')]")
	WebElement message;
	
	
	
	
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
		message.click();
		return new MessagePage();
	}

}
