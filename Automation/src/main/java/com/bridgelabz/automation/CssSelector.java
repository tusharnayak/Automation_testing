package com.bridgelabz.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/admin1/Desktop/File.html");
		
	}
}
