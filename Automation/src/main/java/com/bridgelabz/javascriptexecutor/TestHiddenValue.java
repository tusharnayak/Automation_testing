package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHiddenValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/admin1/Desktop/hiden.html");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('t2').value=''");
		jse.executeScript("document.getElementById('t2').value='manager'");
		jse.executeScript("document.getElementById('t2').type='button'");
	}
}
