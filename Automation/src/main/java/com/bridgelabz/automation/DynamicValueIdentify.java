package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicValueIdentify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//td[.='Java']/../td/a[.='Download']"));
		element.click();
		
	}

}
