package com.bridgelabz.automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Date date = new Date();
		String d = date.toString();
		System.out.println("today's date=" + d);
		String date2 = d.replaceAll(":", "_");
		System.out.println("edited date=" + date2);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/admin1/Desktop/Automation/Automation/ScreenShot/ScreenShot.png");
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(2000);
		driver.close();

	}

}
