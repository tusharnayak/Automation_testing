package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownBottomOfPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		int x=element.getRect().getX();
		int y=element.getRect().getY();
		System.out.println("x=="+x+"y=="+y);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(372,5852)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(-372,-5852)");

	}
}
