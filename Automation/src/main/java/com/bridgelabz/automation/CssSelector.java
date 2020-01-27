package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/admin1/Desktop/File.html");
		WebElement userName=driver.findElement(By.cssSelector("input[type='text']"));
		userName.clear();
		Thread.sleep(2000);
		userName.sendKeys("admin");
		WebElement passWord=driver.findElement(By.cssSelector("input[id='pass']"));
		passWord.clear();
		Thread.sleep(3000);
		passWord.sendKeys("manager");
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.cssSelector("a[href='Click ActiTIME Link']"));
		link.click();
		
	}
}