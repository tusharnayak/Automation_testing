package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/admin1/Desktop/File.html");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.id("username"));
		userName.clear();
		Thread.sleep(2000);
		userName.sendKeys("admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("manager");
		WebElement link=driver.findElement(By.linkText("Click ActiTIME Link"));
		link.click();
		Thread.sleep(5000);
		driver.close();
	}
}
