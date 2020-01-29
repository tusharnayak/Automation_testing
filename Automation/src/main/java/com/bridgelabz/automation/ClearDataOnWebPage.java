package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataOnWebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
		userName.sendKeys("tusharnayak");
		Thread.sleep(2000);
		userName.clear();
		Thread.sleep(3000);
		userName.sendKeys("tushar nayak");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
	}
}
