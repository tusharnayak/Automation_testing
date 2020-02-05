package com.dateautomation.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'17')]"));
		date.click();
	}
	

}
