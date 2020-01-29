package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionEqualOrNot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		int fb_userName_Y = userName.getLocation().getY();
		System.out.println("password=" + fb_userName_Y);
		int userName_width = userName.getSize().width;
		System.out.println("userName width=" + userName_width);
		int userName_height = userName.getSize().height;
		System.out.println("user name height=" + userName_height);
		userName.sendKeys("8109555221");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		int pass_Y = password.getLocation().getY();
		System.out.println("password=" + pass_Y);
		int pass_width = password.getSize().width;
		System.out.println("password width=" + pass_width);
		int pass_height = password.getSize().height;
		System.out.println("password height=" + pass_height);

		password.sendKeys("testdata@123");

		if (fb_userName_Y == pass_Y && userName_width == pass_width && userName_height == pass_height) {
			System.out.println("the dimension of email and password field are allign");
		} else {
			System.out.println("the dimension are not same");
		}

	}
}
