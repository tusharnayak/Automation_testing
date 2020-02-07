package com.hashmap.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HashMapTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void loginWithUserTest() throws InterruptedException {
		String userCredentials=Hashmap.getLogininfo().get("user");
		String adminInfo[]=userCredentials.split("_");
		driver.findElement(By.id("email")).sendKeys(adminInfo[0]);
		driver.findElement(By.id("pass")).sendKeys(adminInfo[1]);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
