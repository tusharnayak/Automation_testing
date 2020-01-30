package com.bridgelabz.handlingframesAndActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.istqb.in/");
		WebElement foundation=driver.findElement(By.xpath("//body[contains(@class,'header-default navbar-default layout-full headertype-sticky su-shortcodes-loaded')]/div[contains(@class,'layout-full-wrapper ls-overflow-visible')]/div[contains(@class,'header-top-wrapper')]/div[contains(@class,'tm-header-wrapper')]/div[contains(@class,'uk-sticky-placeholder')]/div[contains(@class,'tm-headerbar uk-clearfix')]/div[@id='tmMainMenu']/nav[contains(@class,'tm-navbar-full')]/div[contains(@class,'uk-navbar')]/div[contains(@class,'uk-visible-large uk-navbar-flip')]/ul[contains(@class,'uk-navbar-nav uk-hidden-small')]/li[3]/a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(foundation).perform();
		Thread.sleep(3000);
		WebElement subdiv=driver.findElement(By.xpath("//body[contains(@class,'header-default navbar-default layout-full headertype-sticky su-shortcodes-loaded')]/div[contains(@class,'layout-full-wrapper ls-overflow-visible')]/div[contains(@class,'header-top-wrapper')]/div[contains(@class,'tm-header-wrapper')]/div[contains(@class,'uk-sticky-placeholder')]/div[contains(@class,'tm-headerbar uk-clearfix')]/div[@id='tmMainMenu']/nav[contains(@class,'tm-navbar-full')]/div[contains(@class,'uk-navbar')]/div[contains(@class,'uk-visible-large uk-navbar-flip')]/ul[contains(@class,'uk-navbar-nav uk-hidden-small')]/li[contains(@class,'uk-parent uk-open')]/div[contains(@class,'uk-dropdown uk-dropdown-navbar uk-dropdown-width-2 uk-dropdown-bottom')]/div[contains(@class,'uk-grid uk-dropdown-grid')]/div[2]/ul[1]/li[2]/a[1]"));
		action.moveToElement(subdiv).perform();
		Thread.sleep(5000);
		WebElement corporateEnrollment=driver.findElement(By.xpath("//ul[contains(@class,'uk-nav uk-nav-navbar')]//li[contains(@class,'uk-parent uk-nav-header')][contains(text(),'CORPORATE ENROLLMENT')]"));
		action.moveToElement(corporateEnrollment).perform();
		Thread.sleep(5000);
		WebElement enrollment=driver.findElement(By.xpath("//ul[contains(@class,'uk-nav uk-nav-navbar')]//li[contains(@class,'uk-parent')]//ul[contains(@class,'uk-nav-sub')]//ul//li//a[contains(text(),'PAPER BASED ENROLLMENT')]"));
		action.moveToElement(enrollment).click().perform();
	}
}