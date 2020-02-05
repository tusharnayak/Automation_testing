package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class MarketPlace extends TestBase{
	
	@FindBy(xpath = "//input[@placeholder='Search Marketplace']")
	WebElement searchBtn;
	
	
	public MarketPlace() {
		PageFactory.initElements(driver, this);
	}
	
	public String marketPlaceTitleVerify() {
		return driver.getTitle();
	}
	
	public void searchBar() {
		searchBtn.click();
	}

}
