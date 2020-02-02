package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory --object repository
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='u_0_b']")
	WebElement login;
	
	//initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver	,this);//"this" is pointing to the current class object
	}
	//action
	public String loginPageTitle() {
		return driver.getTitle();
	}
	public HomePage login(String un, String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
