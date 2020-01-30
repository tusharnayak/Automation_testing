package com.bridgelabz.handlingframesAndActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/admin1/Desktop/textbox2.html");

		// handling frames using index attribute...
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("tushar");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("nayak");

		// handling frames using id attribute...
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("good");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("morning");

		// handling frames using name attribute
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("bridgelabz");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("solution");

		// handling frames using class attribute
		WebElement className = driver.findElement(By.className("c1"));
		driver.switchTo().frame(className);
		driver.findElement(By.id("t1")).sendKeys("office");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("govandi");
		Thread.sleep(3000);
		driver.close();

	}
}
