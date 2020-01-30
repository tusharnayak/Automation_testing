package com.bridgelabz.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/admin1/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/admin1/Desktop/file.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[2]")).click();
	}
}
