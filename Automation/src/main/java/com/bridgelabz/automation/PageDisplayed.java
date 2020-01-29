package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8109555221");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testdata@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		String expectedTitle="Facebook";
		String actualTitle=driver.getTitle();
		if(expectedTitle.contains(actualTitle)){
			System.out.println("page displayed");
		}
		else {
			System.out.println("page not displayed");
		}
		
	}

}
