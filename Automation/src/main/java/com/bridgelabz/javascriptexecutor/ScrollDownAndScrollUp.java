package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndScrollUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		int x = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']")).getRect().getX();
		int y = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']")).getRect().getY();
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		jse.executeScript("window.scrollBy(372,5852)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(-372,-5852)");

	}

}
