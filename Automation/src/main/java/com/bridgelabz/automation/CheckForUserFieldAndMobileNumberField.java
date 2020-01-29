package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckForUserFieldAndMobileNumberField {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
		int width_userName=userName.getSize().width;
		System.out.println("width of user name="+width_userName);
		userName.sendKeys("8109555221");
		Thread.sleep(3000);
		
		WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		int width_password=mobileNumber.getSize().width;
		System.out.println("width of password="+width_password);
		mobileNumber.sendKeys("7008552993");
		
		if(width_userName==width_password) {
			System.out.println("the width are same");
		}
		else {
			System.out.println("the width are not same## ");
		}
	}
}
