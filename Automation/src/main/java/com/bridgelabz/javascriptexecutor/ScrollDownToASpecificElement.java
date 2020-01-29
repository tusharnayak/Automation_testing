package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToASpecificElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='dismiss']")).click();
		Thread.sleep(2000);
		WebElement elem=driver.findElement(By.xpath("//div[6]//a[1]//img[1]"));
		int x=elem.getRect().getX();
		int y=elem.getRect().getY();
		System.out.println("x="+x+   "y="+y);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(289,1430)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(-289,-1430)");
				
		
	}
}
