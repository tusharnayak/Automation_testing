package com.bridgelabz.popuphandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/admin1/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
	}
}