package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class FindFriends extends TestBase{
	@FindBy(xpath = "//h2[contains(text(),'People you may know')]")
	WebElement friends;
	
//	@FindBy(xpath = "//a[contains(text(),'View sent requests')]")
//	WebElement viewSentRequest;
	
	
	
	public FindFriends() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyFindFriendsLabel() {
		return friends.isDisplayed();
	}
	
	
}
