package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class MessagePage extends TestBase{
	@FindBy(xpath = "//div[contains(text(),'Messenger')]")
	WebElement messenger;
	
	
	public MessagePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyMessengerTitle() {
		return driver.getTitle();
	}
	
	
	public MessagePage messengerClick() {
		messenger.click();
		return new MessagePage();
		
	}
	
	
	
}
