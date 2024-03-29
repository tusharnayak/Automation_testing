package com.bridgelabz.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDividsionPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'monthBlock first')]//a[contains(@class,'ui-state-default')][contains(text(),'20')]")).click();
	}
}
